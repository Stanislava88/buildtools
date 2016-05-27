package com.clouway;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 */
public class Demo {
  private static Logger logger = Logger.getLogger(Message.class);

  public static void main(String[] args) {
    BasicConfigurator.configure();

    Message message = new Message("Hello");
    logger.debug("This is debug message");
    logger.info("The content of message is: " + message.getContent());
  }
}
