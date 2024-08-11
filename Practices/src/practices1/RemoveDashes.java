package practices1;

public class RemoveDashes {

	public static void main(String[] args) {
		String str = "492-73-4156";
		String str2 = str.substring(1, 11).replace("9", "#").replace("2", "#").replace("7", "#")
				.replace("3", "#");
		System.out.println("#".concat(str2));
	}

}
