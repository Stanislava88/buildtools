package com.clouway;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class Demo {
  private static Logger logger = Logger.getLogger(Demo.class);

  public static void main(String[] args) throws SQLException {
    BasicConfigurator.configure();
    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/university", "postgres", "clouway.com");

    PreparedStatement preparedStatement = connection.prepareStatement("SELECT firstName from students WHERE id=?");
    preparedStatement.setInt(1, 1);

    ResultSet resultSet = preparedStatement.executeQuery();
    resultSet.next();
    String name = resultSet.getString("firstName");

    Message m = new Message("");

    logger.info("The first name from id 1 is: " + name);
  }
}
