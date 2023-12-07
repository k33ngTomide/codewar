package src;
import ArrayManipulation.squareArray;

public class ArrayManipulationTest {
    
    
    public void testArrayManipulation(){
    
	    int[] given = {3, 4, 4, 6, 7};
	    int[] actual = ArrayManipulation.squareArray(given);
	    	
	    int[] expected = {9, 16, 25, 36, 49};
	    	
	    if(actual.toString() == expected.toString()){
	    	System.out.print("Passed");
	    } else{
	    	System.out.print("Failed");
	    }
    }

}
