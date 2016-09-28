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
import java.util.Scanner;           // importing for dat and time and input
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class LoginDraftCSA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        infos();  // school info
        clearConsole();   //a wait
        
        dateTime();  // date and time
        clearConsole();//wait
        greeting();// a greeting
        clearConsole();//a wait
        username();// a username check
        
        
       
    }
    public static void infos() { //school info

        System.out.println("14046 Summit Drive");
        System.out.println("Austin, Texas 78728");
        System.out.println("512.947.4665");
    }
    public static void dateTime() { //date and time
    String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    System.out.println(timeStamp);
    }
    public static void greeting() { // a greeting
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello, ");
        System.out.print("What is your name? ");
        String name1 = keyboard.nextLine();
        System.out.println("Welcome "+name1+", to Chaparral Star Academy!");
    
    }
    public static void username(){  // username check
        System.out.println("----------------------------------------------------------");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("(Capital leters please)");
        System.out.print("What are your initials? ");
        String initials = keyboard.nextLine();
        String correct1=("HCD");
        String correct2=("DJH");
        String correct3=("CAP");
        String correct4=("RRA");
        String correct5=("CDP");
        if (initials.equals(correct1)||initials.equals(correct2)||initials.equals(correct3)||initials.equals(correct4)||initials.equals(correct5)){
            System.out.println("Welcome");
        }
        
                        else{
                            System.out.println("You are not allowed to access!");
                            username();
                        }
        
        
                
    
    }
    
    
    public static void clearConsole(){  // a wait method
           try {
        
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
    
  
        }
        catch (final Exception e)
        {
            
        }
    }
}
           