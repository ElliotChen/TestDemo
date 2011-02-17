package idv.elliot.service;

import idv.elliot.dao.PeopleDao;
import idv.elliot.domain.People;
import idv.elliot.exception.ObjectNotFoundException;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class PeopleServiceTest {
	@Test
	public void testNotePeople() throws Exception {
		/*
		 * 這測試要測的是 PeopleService中的notePeople
		 * 而PeopleService所需要的Resource就僅有PeopleDao
		 */
		
		/*
		 * 利用Mockito.mock 建立一個假的PeopleDao實做
		 * 利用when()及thenReutn, thenThrow來假定回傳的結果。
		 */
		PeopleDao mock = Mockito.mock(PeopleDao.class);
		Mockito.when(mock.findById("1")).thenReturn(new People());
		Mockito.when(mock.findById("2")).thenThrow(new ObjectNotFoundException());
		
		/*
		 * 利用setter將mock的PeopleDao注入PeopleService
		 */
		PeopleService service = new PeopleService();
		service.setPeopleDao(mock);
		
		/*
		 * 利用Assert來確認回傳值是否符合預期
		 */
		boolean result = service.notePeople("1", "MSG");
		Assert.assertTrue(result);
		
		result = service.notePeople("2", "NA");
		Assert.assertFalse(result);
		
	}
}
