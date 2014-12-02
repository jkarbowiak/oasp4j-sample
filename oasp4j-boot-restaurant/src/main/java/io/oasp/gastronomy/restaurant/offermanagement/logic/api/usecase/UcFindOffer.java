package io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferCto;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferFilter;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferSortBy;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto;

import java.util.List;

/**
 * Interface for the usecsae to find {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto offers}.
 *
 * @author mvielsac
 */
public interface UcFindOffer {

  /**
   * Gets an {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto} using its entity identifier.
   *
   * @param id is the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer#getId() offer ID}.
   * @return the requested {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer} or <code>null</code>
   *         if no such {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer} exists.
   */
  OfferEto findOffer(Long id);

  /**
   * Gets an {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferCto} using its entity identifier.
   *
   * @param id is the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer#getId() offer ID}.
   * @return the requested {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer} or <code>null</code>
   *         if no such {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer} exists.
   */
  OfferCto findOfferCto(Long id);

  /**
   * @return the {@link java.util.List} with all available {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto}s.
   */
  List<OfferEto> findAllOffers();

  /**
   * Checks, whether a given {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto} is in use by at least one {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto}.
   *
   * @param product product to check if it is in use
   * @return <code>true</code>, if there are no {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto offers}, that use the given {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto}.
   *         <code>false</code> otherwise.
   */
  boolean isProductInUseByOffer(ProductEto product);

  /**
   * @param offerFilterBo is the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferFilter offers filter criteria}
   * @param sortBy is the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferSortBy} attribute, which defines the sorting.
   *
   * @return the {@link java.util.List} with all {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto}s that match the {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferFilter} criteria.
   */
  List<OfferEto> findOffersFiltered(OfferFilter offerFilterBo, OfferSortBy sortBy);

}
