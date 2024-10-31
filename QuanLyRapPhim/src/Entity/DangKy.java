package Entity;

public class DangKy {
	private String tenDangNhap;
	private String hoTen;
	private int SDT;
	private String namSinh;
	private boolean gioiTinh;
	private String matKhau;
	public DangKy(String tenDangNhap, String hoTen, int SDT, String namSinh, boolean gioiTinh, String matKhau) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.hoTen = hoTen;
		this.SDT = SDT;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.matKhau = matKhau;
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
	public int getSDT() {
		return SDT;
	}
	public void setSDT(int sDT) {
		this.SDT = SDT;
	}
	public String getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	
	
}
