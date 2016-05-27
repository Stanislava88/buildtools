package com.clouway;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Unit test for simple Demo.
 */
public class MessageServiceTest {
  @Test
  public void testName() throws Exception {
    Message message = new Message("Hello");
    String actual = message.getContent();

    assertThat(actual, is("Hello"));
  }
}
