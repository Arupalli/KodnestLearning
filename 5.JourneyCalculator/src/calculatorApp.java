import java.util.Scanner;
public class calculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter speed and time");
		double s=scan.nextDouble();
		double t=scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double Distance=journeyCalculator.calculateDistance(s,t);
		System.out.println(Distance);
	}

}
