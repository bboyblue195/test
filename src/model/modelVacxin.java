package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import bean.LichSuTiemPhong;
import bean.Vacxin;
import library.LibraryConnectDB;

public class modelVacxin {
	private LibraryConnectDB lDB;
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	private String table;
	
	public modelVacxin(){
		lDB= new LibraryConnectDB();
		this.table="vacxin";
	}

	public ArrayList<Vacxin> getList() {
		ArrayList<Vacxin> listVacxin= new ArrayList<>();
		conn=lDB.getConnectMySql();
		String sql="SELECT * from "+table;
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				int GiaVacxin=rs.getInt("GiaVacxin");
				int MaVacxin=rs.getInt("MaVacxin");
				int SoMui=rs.getInt("SoMui");
				String TenVacxin=rs.getString("TenVacxin");
				String MoTa=rs.getString("MoTa");
				String TenHang=rs.getString("TenHang");
				
			
				Vacxin obj=new Vacxin(MaVacxin, TenVacxin, SoMui, MoTa, GiaVacxin, TenHang);
				listVacxin.add(obj);
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
		return listVacxin;
	}

	public ArrayList<Vacxin> getListByName(String tenVacxin) {
		ArrayList<Vacxin> listVacxin= new ArrayList<>();
		conn=lDB.getConnectMySql();
		String sql="SELECT * from "+table+" WHERE TenVacxin LIKE '%"+tenVacxin+"'";
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				int GiaVacxin=rs.getInt("GiaVacxin");
				int MaVacxin=rs.getInt("MaVacxin");
				int SoMui=rs.getInt("SoMui");
				String TenVacxin=rs.getString("TenVacxin");
				String MoTa=rs.getString("MoTa");
				String TenHang=rs.getString("TenHang");
				
			
				Vacxin obj=new Vacxin(MaVacxin, TenVacxin, SoMui, MoTa, GiaVacxin, TenHang);
				listVacxin.add(obj);
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
		return listVacxin;
	}

	public Vacxin getItemById(int idVacxin) {
		Vacxin vacxin=null;
		conn=lDB.getConnectMySql();
		String sql="SELECT * from "+table+" WHERE MaVacxin ="+idVacxin;
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()){
				int GiaVacxin=rs.getInt("GiaVacxin");
				int MaVacxin=rs.getInt("MaVacxin");
				int SoMui=rs.getInt("SoMui");
				String TenVacxin=rs.getString("TenVacxin");
				String MoTa=rs.getString("MoTa");
				String TenHang=rs.getString("TenHang");
				
			
				vacxin=new Vacxin(MaVacxin, TenVacxin, SoMui, MoTa, GiaVacxin, TenHang);
				
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
		return vacxin;
	}

	public int edit(Vacxin vacxin) {
		conn=lDB.getConnectMySql();
		String sql="Update "+table+" set TenVacxin=?,SoMui=?,MoTa=?,GiaVacxin=?,TenHang=? where MaVacxin=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, vacxin.getTenVacxin());
			pst.setInt(2, vacxin.getSoMui());
			pst.setString(3, vacxin.getMoTa());
			pst.setInt(4, vacxin.getGiaVacxin());
			pst.setString(5, vacxin.getTenHang());
			pst.setInt(6, vacxin.getMaVacxin());
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

	public int add(Vacxin vacxin) {
		conn=lDB.getConnectMySql();
		String sql="insert into "+table+" (TenVacxin,SoMui,MoTa,GiaVacxin,TenHang) VALUES(?,?,?,?,?)";
		
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, vacxin.getTenVacxin());
			pst.setInt(2, vacxin.getSoMui());
			pst.setString(3, vacxin.getMoTa());
			pst.setInt(4, vacxin.getGiaVacxin());
			pst.setString(5, vacxin.getTenHang());
		
			
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
}
