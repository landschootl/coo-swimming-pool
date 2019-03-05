package action.resource;

import resource.Basket;
import resource.ResourcefulUser;
import resource.resourcePool.BasketPool;

/**
 * Class which allows to give back a basket.
 * @author Ludov_000
 *
 */
public class FreeBasketAction extends ResourceAction<Basket> {
	
	public FreeBasketAction(BasketPool resourcePool, ResourcefulUser<Basket> resourcefulUser) {
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
		return " freeing ressource from pool basket...";
	}

}
