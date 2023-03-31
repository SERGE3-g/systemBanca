package serge.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serge.model.ConnectionManager;
import serge.model.Cliente;
import serge.model.ClienteDAO;

/**
 * Servlet implementation class Aggiungi
 */
@WebServlet("/Aggiungi")
public class Aggiungi extends HttpServlet {
    private static final long serialVersionUID = 1L;

    ClienteDAO dao = new ClienteDAO();

    public Aggiungi() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/form-aggiungi.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cliente c = new Cliente();
        c.setNome(request.getParameter("nome"));
        c.setCognome(request.getParameter("cognome"));
        c.setCodiceFiscale(request.getParameter("codiceFiscale"));
        c.setEta(Integer.parseInt(request.getParameter("eta")));

        dao.aggiungi(c);

        System.out.println(request.getParameter("nome"));
        System.out.println(request.getParameter("cognome"));
        System.out.println(request.getParameter("eta"));

        request.getRequestDispatcher("/home").forward(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("chiamata metodo destory");

        try {
            ConnectionManager.getInstance().getConn().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}