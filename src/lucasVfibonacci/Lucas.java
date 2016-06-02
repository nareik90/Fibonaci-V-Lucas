package lucasVfibonacci;

public class Lucas 
{

	private static int lucValue;
	
	//Calculating the Lucas numbers
	public static int lucasnum(int n) 
	{
        if (n >= 0) {
            if (n == 0)
                return 2;
            else if (n == 1)
                return 1;
            else
                return lucasnum(n - 1) + lucasnum(n - 2);
        }
        else{
            if (n == 0)
                return -2;
            else if (n == -1)
                return -1;
            else
            	return lucasnum(n + 2) - lucasnum(n + 1);
        }
    }

 
	public void setLucas(int number){
		lucValue = lucasnum(number);
	}
	
	public int getLucas(){
		return lucValue;
	}
	
	//main class used to check the lucas numbers were correct.
	/*public static void main(String[] args) {
    	for (int counter = 0; counter < 15; counter++)
    	{
    		setLucas(counter);
    		System.out.println(getLucas());
    	}
    }*/
}
