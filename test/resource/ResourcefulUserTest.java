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
public class ResourcefulUserTest {
	ResourcefulUser<Basket> resourcefulUser;
	Basket basket;

	@Before
	public void setUp() throws Exception {
		resourcefulUser = new ResourcefulUser<>();
		basket = new Basket();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void init() {
		assertNull(resourcefulUser.getResource());
	}
	
	@Test
	public void setResourceTest() {
		resourcefulUser.setResource(basket);
		assertEquals(resourcefulUser.getResource(), basket);
	}
	
	@Test
	public void resetResourceTest() {
		resourcefulUser.resetResource();
		assertEquals(resourcefulUser.getResource(), null);
	}

}
