package customexception;

public class JithunotfoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JithunotfoundException(Object resourID) {
		super(resourID !=null ? resourID.toString():null);
		
		
	}

}
