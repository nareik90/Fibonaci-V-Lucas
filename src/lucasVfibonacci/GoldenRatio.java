package lucasVfibonacci;

public class GoldenRatio 
{
	
	private static double goldenNumber;
	private static double phi = 1.618;
	
    public static double golden(double number) {
    	if ((number == 0))
   	      return number+2;
   	    else
        return (Math.pow(phi, number))+ (1/Math.pow(phi, number));
    }

    public void setGoldenNumber(double number){
    	goldenNumber = golden(number);
		
    }
   public long getGoldenNumber(){
	   return Math.round(goldenNumber);
   }
   
   //method used to check Golden Values
  /* public static void main(String[] args) {
	   for (int counter = 0; counter <= 15; counter++)
	    {
		   setGoldenNumber(counter);
	      System.out.println(getGoldenNumber());
	    }
	}*/
}
