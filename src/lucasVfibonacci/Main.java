package lucasVfibonacci;

public class Main 
{
	private static int MAXNUMBER = 25;
	
	public static void main(String[] args) {
		System.out.println("Proofing that the Lucas numbers come closer to the Golden Ratio than the Fibernacci numbers:");
		System.out.printf("%-15s  %-15s  %-15s\n", "Fibernacci", "Lucas" , "phi Rounded");
		INumberSequence ins = new Facade();
		
		for(int required=1; required<=15; required++)
		{
			if(required < MAXNUMBER){
				ins.numberRequired(required);
			}
		}
	}
}
