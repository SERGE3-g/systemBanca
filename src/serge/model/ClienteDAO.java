package serge.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    Connection conn;

    public ClienteDAO() {
        this.conn = ConnectionManager.getInstance().getConn();
    }


    public void aggiungi(Cliente c) {
        String insert = "INSERT INTO cliente VALUES (null, '" + c.getNome() + "', '" + c.getCognome()
                + "', " + c.getEta() + ");";
        int risultato = 0;
        try (Statement stmt = this.conn.createStatement()) {
            risultato = stmt.executeUpdate(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (risultato > 0) {
            System.out.println(risultato + " row(s) affected");
        } else {
            System.out.println("qualcosa è andato storto, nessuna aggiunta avvenuta!");
        }


    }


    public void cancella(int id) {
        String delete = "DELETE FROM cliente WHERE id =" + id + ";";
        try (Statement stmt = this.conn.createStatement()) {
            stmt.executeUpdate(delete);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Cliente getById(int id) {
        Cliente c = new Cliente();
        try (Statement stmt = this.conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM persona WHERE id=" + id +";")) {

            rs.next();
            // s.setMatricola(rs.getString(1));
            c.setId(rs.getInt("id"));
            c.setNome(rs.getString("nome"));
            c.setCognome(rs.getString("cognome"));
            c.setCodiceFiscale(rs.getString("codiceFiscale"));
            c.setEta(rs.getInt("eta"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }


    public void aggiorna(Cliente c) {
        String update = "UPDATE Cliente SET nome = '" + c.getNome() + "'," +
                "cognome = '" + c.getCognome() + "'," +
                "eta = " + c.getEta() + " WHERE id=" + c.getId() + ";";
        int risultato = 0;
        try (Statement stmt = this.conn.createStatement()) {
            risultato = stmt.executeUpdate(update);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (risultato > 0) {
            System.out.println(risultato + " row(s) affected");
        } else {
            System.out.println("qualcosa è andato storto, nessuna aggiunta avvenuta!");
        }
    }


    public List<Cliente> getAllCliente() {

        List<Cliente> persone = new ArrayList<>();

        try (Statement stmt = this.conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM cliente;")) {

            while (rs.next()) {
                Cliente c = new Cliente();

                // creo un nuovo oggetto Cliente e lo aggiungo alla lista
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCognome(rs.getString("cognome"));
                c.setCodiceFiscale(rs.getString("codiceFiscale"));
                c.setEta(rs.getInt("eta"));

                persone.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persone;
    }
}