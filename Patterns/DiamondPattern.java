import java.util.Scanner;

public class DiamondPattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the diamond");
        int height = sc.nextInt();
        for(int i=1;i<=2*height;i++)
        {
            if(i<=height)
            {
            for(int space = i;space<=height;space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            }
            else
            {
                for(int space=height;space<=i;space++)
                {
                    System.out.print(" ");
                }
                for(int j=i-height;j<=height;j++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
    }
}
