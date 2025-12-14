package Week5;


/**
 * Write a description of class NestedLoopEx here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoopEx
{
    public static void main(String[] args)
    {
        for(int i=1; i<=3; ++i){
            for(int j=1; j<=i; ++j){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}