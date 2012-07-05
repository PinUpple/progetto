package it.lab.business.core.modello;


public class risorsaCartaceaLab extends risorsaCartacea
{
	private int totali; // numero totale copie presenti
	private int prestate;
	
	/** Costruttore 
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
	 * @param numero
	 */
	
	public risorsaCartaceaLab(String prot, String dataIns, String stato, Boolean prestabile, Integer anno, String tipo, String titolo, String autore, String editore, String genere, String collocazione, Integer numero)
	{	super(prot,dataIns,stato,prestabile,anno,tipo,titolo,autore,editore,genere,collocazione); totali = numero; prestate = 0; }

	public int copieTotali() { return totali; }
	
	public int copiePrestate() { return prestate; }
	
	/** Presta una copia del libro, solo se esistono copie non prestate.
	 * @return true in caso di successo, false altrimenti
	 */
	public boolean presta()
	{
		if (prestate<totali) {prestate++; return true; }
		else return false;
	}
	
	/** Restituisce una copia del libro, solo se esistono copie in prestito
	 * @return true in caso di successo, false altrimenti
	 */
	public boolean restituisci()
	{ if (prestate>0) { prestate--; return true; }
	else return false;
	}

}
