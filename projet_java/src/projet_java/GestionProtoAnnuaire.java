package projet_java;

import java.util.*;

public class GestionProtoAnnuaire {

	private Utilisateur user = new Utilisateur();
	private Bd bdAnnu = new Bd();
	
	
	public String analyserTraiter(String req) {
		String[] requete = req.split("#");		
		
		if(requete[0].equalsIgnoreCase("CREATE"))
		{
			if (requete.length==7 ){
				return ("CREATIONOK");
			}
			else
			{
				System.out.println("cezfezverv !");
				return("ERREUR : REQUETE MAL FORMEE");
			}
				
		}
		/*
		else if(requete[0].equalsIgnoreCase("CONSULTINFOPERSO"))
		{
			if (requete.length==2 ){
				bdAnnu.consulterBdAnnuaire(requete[1]);
				
				if (FALSE)
				{
					return("CONSULTATION ERROR");
				}
				else
					return ("CONNEXIONOK#"+validerConnexion);
			}
			else
				return("ERREUR : REQUETE MAL FORMEE");
		}*/
		return("ERREURSRV");
	}

}
