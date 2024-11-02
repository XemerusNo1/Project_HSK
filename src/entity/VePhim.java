package entity;

public class VePhim {
	private String maVe;
	private double giaVe;
	private String ghedadat;
	private ThoiGianChieu thoigianchieu;
	public VePhim(String maVe, double giaVe, String ghedadat, ThoiGianChieu thoigianchieu) {
		super();
		this.maVe = maVe;
		this.giaVe = giaVe;
		this.ghedadat = ghedadat;
		this.thoigianchieu = thoigianchieu;
	}
	public VePhim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaVe() {
		return maVe;
	}
	public void setMaVe(String maVe) {
		this.maVe = maVe;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public String getGhedadat() {
		return ghedadat;
	}
	public void setGhedadat(String ghedadat) {
		this.ghedadat = ghedadat;
	}
	public ThoiGianChieu getThoigianchieu() {
		return thoigianchieu;
	}
	public void setThoigianchieu(ThoiGianChieu thoigianchieu) {
		this.thoigianchieu = thoigianchieu;
	}
	
	
}
