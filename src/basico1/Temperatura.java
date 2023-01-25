package basico1;

public class Temperatura {
	
	public static void main(String[] args) {
		
		double c = 2.43;
		double k = c + 273.15;

		System.out.println("Kelvin = " + k);
		
		double re = c * 0.8;
		
		System.out.println("Réaumur = " + re);
		
		double ra = c * 1.8 + 32 + 459.67;
		
		System.out.printf("Rankine = %.2f\n", ra);
		
		double f = c * 1.8 + 32;
		
		System.out.printf("Fahrenheit = %.2f\n", f);
		
		
	}

}
