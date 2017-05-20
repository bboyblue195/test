package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import bean.User;
import library.LibraryConnectDB;

public class modelUser {
	private LibraryConnectDB lDB;
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	private String table;
	
	public modelUser(){
		lDB= new LibraryConnectDB();
		this.table="user";
	}

	public ArrayList<User> getList() {
		ArrayList<User> listUser= new ArrayList<>();
		conn=lDB.getConnectMySql();
		String sql="SELECT * FROM "+this.table;
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				int id=rs.getInt("idUser");
				String name=rs.getString("UserName");
				String pass=rs.getString("Password");
			
				User objUser=new User(id, name, pass);
				listUser.add(objUser);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				
				rs.close();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listUser;
	}

	public int add(User objUser) {
		conn=lDB.getConnectMySql();
		String sql="insert into "+table+" (UserName,Password) VALUES(?,?)";
		
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, objUser.getUsername());
			pst.setString(2	, objUser.getPassword());
			
			pst.executeUpdate();
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	public int delUser(int idUser) {
		conn=lDB.getConnectMySql();
		String sql="delete from "+table+" where idUser=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setInt(1, idUser);
			pst.executeUpdate();
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	

	public User getItemByID(int idUser) {
		User objUser= new User();
		conn=lDB.getConnectMySql();
		String sql="SELECT * FROM "+table+" where idUser=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setInt(1, idUser);
			rs=pst.executeQuery();
			if(rs.next()){
				int id=rs.getInt("idUser");
				String name=rs.getString("UserName");
				String pass=rs.getString("Password");
				
				objUser=new User(id, name, pass);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				
				rs.close();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return objUser;
	}

	public User getItembyUsernamePass(String username, String password) {
		User objUser=null;
		conn=lDB.getConnectMySql();
		String sql="SELECT * FROM "+table+" where UserName=? and Password=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2	,password);
			rs=pst.executeQuery();
			if(rs.next()){
				int id=rs.getInt("idUser");
				String name=rs.getString("UserName");
				String pass=rs.getString("Password");
				
				objUser=new User(id, name, pass);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				
				rs.close();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return objUser;
	}
		
	public ArrayList<User> getListbyName(String username) {
		ArrayList<User> listUser= new ArrayList<>();
		conn=lDB.getConnectMySql();
		String sql="SELECT * FROM "+this.table+" WHERE UserName LIKE '%"+username+"%'";
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				int id=rs.getInt("idUser");
				String name=rs.getString("UserName");
				String pass=rs.getString("Password");
				
				User objUser=new User(id, name, pass);
				listUser.add(objUser);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				
				rs.close();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listUser;
	}
	

	

}
