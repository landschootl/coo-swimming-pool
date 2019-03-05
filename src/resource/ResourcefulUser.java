package resource;

import resource.Resource;

/**
 * Class which represents the resource that the user have.
 * @author Ludov_000
 *
 * @param <R>
 */
public class ResourcefulUser<R extends Resource> {

    protected R resource;

    public R getResource() {
        return resource;
    }
    
    public void setResource(R resource) {
        this.resource = resource;
    }
    
    public void resetResource() {
        this.resource = null;
    }
}
