package action.resource;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import resource.Basket;
import resource.resourcePool.BasketPool;

/**
 * 
 * @author Ludov_000
 *
 */
public class FreeBasketActionTest extends ResourceActionTest<Basket> {
	
	@Before
	public void setUp() throws Exception {
		resourcePool = new BasketPool(5);
		resourceAction = new FreeBasketAction((BasketPool) resourcePool, resourcefulUser);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void reallyDoStep() {
		super.freeResourceTest();
	}
	
	@Test
	public void description() {
		assertEquals(resourceAction.description(), " freeing ressource from pool basket...");
	}

}

