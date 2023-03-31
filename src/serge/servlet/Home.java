package serge.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serge.model.Cliente;
import serge.model.ClienteDAO;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;

    ClienteDAO dao = new ClienteDAO();

    public Home() {
        super();

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cliente> Cliente = dao.getAllCliente();
        request.setAttribute("cliente", Cliente);

        request.getRequestDispatcher("jsp/home.jsp").forward(request, response);


    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

}
