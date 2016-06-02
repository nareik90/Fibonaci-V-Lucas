package lucasVfibonacci;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OverLoadTesting {

	 @Rule
	  public final ExpectedException exception = ExpectedException.none();
	 private static int MAXNUMBER = 25;
	
	@Test
	public void overTest() {
		
			INumberSequence ins = new Facade();
		try{
			for(int required=1; required<=30; required++)
			{
				if(required < MAXNUMBER){
					ins.numberRequired(required);
				}
				else fail( "25 is the Max length of Index" );	
			}
		}catch (IndexOutOfBoundsException e){
	   
		}
	}

}
