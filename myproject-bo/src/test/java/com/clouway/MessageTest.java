package com.clouway;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 *
 */
public class MessageTest {
  @Test
  public void happyPath() throws Exception {
    Message message = new Message("Hello");

    String actual = message.getContent();
    assertThat(actual, is("Hello"));
  }
}
