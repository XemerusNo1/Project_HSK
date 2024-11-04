package runTest;

import javax.swing.JFrame;

import gui.GD_Ghe;
import gui.GD_ThongTinPhim;

public class Test_GDGhe {
    public static void main(String[] args) {
        // Tạo một JFrame mới
        JFrame frame = new JFrame("Test Thong Tin Phim");
        
        // Thiết lập kích thước cho JFrame
        frame.setSize(1100, 750);
        
        // Đảm bảo JFrame đóng khi nhấn nút đóng
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tạo một đối tượng GD_ThongTinPhim
        GD_Ghe panel = new GD_Ghe();
        
        // Thêm panel vào JFrame
        frame.add(panel);
        
        // Hiển thị JFrame
        frame.setVisible(true);
        
        // Căn giữa JFrame trên màn hình
        frame.setLocationRelativeTo(null);
    }
    
    
}
