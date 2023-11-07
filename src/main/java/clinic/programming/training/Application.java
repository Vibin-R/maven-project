 package clinic.programming.training;
import java.util.*;

public class Application {
    public int countWords(String word){
	String[] s = word.split(" ");
	return s.length;
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