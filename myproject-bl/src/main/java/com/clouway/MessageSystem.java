package com.clouway;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class MessageSystem {
  private MessageGateway gateway;
  private static Logger logger = Logger.getLogger(MessageSystem.class);

  public MessageSystem(MessageGateway gateway) {
    this.gateway = gateway;
  }

  public void send(Message msg) {
    BasicConfigurator.configure();

    gateway.send(msg);

    logger.info(msg);
  }
}
