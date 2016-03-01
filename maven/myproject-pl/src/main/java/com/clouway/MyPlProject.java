package com.clouway;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class MyPlProject {

    public static void main(String[] args) {
        MysqlConnectionPoolDataSource dataSourceTrip = new MysqlConnectionPoolDataSource();
        dataSourceTrip.setURL("jdbc:mysql://localhost:3306/maven");
        dataSourceTrip.setUser("root");
        dataSourceTrip.setPassword("clouway.com");

        Connection connection = null;
        try {
            connection = dataSourceTrip.getConnection();

            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            ResultSet resultSet1 = statement.executeQuery("select * from users");

            while (resultSet1.next()) {
                int age = resultSet1.getInt("age");
                String name = resultSet1.getString("name");
                System.out.println(age + " 232434   " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
