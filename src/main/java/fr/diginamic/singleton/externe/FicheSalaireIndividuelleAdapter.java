package fr.diginamic.singleton.externe;

import fr.diginamic.singleton.IDocument;

public class FicheSalaireIndividuelleAdapter implements IDocument {
	
	private FicheSalaireIndividuelle fsi;
	
	public FicheSalaireIndividuelleAdapter(FicheSalaireIndividuelle fsi) {
		this.fsi = fsi;
	}

	public String getNom() {
		return fsi.getNomSalarie();
	}

	public String getPrenom() {
		return fsi.getPrenomSalarie();
	}
	
	public double getSalaire() {
		return fsi.getSalaire();
	}
	
	
	
	
	

}
