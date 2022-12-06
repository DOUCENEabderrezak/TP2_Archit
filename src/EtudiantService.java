import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	
	IJournal journal = new diffOutputJournal("def");
		
        boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException
	{
		IEtudiant StudRep= new EtudiantRepository();
	    IUniversite UnivRep= new UniversiteRepository();
	    Etudiant stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
	    Universite univ= UnivRep.GetById(id_universite);

	    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
            journal.outPut_Msg("Log: debut de l'operation d'ajout de l'etudiant avec matricule "+stud.getMatricule());
	    
	   
	    
	    if(email == null || email.length() == 0)
	    {
	    	return false;
	    }
	    
	    if (StudRep.Exists(matricule))
	    {
	        return false;
	    }
	    
		if (StudRep.Exists(email))
	    {
	        return false;
	    }
		
		
		
		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }            
		
		
		/* public void addNbrLivre(int nbrAjout){
			
		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10 + nbrAjout);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2 + nbrAjout);
	     }     
	     
			
		 StudRep.add(stud);
		 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 journal.outPut_Msg("Log: Fin de l'operation d'ajout de l'etudiant avec matricule "+stud.getMatricule());
		 return true;
	    
		
	}*/
		
		public void AjouerBonusEtudiant(Etudiant E) throws SQLException{
		
		InterfaceUniversite universite = UR.GetById(E.getId_universite());
		AbsractFactory AB = new AbsractFactory();
		Package P = AB.getPackage(universite.getPack());
		E.bonus(P.getBonus());
	}
		
		
		 StudRep.add(stud);
		 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		journal.outPut_Msg("Log: Fin de l'operation d'ajout de l'etudiant avec matricule "+stud.getMatricule());
		 return true;
	    
		
	}
	
	
	

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}
