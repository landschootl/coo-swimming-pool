package action;

import exception.ActionFinishedException;

/**
 * Class which represents an action.
 * @author Ludov_000
 *
 */
public abstract class Action {
	
	/**
	 * Function which determines if the action is in starting state.
	 * @return boolean
	 */
	public abstract boolean isReady();
	/**
	 * Function which determines if the action is underway.
		 * @return boolean
	 */
	public abstract boolean isInProgress();
	/**
	 * Function which determines if the action is finished.
	 * @return boolean
	 */
	public abstract boolean isFinished();
	/**
	 * Function which represents the execution of the action. 
		 * @throws ActionFinishedException
	 */
	public void doStep() throws ActionFinishedException{
		if(isFinished())
			throw new ActionFinishedException();
		reallyDoStep();
	}
	/**
	 * Function which represents the execution's body of the action.
	 */
	public abstract void reallyDoStep();
}
