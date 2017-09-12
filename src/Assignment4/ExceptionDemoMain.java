package Assignment4;
//In here importing class, which are belong from java.io.IOException.
import java.io.IOException;
/**
 * In here creating a child lass ExceptionDemoMain and 
 * extending the Parent class as mentioned in question..
 * @author Vishwas
 *
 */
public class ExceptionDemoMain  extends ExceptionDemo {
	/**
	 * and in the child class adding a throws statement and 
	 * throwing another Exception 
	 * different from the parent class Exception.. 
	 * @param args
	 * @throws NullPointerException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
		public static void main(String [] args) throws NullPointerException, ClassNotFoundException, IOException{
			//window console
	        System.out.println("Handling the same exception");
	        //In here calling the check method.
	        checkException(100);

	}

}
