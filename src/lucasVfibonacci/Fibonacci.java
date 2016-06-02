package lucasVfibonacci;

public class Fibonacci {

	private static int fibValue;  
	
	  public static int fibonacci(int number) 
	  { 
	    if ((number == 0) || (number == 1)) // base cases
	      return number;
	    else
	      return fibonacci(number - 1) + fibonacci(number - 2);
	  }
	  
	  public int getFibonacci(){
			return fibValue;	
		}
		
		public void setFibonacci(int count){		
			fibValue = fibonacci(count);
		}
		
	//method used to check Fibonacii values.
	 /* public static void main(String[] args) {
	    for (int counter = 0; counter <= 15; counter++)
	    {
	    	setFibonacci(counter);
	      System.out.printf("Fibonacci of %d is: %d\n", counter, getFibonacci());
	    }
	  
	  }*/

}
