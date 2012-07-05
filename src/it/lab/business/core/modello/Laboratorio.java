package it.lab.business.core.modello;


public class Laboratorio // implements Serializable
{
	private int capacita; //libri massimi
	private risorsaCartaceaLab[] libri;
	private int totLibri;
	
	/* COSTRUTTORI */
	public Laboratorio()
	{
		capacita = 10000;
		libri = new risorsaCartaceaLab[10000];
		totLibri = 0;
	}
	
	/** Costruisce laboratorio con capacita' definita
	 * @param cap capacita' del nuovo laboratorio 
	 */
	public Laboratorio(int cap)
	{
		capacita = (cap>=10000) ? cap : 10000;
		libri = new risorsaCartaceaLab[capacita];
		totLibri = 0;
	}

	/* METODI CHE INTERROGANO LO STATO ATTUALE DEL LABORATORIO	 */
	
	/** Fornisce numero massimo di libri (capacita' del laboratorio)	 */
	public int laCapacita() { return capacita; }

/** Fornisce il numero di libri presenti in biblioteca */
	public int numeroLibri() { return totLibri; }
	
/** Restituisce il libro, dato il suo codice 
 * @param cod Codice del libro, cioè la sua posizione nell'array
 */
	public risorsaCartaceaLab libroPerCodice(int cod)
	{
		if ((cod<0) || (cod>totLibri)) return null; 
		return libri[cod];
	}
	
	/* METODI CHE MODIFICANO LO STATO ATTUALE DEL LABORATORIO 	 */
	/** Cambia la capacita', eseguito solo se la biblioteca e' senza libri.
	 * @param cap la nuova capacita', default (e minimo) 10000
	 * @return true;
	 */
	boolean cambiaCapacita(int cap)
	{
		if (totLibri>0) return false;
		capacita = (cap>=10000) ? cap : 10000;
		libri = new risorsaCartaceaLab[capacita];
		return true;
	}
	
/** Aggiunge al laboratorio un nuovo libro, in un certo numero di copie 
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
	 * @return true in caso di successo, false altrimenti
	 */
	public boolean nuovoLibro(String prot, String dataIns, String stato, Boolean prestabile, Integer anno, String tipo, String titolo, String autore, String editore, String genere, String collocazione, Integer numero)
	{
		if (totLibri<capacita)
		{
			libri[totLibri++] = new risorsaCartaceaLab(prot,dataIns,stato,prestabile,anno,tipo,titolo,autore,editore,genere,collocazione,numero);
			return true;
		}
		return false; // limite massimo libri raggiunto
	}
	
	/** Fa rientrare una copia prestata del libro, se qualche copia è stata prestata
	 * @param cod codice del libro, cioè la sua posizione nell'array
	 */
	public void restitLibro(int cod) throws Exception
	{
		risorsaCartaceaLab presente = libri[cod];
		if (presente == null)
			throw new Exception("Restituzione: codice libro non valido");
		else
			if (!presente.restituisci())
				throw new Exception("Restituzione: libro non in prestito");
	}
	
	/** Fa uscire in prestito una copia del libro, se non tutte le copie sono in prestito
	 * @param cod codice del libro, cioè la sua posizione nell'array
	 */
	public void prestaLibro(int cod) throws Exception
	{
		risorsaCartaceaLab presente = libri[cod];
		if (presente == null)
			throw new Exception("Prestito: codice libro non valido");
		else 
		{
			if (!presente.presta())
				throw new Exception("Prestito: non ci sono copie disponibili");
		}
	}
	
}
