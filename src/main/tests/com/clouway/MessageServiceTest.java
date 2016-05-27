package com.clouway;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class MessageServiceTest {
  @Test
  public void happyPath() throws Exception {
    MessageService messageService = new MessageService();
    String actual = messageService.getMessage("Hello");

    assertThat("Hello", is(actual));
  }
}
