package action.resource;

import resource.Cubicle;
import resource.ResourcefulUser;
import resource.resourcePool.CubiclePool;

/**
 * Class which allows to go in cubicle.
 * @author Ludov_000
 *
 */
public class TakeCubicleAction extends ResourceAction<Cubicle> {
    
    public TakeCubicleAction(CubiclePool resourcePool, ResourcefulUser<Cubicle> resourcefulUser) {
		super(resourcePool, resourcefulUser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reallyDoStep() {
		// TODO Auto-generated method stub
		takeResource();
    }

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return " trying to take ressource from pool cubicle...";
	}

}
