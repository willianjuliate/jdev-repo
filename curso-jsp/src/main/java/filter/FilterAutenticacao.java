package filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import connection.SingleConnectionBase;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

/* Intercepta todas as requisições que vierem do projeto ou mapeamento*/
@WebFilter(urlPatterns = { "/principal/*" })
public class FilterAutenticacao implements Filter {

	private static Connection connection;

	public FilterAutenticacao() {
	}

	/* Encerra os processo quando o servidor é parado */
	// Mata o processe de conexão com banco
	@Override
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Intercepta as requisições e a as respostas no sistema Tudo que fizer no
	 * sistema vai fazer por aqui Validação de autenticação Dar commit e rollback de
	 * transações do banco Validar e fazer redirecionamento de páginas
	 *
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			HttpServletRequest rq = (HttpServletRequest) request;
			HttpSession session = rq.getSession();

			String usuarioLogado = (String) session.getAttribute("usuario");
			String urlAutenticar = rq.getServletPath(); // URL que está sendo acessada

			/* Validar se está logado senão redireciona para a tela de login */
			if (usuarioLogado == null && !urlAutenticar.equalsIgnoreCase("principal/dashboard")) {

				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				request.setAttribute("msg", "Por favor realize o login!");
				rd.forward(request, response);
				return;

			} else {
				chain.doFilter(request, response);
			}

			connection.commit();

		} catch (Exception ex) {
			ex.printStackTrace();

			RequestDispatcher redirect = request.getRequestDispatcher("\\erro.jsp");
			request.setAttribute("err", ex.getMessage());
			redirect.forward(request, response);

			try {
				connection.rollback();
			} catch (SQLException err) {
				err.printStackTrace();
			}
		}
	}

	/* Inicia os processos ou recursos quando o servidor sobe o projeto */
	// iniciar conexão com banco
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		connection = SingleConnectionBase.getConnection();
	}

}
