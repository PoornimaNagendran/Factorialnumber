import java.util.Scanner;
public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
System.out.println("The factorial of this number is "+fact);
	}

}
