package War;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = new ArrayList<>();
		for (int value = 2; value <= 14; value++) {
			for (String suit : new String[] { "Hearts", "Diamonds", "Clubs", "Spades" }) {
				String cardName = valueToName(value) + " of " + suit;
				cards.add(new Card(value, cardName, suit));
			}
		}

		cards.add(new Card(0, "Joker", "Special"));
		cards.add(new Card(0, "Joker", "Special"));
	}

	public void shuffle() {
		int n = cards.size();
		for (int i = n - 1; i > 0; i--) {
			// Generate a random index between 0 and i (inclusive)
			int j = (int) (Math.random() * (i + 1));

			// Swap cards at indices i and j
			Card temp = cards.get(i);
			cards.set(i, cards.get(j));
			cards.set(j, temp);
		}

	}

	public Card draw() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		} else {
			System.out.println("The deck is empty. Cannot draw a card.");
			return null;
		}
	}

	private String valueToName(int value) {
		switch (value) {
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		case 14:
			return "Ace";
		default:
			return String.valueOf(value);
		}
	}

	public Card dealCard() {
		return draw();
	}

}
