package Entity;

import java.util.Objects;
import Entity.DangNhap;
public class DangNhap {
	private String tenDangNhap, matKhau;

	public DangNhap(String tenDangNhap, String matKhau) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matKhau, tenDangNhap);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DangNhap other = (DangNhap) obj;
		return Objects.equals(matKhau, other.matKhau) && Objects.equals(tenDangNhap, other.tenDangNhap);
	}
	
	
}	
