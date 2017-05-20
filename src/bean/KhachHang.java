package bean;

import java.util.Date;

public class KhachHang {
	private int MaKH;
	private String HoTenKH;
	private String SoDienThoai;
	private String DiaChi;
	private Date NgaySinh;
	private int TongTien;
	public KhachHang(int maKH, String hoTenKH, String soDienThoai, String diaChi, Date ngaySinh) {
		super();
		MaKH = maKH;
		HoTenKH = hoTenKH;
		SoDienThoai = soDienThoai;
		DiaChi = diaChi;
		NgaySinh = ngaySinh;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getMaKH() {
		return MaKH;
	}
	public int getTongTien() {
		return TongTien;
	}
	public void setTongTien(int tongTien) {
		TongTien = tongTien;
	}
	public void setMaKH(int maKH) {
		MaKH = maKH;
	}
	public String getHoTenKH() {
		return HoTenKH;
	}
	public void setHoTenKH(String hoTenKH) {
		HoTenKH = hoTenKH;
	}
	public String getSoDienThoai() {
		return SoDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	
}
