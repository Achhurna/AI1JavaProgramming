package Week4;
import java.util.Scanner;


/**
 * Write a description of class Week4_8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week4_8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input GPA");
        double gpa = sc.nextDouble();
        if ((gpa>3.6) && (gpa<=4.0)){
            System.out.println("You got A+");
        }
        else if((gpa>3.2)&&(gpa<=3.6)){
            System.out.println("You got A");
        }
        else if((gpa>2.8)&&(gpa<=3.2)){
            System.out.println("You got B+");
        }
        else if((gpa>2.4)&&(gpa<=2.8)){
            System.out.println("You got B");
        }
        else if((gpa>2.0)&&(gpa<=2.4)){
            System.out.println("You got C+");
        }
        else if((gpa>1.6)&&(gpa<=2.0)){
            System.out.println("You got D");
        }
        else if((gpa>0)&&(gpa<=1.6)){
            System.out.println("Failed");
        }
        else{
            System.out.println("Invalid");
            
        }
            
    }
}