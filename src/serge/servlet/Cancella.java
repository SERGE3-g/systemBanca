package serge.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serge.model.ClienteDAO;


@WebServlet("/cancella")
public class Cancella extends HttpServlet {
    private static final long serialVersionUID = 1L;

    ClienteDAO dao = new ClienteDAO();

    public Cancella() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        dao.cancella(Integer.parseInt(request.getParameter("id")));
        request.getRequestDispatcher("/home").forward(request, response);

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}