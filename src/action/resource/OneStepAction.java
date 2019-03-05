package action.resource;

import action.Action;

/**
 * Class which represents an action which lasts only one state.
 * @author Ludov_000
 *
 */
public abstract class OneStepAction extends Action {
	
	protected boolean finish = false;
	
	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return !finish;
	}

	@Override
	public boolean isInProgress() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return finish;
	}

	public boolean isFinish() {
		return finish;
	}

}
