package idv.elliot.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
/**
 * Demo how to create a DataSource instance.
 * 利用Spring 提供的DriverManagerDataSource產生DataSource
 * @author elliot
 *
 */
public class DataSourceTest {
	public static DataSource dataSource;

	@BeforeClass
	public static void init() throws Exception {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("org.h2.Driver");
		dmds.setUrl("jdbc:h2:tcp://localhost/~/test");
		dmds.setUsername("sa");
		dmds.setPassword("");
		
		dataSource = dmds;
	}
	
	@AfterClass
	public static void finish() {
		dataSource = null;
	}

	@Test
	public void testMethod1() throws SQLException {
		Connection connection = dataSource.getConnection();
		connection.close();
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.execute("SELECT 1");
	}
}
