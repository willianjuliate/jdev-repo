package servlets;

import java.io.IOException;
import java.sql.SQLException;

import dao.DAOLoginRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;

@WebServlet(urlPatterns = { "/principal/dashboard", "/dashboard" })
public class ServletLogin extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final DAOLoginRepository dao = new DAOLoginRepository();

	public ServletLogin() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");

		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("logout")) {
			request.getSession().invalidate();
			RequestDispatcher redirect = request.getRequestDispatcher("index.jsp");
			redirect.forward(request, response);
		} else {
			doPost(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String url = request.getParameter("url");

		try {
			if (login != null && !login.isEmpty() && senha != null && !senha.isEmpty()) { // Valida se os campos não
																							// estão vazios
				ModelLogin modelLogin = new ModelLogin();
				modelLogin.setLogin(login);
				modelLogin.setSenha(senha);

				if (dao.validarAutenticacao(modelLogin)) {

					request.getSession().setAttribute("usuario", modelLogin.getLogin());

					if (url == null || url.equals("null")) {
						url = "principal/principal.jsp";
					}

					RequestDispatcher redirect = request.getRequestDispatcher(url);
					redirect.forward(request, response);

				} else {
					redirectRequest(request, response, "/index.jsp", "msg", "Informe o login e senha corretamente");
				}
			} else {
				// Caso os campos sejam invalidos fazer o redirecionamento! "RequestDispatcher"
				redirectRequest(request, response, "/index.jsp", "msg", "Informe o login e senha corretamente");
			}

		} catch (ServletException err) {
			err.printStackTrace();
			redirectRequest(request, response, "erro.jsp", "err", err.getMessage());
		} catch (IOException err) {
			err.printStackTrace();
			redirectRequest(request, response, "erro.jsp", "err", err.getMessage());
		} catch (SQLException err) {
			err.printStackTrace();
			redirectRequest(request, response, "erro.jsp", "err", err.getMessage());
		} catch (NullPointerException err) {
			err.printStackTrace();
			redirectRequest(request, response, "erro.jsp", "err", err.getMessage());
		}
	}

	public void redirectRequest(HttpServletRequest request, HttpServletResponse response, String path, String attibute,
			String msg) throws ServletException, IOException {

		RequestDispatcher redirect = request.getRequestDispatcher(path);
		request.setAttribute(attibute, msg);
		redirect.forward(request, response);
	}

}
