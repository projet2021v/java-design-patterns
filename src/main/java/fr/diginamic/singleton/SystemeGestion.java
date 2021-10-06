package fr.diginamic.singleton;

/** Système de gestion de la paye
 * @author RichardBONNAMY
 *
 */
public class SystemeGestion {

	/** Génère un bulletin de salaire au format PDF
	 * @param document
	 * @param filePath path du fichier (ex: C:/Temp/monFichier.pdf) 
	 */
	public void genererPdf(IDocument document, String filePath) {
		
		DocumentPdf pdf = new DocumentPdfBuilder(filePath)
				                     .appendIdentite(document.getNom(), document.getPrenom())
				                     .appendSalaire(document.getSalaire())
				                     .get();
		pdf.generer();
	}
}
