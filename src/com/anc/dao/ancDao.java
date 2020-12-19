package com.anc.dao;
import java.util.ArrayList;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

import java.sql.DriverManager;
import java.util.Collection;

import com.anc.entities.anc;
import com.anc.metier.Ianc;



public class ancDao implements Ianc {

	
	@Override
	public anc findByCode(int id) {
		anc anc1=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anc?serverTimezone=UTC",
					"root", "");
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM profile WHERE id = " + id);
			result.next();
			anc1 = new anc(result.getInt("id"), result.getString("nom"), result.getString("prenom"), result.getInt("age"));
			return anc1;
		} catch (ClassNotFoundException e) {
			System.out.println("Erreur Driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Erreur SQL : " + e.getMessage());
		}
		return anc1;
	}

	@Override
	public Collection<anc> findAll() {
		Collection<anc> ancs = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			  final String url = "jdbc:mysql:///anc";
		      final String user = "root";
		      final String password = "";
		      final Connection conn = DriverManager.getConnection(url, user, password);
		      
			Statement stmt = conn.createStatement();
			
			ResultSet result = stmt.executeQuery("SELECT * FROM profile");
			ancs = new ArrayList<anc>();
			while (result.next()) {
				anc anc1 = new anc(result.getInt("id"), result.getString("nom"), result.getString("prenom"), result.getInt("age"));
				ancs.add(anc1);
			}
			return ancs;
		} catch (ClassNotFoundException e) {
			System.out.println("Erreur Driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Erreur SQL : " + e.getMessage());
		}
		return null;
	}

	@Override
	public void add(anc a) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anc?serverTimezone=UTC",
					"root", "");
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO profile VALUES(NULL,?,?,?)");
			stmt.setString(1, a.getNom());
			stmt.setString(2, a.getPrenom());
			stmt.setInt(3, a.getAge());
			stmt.execute();

		} catch (ClassNotFoundException e) {
			System.out.println("Erreur Driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Erreur SQL : " + e.getMessage());
		}
	}

	@Override
	public void update(anc a) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anc?serverTimezone=UTC",
					"root", "");
			PreparedStatement stmt = conn.prepareStatement("UPDATE profile SET nom=?, prenom=? , age=? WHERE id=?");

			stmt.setString(1, a.getNom());
			stmt.setString(2, a.getPrenom());
			stmt.setInt(3, a.getAge());
			stmt.setInt(4, a.getCode());

			stmt.execute();

		} catch (ClassNotFoundException e) {
			System.out.println("Erreur Driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Erreur SQL : " + e.getMessage());
		}
	}

	@Override
	public void delete(int code) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anc?serverTimezone=UTC",
					"root", "");
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM profile WHERE id=?");
			stmt.setInt(1, code);
			stmt.execute();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Erreur Driver : " + e.getMessage());
		} 
		catch (SQLException e) {
			System.out.println("Erreur SQL : " + e.getMessage());
		} 
	}

}
