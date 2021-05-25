package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.util.*;
import com.model.*;



public class GestionEtudiant {
	public static int addetu(Etudiant e) {
		
		DBInteraction.connect();
		
		String sql="insert into etudiant values(null,'"+e.getNom()+"','"+e.getPrenom()+"','"+e.getLog()+"','"+e.getPass()+"')";
		int nb=DBInteraction.Maj(sql);
		DBInteraction.disconnect();
		return nb;
}
public static int addetu(String Nom,String Prenom,String log ,String pass) {
		
		DBInteraction.connect();
		
		String sql="Insert into etudiant (Nom,Prenom,log,pass) "
				+ "values('"+Nom+"','"+Prenom+"','"+log+"','"+pass+"'";
		int nb=DBInteraction.Maj(sql);
		DBInteraction.disconnect();
		return nb;
}
	public Etudiant authentification(String log, String pass) {
		Etudiant x=null;
		DBInteraction.connect();
		ResultSet res = DBInteraction.select("select * from etudiant where log='"+log+"' and pass='"+pass+"'");
		try {
			if(res.next())
			{
				x=new Etudiant(res.getInt(1),res.getString(4), res.getString(2), res.getString(3), res.getString(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	

}
