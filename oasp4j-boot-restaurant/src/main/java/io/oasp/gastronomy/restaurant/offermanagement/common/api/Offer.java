package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.datatype.OfferState;

/**
 * This is the interface for an {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer} that combines {@link Product}s with a price for the menu of the
 * restaurant. The combined {@link Product}s are a {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Meal}, a {@link SideDish}, and a {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Drink}. All of them
 * are optional but at least one of the three has to be present in a valid {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer}.
 *
 * @author hohwille
 */
public interface Offer extends MenuItem {

  /**
   * @return the unique number of this {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer} used in the menu. While the {@link #getId() ID} of an {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer}
   *         is auto-generated and will never change, the number may be changed if the menu gets updated. This is the
   *         identifier used by customers to displace orders.
   */
  Long getNumber();

  /**
   * @param number is the new {@link #getNumber() number}.
   */
  void setNumber(Long number);

  /**
   * Returns the field 'currentPrice'.
   *
   * @return Value of currentPrice
   */
  Money getCurrentPrice();

  /**
   * @param currentPrice is the new {@link #getCurrentPrice() price}.
   */
  void setCurrentPrice(Money currentPrice);

  /**
   * @return is the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Meal#getId() ID} of the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Meal} or <code>null</code> if no {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Meal} is contained in
   *         this {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer}.
   */
  Long getMealId();

  /**
   * @param mealId is the new {@link #getMealId() mealId}.
   */
  void setMealId(Long mealId);

  /**
   * @return is the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Drink#getId() ID} of the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Drink} or <code>null</code> if no {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Drink} is contained
   *         in this {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer}.
   */
  Long getDrinkId();

  /**
   * @param drinkId is the new {@link #getDrinkId() drinkId}.
   */
  void setDrinkId(Long drinkId);

  /**
   * @return is the {@link SideDish#getId() ID} of the {@link SideDish} or <code>null</code> if no {@link SideDish} is
   *         contained in this {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer}.
   */
  Long getSideDishId();

  /**
   * @param sideDishId is the new {@link #getSideDishId() sideDishId}.
   */
  void setSideDishId(Long sideDishId);

  /**
   * @return the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.datatype.OfferState state} of this {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer}.
   */
  OfferState getState();

  /**
   * @param state is the new {@link #getState() state}.
   */
  void setState(OfferState state);
}
