package io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto;

/**
 * Interface for the usecsae to manage an {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto offer}.
 *
 * @author mvielsac
 */
public interface UcManageOffer {

  /**
   * Deletes an {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto} by its {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto#getId() id}.
   *
   * @param offerId is the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto#getId() id} that identifies the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto} to be deleted.
   */
  void deleteOffer(Long offerId);

  /**
   * Saves an {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto}. If this {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto} does not exist, an exception will be thrown.
   *
   * @param offer the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto} to persist.
   */
  void updateOffer(OfferEto offer);

  /**
   * Creates the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto} for the first time.
   *
   * @param offer the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto} to persist.
   */
  void createOffer(OfferEto offer);

}
