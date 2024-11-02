package entity;

public class SanPham {
	private String maSP, tenSP;
	private double giaBan;
	public SanPham(String maSP, String tenSP, double giaBan) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.giaBan = giaBan;
	}
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	
}
