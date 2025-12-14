package Week6;
import java.util.Scanner;


/**
 * Write a description of class Week6_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week6_3
{
    public static void main(String[]a)
    {
        
        String[] name={"Saroj", "Sushant", "Ujjawal", "Rabina", "Sandesh"};
        for(int i=0;i<name.length;i++)
        {
           System.out.println("the element of ["+i+"] is: "+name[i]);
    
        } 
        System.out.println(name[2]);
        name[4]="Achhurna";
        System.out.println("Updated value"+name[4]);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array");
        int size=sc.nextInt();
        String name1[] = new String[size];
        sc.nextLine();
        for(int i=0;i<size;i++)
        {
           System.out.println("values for["+i+"] is:");
            name1[i]=sc.nextLine();
        } 
        for(int i=0;i<size;i++)
        {
           System.out.println("the element of ["+i+"] is: "+name1[i]);
    
        }
    }
}