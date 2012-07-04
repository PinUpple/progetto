/** Superclasse */
public class risorsa {

	public String Protocollo;
	public String DataInserimento;
	public String Stato;
	public Boolean PrestitoAmmesso;
	public Integer Anno;
	public String Tipo;

	
	/** Costruttore della risorsa 
	 * @param prot	
	 * @param dataIns
	 * @param stato
	 * @param prestabile
	 * @param anno
	 * @param tipo
	 */
	
	public risorsa(String prot, String dataIns, String stato, Boolean prestabile, Integer anno, String tipo)
	{ Protocollo = prot; DataInserimento = dataIns; Stato = stato; PrestitoAmmesso = prestabile; Anno = anno; Tipo = tipo; }
}

