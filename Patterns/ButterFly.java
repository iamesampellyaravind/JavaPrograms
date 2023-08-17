import java.util.Scanner;

public class ButterFly 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the butterly");
            int height = sc.nextInt();
            for(int i=1;i<=height;i++)
            {
                int logic = height/2>=i?i:height-i+1;
                for(int j=1;j<=logic;j++)
                {
                    System.out.print("*");
                }
                int l = i<=height/2?height-2*i:(i>=(height/2+1))?2*i-height-2:i;
                for(int space=1;space<=l;space++)
                {
                    System.out.print(" ");
                }
                
                for(int j=1;j<=logic;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    }
    
}
