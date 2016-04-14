package com.clouway.build.tools;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Accountant {
  private static Logger logger = Logger.getLogger(Accountant.class);
  public final double tax;

  public Accountant(double taxPercent) {
    this.tax = taxPercent;
  }

  public static void main(String[] args) {
    BasicConfigurator.configure();
    logger.info("accountent");
  }

  public double getTaxes(double amount) {

    double taxes = (amount / 100) * tax;
    logger.info(taxes);
    return taxes;
  }
}
