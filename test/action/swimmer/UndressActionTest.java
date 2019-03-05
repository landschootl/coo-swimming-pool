package action.swimmer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Ludov_000
 *
 */
public class UndressActionTest extends ForeseebleActionTest {

	@Before
	public void setUp() throws Exception {
		foreseebleAction = new UndressAction(2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void description() {
		assertEquals(foreseebleAction.description(), "undressing ("+0+"/"+2+")");
	}

}
