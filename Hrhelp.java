/*
Daniel Herbowy
Chaparral Star Academy
12/04/2015
hrhelp v.1
*/
package hrhelp;
import java.util.Scanner;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class Hrhelp {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        List employeelist=new ArrayList<String>(asList());
        String menuinput="";
        while (!menuinput.equals("5")) {
            System.out.printf("\n\nOption 1: Employee check in; Adds a user to the employee list. \nOption 2: Check for employee; Checks if an employee is in the employee list. \nOption 3: Remove employee; Removes employee from the employee list. \nOption 4: Change employee name; Changes the name of an employee's name in the employee list. \nOption 5: Quit; Quits the program. \n\nPlease enter the number of the option you would like to choose: ");
            menuinput=user_input.nextLine();
            if (menuinput.equals("1")) { //adds the enter name to a list
                System.out.printf("\nEmployee Check In \nPlease enter the name of the employee you would like to add: ");
                employeelist.add(user_input.nextLine());
                System.out.printf("\nReturning to menu... ");
                
            }
            
            if (menuinput.equals("2")) { // searches for an enployee in the list
                System.out.printf("\nEmployee Search \nPlease enter the name of the employee you would like to search for: ");
                String name=user_input.nextLine();
                if (employeelist.contains(name)) {
                    System.out.printf("\nThis employee is in the list! \n\nReturning to menu...");
                } else {
                    System.out.printf("\nThis employee is not in the list! \n\nReturning to menu...");
                }
            }
            if (menuinput.equals("3")) {  //removes the requested name from the list
                System.out.printf("\nEmployee Remove \nPlease enter the name of the employee you would like to remove from the list: ");
                String name=user_input.nextLine();
                if (employeelist.contains(name)) {
                    employeelist.remove(name);
                    System.out.printf("\nThis employee has been removed the list! \n\nReturning to menu...");
                } else {
                    System.out.printf("\nThis employee is not in the list! \n\nReturning to menu...");
                }
            }
            if (menuinput.equals("4")) {  //changes the requested name
                System.out.printf("\nEmployee Name Change \nPlease enter the name of the employee whose name you would like to change: ");
                String name=user_input.nextLine();
                if (employeelist.contains(name)) {
                    for(int i=0;i<employeelist.size();i++) {
                        if (employeelist.get(i).equals(name)) {
                            System.out.printf("Please enter the name you would like to change %s's to: ",name);
                            employeelist.set(i, user_input.nextLine());
                        }
                    }
                } else {
                    System.out.printf("\nThis employee is not in the list! \n\nReturning to menu...");
                }
            }
        }
        System.out.printf("Quiting program... ");
    }
}