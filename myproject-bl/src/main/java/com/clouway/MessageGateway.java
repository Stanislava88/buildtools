package com.clouway;

/**
 * This interface represent the external system for sending report
 *
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public interface MessageGateway {
  /**
   * @param message message to be sent
   */
  void send(Message message);
}
