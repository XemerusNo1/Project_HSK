package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TrangChu extends JFrame implements ActionListener, MouseListener{
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
	private JMenu mnTrangChu;
	private JPanel contentPane_1;
	public TrangChu() {
		setBackground(new Color(35, 33, 33));
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
		logo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		ImageIcon originalIcon = new ImageIcon("src\\Images\\logo.png");
		Image resizedImage = originalIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(resizedImage));
		menuBar.add(logo);

		//thanh menu
		JLabel lblNewLabel_1 = new JLabel("               ");
		menuBar.add(lblNewLabel_1);
		mnTrangChu = new JMenu("Trang Chủ");
		mnTrangChu.setPreferredSize(new Dimension(150, 40));
		mnTrangChu.setIcon(new ImageIcon("src\\Images\\home.png"));
		mnTrangChu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnTrangChu);
		
		
		mnDanhMuc = new JMenu("Danh Mục");
		mnDanhMuc.setPreferredSize(new Dimension(150, 40));
		mnDanhMuc.setIcon(new ImageIcon("src\\Images\\danh-muc.png"));
		mnDanhMuc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnDanhMuc);

		mndsPhim = new JMenuItem("Danh Sách Phim");
		mndsPhim.setPreferredSize(new Dimension(147, 40));
		mndsPhim.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnDanhMuc.add(mndsPhim);

		mnBaoBieu = new JMenu("Báo Biểu");
		mnBaoBieu.setPreferredSize(new Dimension(150, 40));
		mnBaoBieu.setIcon(new ImageIcon("src\\Images\\bao-bieu.png"));
		mnBaoBieu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnBaoBieu);

		mnThongKeDT = new JMenuItem("Thống kê doanh thu");
		mnThongKeDT.setPreferredSize(new Dimension(147, 40));
		mnThongKeDT.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnBaoBieu.add(mnThongKeDT);

		menuBar.add(Box.createHorizontalStrut(90));
		mnCV = new JMenu("");
		mnCV.setPreferredSize(new Dimension(120, 40));
		mnCV.setIcon(new ImageIcon("src\\Images\\user.png"));
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
		
		
		contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane_1);
		contentPane_1.setLayout(new BorderLayout(0, 0));

//		GD_TrangChu trangChu = new GD_TrangChu();
//		contentPane_1.add(trangChu, BorderLayout.CENTER);
		loadPanel(new GD_TrangChu());
		
		
		
		mnDangXuat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int xacNhan = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất?","Xác nhận đăng xuất",JOptionPane.YES_NO_OPTION);
				if(xacNhan == JOptionPane.YES_OPTION) {
					dispose();
					GD_DangNhap frameDangNhap = new GD_DangNhap();
					frameDangNhap.setVisible(true);
				}
			}
		});
		
		mndsPhim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				loadPanel(new GD_DanhSachPhim());
			}

		});
		
		mnThongKeDT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			    loadPanel(new GD_ThongKe());
			}

		});
		
		mnThongTinCaNhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPanel(new GD_ThongTinCaNhan());
            }
        });

		mnTrangChu.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                loadPanel(new GD_TrangChu());
            }
        });

		
	}
	private void loadPanel(JPanel panel) {
	    contentPane_1.removeAll();
	    contentPane_1.add(panel, BorderLayout.CENTER);
	    contentPane_1.validate();
	    contentPane_1.repaint();
	}
	
}
