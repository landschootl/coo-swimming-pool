package resource.resourcePool;

import org.junit.After;
import org.junit.Before;

/**
 * 
 * @author Ludov_000
 *
 */
public class CubiclePoolTest extends ResourcePoolTest {

	@Before
	public void setUp() throws Exception {
		resourcePool = new CubiclePool(5);
	}

	@After
	public void tearDown() throws Exception {
	}

}
