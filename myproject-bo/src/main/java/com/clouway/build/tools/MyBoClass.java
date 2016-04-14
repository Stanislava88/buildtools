package com.clouway.build.tools;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class MyBoClass {
  private static Logger logger = Logger.getLogger(MyBoClass.class);

  public static void main(String[] args) {
    BasicConfigurator.configure();
    logger.info("Bo module class");
  }
}
