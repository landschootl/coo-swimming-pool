package action.scheduler;

import exception.ActionFinishedException;
import action.Action;

/**
 * Class which executes the action in sequential way( to wait the end of the action before to pass on the other action).
 * @author Ludov_000
 *
 */
public class SequentialScheduler extends Scheduler {

	@Override
	public void reallyDoStepTwo() {
		// TODO Auto-generated method stub
		Action nextAction = actions.get(0);
		try {
			nextAction.doStep();
		} catch (ActionFinishedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(nextAction.isFinished())
			actions.remove(0);
	}

}
