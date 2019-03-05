package resource.resourcePool;

import resource.Cubicle;

/**
 * Class which represents the cubicle pool, the management of cubicle.
 * @author Ludov_000
 *
 */
public class CubiclePool extends ResourcePool {

    public CubiclePool(int capacityNumber) {
        while (capacityNumber-- > 0) {
            availableResources.push(new Cubicle());
        }
    }
}
