package idv.elliot.dao;

import idv.elliot.domain.People;
import idv.elliot.exception.ObjectNotFoundException;

public interface PeopleDao {
	/**
	 * Throws Exception if find no people with id.
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public People findById(String id) throws ObjectNotFoundException;
}
