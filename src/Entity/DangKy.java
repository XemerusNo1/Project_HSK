package Entity;

import java.time.LocalDate;

public class DangKy {
	private String tenDangNhap, hoTen, matKhau;
	private boolean gioiTinh;
	private int SDT;
	private LocalDate namSinh;
	public DangKy(String tenDangNhap, String hoTen, String matKhau, boolean gioiTinh, int SDT, LocalDate namSinh) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.hoTen = hoTen;
		this.matKhau = matKhau;
		this.gioiTinh = gioiTinh;
		this.SDT = SDT;
		this.namSinh = namSinh;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getSDT() {
		return SDT;
	}
	public void setSDT(int sDT) {
		this.SDT = SDT;
	}
	public LocalDate getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(LocalDate namSinh) {
		this.namSinh = namSinh;
	}
	
	
}
