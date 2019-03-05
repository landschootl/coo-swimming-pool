package action.swimmer;

/**
 * Class which represents the action of dressing.
 * @author Ludov_000
 *
 */
public class DressAction extends ForeseebleAction {

	public DressAction(int timeToEnd) {
		super(timeToEnd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "dressing ("+(totalTime-remainingTime)+"/"+totalTime+")";
	}
	
}
