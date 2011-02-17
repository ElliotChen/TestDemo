package idv.elliot.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicTest {

	private static final Logger logger = LoggerFactory.getLogger(BasicTest.class);
	private long startTime = 0;

	@BeforeClass
	public static void init() {
		/*
		 * 利用@BeforeClass 來做測試環境的初始化, 被標為@BeforeClass的method在此Test Class僅會執行一次。 可以想像就如同一般Class的 static block
		 * 
		 * static {
		 * 
		 * }
		 */
		logger.info("Run init()");
	}
	
	@AfterClass
	public static void close() {
		/*
		 * 利用@AfterClass 來做測試環境資源的釋放, 被標為@AfterClass者，在所有被標記@Test的method完後才會執行。
		 */
		logger.info("Run close()");
	}

	@Before
	public void before() {
		/*
		 * 利用@Before來做每個TestMethod 執行前要先重覆處理的動作
		 */
		// 利用startTime來取得每個TestMethod的開始時間
		startTime = System.currentTimeMillis();
	}

	@After
	public void after() {
		/*
		 * 利用@After來做每個TestMethod 執行完成後要重覆處理的動作
		 */

		// 輸出TestMethod執行所花費的時間
		logger.info("Used Time: [{}]", System.currentTimeMillis() - startTime);

		// 重置startTime
		startTime = 0;
	}

	@Test
	public void testMethod1() {
		// Does nothing.
		logger.info("Method1");
	}

	@Test
	public void testMethod2() {
		// Does nothing.
		logger.info("Method2");
	}
	
	@Ignore
	@Test
	public void testMethod3() {
		/*
		 * 利用@Ignore來取消尚未完成的Test
		 */
		logger.info("Method3");
	}
}
