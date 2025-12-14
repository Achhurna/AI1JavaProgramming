package Week4;
import java.util.Scanner;


/**
 * Write a description of class NestedIF here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedIF
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        int num = sc.nextInt();
        if(num%3==0){
            if(num%5==0){
               System.out.println("NUMBER IS DIVISIBLE BY 3 AND 5!!"); 
            }
            System.out.println("Number IS DIVISIBLE BY 3 ONLY");
        }
        else if(num%5==0){
            if(num%3==0){
                System.out.println("Number is Divisible by 5 and 3!!!!");
            }
            System.out.println("Number is Divisible by 5 only!!!!");
        }
        else{
            System.out.println("Number is not Divisible by 5 and 3!!!!");
        }
    }
}