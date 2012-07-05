package it.lab.business.core.modello;
/** Implementa una risorsa cartacea: libro, dispensa, ecc */
public class risorsaCartacea extends Risorsa
{

	public String Titolo;
	public String Autore;
	public String Editore;
	public String Genere;
	public String Collocazione;
	
	/** Costruttore della risorsa cartacea 
	 * @param prot
	 * @param dataIns
	 * @param stato
	 * @param prestabile
	 * @param anno
	 * @param tipo
	 * @param titolo	
	 * @param autore	
	 * @param editore
	 * @param genere
	 * @param collocazione
	 */
	public risorsaCartacea(String prot, String dataIns, String stato, Boolean prestabile, Integer anno, String tipo, String titolo, String autore, String editore, String genere, String coll)
	{	super(prot,dataIns,stato,prestabile,anno,tipo); Titolo = titolo; Autore = autore; Editore = editore; Genere = genere; Collocazione = coll; }
}
