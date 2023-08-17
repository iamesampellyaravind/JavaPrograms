package patterns;

import java.util.Scanner;

public class ZeroOneTriangle 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the Triangle ");
            int height = sc.nextInt();
            for(int i=1;i<=height;i++)
            {
                for(int j=1;j<=i;j++)
                {

                    if(j==i)
                    {
                        System.out.print("1");
                    }
                    if((i==3 && j==1) || (i==4 && j==2) || (i==5 && j==3) || (i==5 && j==1))
                    {
                        System.out.print("1");
                    }
                    else
                    {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
        
    }
    
}
