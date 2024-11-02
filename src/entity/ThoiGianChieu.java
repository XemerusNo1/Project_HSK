package entity;

import java.sql.Date;

public class ThoiGianChieu {
	private String maGioChieu;
	private Date gioChieu, gioKetThuc;
	private double giaVeXemPhim;
	private Phong phong;
	private Phim phim;
	public ThoiGianChieu(String maGioChieu, Date gioChieu, Date gioKetThuc, double giaVeXemPhim, Phong phong,
			Phim phim) {
		super();
		this.maGioChieu = maGioChieu;
		this.gioChieu = gioChieu;
		this.gioKetThuc = gioKetThuc;
		this.giaVeXemPhim = giaVeXemPhim;
		this.phong = phong;
		this.phim = phim;
	}
	public ThoiGianChieu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaGioChieu() {
		return maGioChieu;
	}
	public void setMaGioChieu(String maGioChieu) {
		this.maGioChieu = maGioChieu;
	}
	public Date getGioChieu() {
		return gioChieu;
	}
	public void setGioChieu(Date gioChieu) {
		this.gioChieu = gioChieu;
	}
	public Date getGioKetThuc() {
		return gioKetThuc;
	}
	public void setGioKetThuc(Date gioKetThuc) {
		this.gioKetThuc = gioKetThuc;
	}
	public double getGiaVeXemPhim() {
		return giaVeXemPhim;
	}
	public void setGiaVeXemPhim(double giaVeXemPhim) {
		this.giaVeXemPhim = giaVeXemPhim;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	public Phim getPhim() {
		return phim;
	}
	public void setPhim(Phim phim) {
		this.phim = phim;
	}

}
