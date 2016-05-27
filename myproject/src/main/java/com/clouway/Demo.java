package com.clouway;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  private static Logger logger = Logger.getLogger(Message.class.getName());

  public static void main(String[] args) {
    BasicConfigurator.configure();

    Message message = new Message("It's time to work!");
    MessageSystem messageSystem = new MessageSystem(new MessageGateway() {
      public void send(Message message) {
      }
    });

    messageSystem.send(message);

    logger.debug("Hello this is the debug msg");
    logger.info("The msg is: " + message);
  }
}
