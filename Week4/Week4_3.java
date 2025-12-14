package Week4;
import java.util.Scanner;


/**
 * Write a description of class Week4_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week4_3
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num+" is positive");
        }
        else if(num<0){
            System.out.println(num+" is Negative");
        }
        else{
            System.out.println(num+" is Zero");
        }
    }
}