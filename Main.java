import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    		Scanner stdIn = new Scanner(System.in);

		System.out.print("身長(m)を教えてください:");
    		double height = stdIn.nextDouble();
    		System.out.print("体重(kg)を教えてください:");
    		double weight = stdIn.nextDouble();
						    
		double bmi = weight / (Math.pow(height, 2) * 100) * 100;

		System.out.println("BMI値は"+ (Math.floor(bmi * 100)) / 100);
	}
}

