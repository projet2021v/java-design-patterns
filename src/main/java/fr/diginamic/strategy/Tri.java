package fr.diginamic.strategy;

public class Tri {

	public void exec(TypeTri typeTri, Integer[] arr) {
		IStrategy methodeTri = StrategyFactory.getInstance(typeTri);
		methodeTri.trier(arr);
	}
}
