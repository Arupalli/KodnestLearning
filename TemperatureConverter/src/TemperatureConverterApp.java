import java.util.Scanner;
public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temperature");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.println(temperatureConverter.ConvertFahrenheitToCelsius(f));

	}

}
