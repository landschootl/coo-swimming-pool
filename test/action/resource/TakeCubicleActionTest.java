package action.resource;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import resource.Cubicle;
import resource.resourcePool.CubiclePool;

/**
 * 
 * @author Ludov_000
 *
 */
public class TakeCubicleActionTest extends ResourceActionTest<Cubicle> {
	
	@Before
	public void setUp() throws Exception {
		resourcePool = new CubiclePool(5);
		resourceAction = new TakeCubicleAction((CubiclePool) resourcePool, resourcefulUser);
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
		assertEquals(resourceAction.description(), " trying to take ressource from pool cubicle...");
	}

}
