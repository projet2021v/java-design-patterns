package fr.diginamic.singleton;

import fr.diginamic.singleton.externe.FicheSalaireIndividuelle;
import fr.diginamic.singleton.externe.FicheSalaireIndividuelleAdapter;

public class DemoGeneration {

	public static void main(String[] args) {
		
		BulletinSalaire bs = new BulletinSalaire("Untel", "Bob", 2337.5);
		
		FicheSalaireIndividuelle fsi = new FicheSalaireIndividuelle("LB", "Vincent", 10000);
		FicheSalaireIndividuelleAdapter fsiAdapt = new FicheSalaireIndividuelleAdapter(fsi);
		
		SystemeGestion sg = new SystemeGestion();

		sg.genererPdf(bs, "C:/Temp/bulletin_salaire.pdf");
		sg.genererPdf(fsiAdapt, "C:/Temp/fiche_salaire_individuelle.pdf");
		
	}

}
