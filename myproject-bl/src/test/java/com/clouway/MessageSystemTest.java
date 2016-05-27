package com.clouway;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

/**
 * Unit test for simple Demo.
 */
public class MessageSystemTest {
  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();

  private MessageGateway gateway = context.mock(MessageGateway.class);

  @Test
  public void happyPath() throws Exception {
    final Message message = new Message("Hello");

    final MessageSystem messageSystem = new MessageSystem(gateway);

    context.checking(new Expectations() {{
      oneOf(gateway).send(message);
    }});

    messageSystem.send(message);
  }
}
