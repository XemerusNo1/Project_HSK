package entity;

public class Phong {
	private String maPhong;
	private int tongSoGhe;
	private Ghe ghe;
	public Phong(String maPhong, int tongSoGhe, Ghe ghe) {
		super();
		this.maPhong = maPhong;
		this.tongSoGhe = tongSoGhe;
		this.ghe = ghe;
	}
	public Phong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public int getTongSoGhe() {
		return tongSoGhe;
	}
	public void setTongSoGhe(int tongSoGhe) {
		this.tongSoGhe = tongSoGhe;
	}
	public Ghe getGhe() {
		return ghe;
	}
	public void setGhe(Ghe ghe) {
		this.ghe = ghe;
	}
	
}
