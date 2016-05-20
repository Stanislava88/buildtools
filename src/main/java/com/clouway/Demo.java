package com.clouway;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  private static Logger logger = Logger.getLogger(Greeter.class);

  public static void main(String[] args) {
    BasicConfigurator.configure();

    Greeter greeter = new Greeter();
    String msg=greeter.sayHello("Hello");
    logger.info(greeter.sayHello(msg));
  }
}
