package practices1;

public class Task1 {
	
	
	protected static int number(int[]array) {
		int sum=0;
		for(int num:array) {
			sum+=num;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		int[]numbers= {
				5,4,3,2,1
		};
		System.out.println(Task1.number(numbers));
		

	}

}
