package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.MysqlDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/databaseTest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getMySQLDatasource() {
        Connection connection = null;
        try {
            MysqlDataSource dataSource = new MysqlDataSource();

            dataSource.setURL(URL);
            dataSource.setUser(USERNAME);
            dataSource.setPassword(PASSWORD);
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
