package War;

public class WarGame {

	public static void main(String[] args) {

		Card[][] hands = new Card[2][1];
		Deck myDeck = new Deck();

		for (int i = 0; i < 53; i++) {
			System.out.printf("\nRound %d of The War\n", i);

			for (int player = 0; player < hands.length; player++) {
				hands[player][0] = myDeck.dealCard();
			}

			for (int player = 0; player < hands.length; player++) {
				String playerName = (player == 0) ? "Jimmy" : "Bianca";
				System.out.printf("%s: ", playerName);
				printHand(hands[player]);
			}

			if (hands[0][0] != null && hands[1][0] != null) {
				int player1Value = hands[0][0].getValue();
				int player2Value = hands[1][0].getValue();

				if (player1Value > player2Value) {
					System.out.println("Jimmy wins this round!");
				} else if (player2Value > player1Value) {
					System.out.println("Bianca wins this round!");
				} else {
					System.out.println("It's a tie! No points awarded.");
				}
			} else {
				System.out.println("One or both players have null cards.");
			}
		}
	}

	public static void printHand(Card[] hand) {
		for (int card = 0; card < hand.length; card++) {
			if (hand[card] != null) {
				System.out.printf("%s ", hand[card].toString());
			} else {
				System.out.print("null ");
			}
		}
		System.out.println();

	}

}
