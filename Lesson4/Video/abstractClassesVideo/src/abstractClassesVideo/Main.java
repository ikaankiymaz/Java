package abstractClassesVideo;

public class Main {

	public static void main(String[] args) {

//		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
//		womanGameCalculator.hesapla();
//		womanGameCalculator.gameOver();

		// Abstract siniflar newlenemez.
		// GameCalculator gameCalculator = new GameCalculator();

		GameCalculator[] gameCalculators = { new WomanGameCalculator(), new ManGameCalculator(),
				new KidsGameCalculator(), new OlderGameCalculator()};
		
		for(GameCalculator gameCalculator : gameCalculators) {
			gameCalculator.hesapla();
		}

	}

}
