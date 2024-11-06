package dao;

import java.util.List;

public class Test_DaoGhe {
    public static void main(String[] args) {
        // Khởi tạo đối tượng DAO_Ghe
        DAO_Ghe daoGhe = new DAO_Ghe();
        
        // Các tham số cần thiết để gọi getDanhSachGhe
        String maPhong = "Phong01";  // Mã phòng
        String gioChieu = "17:30";  // Giờ chiếu
        String ngayChieu = "30/10 Thứ Tư";  // Ngày chiếu

        // Gọi phương thức và lấy danh sách ghế
        List<String> danhSachGhe = daoGhe.getDanhSachGhe(maPhong, gioChieu, ngayChieu);

        // In ra danh sách ghế
        for (String ghe : danhSachGhe) {
            System.out.println(ghe);
        }
    }
}
