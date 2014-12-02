package io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto;
import io.oasp.gastronomy.restaurant.tablemanagement.logic.api.to.TableEto;

/**
 * Interface of {@link io.oasp.gastronomy.restaurant.general.logic.base.AbstractUc use case} to
 * {@link #changeTable(io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto, io.oasp.gastronomy.restaurant.tablemanagement.logic.api.to.TableEto) change the table}.
 *
 * Interface of UcChangeTable to centralize documentation and signatures of methods.
 *
 * @author mvielsac
 */
public interface UcChangeTable {

  /**
   * UseCase to change from one {@link io.oasp.gastronomy.restaurant.tablemanagement.logic.api.to.TableEto table} to another. The people sitting at a table are identified by their
   * {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto order} that has to be provided as argument.
   *
   * @param order the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto order}
   * @param newTable the new {@link io.oasp.gastronomy.restaurant.tablemanagement.logic.api.to.TableEto table} to switch to.
   */
  void changeTable(OrderEto order, TableEto newTable);

}
