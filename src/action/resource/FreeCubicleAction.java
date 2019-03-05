package action.resource;

import resource.Cubicle;
import resource.ResourcefulUser;
import resource.resourcePool.CubiclePool;

/**
 * Class which allows to free a cubicle.
 * @author Ludov_000
 *
 */
public class FreeCubicleAction extends ResourceAction<Cubicle> {
	
	public FreeCubicleAction(CubiclePool resourcePool, ResourcefulUser<Cubicle> resourcefulUser) {
		super(resourcePool, resourcefulUser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reallyDoStep() {
		// TODO Auto-generated method stub
		freeResource();
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return " freeing ressource from pool cubicle...";
	}

}
