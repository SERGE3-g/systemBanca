package serge.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//classe con pattern singleton
public class ConnectionManager {

    private static ConnectionManager instance = null;
    private Connection conn;

    //costruttore privato per impedire la creazione di nuove istanze
    private ConnectionManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SystemBanca", "root", "Gueaserge");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //qui c'è il singleton
    public static ConnectionManager getInstance() {

        if(instance == null) {
            instance = new ConnectionManager();
        }

        return instance;
    }

    public Connection getConn() {
        return conn;
    }

}
