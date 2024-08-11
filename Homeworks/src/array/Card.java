package array;

public abstract class Card {
	String cardname;
	Card(String cardname) {
		this.cardname = cardname;
	}

	public abstract double debt();

	public void limit() {
		System.out.println("Your limit is $5000." );
	}
	}



