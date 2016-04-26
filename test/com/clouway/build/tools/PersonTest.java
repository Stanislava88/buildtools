package com.clouway.build.tools;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class PersonTest {
  @Test
  public void ateSomething() {
    Person person = new Person();
    String ate = person.eat("beef meat");
    assertThat(ate, is(equalTo("I ate beef meat.")));
  }
}
