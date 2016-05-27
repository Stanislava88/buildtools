package com.clouway;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  private static Logger logger = Logger.getLogger(MessageService.class);

  public static void main(String[] args) {
    BasicConfigurator.configure();

    MessageService messageService = new MessageService();
    String msg = messageService.getMessage("Hello");
   logger.info(messageService.getMessage(msg));
  }
}
