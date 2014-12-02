package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.MenuItem;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author loverbec
 */
@MappedSuperclass
public abstract class MenuItemEntity extends ApplicationPersistenceEntity implements MenuItem {

  private static final long serialVersionUID = 1L;

  private String name;

  private String description;

  /**
   * The constructor.
   */
  public MenuItemEntity() {

    super();
  }

  /**
   * {@inheritDoc}
   */
  @Column(name = "name"/* , unique = true */)
  @Override
  public String getName() {

    return this.name;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * {@inheritDoc}
   */
  @Column(name = "description")
  @Override
  public String getDescription() {

    return this.description;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setDescription(String description) {

    this.description = description;
  }

}
