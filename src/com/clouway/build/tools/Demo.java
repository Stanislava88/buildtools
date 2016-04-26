package com.clouway.build.tools;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 *         Demo for the Person class
 */
public class Demo {

  /**
   * PRINTS I ate rostbeef.
   *
   * @param args unused arguments
   */
  public static void main(String[] args) {
    Person person = new Person();
    System.out.println(person.eat("roast beef"));
  }
}
