import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

	@Override
	public int compare(Card o1, Card o2) {
		int compare = 0;
		compare = o1.getSuit().ordinal() - o2.getSuit().ordinal();
		if (o1.getSuit().ordinal() == o2.getSuit().ordinal()) {
			compare = o1.compareTo(o2);
		}
		return compare;
//		} else if (o1.getSuit().ordinal() < o2.getSuit().ordinal()) {
//			return -1;
//		} else {
//			if (o1.getValue() > o2.getValue()) {
//				return 1;
//			} else if (o1.getValue() < o2.getValue()) {
//				return -1;
//			} else {
//				return 0;
	}

}
