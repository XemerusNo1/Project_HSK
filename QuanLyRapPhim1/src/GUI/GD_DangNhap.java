package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GD_DangNhap extends JFrame {
    
    private Image backgroundImage;
    private JButton btnDangNhap, btnDangKy;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                GD_DangNhap frame = new GD_DangNhap();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public GD_DangNhap() {
        setSize(1100, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Đăng nhập");

        backgroundImage = new ImageIcon("src\\Images\\background-dang-nhap.png").getImage();
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        setContentPane(backgroundPanel);
        backgroundPanel.setLayout(null);
        
        // Tên đăng nhập
        JLabel lblDangNhap = new JLabel("Tên đăng nhập:", SwingConstants.CENTER);
        lblDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblDangNhap.setForeground(Color.BLACK);
        lblDangNhap.setBounds(255, 250, 400, 40);
        JTextField txtDangNhap = new JTextField();
        txtDangNhap.setBounds(400, 285, 300, 40);
        
        // Mật khẩu
        JLabel lblMatKhau = new JLabel("Mật khẩu:", SwingConstants.CENTER);
        lblMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblMatKhau.setForeground(Color.BLACK);
        lblMatKhau.setBounds(235, 330, 400, 40);
        JTextField txtMatKhau = new JTextField();
        txtMatKhau.setBounds(400, 365, 300, 40);
        
        // nút Đăng nhập
        btnDangNhap = new JButton("Đăng nhập");
        btnDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnDangNhap.setBackground(Color.BLACK);
        btnDangNhap.setForeground(Color.WHITE);
        btnDangNhap.setBounds(420, 420, 120, 40);
        
        // nút Đăng ký
        btnDangKy = new JButton("Đăng ký");
        btnDangKy.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnDangKy.setBackground(Color.BLACK);
        btnDangKy.setForeground(Color.WHITE);
        btnDangKy.setBounds(560, 420, 120, 40);
        
        // Thêm các thành phần vào backgroundPanel
        backgroundPanel.add(lblDangNhap);
        backgroundPanel.add(txtDangNhap);
        backgroundPanel.add(lblMatKhau);
        backgroundPanel.add(txtMatKhau);
        backgroundPanel.add(btnDangNhap);
        backgroundPanel.add(btnDangKy);

        // Gán hành động cho các nút
        btnDangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = 1; // Giả lập logic đăng nhập
                if (a == 1) {
                    dispose(); // Đóng giao diện đăng nhập
                    new TrangChu().setVisible(true); // Mở giao diện TrangChu
                } else {
                    JOptionPane.showMessageDialog(GD_DangNhap.this, "Tên đăng nhập hoặc mật khẩu không đúng.");
                }
            }
        });

        btnDangKy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Đóng giao diện đăng nhập
                new GD_DangKy().setVisible(true); // Giả sử GD_DangKy là giao diện đăng ký
            }
        });
    }
    
    // JPanel để vẽ background
    private class BackgroundPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
