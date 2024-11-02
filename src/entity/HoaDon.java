package entity;

import java.sql.Date;

public class HoaDon {
	private String maHD;
	private double tongTien;
	private Date ngayBan;
	private SanPhamOreder sanphamOrder;
	private VePhim vephim;
	private NhanVien nhanvien;
	public HoaDon(String maHD, double tongTien, Date ngayBan, SanPhamOreder sanphamOrder, VePhim vephim,
			NhanVien nhanvien) {
		super();
		this.maHD = maHD;
		this.tongTien = tongTien;
		this.ngayBan = ngayBan;
		this.sanphamOrder = sanphamOrder;
		this.vephim = vephim;
		this.nhanvien = nhanvien;
	}
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public Date getNgayBan() {
		return ngayBan;
	}
	public void setNgayBan(Date ngayBan) {
		this.ngayBan = ngayBan;
	}
	public SanPhamOreder getSanphamOrder() {
		return sanphamOrder;
	}
	public void setSanphamOrder(SanPhamOreder sanphamOrder) {
		this.sanphamOrder = sanphamOrder;
	}
	public VePhim getVephim() {
		return vephim;
	}
	public void setVephim(VePhim vephim) {
		this.vephim = vephim;
	}
	public NhanVien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
	
}
