package io.oasp.gastronomy.restaurant.tablemanagement.service.api.rest;

import io.oasp.gastronomy.restaurant.tablemanagement.logic.api.to.TableEto;

/**
 * This is the interface for a service exposing the functionality of the
 * {@link io.oasp.gastronomy.restaurant.tablemanagement.logic.api.Tablemanagement} component.
 * 
 * @author hohwille
 */
public interface TableManagmentRestService {

  /**
   * @see io.oasp.gastronomy.restaurant.tablemanagement.logic.api.Tablemanagement#findTable(Long)
   * 
   * @param id is the {@link io.oasp.gastronomy.restaurant.tablemanagement.logic.api.to.TableEto#getId() ID}.
   * @return the requested {@link io.oasp.gastronomy.restaurant.tablemanagement.logic.api.to.TableEto table}.
   */
  TableEto getTable(Long id);

}
