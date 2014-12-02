package io.oasp.gastronomy.restaurant.salesmanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;
import io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.OrderState;

/**
 * This is the interface for an {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.Order}. It is {@link #getTableId() associated} with a
 * {@link io.oasp.gastronomy.restaurant.tablemanagement.common.api.Table} and consists of multiple {@link OrderPosition
 * positions}.
 *
 * @author hohwille
 */
public interface Order extends ApplicationEntity {

  /**
   * @return the {@link io.oasp.gastronomy.restaurant.tablemanagement.common.api.Table#getId() ID} of the associated
   *         {@link io.oasp.gastronomy.restaurant.tablemanagement.common.api.Table} where this {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.Order} was
   *         disposed.
   */
  long getTableId();

  /**
   * @param tableId the new {@link #getTableId() tableId}.
   */
  void setTableId(long tableId);

  /**
   * @return the {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.OrderState state} of this {@link io.oasp.gastronomy.restaurant.salesmanagement.common.api.Order}.
   */
  OrderState getState();

  /**
   * @param state is the new {@link #getState() state}.
   */
  void setState(OrderState state);
}
