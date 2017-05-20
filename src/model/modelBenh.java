package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import library.LibraryConnectDB;

public class modelBenh {
	private LibraryConnectDB lDB;
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	private String table;
	
	public modelBenh(){
		lDB= new LibraryConnectDB();
		this.table="benh";
	}
}
