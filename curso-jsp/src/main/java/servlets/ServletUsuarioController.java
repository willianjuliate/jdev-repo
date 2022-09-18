package servlets;

import java.io.IOException;
import java.sql.SQLException;

import dao.DAOUsuarioRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;

@WebServlet(urlPatterns = { "/UsuarioController" })
public class ServletUsuarioController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private DAOUsuarioRepository repository = new DAOUsuarioRepository();

	public ServletUsuarioController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			String id = request.getParameter("id");
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");

			ModelLogin mdl = new ModelLogin();
			mdl.setId(id != null && !id.isEmpty() ? Long.parseLong(id) : null);
			mdl.setNome(nome);
			mdl.setEmail(email);
			mdl.setLogin(login);
			mdl.setSenha(senha);

			request.setAttribute("msg", "Operação realizada com sucesso!");
			request.setAttribute("mdl", mdl);			
			request.getRequestDispatcher("/principal/usuario.jsp").forward(request, response);

			repository.gravarUsuario(mdl);
		} 
		catch (SQLException e) {
			e.printStackTrace();
			RequestDispatcher redirect = request.getRequestDispatcher("erro.jsp");
			request.setAttribute("msg", e.getMessage());
			redirect.forward(request, response);
		}

	}

}
