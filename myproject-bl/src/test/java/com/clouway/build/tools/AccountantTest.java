package com.clouway.build.tools;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class AccountantTest {

  @Test
  public void getTaxes() {
    Accountant accountant = new Accountant(20);

    assertThat(accountant.getTaxes(100), is(equalTo(20d)));
  }

}