package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import bean.LichSuTiemPhong;
import bean.User;
import library.LibraryConnectDB;

public class modelLichSuTiemPhong {
	private LibraryConnectDB lDB;
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	private String table;
	
	public modelLichSuTiemPhong(){
		lDB= new LibraryConnectDB();
		this.table="lichsutiemphong";
	}
	
	

	public ArrayList<LichSuTiemPhong> getListByID(int idKH) {
		ArrayList<LichSuTiemPhong> listLSTP= new ArrayList<>();
		conn=lDB.getConnectMySql();
		String sql="SELECT lichsutiemphong.*,khachhang.HoTenKH,vacxin.TenVacxin,benh.TenBenh,COUNT(lichsutiemphong.STTMui) as TongSoMui FROM `lichsutiemphong` INNER JOIN vacxin On lichsutiemphong.MaVacxin=vacxin.MaVacxin INNER JOIN khachhang on khachhang.MaKH=lichsutiemphong.MaKH INNER join phongbenh on phongbenh.MaVacxin=vacxin.MaVacxin INNER JOIN benh on benh.MaBenh=phongbenh.MaBenh WHERE lichsutiemphong.MaKH="+idKH+" and lichsutiemphong.NgayTiemPhong < CURDATE() GROUP BY lichsutiemphong.MaVacxin";
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				int MaKH=rs.getInt("MaKH");
				int MaVacxin=rs.getInt("MaVacxin");
				int TongSoMui=rs.getInt("TongSoMui");
				String TenKH=rs.getString("hoTenKH");
				String TenVacxin=rs.getString("TenVacxin");
				String TenBenh=rs.getString("TenBenh");
				Date ngaytiem=rs.getDate("NgayTiemPhong");
				Date ngayhentieptheo=rs.getDate("NgayHenTiepTheo");
			
				LichSuTiemPhong obj=new LichSuTiemPhong(MaKH, TenKH, TenBenh, MaVacxin, TenVacxin, TongSoMui, ngaytiem, ngayhentieptheo);
				listLSTP.add(obj);
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
		return listLSTP;
	}
}
