package dao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test_DaoThongTinPhim extends JFrame {
    private DAO_Ghe daoThongTinPhim;
    private JTextField txtMaPhim;
    private JTextField txtTieuDe;

    public Test_DaoThongTinPhim() {
        daoThongTinPhim = new DAO_Ghe();
        
        // Thiết lập giao diện
        setTitle("Kiểm tra Tiêu đề Phim");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 5, 5));

        // Nhãn và trường nhập mã phim
        JLabel lblMaPhim = new JLabel("Mã Phim:");
        txtMaPhim = new JTextField();
        
        // Nhãn và trường để hiển thị tiêu đề
        JLabel lblTieuDe = new JLabel("Tiêu Đề:");
        txtTieuDe = new JTextField();
        txtTieuDe.setEditable(false); // Không cho phép chỉnh sửa
        
        // Nút để thực hiện tìm kiếm tiêu đề phim
        JButton btnLayTieuDe = new JButton("Lấy Tiêu Đề");
        btnLayTieuDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layTieuDe();
            }
        });

        // Thêm các thành phần vào giao diện
        add(lblMaPhim);
        add(txtMaPhim);
        add(lblTieuDe);
        add(txtTieuDe);
        add(btnLayTieuDe);
    }

    private void layTieuDe() {
        // Lấy mã phim từ txtMaPhim
        String maPhim = txtMaPhim.getText().trim();
        
        // Kiểm tra nếu mã phim không rỗng
        if (!maPhim.isEmpty()) {
            String tieuDe = daoThongTinPhim.getGiaSanPhamTheoMaSP(maPhim);
            if (tieuDe != null) {
                txtTieuDe.setText(tieuDe);
            } else {
                txtTieuDe.setText("Không tìm thấy tiêu đề");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã phim", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Test_DaoThongTinPhim frame = new Test_DaoThongTinPhim();
            frame.setVisible(true);
        });
    }
}
