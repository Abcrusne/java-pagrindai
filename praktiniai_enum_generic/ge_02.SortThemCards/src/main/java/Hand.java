
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

	private ArrayList<Card> hand;

	public Hand() {
		this.hand = new ArrayList<Card>();
	}

	public void add(Card card) {
		this.hand.add(card);
	}

	public void print() {
		for (Card card : this.hand) {
			System.out.println(card);
		}
	}

	public void sort() {
		Collections.sort(this.hand);
//		this.print();
	}

	public int sum() {

		int sum = 0;

		for (Card card : hand) {

			sum += card.getValue();

		}

		return sum;

	}

	@Override

	public int compareTo(Hand o) {

		if (this.sum() > o.sum()) {

			return 1;

		} else if (this.sum() < o.sum()) {

			return -1;

		}

		return 0;

	}

//	public int compareTo(Hand other) {
//		int thisValue = 0;
//		int otherValue = 0;
//		for (Card card : this.hand) {
//			thisValue = thisValue + card.getValue();
//		}
//		for (Card othercard : other.hand) {
//			otherValue = otherValue + othercard.getValue();
//		}
//		return thisValue - otherValue;
//	}

	public void sortBySuit() {
		Collections.sort(hand, new BySuitInValueOrder());

	}

}
