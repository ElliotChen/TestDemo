package idv.elliot.util;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateUtilsTest {
	
	@BeforeClass
	public static void init() {
		/*
		 * 利用@BeforeClass 來做測試環境的初始化, 被標為@BeforeClass的method在此Test Class僅會執行一次。
		 * 可以想像就如同一般Class的 static block
		 * 
		 * static {
		 * 
		 * }
		 */
	}
	
	@Before
	public void before() {
		/*
		 * 利用@Before來做每個TestMethod要先處理的
		 * */
	}
	
	@After
	public void after() {
		
	}
	
	
	@Test
	public void testParseDate() {
		
	}
}
