package com.clouway.build.tools;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class CalculatorTest {

  @Test
  public void sum() {
    Calculator calculator = new Calculator();
    assertThat(calculator.sum(2, 2), is(equalTo(4)));
  }

}