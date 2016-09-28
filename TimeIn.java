/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timein;

/**
 *
 * @author danielherbowy
 */
public class TimeIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Hello Billy");
    System.out.print("Timed in at ");
    int Timein;
    Timein = 1200;
    System.out.println(Timein);
    int Timeout;
    Timeout = 1730;
  
    System.out.print("Tied out at ");
    System.out.println(Timeout);
    int Total;
    Total=Timeout-Timein;
    System.out.print("Worked ");
   
    System.out.print(Total);
    System.out.println(" hours");
    
    
    
   
    }
    
}
