package entity;

import java.util.Objects;

public class Phim {
	private String maPhim, tieuDe, daoDien;
	private int thoiLuong;
	private String moTa;
	private int namPhatHanh;
	public Phim(String maPhim, String tieuDe, String daoDien, int thoiLuong, String moTa, int namPhatHanh) {
		super();
		this.maPhim = maPhim;
		this.tieuDe = tieuDe;
		this.daoDien = daoDien;
		this.thoiLuong = thoiLuong;
		this.moTa = moTa;
		this.namPhatHanh = namPhatHanh;
	}
	public Phim() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getThoiLuong() {
		return thoiLuong;
	}
	public void setThoiLuong(int thoiLuong) {
		this.thoiLuong = thoiLuong;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getNamPhatHanh() {
		return namPhatHanh;
	}
	public void setNamPhatHanh(int namPhatHanh) {
		this.namPhatHanh = namPhatHanh;
	}
	
	
	
}
