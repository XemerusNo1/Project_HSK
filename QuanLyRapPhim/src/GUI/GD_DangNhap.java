package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import DAO.DAO_DangNhap;


public class GD_DangNhap extends JFrame {
	private DAO_DangNhap daoDangNhap;
    private Image backgroundImage;
    private JButton btnDangNhap, btnDangKy;
	private JTextField txtDangNhap;
	private Connection connection;
	private JPasswordField txtMatKhau;
    
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
        txtDangNhap = new JTextField();
        txtDangNhap.setBounds(400, 285, 300, 40);
        
        // Mật khẩu
        JLabel lblMatKhau = new JLabel("Mật khẩu:", SwingConstants.CENTER);
        lblMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblMatKhau.setForeground(Color.BLACK);
        lblMatKhau.setBounds(235, 330, 400, 40);
        txtMatKhau = new JPasswordField();
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
        
        backgroundPanel.add(lblDangNhap);
        backgroundPanel.add(txtDangNhap);
        backgroundPanel.add(lblMatKhau);
        backgroundPanel.add(txtMatKhau);
        backgroundPanel.add(btnDangNhap);
        backgroundPanel.add(btnDangKy);
        
        btnDangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });

        btnDangKy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GD_DangKy().setVisible(true);
            }
        });
    }
    
    private class BackgroundPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
    //DAO_DangNhap daoDangNhap1 = new DAO_DangNhap();
    
    private void handleLogin() {
        String tenTaiKhoan = txtDangNhap.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        
        // Khởi tạo DAO_DangNhap
        DAO_DangNhap daoDangNhap = new DAO_DangNhap();
        
        // Kiểm tra thông tin đăng nhập
        if (daoDangNhap.kiemTraDangNhap(tenTaiKhoan, matKhau)) {
            //JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        	dispose();
        	TrangChu frameTrangChu = new TrangChu();
        	frameTrangChu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Tên tài khoản hoặc mật khẩu không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

}
