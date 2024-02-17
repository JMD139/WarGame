package War;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.shuffle();

		Player jimmy = new Player("Jimmy");
		Player bianca = new Player("Bianca");

		for (int i = 0; i < 26; i++) {
			jimmy.draw(deck);
			bianca.draw(deck);
		}

		for (int i = 0; i < 26; i++) {
			Card jimmyCard = jimmy.flip();
			Card biancaCard = bianca.flip();

			System.out.println("Jimmy drew: " + jimmyCard.getName());
			System.out.println("Bianca drew: " + biancaCard.getName());

			if (jimmyCard.getValue() > biancaCard.getValue()) {
				jimmy.incrementScore();
				System.out.println("Jimmy wins this round!");
			} else if (jimmyCard.getValue() < biancaCard.getValue()) {
				bianca.incrementScore();
				System.out.println("Bianca wins this round!");
			} else {
				System.out.println("It's a tie! No points awarded.");
			}
		}

		System.out.println("\nFinal Scores:");
		System.out.println("Jimmy: " + jimmy.getScore());
		System.out.println("Bianca: " + bianca.getScore());

		if (jimmy.getScore() > bianca.getScore()) {
			System.out.println("Jimmy wins the game!");
		} else if (jimmy.getScore() < bianca.getScore()) {
			System.out.println("Bianca wins the game!");
		} else {
			System.out.println("It's a tie! The game is a draw.");
		}

	}

}
