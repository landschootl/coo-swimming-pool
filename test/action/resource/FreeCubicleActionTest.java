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
public class FreeCubicleActionTest extends ResourceActionTest<Cubicle> {
	
	@Before
	public void setUp() throws Exception {
		resourcePool = new CubiclePool(5);
		resourceAction = new FreeCubicleAction((CubiclePool) resourcePool, resourcefulUser);
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
		assertEquals(resourceAction.description(), " freeing ressource from pool cubicle...");
	}

}
