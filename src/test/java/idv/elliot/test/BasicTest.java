package idv.elliot.test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicTest {
	
	private static final Logger logger = LoggerFactory.getLogger(BasicTest.class);
	private long startTime = 0;
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
		logger.info("Run init()");
	}
	
	@Before
	public void before() {
		/*
		 * 利用@Before來做每個TestMethod要先重覆處理的
		 * */
		//利用startTime來取得每個TestMethod的開始時間
		startTime = System.currentTimeMillis();
	}
	
	@After
	public void after() {
		/*
		 * 利用@After來做每個TestMethod 執行完成後要重覆處理的動作
		 * */
		
		//輸出TestMethod執行所花費的時間
		logger.info("Used Time: [{}]", System.currentTimeMillis() - startTime );
		
		//重置startTime
		startTime = 0;
	}
	
	
	@Test
	public void testMethod1() {
		//Does nothing.
		logger.info("Method1");
	}
	
	@Test
	public void testMethod2() {
		//Does nothing.
		logger.info("Method2");
	}
}
