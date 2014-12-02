package io.oasp.gastronomy.restaurant.salesmanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.salesmanagement.common.api.datatype.PaymentStatus;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.BillEto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto;
import io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.PaymentData;

import java.util.List;

/**
 * Interface of UcManageBill to centralize documentation and signatures of methods.
 *
 * @author mvielsac
 */
public interface UcManageBill {
  /**
   * Create a {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.BillEto} and save it in the database by linking the billed {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto order positions}
   * with it. A bill also consists of the {@link io.oasp.gastronomy.restaurant.general.common.api.datatype.Money total amount} as well as the {@link io.oasp.gastronomy.restaurant.general.common.api.datatype.Money tip}, the waiter could
   * fill in. The tip is at default 0.0.
   *
   * @param orderPositions is the {@link java.util.List} of {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderPositionEto}, the billing process places on.
   * @param tip is the waiter's {@link io.oasp.gastronomy.restaurant.general.common.api.datatype.Money}
   *
   * @return the created {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.BillEto}
   */
  BillEto createBill(List<OrderPositionEto> orderPositions, Money tip);

  /**
   * This method deletes a {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.BillEto} from the database by its given id.
   *
   * @param billId the ID of the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.BillEto} that has to be deleted.
   */
  void deleteBill(Long billId);

  /**
   * This method provides the payment process. It provides the cash-only functionality without any additional
   * {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.PaymentData}.
   *
   * @param bill is the identifier of the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.BillEto} on which the payment process takes place.
   * @return the {@link PaymentStatus status code} of the payment process.
   */
  PaymentStatus doPayment(BillEto bill);

  /**
   * This method provides the payment process.
   *
   * @param paymentDataDebitor is the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.PaymentData} which holds special data for the payment process.
   * @param bill is the identifier of the {@link io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.BillEto} on which the payment process takes place.
   * @return the {@link PaymentStatus status code} of the payment process.
   */
  PaymentStatus doPayment(BillEto bill, PaymentData paymentDataDebitor);
}
