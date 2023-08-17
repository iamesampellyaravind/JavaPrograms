package patterns;

import java.util.Scanner;

public class FloydsTriangle 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the pyramid");
            int height = sc.nextInt();
            int sum =0;
            for(int i=1;i<=height;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    sum++;
                    System.out.print(sum);
                }
                System.out.println();
            }
        }
        
    }
    
}
