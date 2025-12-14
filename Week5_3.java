package Week5;
import java.util.Scanner;


/**
 * Write a description of class Week5_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week5_3
{
    public static void main(String[] args){
        int rem=0, rnum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int num = sc.nextInt();
        int num1=num;
        while(num!=0){
            rem=num%10;
            rnum=rnum*10+rem;
            num=num/10;
        }
        System.out.println("Reversed num is: "+rnum);
        if(num1==rnum){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}