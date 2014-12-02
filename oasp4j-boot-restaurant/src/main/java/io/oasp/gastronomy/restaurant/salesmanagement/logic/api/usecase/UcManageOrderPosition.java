package io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto;
import io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.OrderPositionState;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto;

/**
 * Interface of UcManageOrderPosition to centralize documentation and signatures of methods.
 *
 * @author mvielsac
 */
public interface UcManageOrderPosition {

  /**
   * Creates an {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto} for the given {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto} and a given {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto}.
   *
   * @param offer is the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto} to be ordered.
   * @param order is the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto order} for which the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}s are
   * @param comment is the comment for special orders
   *
   * @return the new {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}
   */
  OrderPositionEto createOrderPosition(OfferEto offer, OrderEto order, String comment);

  /**
   * Saves or updates the given {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}.
   *
   * @param orderPosition is the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto} to persist.
   * @return the saved {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}.
   */
  OrderPositionEto updateOrderPosition(OrderPositionEto orderPosition);

  /**
   * Marks the given {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto} as 'chosen' {@link OrderPositionState}.
   *
   * @param orderPosition {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}.
   * @param newState new {@link OrderPositionState}.
   */
  void markOrderPositionAs(OrderPositionEto orderPosition, OrderPositionState newState);

}
