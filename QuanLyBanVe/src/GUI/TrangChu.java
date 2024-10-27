package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TrangChu extends JFrame{
	
	public TrangChu() {
		setBackground(new Color(64, 64, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1300, 750);
		setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("ABK START CINEMA");
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);

		JLabel lblNewLabel_2 = new JLabel("       ");
		menuBar.add(lblNewLabel_2);

		JLabel logo = new JLabel("ABK START CINEMA");
		logo.setForeground(new Color(0, 0, 102));
		logo.setFont(new Font("Segoe Script", Font.BOLD, 18));
		logo.setIcon(
				new ImageIcon("src\\img\\logo.jpg"));
		menuBar.add(logo);

		//thanh menu
		JLabel lblNewLabel_1 = new JLabel("               ");
		menuBar.add(lblNewLabel_1);

		JMenu HeThong = new JMenu("Hệ thống");
		HeThong.setPreferredSize(new Dimension(150, 40));
		HeThong.setIcon(new ImageIcon("src\\img\\app-development.png"));
		HeThong.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(HeThong);
		
		JMenuItem DangXuat = new JMenuItem("Đăng Xuất");
		DangXuat.setPreferredSize(new Dimension(147, 40));
		DangXuat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		HeThong.add(DangXuat);

		
		JMenu DanhMuc = new JMenu("Danh Mục");
		DanhMuc.setPreferredSize(new Dimension(150, 40));
		DanhMuc.setIcon(new ImageIcon("src\\img\\categories.png"));
		DanhMuc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(DanhMuc);

		JMenuItem NhanVien = new JMenuItem("Nhân viên");
		NhanVien.setPreferredSize(new Dimension(147, 40));
		NhanVien.setFont(new Font("Times New Roman", Font.BOLD, 15));
		DanhMuc.add(NhanVien);

		JMenuItem Phim = new JMenuItem("Phim");
		Phim.setPreferredSize(new Dimension(147, 40));
		Phim.setFont(new Font("Times New Roman", Font.BOLD, 15));
		DanhMuc.add(Phim);

		JMenu XuLy = new JMenu("Xử Lý");
		XuLy.setPreferredSize(new Dimension(150, 40));
		XuLy.setIcon(new ImageIcon("src\\img\\process.png"));
		XuLy.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(XuLy);

		JMenuItem DatVe = new JMenuItem("Đặt vé");
		DatVe.setPreferredSize(new Dimension(147, 40));
		DatVe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		XuLy.add(DatVe);

		JMenuItem HoaDon = new JMenuItem("Xuất hóa đơn");
		HoaDon.setPreferredSize(new Dimension(147, 40));
		HoaDon.setFont(new Font("Times New Roman", Font.BOLD, 15));
		XuLy.add(HoaDon);

		JMenuItem XuatVe = new JMenuItem("Xuất vé");
		XuatVe.setPreferredSize(new Dimension(147, 40));
		XuatVe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		XuLy.add(XuatVe);

		JMenu TimKiem = new JMenu("Tìm Kiếm");
		TimKiem.setPreferredSize(new Dimension(150, 40));
		TimKiem.setIcon(
				new ImageIcon("src\\img\\seo.png"));
		TimKiem.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(TimKiem);

		JMenuItem NhanVienTK = new JMenuItem("Nhân Viên");
		NhanVienTK.setPreferredSize(new Dimension(147, 40));
		NhanVienTK.setFont(new Font("Times New Roman", Font.BOLD, 15));
		TimKiem.add(NhanVienTK);

		JMenuItem PhimTK = new JMenuItem("Phim");
		PhimTK.setPreferredSize(new Dimension(147, 40));
		PhimTK.setFont(new Font("Times New Roman", Font.BOLD, 15));
		TimKiem.add(PhimTK);


		JMenu BaoBieu = new JMenu("Báo Biểu");
		BaoBieu.setPreferredSize(new Dimension(150, 40));
		BaoBieu.setIcon(new ImageIcon("src\\img\\increase.png"));
		BaoBieu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(BaoBieu);

		JMenuItem ThongKeDT = new JMenuItem("Thống kê doanh thu");
		ThongKeDT.setPreferredSize(new Dimension(147, 40));
		ThongKeDT.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BaoBieu.add(ThongKeDT);

		JLabel lblNewLabel = new JLabel("                                        ");
		menuBar.add(lblNewLabel);


		JLabel lblTK = new JLabel("");
		lblTK.setIcon(new ImageIcon("src\\img\\user-profile.png"));
		lblTK.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		menuBar.add(lblTK);

		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane_1);
		contentPane_1.setLayout(new BorderLayout(0, 0));

		GD_TrangChu tc = new GD_TrangChu();
		contentPane_1.add(tc, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		// Khởi tạo giao diện TrangChu
		TrangChu frame = new TrangChu();
		frame.setVisible(true); // Hiển thị cửa sổ
	}
}
