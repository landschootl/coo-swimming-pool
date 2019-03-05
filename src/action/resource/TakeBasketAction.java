package action.resource;

import resource.Basket;
import resource.ResourcefulUser;
import resource.resourcePool.BasketPool;

/**
 * Class which allows to take a basket.
 * @author Ludov_000
 *
 */
public class TakeBasketAction extends ResourceAction<Basket> {
    
    public TakeBasketAction(BasketPool resourcePool, ResourcefulUser<Basket> resourcefulUser) {
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
		return " trying to take ressource from pool basket...";
	}

}
