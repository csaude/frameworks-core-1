/**
 *
 */
package mz.co.mozview.frameworks.core.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import mz.co.mozview.frameworks.core.model.GenericEntity;

/**
 * @author Stélio Klésio Adriano Moiane
 *
 */
public interface GenericDAO<T, V extends Serializable> {

	public T getById(final Long id);

	public List<T> getAll();

	@SuppressWarnings("hiding")
	public <T extends GenericEntity> T create(final Long userContextId, final T entity);

	@SuppressWarnings("hiding")
	public <T extends GenericEntity> T update(final Long userContextId, final T entity);

	@SuppressWarnings("hiding")
	public <T extends GenericEntity> void delete(final Long userContextId, final T entity);

	@SuppressWarnings("hiding")
	public <T extends GenericEntity> void deleteById(final Long userContextId, final Long entityId);

	public List<T> findByNamedQuery(final String queryName, final Map<String, ? extends Object> params);

	public T findSingleByNamedQuery(final String name, final Map<String, ? extends Object> params);

	public Query findByQuery(final String name, final Map<String, ? extends Object> params);

	public <Y> List<Y> findByNamedQuery(final String queryName, final Map<String, ? extends Object> params,
			final Class<Y> clazz);

	public <Y> Y findSingleByNamedQuery(final String queryName, final Map<String, ? extends Object> params,
			final Class<Y> clazz);
}
