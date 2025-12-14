package Week5;
import java.util.Scanner;


/**
 * Write a description of class Week5_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week5_4
{
    public static void main(String[] args)
    {
        int rnum=0, rem=0, count1=0,count2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a num");
        int num = sc.nextInt();
        while(num!=0){
            rem=num%10;
            rnum=rnum*10+rem;
            if(rnum%2==0)
                count1++;
            else
                count2++;
            num=num/10;
        }
        System.out.println("even number are:"+count1);
        System.out.println("odd number are:"+count2);
    }
}