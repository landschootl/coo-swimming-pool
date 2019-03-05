package action.resource;

import resource.Resource;
import resource.ResourcefulUser;
import resource.resourcePool.ResourcePool;
import exception.NoResourceAvailable;

/**
 *  Generic Class which represents the action corresponding to a resource.
 * @author Ludov_000
 *
 * @param <R> : Class which inherits from Resource.
 */
public abstract class ResourceAction<R extends Resource> extends OneStepAction {

	protected ResourcePool resourcePool;
	protected ResourcefulUser<R> resourcefulUser;
	
	public ResourceAction(ResourcePool resourcePool, ResourcefulUser<R> resourcefulUser) {
		// TODO Auto-generated constructor stub
		this.resourcePool=resourcePool;
		this.resourcefulUser=resourcefulUser;
	}
	
	/**
	 * Function which allows to take a resource.
	 */
	@SuppressWarnings("unchecked")
	public void takeResource(){
		// TODO Auto-generated method stub
		try {
			System.out.print(description());
			resourcefulUser.setResource((R) resourcePool.provideResource());
			actionSuccess();
		} catch (NoResourceAvailable e) {
			// TODO Auto-generated catch block
			actionFailed();
		}
	}
	/**
	 * Function which allows to free a resource.
	 */
	public void freeResource(){
		// TODO Auto-generated method stub
		try {
			System.out.print(description());
			resourcePool.freeResource(resourcefulUser.getResource());
			resourcefulUser.resetResource();
			actionSuccess();
		} catch (NoResourceAvailable e) {
			// TODO Auto-generated catch block
			actionFailed();
		}
	}
	/**
	 * Function executed in case of sucess of the action. 
	 */
	public void actionSuccess(){
		System.out.println(" success");
		finish=true;
	}
	/**
	 * Function executed in case of fail of the action.
	 */
	public void actionFailed(){
		System.out.println(" failed");
	}
	/**
	 * Function which describes the execution of the action.
	 */
	public abstract String description();

	public ResourcePool getResourcePool() {
		return resourcePool;
	}

	public ResourcefulUser<R> getResourcefulUser() {
		return resourcefulUser;
	}

}
