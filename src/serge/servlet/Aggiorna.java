package serge.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serge.model.Cliente;
import serge.model.ClienteDAO;


@WebServlet("/aggiorna")
public class Aggiorna extends HttpServlet {
        private static final long serialVersionUID = 1L;

        ClienteDAO dao = new ClienteDAO();

        public Aggiorna() {
                super();
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                Cliente c = new Cliente();

                c = dao.getById(Integer.parseInt(request.getParameter("id")));

                request.setAttribute("cliente", c);

                request.getRequestDispatcher("jsp/form-aggiorna.jsp").forward(request, response);
        }


        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

               Cliente aggiornato = new Cliente();

                aggiornato.setNome(request.getParameter("nome"));
                aggiornato.setCognome(request.getParameter("cognome"));
                aggiornato.setCodiceFiscale(request.getParameter("codiceFiscale"));
                aggiornato.setEta(Integer.parseInt(request.getParameter("eta")));
                aggiornato.setId(Integer.parseInt(request.getParameter("id")));

                dao.aggiorna(aggiornato);
                request.getRequestDispatcher("/home").forward(request, response);

        }

}