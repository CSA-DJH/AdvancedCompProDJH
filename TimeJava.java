/*
Daniel Herbowy
Chaparral Star Academy
Time.Java v1
 */
package time.java;

/**
 *
 * @author Daniel Herbowy
 */
public class TimeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int Hour=19;
    int Minute=10;
    int second=10;
    int seconds=Hour*60*60+second;
    System.out.print(seconds);
    System.out.println(" Seconds since Midnight");
    int total=86400;
    System.out.print(total-seconds);
    System.out.println(" Seconds till midnight");
    int per=Hour*100/24;
    System.out.print(per);
    System.out.println("% of the day has passed");
    
    }
    
}
