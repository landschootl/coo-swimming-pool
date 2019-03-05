package action.scheduler;

import java.util.ArrayList;

import action.Action;

/**
 * Class which allows to have and to execute several actions.
 * @author Ludov_000
 *
 */
public abstract class Scheduler extends Action {
	
	protected boolean isInitialized = false;
	protected boolean isReady = true;
	/**
	 * Table of actions.
	 */
	protected ArrayList<Action> actions = new ArrayList<>();

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return isInitialized&&isReady;
	}

	@Override
	public boolean isInProgress() {
		// TODO Auto-generated method stub
		return isInitialized&&!isReady()&&!isFinished();
	}

	@Override
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return isInitialized&&!isReady()&&actions.isEmpty();
	}
	
	@Override
	public void reallyDoStep() {
		// TODO Auto-generated method stub
		isReady=false;
		if(isInitialized)
			reallyDoStepTwo();
	}
	/**
	 * Function which allows the execution of the secondary body of the action.
	 */
	public abstract void reallyDoStepTwo();
	/**
	 * Fonction qui permet d'ajouter une action.
	 * @param subAction : the action to add.
	 */
	public void addAction(Action subAction){
		isInitialized=true;
		if(subAction.isFinished())
			throw new IllegalArgumentException("Can't add an already finished action");
		if(isFinished())
			throw new IllegalStateException("You can't add an action to a finished sheduler");
		else
			actions.add(subAction);
	}

}
