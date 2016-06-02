package lucasVfibonacci;

public class Facade implements INumberSequence {
	
	private static Fibonacci fib = new Fibonacci();
	private static Lucas luc = new Lucas();
	private static GoldenRatio golden = new GoldenRatio();
	
	//This method retrieves the values from the Fibonacci,Lucas and GoldenRatio classes.
	//As an alternative the for loop in the main.java could be placed in this class to process 
	//all the number in on go.
	@Override
	public int numberRequired(int number) 
	{
		fib.setFibonacci(number);
		luc.setLucas(number-1);
		golden.setGoldenNumber(number-1);
		
		System.out.printf("%-15d  %-15d  %-15d \n", fib.getFibonacci(), luc.getLucas(), golden.getGoldenNumber());	

		return 0;
	}
	
	
	

}
