package practices1;
/*
 * // Task until 2:15
// Create a multiply method that accepts an array of integer
// Multiply all the numbers in the array and print the result
 */
  
public class MultiplyArray {
	
	
            int multi=1;
	public void array3(int []array) {
		for (int sample : array) {
			multi*=sample;
			
			
       
		}
		
		System.out.println(multi);
		

	}

	public static void main(String[] args) {
		MultiplyArray numbers= new MultiplyArray();
		int[] array2= {5,2,3};
		numbers.array3(array2);
		
		

	}

}
