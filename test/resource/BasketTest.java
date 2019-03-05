package resource;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Ludov_000
 *
 */
public class BasketTest {
	Basket basket;

	@Before
	public void setUp() throws Exception {
		basket = new Basket();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void init() {
		assertEquals(basket.description(), "I am basket.");
	}

}
