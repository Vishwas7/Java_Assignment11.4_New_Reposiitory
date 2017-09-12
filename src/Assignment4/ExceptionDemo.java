package Assignment4;
// In here importing class, which are belong from java.io.IOException. 
import java.io.IOException;

// creating a Parent class ExceptionDemo as mentioned in question..

class ExceptionDemo  {
	/**
	 * creating check method to check Exception..
	 * @param number
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	 protected static void checkException(int number) throws  IOException, ClassNotFoundException{
	         if(number==100){
	                throw new IOException("Exception Message First=IOException");
	         }else{
	                throw new ClassNotFoundException("Exception Message Second=ClassNotFoundException");
	         } 
	    }	
}
	

	