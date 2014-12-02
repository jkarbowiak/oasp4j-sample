package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.ProductEntity;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductFilter;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductSortBy;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

import java.util.List;

/**
 * {@link io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationDao Data Access Object} for {@link ProductEntity} entity.
 *
 * @author loverbec
 */
public interface ProductDao extends ApplicationDao<ProductEntity>, MasterDataDao<ProductEntity> {

  /**
   * @param productFilter is the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductFilter}.
   * @param sortBy is the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductSortBy} criteria.
   * @return the {@link java.util.List} of filtered and sorted {@link ProductEntity products}.
   */
  List<ProductEntity> findProductsFiltered(ProductFilter productFilter, ProductSortBy sortBy);

}
