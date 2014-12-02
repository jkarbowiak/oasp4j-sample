package io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.DrinkEto;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.MealEto;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductFilter;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductSortBy;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SideDishEto;

import java.util.List;

/**
 * Interface for the usecsae to find {@link io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.ProductEto products}.
 *
 * @author mvielsac
 */
public interface UcFindProduct {

  /**
   * Gets a {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Product} using its entity identifier.
   *
   * @param id is the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Product#getId() product ID}.
   * @return the requested {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Product} or <code>null</code>
   *         if no such {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Product} exists.
   */
  ProductEto findProduct(Long id);

  /**
   * Gets a {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Meal} using its entity identifier.
   *
   * @param id is the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Meal#getId() product ID}.
   * @return the requested {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Meal} or <code>null</code> if
   *         no such {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Meal} exists.
   */
  MealEto findMeal(Long id);

  /**
   * Gets a {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Drink} using its entity identifier.
   *
   * @param id is the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Drink#getId() product ID}.
   * @return the requested {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Drink} or <code>null</code>
   *         if no such {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Drink} exists.
   */
  DrinkEto findDrink(Long id);

  /**
   * Gets a {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.SideDish} using its entity identifier.
   *
   * @param id is the {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.SideDish#getId() product ID}.
   * @return the requested {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.SideDish} or
   *         <code>null</code> if no such {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.SideDish}
   *         exists.
   */
  SideDishEto findSideDish(Long id);

  /**
   * @return the {@link java.util.List} with all {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Product}s.
   */
  List<ProductEto> findAllProducts();

  /**
   * @return the {@link java.util.List} with all {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Meal meals}.
   */
  List<MealEto> findAllMeals();

  /**
   * @return the {@link java.util.List} with all {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Drink drinks}.
   */
  List<DrinkEto> findAllDrinks();

  /**
   * @return the {@link java.util.List} with all {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.SideDish side
   *         dishes}.
   */
  List<SideDishEto> findAllSideDishes();

  /**
   * Returns the {@link java.util.List} of filtered products sorted according to the specification.
   *
   * @param productFilterBo filter specification
   * @param sortBy sorting specification
   * @return a {@link java.util.List} of filtered products
   */
  List<ProductEto> findProductsFiltered(ProductFilter productFilterBo, ProductSortBy sortBy);
}
