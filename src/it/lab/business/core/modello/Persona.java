package it.lab.business.core.modello;

public class Persona {
	public String Nome;
	public String Cognome;
	public String Username;
	public String Password;
	public String DataNascita;
	public String Citta;
	public String Indirizzo;
	public String Email;
	public String Recapito;
	public String Ruolo;
	
	/** Costruttore 
	 * @param nome
	 * @param cognome
	 * @param username
	 * @param password
	 * @param dataNascita
	 * @param citta
	 * @param indirizzo
	 * @param email
	 * @param recapito
	 * @param ruolo
	 */
	
	public Persona(String nome, String cognome, String username, String password, String dataNascita, String citta, String indirizzo, String email, String recapito, String ruolo)
	{ Nome = nome; Cognome = cognome; Username = username; Password = password; DataNascita = dataNascita; Citta = citta; Indirizzo = indirizzo; Email = email; Recapito = recapito; Ruolo = ruolo;}

}
