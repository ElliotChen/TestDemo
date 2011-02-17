package idv.elliot.service;

import idv.elliot.dao.PeopleDao;
import idv.elliot.domain.People;
import idv.elliot.exception.ObjectNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PeopleService {
	
	private static final Logger logger = LoggerFactory.getLogger(PeopleService.class);
	
	private PeopleDao peopleDao;
	
	public PeopleDao getPeopleDao() {
		return peopleDao;
	}

	public void setPeopleDao(PeopleDao peopleDao) {
		this.peopleDao = peopleDao;
	}

	public boolean notePeople(String id, String message) {
		/*
		 * 如果依id找不到People, peopleDao會拋出ObjectNotFoundException
		 */
		try {
			People people = peopleDao.findById(id);
			return true;
		} catch (ObjectNotFoundException e) {
			logger.error("Can't find People with id[{}]", id);
		}
		
		return false;
	}
}
