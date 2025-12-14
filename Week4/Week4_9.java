package Week4;
import java.util.Scanner;


/**
 * Write a description of class Week4_9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week4_9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input GPA");
        double gpa = sc.nextDouble();
        System.out.println("Input Attendance in %");
        int att = sc.nextInt();
        System.out.println("Input Altitude");
        int alt = sc.nextInt();
        if(gpa>=3.2)
        {
            if(att>80)
            {
                if(alt>5)
                {
                    System.out.println("You are eligible for Svholarship");
                }
                else{
                    System.out.println("You are not eligible for Svholarship bcz of altitude");
                }
                
            }
            else{
                    System.out.println("You are not eligible for Svholarship bcz of Attendace");
                }
            
        }
        else{
                 System.out.println("You are not eligible for Svholarship bcz of gpa");
            }
            
    }
}