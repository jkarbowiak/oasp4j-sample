package io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto;

import java.util.List;

/**
 * Interface of {@link io.oasp.gastronomy.restaurant.general.logic.base.AbstractUc use case} to get or find specific
 * {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto order position}s.
 *
 * @author mvielsac
 */
public interface UcFindOrderPosition {
  /**
   * @param orderPositionId is the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto#getId() ID} of the requested {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}.
   * @return the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto} with the given ID. Will be <code>null</code> if the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}
   *         does not exist.
   */
  OrderPositionEto findOrderPosition(Long orderPositionId);

  /**
   * @param orderId is the {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.Order#getId() ID} of the
   *        {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.Order} for which the
   *        {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto positions} are requested.
   * @return the {@link java.util.List} of {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}s {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto#getOrderId() associated} with the
   *         given <code>orderId</code>.
   */
  List<OrderPositionEto> findOrderPositionsByOrderId(Long orderId);

  /**
   * @param orderId for which the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}s are requested.
   * @return the {@link java.util.List} of all {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}s {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto#getId() associated} with the
   *         given <code>orderId</code>. Will be the empty {@link java.util.List} if no such {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto} exists.
   */
  List<OrderPositionEto> findOpenOrderPositionsByOrderId(Long orderId);

}
