package action.swimmer;

/**
 * Class which represents the action of undressing.
 * @author Ludov_000
 *
 */
public class UndressAction extends ForeseebleAction {

	public UndressAction(int timeToEnd) {
		super(timeToEnd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "undressing ("+(totalTime-remainingTime)+"/"+totalTime+")";
	}
	
}
