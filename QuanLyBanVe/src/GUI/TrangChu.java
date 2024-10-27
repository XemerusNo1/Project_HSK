package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TrangChu extends JFrame {
	private JMenuItem mnThongKeDT;
	private JMenu mnBaoBieu;
	private JMenuItem mnPhimTK;
	private JMenuItem mnNhanVienTK;
	private JMenu mnTimKiem;
	private JMenu mnXuLy;
	private JMenuItem mnDatVe;
	private JMenuItem mnHoaDon;
	private JMenuItem mnXuatVe;
	private JMenu mnDanhMuc;
	private JMenuItem mnNhanVien;
	private JMenuItem mnPhim;
	private JMenu mnHeThong;
	private JMenuItem mndsPhim;
	private JMenuItem mnPhimDangChieu;
	private JMenu mnCV;
	private JMenuItem mnDangXuat;
	private JMenuItem mnThongTinCaNhan;
	public TrangChu() {
		setBackground(new Color(64, 64, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1100, 750);
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
		logo.setForeground(new Color(0, 0, 0));
		logo.setFont(new Font("Heebo", Font.BOLD, 18));
		
		ImageIcon originalIcon = new ImageIcon("src\\img\\logo.png");
		Image resizedImage = originalIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(resizedImage));
		menuBar.add(logo);

		//thanh menu
		JLabel lblNewLabel_1 = new JLabel("               ");
		menuBar.add(lblNewLabel_1);
		mnDanhMuc = new JMenu("Danh Mục");
		mnDanhMuc.setPreferredSize(new Dimension(150, 40));
		mnDanhMuc.setIcon(new ImageIcon("src\\img\\danh-muc.png"));
		mnDanhMuc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnDanhMuc);

		mndsPhim = new JMenuItem("Danh Sách Phim");
		mndsPhim.setPreferredSize(new Dimension(147, 40));
		mndsPhim.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnDanhMuc.add(mndsPhim);

		mnPhimDangChieu = new JMenuItem("Phim Đang Chiếu");
		mnPhimDangChieu.setPreferredSize(new Dimension(147, 40));
		mnPhimDangChieu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnDanhMuc.add(mnPhimDangChieu);

		mnXuLy = new JMenu("Xử Lý");
		mnXuLy.setPreferredSize(new Dimension(150, 40));
		mnXuLy.setIcon(new ImageIcon("src\\img\\xu-li.png"));
		mnXuLy.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnXuLy);

		mnDatVe = new JMenuItem("Đặt vé");
		mnDatVe.setPreferredSize(new Dimension(147, 40));
		mnDatVe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnXuLy.add(mnDatVe);

		mnTimKiem = new JMenu("Tìm Kiếm");
		mnTimKiem.setPreferredSize(new Dimension(150, 40));
		mnTimKiem.setIcon(new ImageIcon("src\\img\\tim-kiem.png"));
		mnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnTimKiem);

		mnPhimTK = new JMenuItem("Phim");
		mnPhimTK.setPreferredSize(new Dimension(147, 40));
		mnPhimTK.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnTimKiem.add(mnPhimTK);


		mnBaoBieu = new JMenu("Báo Biểu");
		mnBaoBieu.setPreferredSize(new Dimension(150, 40));
		mnBaoBieu.setIcon(new ImageIcon("src\\img\\bao-bieu.png"));
		mnBaoBieu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnBaoBieu);

		mnThongKeDT = new JMenuItem("Thống kê doanh thu");
		mnThongKeDT.setPreferredSize(new Dimension(147, 40));
		mnThongKeDT.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnBaoBieu.add(mnThongKeDT);

		menuBar.add(Box.createHorizontalStrut(60));
		mnCV = new JMenu("");
		mnCV.setPreferredSize(new Dimension(120, 40));
		mnCV.setIcon(new ImageIcon("src\\img\\user.png"));
		mnCV.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnCV);
		
		
		mnThongTinCaNhan = new JMenuItem("Hồ Sơ Cá Nhân");
		mnThongTinCaNhan.setPreferredSize(new Dimension(117, 40));
		mnThongTinCaNhan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnCV.add(mnThongTinCaNhan);
		mnDangXuat = new JMenuItem("Đăng Xuất");
		mnDangXuat.setPreferredSize(new Dimension(117, 40));
		mnDangXuat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnCV.add(mnDangXuat);
		// het thanh menu
		
		
	}
	public static void main(String[] args) {
		TrangChu frame = new TrangChu();
		frame.setVisible(true);
	}
}
