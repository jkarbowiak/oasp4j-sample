package io.oasp.gastronomy.restaurant.staffmanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto;

import java.util.List;

/**
 * Interface for the use-case FindStaffMember.
 *
 * @author mvielsac
 */
public interface UcFindStaffMember {

  /**
   * @param id the {@link io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto#getId() ID} of the requested staff member.
   * @return The {@link io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto} with the given <code>id</code> or <code>null</code> if no such object exists.
   */
  StaffMemberEto findStaffMember(Long id);

  /**
   * @param login The {@link io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto#getName() login} of the requested staff member.
   * @return The {@link io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto} with the given <code>login</code> or <code>null</code> if no such object exists.
   */
  StaffMemberEto findStaffMemberByLogin(String login);

  /**
   * @return {@link java.util.List} of all existing {@link io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto staff members}.
   */
  List<StaffMemberEto> findAllStaffMembers();
}
