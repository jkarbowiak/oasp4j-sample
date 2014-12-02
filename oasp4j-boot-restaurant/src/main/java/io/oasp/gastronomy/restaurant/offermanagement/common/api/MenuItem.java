package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;

/**
 * This is the interface for a {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.MenuItem} what is either a {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Product} or an {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer}.
 *
 * @author hohwille
 */
public interface MenuItem extends ApplicationEntity {

  /**
   * @return a description with the details of this item.
   */
  String getDescription();

  /**
   * @param description is the new {@link #getDescription() description}.
   */
  void setDescription(String description);

  /**
   * @return the display name of this item.
   */
  String getName();

  /**
   * @param name is the new {@link #getName() name}.
   */
  void setName(String name);

}
