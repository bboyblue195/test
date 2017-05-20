package bean;

public class Benh {
	private int MaBenh;
	private String TenBenh;
	private String MoTa;
	public Benh(int maBenh, String tenBenh, String moTa) {
		super();
		MaBenh = maBenh;
		TenBenh = tenBenh;
		MoTa = moTa;
	}
	public Benh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaBenh() {
		return MaBenh;
	}
	public void setMaBenh(int maBenh) {
		MaBenh = maBenh;
	}
	public String getTenBenh() {
		return TenBenh;
	}
	public void setTenBenh(String tenBenh) {
		TenBenh = tenBenh;
	}
	public String getMoTa() {
		return MoTa;
	}
	public void setMoTa(String moTa) {
		MoTa = moTa;
	}
	
	
}
