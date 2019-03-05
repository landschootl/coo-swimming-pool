package action.resource;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;

public abstract class OneStepActionTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	public void init(OneStepAction oneStepAction) {
		assertFalse(oneStepAction.isFinish());
	}

}
