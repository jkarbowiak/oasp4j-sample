package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao;

import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.DrinkEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.DrinkDao;

import javax.inject.Named;

/**
 * Implementation of {@link io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.DrinkDao}.
 *
 * @author hohwille
 */
@Named
public class DrinkDaoImpl extends ApplicationMasterDataDaoImpl<DrinkEntity> implements DrinkDao {

  /**
   * The constructor.
   */
  public DrinkDaoImpl() {

    super();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected Class<DrinkEntity> getEntityClass() {

    return DrinkEntity.class;
  }

}
