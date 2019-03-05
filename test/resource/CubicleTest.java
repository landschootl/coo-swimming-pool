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
public class CubicleTest {
	Cubicle cubicle;
	
	@Before
	public void setUp() throws Exception {
		cubicle = new Cubicle();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void init() {
		assertEquals(cubicle.description(), "I am Cubicle.");
	}

}
