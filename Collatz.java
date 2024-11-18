// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		int counter = 0;
		String mood = args[1];
		String printer = "";
		if (mood.equals("v")){
			System.out.println("1 4 2 1 (4)");
			for (int i = 0; i < seed-1; i++) {
				int x = i + 2;
				int xSaver = x;
				String checker = "";
				while ( x != 1){
					if( x % 2 ==0){				
					x = x / 2;
					checker = checker + " " + x;
					counter++;
					} else {				
					x = x * 3 + 1;
					checker = checker+ " " + x;
					counter++;
				}				
			}
				System.out.println(xSaver + checker + " (" + (counter+1) + ")" );	
				counter = 0;
		}
		} else {
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
		if (mood.equals("v")){
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}


}
}
