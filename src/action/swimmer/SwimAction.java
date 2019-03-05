package action.swimmer;

/**
 * Class which represents the action of swimming.
 * @author Ludov_000
 *
 */
public class SwimAction extends ForeseebleAction {

	public SwimAction(int timeToEnd) {
		super(timeToEnd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "swimming ("+(totalTime-remainingTime)+"/"+totalTime+")";
	}
	
}
