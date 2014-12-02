package io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderCto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto;
import io.oasp.gastronomy.restaurant.tablemanagement.logic.api.to.TableEto;

/**
 * Interface of UcMangeOrder to centralize documentation and signatures of methods.
 *
 * @author mvielsac
 */
public interface UcManageOrder {
  /**
   * Creates an {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto} for the given {@link io.oasp.gastronomy.restaurant.tablemanagement.logic.api.to.TableEto}.
   *
   * @param table for which the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto} is
   *
   * @return the new {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto}
   */
  OrderEto createOrder(TableEto table);

  /**
   * Saves or updates the given {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderCto}.
   *
   * @param order is the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderCto} to persist.
   * @return the saved {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderCto}.
   */
  OrderCto updateOrder(OrderCto order);

  /**
   * Saves or updates the given {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto}.
   *
   * @param order is the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto} to persist.
   * @return the saved {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto}.
   */
  OrderEto updateOrder(OrderEto order);

  /**
   * @param table the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto} to create.
   * @return the created OrderEto
   */
  OrderEto createOrder(OrderEto table);

  /**
   * @param id is the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto#getId() ID} of the order to delete.
   */
  void deleteOrder(Long id);
}
