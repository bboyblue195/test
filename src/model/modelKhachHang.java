package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import bean.KhachHang;
import bean.User;
import library.LibraryConnectDB;

public class modelKhachHang {
	private LibraryConnectDB lDB;
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	private String table;
	
	public modelKhachHang(){
		lDB= new LibraryConnectDB();
		this.table="khachhang";
	}

	public ArrayList<KhachHang> getList() {
		ArrayList<KhachHang> listKhachHang= new ArrayList<>();
		conn=lDB.getConnectMySql();
		String sql="SELECT * FROM "+this.table;
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				int id=rs.getInt("MaKH");
				String name=rs.getString("HoTenKH");
				String sdt=rs.getString("SoDienThoai");
				String diachi=rs.getString("DiaChi");
				Date ngaysinh=rs.getDate("NgaySinh");
			
				KhachHang obj=new KhachHang(id, name, sdt,diachi,ngaysinh);
				listKhachHang.add(obj);
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
		return listKhachHang;
	}

	public KhachHang getItemByID(int idKH) {
		KhachHang khachhang=null;
		conn=lDB.getConnectMySql();
		String sql="SELECT * FROM "+this.table;
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				int id=rs.getInt("MaKH");
				String name=rs.getString("HoTenKH");
				String sdt=rs.getString("SoDienThoai");
				String diachi=rs.getString("DiaChi");
				Date ngaysinh=rs.getDate("NgaySinh");
			
				khachhang=new KhachHang(id, name, sdt,diachi,ngaysinh);
				
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
		return khachhang;
	}

	public ArrayList<KhachHang> getListWithPayment() {
		ArrayList<KhachHang> listKhachHang= new ArrayList<>();
		conn=lDB.getConnectMySql();
		String sql="SELECT khachhang.*,sum(vacxin.GiaVacxin) as TongTien FROM lichsutiemphong INNER join vacxin ON lichsutiemphong.MaVacxin=vacxin.MaVacxin INNER JOIN khachhang ON khachhang.MaKH=lichsutiemphong.MaKH group BY khachhang.MaKH ORDER BY TongTien";
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				int id=rs.getInt("MaKH");
				String name=rs.getString("HoTenKH");
				String sdt=rs.getString("SoDienThoai");
				String diachi=rs.getString("DiaChi");
				Date ngaysinh=rs.getDate("NgaySinh");
				int TongTien=rs.getInt("TongTien");
				KhachHang obj=new KhachHang(id, name, sdt,diachi,ngaysinh);
				obj.setTongTien(TongTien);
				listKhachHang.add(obj);
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
		return listKhachHang;
	}

	public int add(KhachHang obj) {
		conn=lDB.getConnectMySql();
		String sql="insert into "+table+" (HoTenKH,SoDienThoai,DiaChi,NgaySinh) VALUES(?,?,?,?)";
		java.sql.Date ns=new java.sql.Date(obj.getNgaySinh().getTime());
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, obj.getHoTenKH());
			pst.setString(2	, obj.getSoDienThoai());
			pst.setString(3	, obj.getDiaChi());
			pst.setDate(4, ns);
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
