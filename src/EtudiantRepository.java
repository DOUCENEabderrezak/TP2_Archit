
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository {
	
	
	void add(Etudiant E) throws SQLException
	{
public class EtudiantRepository implements IEtudiant {



		DBConnection BD= DBConnection.getInstance();

	@Override
	public void add(Etudiant E) throws SQLException{

		DBConnection BD= DBConnection.getInstance();

		Connection connect= BD.getConn();

		DBConnection BD= new DBConnection();
		Connection connect=BD.getConn();

		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		String sql = "INSERT INTO etudiant VALUES (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);


		if (rs == 1){
				System.out.println("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
				System.out.println("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				System.out.println("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
				System.out.println("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule());
			}
		connect.close();
		//connect.close();
	 }


	boolean Exists(String email) throws SQLException	
	{
		DBConnection BD= new DBConnection();
		Connection connect=BD.getConn();


		DBConnection BD= DBConnection.getInstance();
		Connection connect= BD.getConn();

		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.execute(sql);


		String sql = "SELECT * FROM etudiant WHERE email='"+ email+"'";
		boolean rs = stmt.executeQuery(sql).next();

		if (rs){
			System.out.println("logBD--- :email existe dans la BD  " + email);
			connect.close();
	 @Override
		public boolean Exists(String email) throws SQLException	
		{
			DBConnection BD= DBConnection.getInstance();
			Connection connect= BD.getConn();

			Statement stmt = connect.createStatement();
			String sql = "SELECT * FROM etudiant WHERE email='"+ email+"'";
			boolean rs = stmt.executeQuery(sql).next();

			if (rs){
				System.out.println("logBD--- :email existe dans la BD  " + email);
				//connect.close();
				return true;
				}
			System.out.println("logBD--- : email n'existe pas " + email);	
			//connect.close();
			return true;
			}
		System.out.println("logBD--- : email n'existe pas " + email);	
		connect.close();
		//connect.close();
		return false;
	}
	

	boolean Exists(int mat) throws SQLException	
			return false;
		}
	public boolean Exists(int mat) throws SQLException	
	{
		DBConnection BD= new DBConnection();
		Connection connect=BD.getConn();

		DBConnection BD= DBConnection.getInstance();
		Connection connect= BD.getConn();


		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.execute(sql);

		String sql = "SELECT * FROM etudiant WHERE matricule='"+ mat+"'";
		boolean rs = stmt.executeQuery(sql).next();


		if (rs){
			System.out.println("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
			System.out.println("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
			connect.close();
			//connect.close();
			return true;
			}
		System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		connect.close();
		//connect.close();
		return false;
	}
