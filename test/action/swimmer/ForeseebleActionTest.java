package action.swimmer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exception.ActionFinishedException;
import action.Action;
import action.ActionTest;

/**
 * 
 * @author Ludov_000
 *
 */
public abstract class ForeseebleActionTest extends ActionTest {
	ForeseebleAction foreseebleAction;
	
	@Override
	public Action createAction() {
		// TODO Auto-generated method stub
		return createForeseebleAction(10);
	}
	
	@Test
	public void doStepTest() throws ActionFinishedException {
		Action action = foreseebleAction;
		
		assertTrue(action.isReady());
		assertFalse(action.isInProgress());
		assertFalse(action.isFinished());
		
		action.doStep();
		
		assertFalse(action.isReady());
		assertTrue(action.isInProgress());
		assertFalse(action.isFinished());
		
		action.doStep();
		
		assertFalse(action.isReady());
		assertFalse(action.isInProgress());
		assertTrue(action.isFinished());
	}

}
