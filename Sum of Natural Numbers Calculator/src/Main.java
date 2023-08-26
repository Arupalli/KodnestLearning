import java.util.Scanner;

public class Main {
	public static void calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);   //System.out.println(n*(n+1)/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		calculateSum(a);
	}

}
