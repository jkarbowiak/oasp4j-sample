package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferFilter;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferSortBy;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

import java.util.List;

/**
 * {@link io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationDao Data Access Object} for {@link OfferEntity} entity.
 *
 * @author loverbec
 */
public interface OfferDao extends ApplicationDao<OfferEntity>, MasterDataDao<OfferEntity> {

  /**
   * Returns a {@link java.util.List} of filtered {@link OfferEntity}s.
   *
   * @param offerFilterBo is the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferFilter offers filter criteria}. Any value, that should be applied as a
   *        filter, have to be different to <code>null</code>.
   * @param sortBy is the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferSortBy} attribute, which defines the sorting.
   *
   * @return the {@link java.util.List} with all {@link OfferEntity}s that match the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferFilter offers filter criteria}.
   */
  List<OfferEntity> findOffersFiltered(OfferFilter offerFilterBo, OfferSortBy sortBy);

}
