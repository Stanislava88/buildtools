package com.clouway.build.tools;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class PersistentLayer {
  private static Logger logger = Logger.getLogger(PersistentLayer.class);

  public static void main(String[] args) throws SQLException {
    BasicConfigurator.configure();
    DriverManager.registerDriver(new org.postgresql.Driver());
    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/users", "postgres", "clouway.com");

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from users;");
    resultSet.next();
    logger.info(resultSet.getInt("id") + " " + resultSet.getString("name"));
    resultSet.close();
    statement.close();
    connection.close();
  }
}
