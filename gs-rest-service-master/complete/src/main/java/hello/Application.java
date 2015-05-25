// AUTHOR :: PUNIT SHARMA
// APPLICATION STARTS HERE
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    // FUNCTION ADDED
    public static void fn(){
    	
    	System.out.println("Demo function");
    }
    
    // ADDING ADD1 FUNCTION
    public static void add1(){
    	
    	System.out.println("Add1 function");
    }
    
    // ADDING ADD1 FUNCTION
    public static void add2(){
    	
    	System.out.println("Add2 function");
    }
}
