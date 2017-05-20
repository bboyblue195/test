package bean;

import java.util.Date;

public class LichSuTiemPhong {
	private int MaKH;
	private String TenKH;
	private String TenBenh;
	private int MaVacxin;
	private String TenVacxin;
	private int TongSoMui;
	private Date NgayTiemPhong;
	private Date NgayHenTiepTheo;
	public LichSuTiemPhong(int maKH, String tenKH, String tenBenh, int maVacxin, String tenVacxin, int tongSoMui,
			Date ngayTiemPhong, Date ngayHenTiepTheo) {
		super();
		MaKH = maKH;
		TenKH = tenKH;
		TenBenh = tenBenh;
		MaVacxin = maVacxin;
		TenVacxin = tenVacxin;
		TongSoMui = tongSoMui;
		NgayTiemPhong = ngayTiemPhong;
		NgayHenTiepTheo = ngayHenTiepTheo;
	}
	public LichSuTiemPhong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaKH() {
		return MaKH;
	}
	public void setMaKH(int maKH) {
		MaKH = maKH;
	}
	public String getTenKH() {
		return TenKH;
	}
	public void setTenKH(String tenKH) {
		TenKH = tenKH;
	}
	public String getTenBenh() {
		return TenBenh;
	}
	public void setTenBenh(String tenBenh) {
		TenBenh = tenBenh;
	}
	public int getMaVacxin() {
		return MaVacxin;
	}
	public void setMaVacxin(int maVacxin) {
		MaVacxin = maVacxin;
	}
	public String getTenVacxin() {
		return TenVacxin;
	}
	public void setTenVacxin(String tenVacxin) {
		TenVacxin = tenVacxin;
	}
	public int getTongSoMui() {
		return TongSoMui;
	}
	public void setTongSoMui(int tongSoMui) {
		TongSoMui = tongSoMui;
	}
	public Date getNgayTiemPhong() {
		return NgayTiemPhong;
	}
	public void setNgayTiemPhong(Date ngayTiemPhong) {
		NgayTiemPhong = ngayTiemPhong;
	}
	public Date getNgayHenTiepTheo() {
		return NgayHenTiepTheo;
	}
	public void setNgayHenTiepTheo(Date ngayHenTiepTheo) {
		NgayHenTiepTheo = ngayHenTiepTheo;
	}
	
	
	
}
