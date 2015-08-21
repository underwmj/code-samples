public class Count
{
	public static void main(String[] args) 
	{
	    int countTo = 0;
            
            if(args.length != 0)
                countTo = Integer.valueOf(args[0]);
            
            if(countTo <= 0)
                System.out.println("Gotta enter a positive number. Run the program again.");
            else
                for(int ii = 1; ii <= countTo; ii++)
                    System.out.println(ii);
        }
}
		


