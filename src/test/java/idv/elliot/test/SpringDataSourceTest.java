package idv.elliot.test;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Demo how to create a DataSource instance with spring configuration.
 * 利用Spring Xml Configuration 取得DataSource
 * @author elliot
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "SpringDataSourceTest.xml" })
public class SpringDataSourceTest {
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testDataSource() {
		Assert.assertNotNull(dataSource);
	}
}
