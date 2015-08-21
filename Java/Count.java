import java.util.Scanner;

public class Count
{
    public static void main(String[] args) 
    {
        ClearScreen.clear(200);
       
        int count;
        
        System.out.println("Please enter a number between 1 and 5000");
        
        Scanner scan = new Scanner(System.in);
       
        if(scan.hasNextInt() == true)
        { 
            count = scan.nextInt();

            if(count >= 1 && count <= 5000)
            {    
                for(int ii = 1; ii <= count; ii++)
                    System.out.println(ii);

            } 
            else System.out.println("A number between 1 and 5000 please...");
        }
        else System.out.println("You have to put in a number...");
   }
}
		


