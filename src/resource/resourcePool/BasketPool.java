package resource.resourcePool;

import resource.Basket;

/**
 * Class which represents the management of baskets.
 * @author Ludov_000
 *
 */
public class BasketPool extends ResourcePool {

    public BasketPool(int capacityNumber) {
        while (capacityNumber-- > 0) {
        	availableResources.push(new Basket());
        }
    }
}
