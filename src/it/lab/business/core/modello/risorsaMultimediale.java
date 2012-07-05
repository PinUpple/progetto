package it.lab.business.core.modello;
/** Implementa una risorsa multimediale: computer, proiettori, ecc. */
public class risorsaMultimediale extends Risorsa
{

	public String Nome;
	public String Modello;
	public String Produttore;
	public String Caratteristiche;
	public String Accessori; 
	
	/** Costruttore della risorsa cartacea 
	 * @param prot
	 * @param dataIns
	 * @param stato
	 * @param prestabile
	 * @param anno
	 * @param tipo
	 * @param nome
	 * @param model
	 * @param vendor
	 * @param features
	 * @param accessori
	 */
	public risorsaMultimediale(String prot, String dataIns, String stato, Boolean prestabile, Integer anno, String tipo,String nome,  String model, String vendor, String features, String accessori )
	{	super(prot,dataIns,stato,prestabile,anno,tipo); Nome = nome; Modello = model; Produttore = vendor; Caratteristiche = features; Accessori = accessori; }
}
