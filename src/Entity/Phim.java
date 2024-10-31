package Entity;

import java.util.Objects;

public class Phim {
	private String maPhim, tieuDe, daoDien, moTa;
	private int thoiLuong, namPhatHanh;
	public Phim(String maPhim, String tieuDe, String daoDien, String moTa, int thoiLuong, int namPhatHanh) {
		super();
		this.maPhim = maPhim;
		this.tieuDe = tieuDe;
		this.daoDien = daoDien;
		this.moTa = moTa;
		this.thoiLuong = thoiLuong;
		this.namPhatHanh = namPhatHanh;
	}
	public String getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getDaoDien() {
		return daoDien;
	}
	public void setDaoDien(String daoDien) {
		this.daoDien = daoDien;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getThoiLuong() {
		return thoiLuong;
	}
	public void setThoiLuong(int thoiLuong) {
		this.thoiLuong = thoiLuong;
	}
	public int getNamPhatHanh() {
		return namPhatHanh;
	}
	public void setNamPhatHanh(int namPhatHanh) {
		this.namPhatHanh = namPhatHanh;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhim);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phim other = (Phim) obj;
		return Objects.equals(maPhim, other.maPhim);
	}
	
	
}
