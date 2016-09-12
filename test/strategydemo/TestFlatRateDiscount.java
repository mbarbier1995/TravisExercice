package strategydemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFlatRateDiscount {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Order order = new Order("John", 200.24f);
		float discount = 10; 
		FlatRateDiscountStrategy strategy = new FlatRateDiscountStrategy(discount);
		order.setStrategy(strategy);
		assertEquals(190.24, order.getDiscountedPrice(), 0.00001);
	}

}
//ad depends on build file
