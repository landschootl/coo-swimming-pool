package resource.resourcePool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

import resource.Basket;
import exception.NoResourceAvailable;

/**
 * 
 * @author Ludov_000
 *
 */
public abstract class ResourcePoolTest {
	protected ResourcePool resourcePool;
	protected Stack<resource.Resource> resources = new Stack<>();
	
	@Test
	public void init() {
		assertEquals(resourcePool.getAvailableResources().size(), 5);
		assertTrue(resourcePool.getUnavailableResources().isEmpty());
	}
	
	@Test(expected = NoResourceAvailable.class)
	public void provideResourceTest() throws Exception {
		int i=0;
		while(!resourcePool.getAvailableResources().isEmpty()){
			resources.push(resourcePool.provideResource());
			assertTrue(resourcePool.getUnavailableResources().contains(resources.get(i)));
			assertFalse(resourcePool.getAvailableResources().contains(resources.get(i)));
			i++;
		}
		resourcePool.provideResource();
	}
	
	@Test(expected = NoResourceAvailable.class)
	public void freeResourceTest() throws Exception {
		int i=0;
		while(!resourcePool.getUnavailableResources().isEmpty()){
			resourcePool.freeResource(resources.get(i));
			assertFalse(resourcePool.getUnavailableResources().contains(resources.get(i)));
			assertTrue(resourcePool.getAvailableResources().contains(resources.get(i)));
			i++;
		}
		resourcePool.freeResource(new Basket());
	}

}
