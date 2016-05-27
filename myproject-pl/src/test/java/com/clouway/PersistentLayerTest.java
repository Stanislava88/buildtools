package com.clouway;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple Demo.
 */
public class PersistentLayerTest {
  @Test
  public void happyPath() throws Exception {
    assertThat("Lilia", is("Lilia"));
  }
}
