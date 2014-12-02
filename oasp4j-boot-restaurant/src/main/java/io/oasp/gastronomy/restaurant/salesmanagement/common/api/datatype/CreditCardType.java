package io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype;

/**
 * Enum with the types of a credit card.
 *
 * @author etomety
 */
public enum CreditCardType {

  /** This represents the VISA card. */
  VISA,

  /** This represents the American Express card. */
  AMEX,

  /** This represents the Mastercard. */
  MASTERCARD;

  /**
   * @return <code>true</code>, if the {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.CreditCardType} equals {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.CreditCardType#VISA}. <code>false</code>
   *         otherwise.
   */
  public boolean isVisa() {

    return this == VISA;
  }

  /**
   * @return <code>true</code>, if the {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.CreditCardType} equals {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.CreditCardType#AMEX}. <code>false</code>
   *         otherwise.
   */
  public boolean isAmex() {

    return this == AMEX;
  }

  /**
   * @return <code>true</code>, if the {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.CreditCardType} equals {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.CreditCardType#MASTERCARD}.
   *         <code>false</code> otherwise.
   */
  public boolean isMastercard() {

    return this == MASTERCARD;
  }
}
