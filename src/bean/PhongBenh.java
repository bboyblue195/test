package bean;

public class PhongBenh {
	private int MaVacxin;
	private int MaBenh;
	private String GhiChu;
	public PhongBenh(int maVacxin, int maBenh, String ghiChu) {
		super();
		MaVacxin = maVacxin;
		MaBenh = maBenh;
		GhiChu = ghiChu;
	}
	public PhongBenh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaVacxin() {
		return MaVacxin;
	}
	public void setMaVacxin(int maVacxin) {
		MaVacxin = maVacxin;
	}
	public int getMaBenh() {
		return MaBenh;
	}
	public void setMaBenh(int maBenh) {
		MaBenh = maBenh;
	}
	public String getGhiChu() {
		return GhiChu;
	}
	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	
}
