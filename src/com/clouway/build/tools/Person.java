package com.clouway.build.tools;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Person {
  static Logger log = LogManager.getLogger(Person.class);


  /**
   * Prints 'I ate' and a food name
   *
   * @param food the food name
   */
  public String eat(String food) {
    String message = "I ate " + food + ".";
    log.info(message);
    return message;
  }
}
