package io.oasp.gastronomy.restaurant.salesmanagement.logic.impl;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.common.base.AbstractBeanMapperSupport;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto;
import io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.OrderPositionState;
import io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.PaymentStatus;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.Salesmanagement;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.BillEto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderCto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderEto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderSearchCriteriaTo;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.PaymentData;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcChangeTable;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcFindBill;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcFindOrder;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcFindOrderPosition;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcManageBill;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcManageOrder;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcManageOrderPosition;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.impl.usecase.UcFindOrderPositionImpl;
import io.oasp.gastronomy.restaurant.tablemanagement.logic.api.to.TableEto;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * This is the implementation of {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.Salesmanagement}.
 *
 * @author hohwille
 */
@Named
public class SalesmanagementImpl extends AbstractBeanMapperSupport implements Salesmanagement {

  private UcFindOrderPosition ucFindOrderPosition;

  private UcManageOrderPosition ucManageOrderPosition;

  private UcFindOrder ucFindOrder;

  private UcManageOrder ucManageOrder;

  private UcFindBill ucFindBill;

  private UcManageBill ucManageBill;

  private UcChangeTable ucChangeTable;

  /**
   * The constructor.
   */
  public SalesmanagementImpl() {

    super();
  }

  /**
   * @param ucFindOrderPosition the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcFindOrderPosition} to {@link Inject}.
   */
  @Inject
  public void setUcFindOrderPosition(UcFindOrderPositionImpl ucFindOrderPosition) {

    this.ucFindOrderPosition = ucFindOrderPosition;
  }

  /**
   * @param ucManageOrderPosition the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcManageOrderPosition} to {@link Inject}.
   */
  @Inject
  public void setUcManageOrderPosition(UcManageOrderPosition ucManageOrderPosition) {

    this.ucManageOrderPosition = ucManageOrderPosition;
  }

  /**
   * @param ucFindBill the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcFindBill} to {@link Inject}.
   */
  @Inject
  public void setUcFindBill(UcFindBill ucFindBill) {

    this.ucFindBill = ucFindBill;
  }

  /**
   * @param ucFindOrder the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcFindOrder} to {@link Inject}.
   */
  @Inject
  public void setUcFindOrder(UcFindOrder ucFindOrder) {

    this.ucFindOrder = ucFindOrder;
  }

  /**
   * @param ucManageOrder the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcManageOrder} to {@link Inject}.
   */
  @Inject
  public void setUcManageOrder(UcManageOrder ucManageOrder) {

    this.ucManageOrder = ucManageOrder;
  }

  /**
   * @param ucManageBill the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcManageBill} to {@link Inject}.
   */
  @Inject
  public void setUcManageBill(UcManageBill ucManageBill) {

    this.ucManageBill = ucManageBill;
  }

  /**
   * @param ucChangeTable the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase.UcChangeTable} to {@link Inject}.
   */
  @Inject
  public void setUcChangeTable(UcChangeTable ucChangeTable) {

    this.ucChangeTable = ucChangeTable;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderEto createOrder(TableEto table) {

    return this.ucManageOrder.createOrder(table);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderEto findOrder(Long id) {

    return this.ucFindOrder.findOrder(id);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<OrderEto> findOrderEtos(OrderSearchCriteriaTo criteria) {

    return this.ucFindOrder.findOrderEtos(criteria);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<OrderCto> findOrderCtos(OrderSearchCriteriaTo criteria) {

    return this.ucFindOrder.findOrderCtos(criteria);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderCto findOrderCto(OrderEto order) {

    return this.ucFindOrder.findOrderCto(order);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderEto findOpenOrderForTable(Long tableId) {

    return this.ucFindOrder.findOpenOrderForTable(tableId);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderEto updateOrder(OrderEto order) {

    return this.ucManageOrder.updateOrder(order);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderCto updateOrder(OrderCto order) {

    return this.ucManageOrder.updateOrder(order);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void changeTable(OrderEto order, TableEto table) {

    this.ucChangeTable.changeTable(order, table);

  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderPositionEto createOrderPosition(OfferEto offer, OrderEto order, String comment) {

    return this.ucManageOrderPosition.createOrderPosition(offer, order, comment);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderPositionEto findOrderPosition(Long orderPositionId) {

    return this.ucFindOrderPosition.findOrderPosition(orderPositionId);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<OrderPositionEto> findOrderPositionsByOrderId(Long orderId) {

    return this.ucFindOrderPosition.findOrderPositionsByOrderId(orderId);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<OrderPositionEto> findOpenOrderPositionsByOrderId(Long orderId) {

    return this.ucFindOrderPosition.findOpenOrderPositionsByOrderId(orderId);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderPositionEto updateOrderPosition(OrderPositionEto order) {

    return this.ucManageOrderPosition.updateOrderPosition(order);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void markOrderPositionAs(OrderPositionEto orderPosition, OrderPositionState newState) {

    this.ucManageOrderPosition.markOrderPositionAs(orderPosition, newState);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PaymentStatus doPayment(BillEto bill) {

    return this.ucManageBill.doPayment(bill);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PaymentStatus doPayment(BillEto bill, PaymentData paymentData) {

    return this.ucManageBill.doPayment(bill, paymentData);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BillEto createBill(List<OrderPositionEto> orderPositions, Money tip) {

    return this.ucManageBill.createBill(orderPositions, tip);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BillEto findBill(Long id) {

    return this.ucFindBill.findBill(id);

  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void deleteBill(Long billId) {

    this.ucManageBill.deleteBill(billId);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderEto createOrder(OrderEto order) {

    return this.ucManageOrder.createOrder(order);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void deleteOrder(Long id) {

    this.ucManageOrder.deleteOrder(id);
  }

}
