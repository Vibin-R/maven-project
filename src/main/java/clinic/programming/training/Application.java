 package clinic.programming.training;
import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class Application {

	public int countWords(String s){
		String[] arr = StringUtils.split(s,' ');
		return (arr==null)?0:arr.length;
	}
   
	public Application() {
        	System.out.println ("Inside Application");
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	int c = app.countWords("hello world");
	System.out.println(c);
    }
}