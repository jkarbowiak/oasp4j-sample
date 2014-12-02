package io.oasp.gastronomy.restaurant.salesmanagement.logic.impl.usecase;

import io.oasp.gastronomy.restaurant.salesmanagement.dataaccess.api.OrderPositionEntity;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcFindOrderPosition;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.base.usecase.AbstractOrderPositionUc;

import java.util.List;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcFindOrderPosition}.
 *
 * @author jozitz
 */
@Named
public class UcFindOrderPositionImpl extends AbstractOrderPositionUc implements UcFindOrderPosition {

  private static final Logger LOG = LoggerFactory.getLogger(UcFindOrderPositionImpl.class);

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderPositionEto findOrderPosition(Long orderPositionId) {

    LOG.debug("Get order position.");
    OrderPositionEntity orderPositionEntities = getOrderPositionDao().findOne(orderPositionId);
    OrderPositionEto orderPositionBo = getBeanMapper().map(orderPositionEntities, OrderPositionEto.class);
    return orderPositionBo;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<OrderPositionEto> findOrderPositionsByOrderId(Long orderId) {

    List<OrderPositionEntity> positions = getOrderPositionDao().findOrderPositionsByOrder(orderId);
    return getBeanMapper().mapList(positions, OrderPositionEto.class);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<OrderPositionEto> findOpenOrderPositionsByOrderId(Long orderId) {

    LOG.debug("Get all open order positions for order id '" + orderId + "'.");
    return getBeanMapper()
        .mapList(getOrderPositionDao().findOpenOrderPositionsByOrder(orderId), OrderPositionEto.class);
  }

}
