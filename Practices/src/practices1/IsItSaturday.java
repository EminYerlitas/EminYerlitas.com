package practices1;

public class IsItSaturday {

	public static void main(String[] args) {
//		You have a String str = "Is it saturday? Is it raining? Do we have a Java Class today?"
//		How would you find out how many sentences are in that String?

		String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] result = str.split("[?]");
		System.out.println(result.length);

	}

}
