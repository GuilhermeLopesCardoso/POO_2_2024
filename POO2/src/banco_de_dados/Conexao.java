package banco_de_dados;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    public static Connection conectaMySql() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/poo", "root", "09042003");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}
