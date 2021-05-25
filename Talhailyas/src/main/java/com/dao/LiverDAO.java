package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Liver;
import com.util.DBInteraction;




public class LiverDAO {
	
	

	private static final String INSERT_USERS_SQL = "INSERT INTO liver" + "  (Auteur, Titre, Categorie) VALUES "
			+ " (?, ?, ?);";

	private static final String SELECT_USER_BY_ID = "select id,Auteur,Titre,Categorie from liver where id =?";
	private static final String SELECT_ALL_USERS = "select * from liver";
	private static final String DELETE_USERS_SQL = "delete from liver where id = ?;";
	private static final String UPDATE_USERS_SQL = "update liver set Auteur = ?,Titre= ?, Categorie =? where id = ?;";

	public LiverDAO() {
	}
	public List<Liver> findAu(String Auteur) throws SQLException {
		Liver l=null;
		List<Liver> re=new ArrayList <Liver>();
		DBInteraction.connect();
		ResultSet res = DBInteraction.select("select * from livre where Auteur=" +Auteur);
		while(res.next()) {
			 l=new Liver();
			l.setId(res.getInt(1));
			l.setTitre(res.getString(2));
			l.setAuteur(res.getString(3));
			l.setCategorie(res.getString(4));
			re.add(l);
		}
		DBInteraction.disconnect();
		return re;
	}
	public List<Liver> findCa(String Categorie) throws SQLException{
		List<Liver> re=new ArrayList <Liver>();
		DBInteraction.connect();
		ResultSet res = DBInteraction.select("select * from liver where Categorie="+Categorie);
		while(res.next()) {
			Liver l=new Liver();
			l.setId(res.getInt(1));
			l.setTitre(res.getString(2));
			l.setAuteur(res.getString(3));
			l.setCategorie(res.getString(4));
			re.add(l);
		}
		return re;
}
	

	public void insertLiver(Liver x) throws SQLException {
System.out.println(INSERT_USERS_SQL);
		
		try (Connection connection =DBInteraction.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, x.getAuteur());
			preparedStatement.setString(2, x.getTitre());
			preparedStatement.setString(3, x.getCategorie());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public Liver selectLiver(int id) {
		Liver user = null;
	
		try (Connection connection = DBInteraction.getConnection();
				
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
	
			ResultSet rs = preparedStatement.executeQuery();

	
			while (rs.next()) {
				String Auteur = rs.getString("Auteur");
				String Titre = rs.getString("Titre");
				String Categorie = rs.getString("Categorie");
				user = new Liver(id, Auteur, Titre, Categorie);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return user;
	}

	public List<Liver> selectAllLiver() {

		
		List<Liver> users = new ArrayList<>();

		try (Connection connection = DBInteraction.getConnection();

				
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
			System.out.println(preparedStatement);
			
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String Auteur = rs.getString("Auteur");
				String Titre = rs.getString("Titre");
				String Categorie = rs.getString("Categorie");
				users.add(new Liver(id, Auteur, Titre, Categorie));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return users;
	}

	public boolean deleteLiver(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = DBInteraction.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	public boolean updateLiver(Liver user) throws SQLException {
		boolean rowUpdated;
		try (Connection connection =DBInteraction.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
			System.out.println("updated liver:"+statement);
			statement.setString(1, user.getAuteur());
			statement.setString(2, user.getTitre());
			statement.setString(3, user.getCategorie());
			statement.setInt(4, user.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}