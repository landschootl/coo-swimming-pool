package action.resource;

import static org.junit.Assert.assertEquals;

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
public class TakeBasketActionTest extends ResourceActionTest<Basket> {
	
	@Before
	public void setUp() throws Exception {
		resourcePool = new BasketPool(5);
		resourceAction = new TakeBasketAction((BasketPool) resourcePool, resourcefulUser);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void reallyDoStep() {
		super.takeResourceTest();
	}
	
	@Test
	public void description() {
		assertEquals(resourceAction.description(), " trying to take ressource from pool basket...");
	}

}
