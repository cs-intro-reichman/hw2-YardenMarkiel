// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int n = Integer.parseInt(args[0]);
		int x = 0;
		int counterLessHalf = 0;
		int counterMoreHalf = 0;
		while (x < (n-1)) {
			double i = Math.random();
			if ( i <= 0.5 ) {
				counterLessHalf++;
			}
			else {
				counterMoreHalf++;
			}
			x++ ;
		}
		System.out.println(">0.5 " + counterMoreHalf + " times");
		System.out.println("<=0.5 " + counterLessHalf + " times");
		double max = 0;
		double min = 0;
		if(counterLessHalf >= counterMoreHalf){
			max = counterLessHalf;
			min = counterMoreHalf;
		} else {
			max = counterMoreHalf;
			min = counterLessHalf;
		}
		if ((counterLessHalf == 0) || (counterMoreHalf == 0)){
			System.out.print("");
		} else {
			System.out.println("ratio " + (min / max));
		}

        
	}
}
