import java.util.Scanner;
public class addition
{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enetr the first number:");
		int a=scan.nextInt();
		System.out.print("Enetr the second number:");
		int b=scan.nextInt();
		int result=a+b;
		System.out.print("The sum of "+a+ " and "+b+ " = "+result);
		}
}
