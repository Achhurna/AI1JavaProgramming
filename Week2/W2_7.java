package Week2;
import java.util.Scanner;


/**
 * Write a description of class W2_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W2_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Medicine Name: ");
        String MedName = sc.nextLine();
        System.out.println("Input Medicine Price Per tablet in Rs: ");
        int MedPrice = sc.nextInt();
        System.out.println("Input Medicine Quantity in Stock: ");
        int MedQty = sc.nextInt();
        //System.out.println("Medicine Name is: "+MedName+"\nMedicine Price per Tablet is: "+MedPrice+"\nMedicine Quantity in Stock is: "+MedQty);
        System.out.println("Hello! What Medicine do You Want: ");
        sc.nextLine();
        String UMedName = sc.next();
        System.out.println("How Much Medicine You want in Stock: ");
        int UMedQty = sc.nextInt();
        int PriceInfo = UMedQty * MedPrice;
        int RemQty = MedQty - UMedQty;
        System.out.println("Your Total Bill is: "+PriceInfo);
        System.out.println("Stock Remaining: "+RemQty);
    }
}