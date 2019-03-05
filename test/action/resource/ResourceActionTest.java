package action.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import resource.Resource;
import resource.ResourcefulUser;
import resource.resourcePool.ResourcePool;

/**
 * 
 * @author Ludov_000
 *
 */
public abstract class ResourceActionTest<R extends Resource> extends OneStepActionTest {
	protected ResourceAction<R> resourceAction;
	protected ResourcePool resourcePool;
	protected ResourcefulUser<R> resourcefulUser = new ResourcefulUser<>();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void init() {
		super.init(resourceAction);
		assertEquals(resourceAction.getResourcefulUser().getClass(), new ResourcefulUser<R>().getClass());
		assertNotNull(resourceAction.getResourcePool());
	}
	
	public void takeResourceTest() {
		resourceAction.takeResource();
		assertEquals(resourceAction.getResourcePool().getAvailableResources().size(), 4);
		assertEquals(resourceAction.getResourcePool().getUnavailableResources().size(), 1);
		assertNotNull(resourceAction.getResourcefulUser().getResource());
	}
	
	public void freeResourceTest() {
		resourceAction.freeResource();
		assertEquals(resourceAction.getResourcePool().getAvailableResources().size(), 5);
		assertEquals(resourceAction.getResourcePool().getUnavailableResources().size(), 0);
		assertNull(resourceAction.getResourcefulUser().getResource());
	}

}
