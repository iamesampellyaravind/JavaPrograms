import java.util.Scanner;

public class PalindromicPattern 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the pyramid");
            int height = sc.nextInt();
            for(int i=1;i<=height;i++)
            {
                for(int space=height;space>=i;space--)
                {
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--)
                {
                    System.out.print(j);
                }
                if(i>=2)
                for(int j=2;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        
    }
    
}
