package exception;

/**
 * Created by nanosvir on 30 Oct 15.
 * n.svirchevsky@gmail.com
 */
public class NoResourceAvailable extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoResourceAvailable(){
		super("The action is not disponible.");
	}
}
