package it.lab.business.core.modello;

public class Risorsa {
	/** Superclasse */

	public String Protocollo;
	public String DataInserimento;
	public String Stato;
	public Boolean PrestitoAmmesso;
	public Integer Anno;
	public String Tipo;

	public Risorsa(String prot, String dataIns, String stato2,
			Boolean prestabile, Integer anno2, String tipo2) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Costruttore della risorsa
	 * 
	 * @param prot
	 * @param dataIns
	 * @param stato
	 * @param prestabile
	 * @param anno
	 * @param tipo
	 * @return void
	 */

	public void risorsa(String prot, String dataIns, String stato,
			Boolean prestabile, Integer anno, String tipo) {
		Protocollo = prot;
		DataInserimento = dataIns;
		Stato = stato;
		PrestitoAmmesso = prestabile;
		Anno = anno;
		Tipo = tipo;
	}
}
