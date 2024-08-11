package array;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {

	public static void main(String[] args) {
		LinkedList<Card> cards = new LinkedList<>();
		cards.add(new Citi("Citi Double Cashback"));
		cards.add(new Boa("Bank of America Visa"));
		cards.add(new Chase("Chase Travel"));
		for(int i=0; i<cards.size();i++) {
			Card a=cards.get(i);
            a.limit();
            System.out.println(a.debt());
			
		}
		for(Card b:cards) {
			b.limit();
			System.out.println(b.debt());
			
		}
		Iterator<Card>it=cards.iterator();
		while(it.hasNext()) {
			Card c=it.next();
			c.limit();
			System.out.println(c.debt());
			
		}

	}

}

class Citi extends Card {

	public Citi(String cardname) {
		super(cardname);

	}

	public double debt() {

		return 552;
	}
}

class Boa extends Card {

	public Boa(String cardname) {
		super(cardname);

	}

	public double debt() {

		return 734;
	}

}

class Chase extends Card {

	public Chase(String cardname) {
		super(cardname);

	}

	public double debt() {

		return 631;
	}

}
