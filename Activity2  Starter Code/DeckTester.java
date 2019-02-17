/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//Deck newDeck = new Deck({"jack", "queen", "king"}, {"hearts", "spades", "clubs"}, {"10", "10", "10"});
		
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"clubs", "diamonds", "hearts", "spades"};
		int[] pointValues = {11, 12, 13};
		Deck newDeck = new Deck(ranks, suits, pointValues);

		System.out.println(newDeck);
	}
}
