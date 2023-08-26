import java.util.Scanner;
public class TheCalculatorDilemma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter first integer");
		int a=scan.nextInt();
		System.out.println("Enter second integer");
		int b=scan.nextInt();*/
		basicArithmeticOperations();
	}
	public static void basicArithmeticOperations() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first integer");
		int a=scan.nextInt();
		System.out.println("Enter second integer");
		int b=scan.nextInt();
		System.out.println("Enter an operator:");
		char operator=scan.next().charAt(0);
		switch(operator) {
		case '+':
			int c=a+b;
			System.out.println("Result:"+c);
			break;
		case '-':
			int d=a-b;
			System.out.println("Result:"+d);
			break;
		case '*':
			int e=a*b;
			System.out.println("Result:"+e);
			break;
		case '/':
			int f=a/b;
			System.out.println("Result:"+f);
			break;
		
		}
		
	}

}
