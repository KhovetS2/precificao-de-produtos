package conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://fatec:fatec@localhost/precificao");

        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }

    }
}
