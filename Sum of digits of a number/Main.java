import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the value for n
	    int n = in.nextInt();
      int sum=0;
     
		while(n > 0)
		{
          int rem = n % 10;
          sum = sum + rem;
		   n = n / 10;
		}
        // Add first and last digit
		System.out.print(sum);
	}
}