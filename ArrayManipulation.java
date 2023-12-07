package src;

public class ArrayManipulation {

	public static int[] squareArray(int[] givenArray){
		
		for(int counter = 0; counter <= givenArray.length; counter++){
			givenArray[counter]	= givenArray[counter] * givenArray[counter];
		}
		return givenArray;
	}
	
  
}
