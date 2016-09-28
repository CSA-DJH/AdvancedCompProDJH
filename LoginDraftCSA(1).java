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
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class LoginDraftCSA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        infos();
        clearConsole();
        
        dateTime();
        clearConsole();
        greeting();
        clearConsole();
        username();
        
        
       
    }
    public static void infos() {

        System.out.println("14046 Summit Drive");
        System.out.println("Austin, Texas 78728");
        System.out.println("512.947.4665");
    }
    public static void dateTime() {
    String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    System.out.println(timeStamp);
    }
    public static void greeting() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello, ");
        System.out.print("What is your name? ");
        String name1 = keyboard.nextLine();
        System.out.println("Welcome "+name1+", to Chaparral Star Academy!");
    
    }
    public static void username(){
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
        if (initials.equals(correct1)){
            System.out.println("Welcome, "+correct1);
        }
        else{
            if (initials.equals(correct2)){
            System.out.println("Welcome, "+correct2);
        }
            else{
                if (initials.equals(correct3)){
            System.out.println("Welcome, "+correct3);
            }
                else{
                    if (initials.equals(correct4)){
            System.out.println("Welcome, "+correct4);
                }
                    else{
                        if (initials.equals(correct5)){
            System.out.println("Welcome, "+correct5);
                    }
                        else{
                            System.out.println("You are not allowed to access!");
                            username();
                        }
        }
        }
        }
        }
        
                
    
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
           