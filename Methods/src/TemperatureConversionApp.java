import java.util.Scanner;
public class TemperatureConversionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:");
		System.out.println("1.Convert Celsius to Fahrenheit");
		System.out.println("2.Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice:");
		int num=scan.nextInt();
		if(num==1) {
		System.out.println("Enter the temperature in Celsius:");
		double celsius=scan.nextDouble();
		double res=TemperatureConversion.celsiusToFahrenheit(celsius);
		System.out.println(celsius +"C is equivalent to"+" "+res+'F');
		}
		else {
			System.out.println("Enter the temperature in Fahrenheit:");
			double fahrenheit=scan.nextDouble();
			double res=TemperatureConversion.fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+"F is equivalent to"+" "+res+'C');
		}
	}
}
