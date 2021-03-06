package io.oasp.gastronomy.restaurant.general.logic.base;

import io.oasp.gastronomy.restaurant.general.common.base.AbstractBeanMapperSupport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.mmm.util.entity.api.GenericEntity;

/**
 * Abstract base class for any <em>use case</em> in this application.
 *
 * @author jozitz
 */
public abstract class AbstractUc extends AbstractBeanMapperSupport {

  /**
   * The limit for {@link net.sf.mmm.util.search.base.AbstractSearchCriteria#getMaximumHitCount() maximum hit count} for
   * UI requests.
   */
  protected static final int MAXIMUM_HIT_LIMIT = 500;

  /**
   * The constructor.
   */
  public AbstractUc() {

    super();
  }

  /**
   * Creates a {@link java.util.Map} with all {@link GenericEntity entities} from the given {@link java.util.Collection} using their
   * {@link GenericEntity#getId() ID} as key. All {@link GenericEntity entities} without an
   * {@link GenericEntity#getId() ID} (<code>null</code>) will be ignored.
   *
   * @param <ID> is the generic type of the {@link GenericEntity#getId() ID}.
   * @param <E> is the generic type of the {@link GenericEntity entity}.
   * @param entities is the {@link java.util.Collection} of {@link GenericEntity entities}.
   * @return a {@link java.util.Map} mapping from {@link GenericEntity#getId() ID} to {@link GenericEntity entity}.
   */
  protected static <ID, E extends GenericEntity<ID>> Map<ID, E> getEntityMap(Collection<E> entities) {

    Map<ID, E> id2EntityMap = new HashMap<>();
    for (E entity : entities) {
      ID id = entity.getId();
      if (id != null) {
        id2EntityMap.put(id, entity);
      }
    }
    return id2EntityMap;
  }

  /**
   * Determines the {@link GenericEntity entities} to delete if <code>currentList</code> is the current list from the
   * persistence and <code>listToSave</code> is the new list that shall be saved. In other words this method selects the
   * {@link GenericEntity entities} from <code>currentList</code> that are not contained in <code>listToSave</code>.
   *
   * @param <ID> is the generic type of the {@link GenericEntity#getId() ID}.
   * @param <E> is the generic type of the {@link GenericEntity entity}.
   * @param currentEntities is the {@link java.util.Collection} of the {@link GenericEntity entities} currently persisted. We
   *        assume that all objects in this list have an {@link GenericEntity#getId() ID} value (that is not
   *        <code>null</code>).
   * @param entitiesToSave is the {@link java.util.Collection} that contains the {@link GenericEntity entities} that shall be
   *        saved. It may contain {@link GenericEntity entities} that have no {@link GenericEntity#getId() ID} that
   *        shall be newly created.
   * @return the {@link java.util.List} with the {@link GenericEntity entities} to delete.
   */
  protected static <ID, E extends GenericEntity<ID>> List<E> getEntities2Delete(Collection<E> currentEntities,
      Collection<E> entitiesToSave) {

    List<E> result = new ArrayList<>(currentEntities.size());
    Map<ID, E> entityMap = getEntityMap(entitiesToSave);
    for (E entity : currentEntities) {
      if (!entityMap.containsKey(entity.getId())) {
        // entity from currentList is not contained in listToSave...
        result.add(entity);
      }
    }
    return result;
  }

}
