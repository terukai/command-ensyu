import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    		Scanner stdIn = new Scanner(System.in);

		System.out.println("1人目");
		System.out.print("身長(m)を教えてください:");
    		double height = stdIn.nextDouble();
    		System.out.print("体重(kg)を教えてください:");
    		double weight = stdIn.nextDouble();

		System.out.println("2人目");
                System.out.print("身長(m)を教えてください:");
                double height2 = stdIn.nextDouble();
                System.out.print("体重(kg)を教えてください:");
                double weight2 = stdIn.nextDouble();


						    
		double bmi = weight / (Math.pow(height, 2) * 100) * 100;
		double bmi2 = weight2 / (Math.pow(height2, 2) * 100) * 100;


		System.out.println("1人目のBMI値は"+ (Math.floor(bmi * 100)) / 100);
		System.out.println("2人目のBMI値は"+ (Math.floor(bmi2 * 100)) / 100);
	}
}

