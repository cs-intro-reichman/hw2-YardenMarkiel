// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int x = Integer.parseInt(args[0]); 
		double aprox = 1;
		double y = 3;
		int counter = 1;
		for (int i = 0; i < x; i++) {
			if (counter % 2 == 0) {
				aprox = aprox + (1/y);
			}
			else {
				aprox = aprox - (1/y);
			}
			counter++;	
			y = y + 2;	
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + aprox * 4);
	}
}
