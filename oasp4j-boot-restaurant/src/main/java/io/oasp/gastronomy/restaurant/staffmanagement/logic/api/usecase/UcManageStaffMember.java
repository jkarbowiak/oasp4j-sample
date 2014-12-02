package io.oasp.gastronomy.restaurant.staffmanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto;

/**
 * Interface of UcManageStaffMember to centralize documentation and signatures of methods.
 *
 * @author mvielsac
 */
public interface UcManageStaffMember {

  /**
   * @param staffMemberId the {@link io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto#getId() ID} of a {@link io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto} to delete.
   */
  void deleteStaffMember(Long staffMemberId);

  /**
   * @param login {@link io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto#getName() login} of a {@link io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto} to delete.
   */
  void deleteStaffMemberByLogin(String login);

  /**
   * @param staffMember The {@link io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto} to update.
   */
  void updateStaffMember(StaffMemberEto staffMember);
}
