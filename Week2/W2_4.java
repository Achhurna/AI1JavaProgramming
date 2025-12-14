package Week2;
import java.util.Scanner;


/**
 * Write a description of class W2_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W2_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Student Name:");
        String Name = sc.nextLine();
        System.out.println("Input Student Age:");
        int Age = sc.nextInt();
        System.out.println("Input Student GPA:");
        float Gpa = sc.nextFloat();
        System.out.println("Student Name:"+Name+"\nAge is: "+Age+"\nGPA is: "+Gpa);
        
    }
}