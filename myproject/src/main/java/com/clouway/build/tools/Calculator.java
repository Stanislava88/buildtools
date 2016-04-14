package com.clouway.build.tools;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Calculator {
  private static Logger logger = Logger.getLogger(Calculator.class);

  public static void main(String[] args) {
    BasicConfigurator.configure();
    logger.info("Calculator works");
  }

  public int sum(int a, int b) {
    logger.info(a + b);
    return a + b;
  }
}
