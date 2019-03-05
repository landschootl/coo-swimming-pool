import resource.Basket;
import resource.Cubicle;
import resource.ResourcefulUser;
import resource.resourcePool.BasketPool;
import resource.resourcePool.CubiclePool;
import action.resource.FreeBasketAction;
import action.resource.FreeCubicleAction;
import action.resource.TakeBasketAction;
import action.resource.TakeCubicleAction;
import action.scheduler.SequentialScheduler;
import action.swimmer.DressAction;
import action.swimmer.SwimAction;
import action.swimmer.UndressAction;

/**
 * Class which represents a swimmer.
 * It extends of the classe "SequentialScheduler" because the swimmer performs a sequence of actions.
 * @author Ludov_000
 *
 */
public class Swimmer extends SequentialScheduler{

	private String name;
	private BasketPool basketPool;
	private CubiclePool cubliclePool;
	private int timeUndress;
	private int timeSwim;
	private int timeDress;
	private ResourcefulUser<Basket> swimmer_basket = new ResourcefulUser<Basket>();
	private ResourcefulUser<Cubicle> swimmer_cubicle = new ResourcefulUser<Cubicle>();
	
	public Swimmer(String name, BasketPool basketPool, CubiclePool cubliclePool, int timeUndress, int timeSwim, int timeDress) {
		this.name = name;
		this.basketPool = basketPool;
		this.cubliclePool = cubliclePool;
		this.timeUndress = timeUndress;
		this.timeSwim = timeSwim;
		this.timeDress = timeDress;
		
		this.addAction(new TakeBasketAction(basketPool, swimmer_basket));
		this.addAction(new TakeCubicleAction(cubliclePool, swimmer_cubicle));
		this.addAction(new UndressAction(timeUndress));
		this.addAction(new FreeCubicleAction(cubliclePool, swimmer_cubicle));
		this.addAction(new SwimAction(timeSwim));
		this.addAction(new TakeCubicleAction(cubliclePool, swimmer_cubicle));
		this.addAction(new DressAction(timeDress));
		this.addAction(new FreeCubicleAction(cubliclePool, swimmer_cubicle));
		this.addAction(new FreeBasketAction(basketPool, swimmer_basket));
	}
	
	public void reallyDoStepTwo() {
		System.out.println(name+"'s turn");
		super.reallyDoStepTwo();
	}

	public String getName() {
		return name;
	}

	public BasketPool getBasketPool() {
		return basketPool;
	}

	public CubiclePool getCubliclePool() {
		return cubliclePool;
	}

	public int getTimeUndress() {
		return timeUndress;
	}
	
	public int getTimeSwim() {
		return timeSwim;
	}

	public int getTimeDress() {
		return timeDress;
	}

	public ResourcefulUser<Basket> getSwimmer_basket() {
		return swimmer_basket;
	}

	public ResourcefulUser<Cubicle> getSwimmer_cubicle() {
		return swimmer_cubicle;
	}
	
}
