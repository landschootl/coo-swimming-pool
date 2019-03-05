package resource.resourcePool;

import java.util.Stack;

import resource.Resource;
import exception.NoResourceAvailable;

/**
 * Class which represents the management of one resource.
 * @author Ludov_000
 *
 */
public abstract class ResourcePool {

    protected Stack<Resource> availableResources = new Stack<>();
    protected Stack<Resource> unavailableResources = new Stack<>();

    /**
     * Function which allows to take a resource and to return it.
     * @return : the resource that has took.
     * @throws NoResourceAvailable
     */
    public Resource provideResource() throws NoResourceAvailable {
        if(availableResources.isEmpty())
        	throw new NoResourceAvailable();
    	return unavailableResources.push(availableResources.pop());
    }
    /**
     * Function which allows to free/ to give back a resource.
     * @param r : the resource to free
     * @throws NoResourceAvailable
     */
    public void freeResource(Resource r) throws NoResourceAvailable {
    	if(!unavailableResources.contains(r))
    		throw new NoResourceAvailable();
    	availableResources.push(r);
    	unavailableResources.remove(r);
    }
    
	public Stack<Resource> getAvailableResources() {
		return availableResources;
	}
	
	public Stack<Resource> getUnavailableResources() {
		return unavailableResources;
	}

}
