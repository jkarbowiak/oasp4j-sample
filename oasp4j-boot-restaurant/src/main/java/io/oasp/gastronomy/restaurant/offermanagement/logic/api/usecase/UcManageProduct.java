package io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto;

/**
 * Interface for the usecsae to manage an {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto product}.
 *
 * @author mvielsac
 */
public interface UcManageProduct {
  /**
   * Updates a product.
   *
   * @param product the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto} to persist.
   */
  void updateProduct(ProductEto product);

  /**
   * Creates the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto} for the first time.
   *
   * @param product the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto} to persist.
   */
  void createProduct(ProductEto product);

  /**
   * Deletes a {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto}.
   *
   * @param productId is the ID of the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto} to delete
   */
  void deleteProduct(Long productId);
}
