package it.lab.business.dbinterface.dao;



import java.util.ArrayList;
import java.util.Vector;

import it.lab.business.core.modello.Persona;
import it.lab.business.core.modello.Risorsa;
import it.lab.business.dbinterface.DbConnection;

public class PersonaDAO {

	private static PersonaDAO instance;
	
	public static PersonaDAO getInstance() {
		
		if(instance == null) 
			instance =new PersonaDAO();
		return instance;
		
	}
	
	public boolean isValidate(String username, String password) {
		
		Vector<String[]> risultato=DbConnection.getInstance().eseguiQuery("SELECT * from db_laboratorio.persona as P where P.username='"+ username +"' and P.password='"+password+"'");
		
		if(risultato.size()==0)
			return false;
		else
			return true;
		
	}

	public boolean isResponsabile(String username) {
		
		Vector<String[]> risultato=DbConnection.getInstance().eseguiQuery("SELECT * from db_laboratorio.persona as P inner join db_laboratorio.responsabile as R on P.idpersona=R.idpersona where P.username='"+ username +"'");

		if(risultato.size()==0)
			return false;
		else
			return true;
	}
	
	public Persona getPersonaByUsername(String username) {
		Persona s=new Persona();
		
		Vector<String[]> risultato=DbConnection.getInstance().eseguiQuery("select P.nome, P.cognome,  P.username, P.password, P.dataNascita, P.citta, P.indirizzo, P.email, P.recapito, P.ruolo FROM db_laboratorio.persona as P WHERE P.username='"+ username +"'");
		
		if(risultato.size() == 0) // studente non trovato
			return null;
		else{
		
		String[] riga = risultato.get(0);
		s.setNome(riga[0]);
		s.setCognome(riga[1]);
		s.setUsername(riga[2]);
		s.setPassword(riga[3]);		
		s.setDataNascita(riga[4]);
		s.setCitta(riga[5]);
		s.setIndirizzo(riga[6]);
		s.setEmail(riga[7]);		
		s.setRecapito(riga[8]);
		s.setRuolo(riga[9]);
		
		
		return s;
		}
	}
	
	public Persona getPersonaById(int id) {
		Persona s=new Persona();
		
		Vector<String[]> risultato=DbConnection.getInstance().eseguiQuery("select P.nome, P.cognome,  P.username, P.password, P.dataNascita, P.citta, P.indirizzo, P.email, P.recapito, P.ruolo FROM db_laboratorio.persona as P WHERE P.idpersona='"+ id +"'");
		
		if(risultato.size() == 0) // studente non trovato
			return null;
		else{
		
		String[] riga = risultato.get(0);
		s.setNome(riga[0]);
		s.setCognome(riga[1]);
		s.setUsername(riga[2]);
		s.setPassword(riga[3]);		
		s.setDataNascita(riga[4]);
		s.setCitta(riga[5]);
		s.setIndirizzo(riga[6]);
		s.setEmail(riga[7]);		
		s.setRecapito(riga[8]);
		s.setRuolo(riga[9]);
		
		
		return s;
		}
	}

	
	public boolean Update(Persona p, String oldUsername){
		 
			String modificaPersona= "UPDATE db_laboratorio.persona SET username='"+p.getUsername()+"', "+
									"password='"+p.getPassword()+"', dataNascita='"+p.getDataNascita()+"', "+
									"citta='"+p.getCitta()+"',indirizzo='"+p.getIndirizzo()+"', "+
									"recapito='"+p.getRecapito()+"', ruolo='"+p.getRuolo()+"' "+
									"WHERE username='"+oldUsername+"'";
			if ( !DbConnection.getInstance().eseguiAggiornamento(modificaPersona)) 
			{// QUALCOSA E' ANDATO STORTO
				System.out.println("assegnatario non aggiornato");
				return false;
			}
		   else
		   {
			   System.out.println("assegnatario aggiornato");
				// TUTTO OK!   
				  return true;
		   }		
		}
	
	public boolean Insert(Persona p){
		String DataNascita = p.getDataNascita();
		if(DataNascita.equals(""))
			DataNascita="0000-00-00";
					
		String inserimentoPersona= "insert into db_laboratorio.persona values("+0+",'"+p.getUsername()+"','"+p.getPassword()+"','"+p.getNome()+"','"+p.getCognome()+"','"+DataNascita+"','"+p.getCitta()+"','"+p.getIndirizzo()+"','"+p.getEmail()+"','"+p.getRecapito()+"','"+p.getRuolo()+"')";
			
		if ( !DbConnection.getInstance().eseguiAggiornamento(inserimentoPersona)) 
		{// QUALCOSA E' ANDATO STORTO
			System.out.println("utente non inserito");
			return false;
		}
	   else
	   {
		   System.out.println("utente inserito");
			// TUTTO OK!   
			  return true;
	   }		
	}
	
	public ArrayList<Persona> getListaAssegnatari(String username)
	{
		
		ArrayList<Persona> lista=new ArrayList<Persona>();
		
		String Query = "SELECT P.nome, P.cognome, P.username, P.password, P.dataNascita,P.citta, P.indirizzo, P.email, P.recapito, P.ruolo FROM db_laboratorio.persona as P " +
				" WHERE P.idpersona NOT IN (SELECT R.idpersona FROM db_laboratorio.responsabile as R)";
		
		if((username != null) && (username != "" ))
				Query += "AND P.username LIKE '"+username+"%'";
		
		Vector<String[]> risultato=DbConnection.getInstance().eseguiQuery(Query);
				
		
		for(int i=0;i<risultato.size();i++) {
			String[] riga=risultato.get(i);
			Persona a = new Persona(riga[0], riga[1], riga[2], riga[3], riga[4],riga[5],riga[6],riga[7],riga[8], riga[9]);
			lista.add(a);
		}
		
		return lista;
	}
	
	public int getIdPersonaByNumeroPrestito(int numero){
		int id=0;
		Vector<String[]> risultato=DbConnection.getInstance().eseguiQuery(""+
				"SELECT U.idpersona FROM db_laboratorio.utilizza AS U WHERE U.numero_prestito='"+numero+"'"+
				"");

		if(risultato.size()==0)
			return 0;
		String[] riga = risultato.get(0);
		id=Integer.parseInt(riga[0]);
		return id;
	}
	
	
}