package entity;

public class SanPhamOreder {
	private String maOrederSP;
	private int soLuong;
	private double thanhTien;
	private SanPham sanpham;
	public SanPhamOreder(String maOrederSP, int soLuong, double thanhTien, SanPham sanpham) {
		super();
		this.maOrederSP = maOrederSP;
		this.soLuong = soLuong;
		this.thanhTien = thanhTien;
		this.sanpham = sanpham;
	}
	public SanPhamOreder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaOrederSP() {
		return maOrederSP;
	}
	public void setMaOrederSP(String maOrederSP) {
		this.maOrederSP = maOrederSP;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	public SanPham getSanpham() {
		return sanpham;
	}
	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}
	
}
