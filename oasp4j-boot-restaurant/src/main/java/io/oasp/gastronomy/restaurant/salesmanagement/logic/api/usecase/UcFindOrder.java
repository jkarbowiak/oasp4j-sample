package io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderCto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderSearchCriteriaTo;

import java.util.List;

/**
 * Interface of {@link io.oasp.gastronomy.restaurant.general.logic.base.AbstractUc use case} to get specific or all
 * {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto orders}.
 *
 * @author mvielsac
 */
public interface UcFindOrder {

  /**
   * @param criteria the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderSearchCriteriaTo}.
   * @return the {@link java.util.List} of matching {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto}s.
   */
  List<OrderEto> findOrderEtos(OrderSearchCriteriaTo criteria);

  /**
   * @param criteria the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderSearchCriteriaTo}.
   * @return the {@link java.util.List} of matching {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderCto}s.
   */
  List<OrderCto> findOrderCtos(OrderSearchCriteriaTo criteria);

  /**
   * @param order the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto}.
   * @return the corresponding {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderCto} (order with order-positions).
   */
  OrderCto findOrderCto(OrderEto order);

  /**
   * This method returns an {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto order}.
   *
   * @param orderId identifier of the searched {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto order}
   * @return the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto order} with the given identifier. Will be <code>null</code> if the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto
   *         order} does not exist.
   */
  OrderEto findOrder(Long orderId);

  /**
   * This method returns a the {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.OrderState#OPEN
   * open} {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto order} for the specified table.
   *
   * @param tableId the {@link io.oasp.gastronomy.restaurant.tablemanagement.common.api.Table#getId() table ID} the
   *        requested order shall be {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto#getTableId() associated} with.
   * @return the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto order} {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto#getTableId() associated} with the given <code>tableId</code> in
   *         {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.OrderState#OPEN open}
   *         {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto#getState() state} or <code>null</code> if no such {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto order} exists.
   */
  OrderEto findOpenOrderForTable(Long tableId);

}
