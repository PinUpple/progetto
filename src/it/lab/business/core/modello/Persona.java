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

	/**
	 * Costruttore
	 * 
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

	public Persona(String nome, String cognome, String username,
			String password, String dataNascita, String citta,
			String indirizzo, String email, String recapito, String ruolo) {
		Nome = nome;
		Cognome = cognome;
		Username = username;
		Password = password;
		DataNascita = dataNascita;
		Citta = citta;
		Indirizzo = indirizzo;
		Email = email;
		Recapito = recapito;
		Ruolo = ruolo;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDataNascita() {
		return DataNascita;
	}

	public void setDataNascita(String dataNascita) {
		DataNascita = dataNascita;
	}

	public String getCitta() {
		return Citta;
	}

	public void setCitta(String citta) {
		Citta = citta;
	}

	public String getIndirizzo() {
		return Indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getRecapito() {
		return Recapito;
	}

	public void setRecapito(String recapito) {
		Recapito = recapito;
	}

	public String getRuolo() {
		return Ruolo;
	}

	public void setRuolo(String ruolo) {
		Ruolo = ruolo;
	}

}
