package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GD_DangKy extends JFrame implements ActionListener{
    
    private Image backgroundImage;
    private JButton btnDangKy;
	private JTextField txtDangNhap, txtHoTen, txtSDT, txtMatKhau;
	private JRadioButton radNam;
	private JRadioButton radNu;
    public GD_DangKy() {
        setSize(1100, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Đăng nhập");

        backgroundImage = new ImageIcon("src\\Images\\background-dang-nhap.png").getImage();

        BackgroundPanel backgroundPanel = new BackgroundPanel();
        setContentPane(backgroundPanel);
        backgroundPanel.setLayout(null);
        
        //Tên đăng nhập
        JLabel lblDangNhap = new JLabel("Tên đăng nhập:", SwingConstants.CENTER);
        lblDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblDangNhap.setForeground(Color.BLACK);
        lblDangNhap.setBounds(255, 220, 400, 30);
        JTextField txtDangNhap = new JTextField();
        txtDangNhap.setBounds(400, 245, 300, 30);
        
        //Họ tên
        JLabel lblHoTen = new JLabel("Họ tên:", SwingConstants.CENTER);
        lblHoTen.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblHoTen.setForeground(Color.BLACK);
        lblHoTen.setBounds(225, 270, 400, 30);
        JTextField txtHoTen = new JTextField();
        txtHoTen.setBounds(400, 295, 300, 30);
        
        //Số điện thoại
        JLabel lblSDT = new JLabel("Số điện thoại:", SwingConstants.CENTER);
        lblSDT.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblSDT.setForeground(Color.BLACK);
        lblSDT.setBounds(245, 320, 400, 30);
        JTextField txtSDT = new JTextField();
        txtSDT.setBounds(400, 345, 300, 30);
        
        //Năm sinh
        JLabel lblNamSinh = new JLabel("Năm sinh:", SwingConstants.CENTER);
        lblNamSinh.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNamSinh.setForeground(Color.BLACK);
        lblNamSinh.setBounds(235, 370, 400, 30);
        JTextField txtNamSinh = new JTextField();
        txtNamSinh.setBounds(400, 395, 300, 30);
        
        //Giới tính
        JLabel lblGioiTinh = new JLabel("Giới tính:", SwingConstants.CENTER);
        lblGioiTinh.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblGioiTinh.setForeground(Color.BLACK);
        lblGioiTinh.setBounds(230, 430, 400, 30);
        JRadioButton radNam = new JRadioButton("Nam");
        radNam.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        radNam.setBounds(480, 430, 70, 30);
        radNam.setOpaque(false);
        radNam.setFocusPainted(false);
        JRadioButton radNu = new JRadioButton("Nữ");
        radNu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        radNu.setBounds(580, 430, 70, 30);
        radNu.setOpaque(false);
        radNu.setFocusPainted(false);
        ButtonGroup groupGioiTinh = new ButtonGroup();
        groupGioiTinh.add(radNam);
        groupGioiTinh.add(radNu);
        
        
        //Mật khẩu
        JLabel lblMatKhau = new JLabel("Mật khẩu:", SwingConstants.CENTER);
        lblMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblMatKhau.setForeground(Color.BLACK);
        lblMatKhau.setBounds(235, 460, 400, 30);
        JTextField txtMatKhau = new JTextField();
        txtMatKhau.setBounds(400, 485, 300, 30);
        
        //nút đăng ký
        JButton btnDangNhap = new JButton("Đăng ký");
        btnDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnDangNhap.setBackground(Color.BLACK);
        btnDangNhap.setForeground(Color.WHITE);
        btnDangNhap.setBounds(490, 530, 120, 40);
        btnDangNhap.addActionListener(this);
        
        //nút trở về
        JButton btnTroVe = new JButton("");
        btnTroVe.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnTroVe.setIcon(new ImageIcon("src\\Images\\back.png"));
        btnTroVe.setBorderPainted(false);
        btnTroVe.setFocusPainted(false);
        btnTroVe.setBackground(Color.WHITE);
        btnTroVe.setForeground(Color.BLACK);
        btnTroVe.setBounds(70, 30, 120, 40);
        btnTroVe.addActionListener(this);
        
        
        backgroundPanel.add(btnTroVe);
        backgroundPanel.add(txtDangNhap);
        backgroundPanel.add(lblDangNhap);
        backgroundPanel.add(lblHoTen);
        backgroundPanel.add(txtHoTen);
        backgroundPanel.add(lblSDT);
        backgroundPanel.add(txtSDT);
        backgroundPanel.add(lblNamSinh);
        backgroundPanel.add(txtNamSinh);
        backgroundPanel.add(lblGioiTinh);
        backgroundPanel.add(radNam);
        backgroundPanel.add(radNu);
        backgroundPanel.add(lblMatKhau);
        backgroundPanel.add(txtMatKhau);
        backgroundPanel.add(btnDangNhap);
        
    }
    
    private class BackgroundPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    @Override
	public void actionPerformed(ActionEvent e) {
    	//dangKyNhanVien();
    	
	}
    
    private void dangKyNhanVien() {
    	String tenDangNhap = txtDangNhap.getText();
    	String hoTen = txtHoTen.getText();
    	String matKhau = txtMatKhau.getText();
    	boolean gioiTinh = radNam.isSelected();
    	int SDT = Integer.parseInt(txtSDT.getText());
    	
    	try {
    		Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=QuanLyRapChieuPhim;user=sa;password=123");
    		String sql = "EXEC sp_ThemNhanVien @tenDangNhap = ?, @hoTen = ?, @matKhau = ?, @gioiTinh = ?, @sdt = ?";
    		PreparedStatement statement = con.prepareStatement(sql);
    		statement.setString(1, tenDangNhap);
    		statement.setString(2, hoTen);
    		statement.setInt(3, SDT);
    		statement.setBoolean(4, gioiTinh);
    		statement.setString(5, matKhau);
    		statement.executeUpdate();
    		JOptionPane.showMessageDialog(this, "Đăng ký thành công!");
    		
    		//Đóng kết nối
    		statement.close();
    		con.close();
    		
    		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Đăng ký không thành công!" + e.getMessage());
			
		}
    	
    }
    
//    public static void main(String[] args) {
//    	GD_DangKy frame = new GD_DangKy();
//    	frame.setVisible(true);
//    }
}
