/*
Daniel Herbowy
Chaparral Star Academy
LoginDraftCAS v.1.1
 */
package logindraftcsa;



/**
 *
 * @author Daniel
 */
public class LoginDraftCSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        infos();
        clearConsole();
        
        dateTime(2,35,25,9,2015);
        clearConsole();
        greeting("User");
        clearConsole();
        clearConsole();
        clearConsole();
        
       
    }
    public static void infos() {

        System.out.println("14046 Summit Drive");
        System.out.println("Austin, Texas 78728");
        System.out.println("512.947.4665");
    }
    public static void dateTime(int hour, int minute, int day, int month, int year) {
        System.out.print("Time: ");
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
        System.out.print("Date: ");
        System.out.print(day);
        System.out.print("/");
        System.out.print(month);
        System.out.print("/");
        System.out.println(year);
    }
    public static void greeting(String name) {
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");
    
    }
    
    public static void clearConsole(){
           try {
        
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
    
  
        }
        catch (final Exception e)
        {
            
        }
    }
}
            //  Handle any exceptions.
        

    
        
        
            
    
            
        

    

