package entity;

public class Ghe {
	private String maGhe,loaiGhe;

	public Ghe(String maGhe, String loaiGhe) {
		super();
		this.maGhe = maGhe;
		this.loaiGhe = loaiGhe;
	}

	public Ghe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMaGhe() {
		return maGhe;
	}

	public void setMaGhe(String maGhe) {
		this.maGhe = maGhe;
	}

	public String getLoaiGhe() {
		return loaiGhe;
	}

	public void setLoaiGhe(String loaiGhe) {
		this.loaiGhe = loaiGhe;
	}
	
}
