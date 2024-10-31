package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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

import DAO.DAO_DangKy;


public class GD_DangKy extends JFrame implements ActionListener{
    private Image backgroundImage;
    private JTextField txtTenDangNhap; // Khai báo biến ở đây
    private JTextField txtHoTen;
    private JTextField txtSDT;
    private JTextField txtMatKhau1;
    private JTextField txtNamSinh;
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
        JLabel lblTenDangNhap = new JLabel("Tên đăng nhập:", SwingConstants.CENTER);
        lblTenDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblTenDangNhap.setForeground(Color.BLACK);
        lblTenDangNhap.setBounds(255, 220, 400, 30);
        txtTenDangNhap = new JTextField();
        txtTenDangNhap.setBounds(400, 245, 300, 30);
        
        //Họ tên
        JLabel lblHoTen = new JLabel("Họ tên:", SwingConstants.CENTER);
        lblHoTen.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblHoTen.setForeground(Color.BLACK);
        lblHoTen.setBounds(225, 270, 400, 30);
        txtHoTen = new JTextField();
        txtHoTen.setBounds(400, 295, 300, 30);
        
        //Số điện thoại
        JLabel lblSDT = new JLabel("Số điện thoại:", SwingConstants.CENTER);
        lblSDT.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblSDT.setForeground(Color.BLACK);
        lblSDT.setBounds(245, 320, 400, 30);
        txtSDT = new JTextField();
        txtSDT.setBounds(400, 345, 300, 30);
        
        //Năm sinh
        JLabel lblNamSinh = new JLabel("Năm sinh:", SwingConstants.CENTER);
        lblNamSinh.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNamSinh.setForeground(Color.BLACK);
        lblNamSinh.setBounds(235, 370, 400, 30);
        txtNamSinh = new JTextField();
        txtNamSinh.setBounds(400, 395, 300, 30);
        
        //Giới tính
        JLabel lblGioiTinh = new JLabel("Giới tính:", SwingConstants.CENTER);
        lblGioiTinh.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblGioiTinh.setForeground(Color.BLACK);
        lblGioiTinh.setBounds(230, 430, 400, 30);
        radNam = new JRadioButton("Nam");
        radNam.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        radNam.setBounds(480, 430, 70, 30);
        radNam.setOpaque(false);
        radNam.setFocusPainted(false);
        radNu = new JRadioButton("Nữ");
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
        txtMatKhau1 = new JTextField();
        txtMatKhau1.setBounds(400, 485, 300, 30);
        
        //nút đăng ký
        JButton btnDangKy1 = new JButton("Đăng ký");
        btnDangKy1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnDangKy1.setBackground(Color.BLACK);
        btnDangKy1.setForeground(Color.WHITE);
        btnDangKy1.setBounds(490, 530, 120, 40);
        btnDangKy1.addActionListener(this);
        
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
        backgroundPanel.add(txtTenDangNhap);
        backgroundPanel.add(lblTenDangNhap);
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
        backgroundPanel.add(txtMatKhau1);
        backgroundPanel.add(btnDangKy1);
        btnTroVe.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new GD_DangNhap().setVisible(true);
				
			}
		});
        
        btnDangKy1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnDangKy1) {
		            dangKyNhanVien();
		            dispose();
		            new GD_DangNhap().setVisible(true);// Gọi phương thức đăng ký khi nhấn nút
		        }
				
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

    
    private void dangKyNhanVien() {
        // Lấy thông tin từ các trường giao diện
        String tenTaiKhoan = txtTenDangNhap.getText().trim();
        String hoTen = txtHoTen.getText().trim();
        String matKhau = txtMatKhau1.getText().trim();
        String sdtStr = txtSDT.getText().trim();
        boolean gioiTinh = radNam.isSelected();
        String namSinhStr = txtNamSinh.getText().trim();
        
        if (tenTaiKhoan.isEmpty() || hoTen.isEmpty() || matKhau.isEmpty() || sdtStr.isEmpty() || namSinhStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int sdt;
        try {
            sdt = Integer.parseInt(sdtStr); // Chuyển đổi chuỗi số điện thoại sang int
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ! Vui lòng nhập lại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Gọi DAO_DangKy để thêm vào cơ sở dữ liệu
        DAO_DangKy daoDangKy = new DAO_DangKy();
        if (daoDangKy.dangKyNhanVien(hoTen, namSinhStr, sdt, gioiTinh, tenTaiKhoan, matKhau)) {
            JOptionPane.showMessageDialog(this, "Đăng ký thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            clearFields(); // Làm mới các trường nhập
        } else {
            JOptionPane.showMessageDialog(this, "Đăng ký không thành công! Vui lòng thử lại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void clearFields() {
    	txtTenDangNhap.setText("");
        txtHoTen.setText("");
        txtSDT.setText("");
        txtNamSinh.setText("");
        txtMatKhau1.setText("");
        radNam.setSelected(false);
        radNu.setSelected(false);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

    
//    public static void main(String[] args) {
//    	GD_DangKy frame = new GD_DangKy();
//    	frame.setVisible(true);
//    }
}
