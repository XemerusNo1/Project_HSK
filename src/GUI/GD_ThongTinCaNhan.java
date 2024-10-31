package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class GD_ThongTinCaNhan extends JPanel {

	private JLabel title;
	private Font font;
	private JLabel txtmanv;
	private JLabel txtten;
	private JLabel txtsdt;
	private Component txtvaitro;

	public GD_ThongTinCaNhan() {
		setSize(1100, 700);
		// Tạo JPanel cho tiêu đề
		JPanel pnn = new JPanel();
		pnn.setLayout(new BorderLayout()); // Đặt layout cho pnn

		// Tạo tiêu đề
		JLabel title = new JLabel("THÔNG TIN NHÂN VIÊN", SwingConstants.CENTER);
		Font font = new Font("Times New Roman", Font.BOLD, 40);
		title.setFont(font);
		title.setForeground(Color.BLACK);

		// Thêm tiêu đề vào pnn
		pnn.add(title, BorderLayout.NORTH); // Thêm vào phần NORTH

		// Tạo và thêm JSeparator vào pnn
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(800, 2)); // Chiều rộng và chiều cao của đường
		separator.setBackground(Color.BLACK); // Màu sắc
		separator.setOpaque(true); // Làm cho đường rõ ràng

		// Tạo một JPanel để chứa JSeparator
		JPanel separatorPanel = new JPanel();
		separatorPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0)); // Căn trái với khoảng cách
		separatorPanel.add(separator); // Thêm JSeparator vào JPanel này
		separatorPanel.setBackground(Color.WHITE); // Màu nền cho rõ ràng
		pnn.add(separatorPanel, BorderLayout.SOUTH);
		// Thêm pnn vào phần NORTH của JFrame
		add(pnn, BorderLayout.NORTH);

		// Tạo JPanel chính với GridLayout
		JPanel mainPanel = new JPanel(new GridLayout(1, 2)); // 1 hàng, 3 cột

		// Tạo các JPanel cho các phần
		JPanel leftPanel = new JPanel();
		ImageIcon oricon = new ImageIcon("src\\Images\\user.jpg"); // Đường dẫn tương đối

		// Thay đổi kích thước icon
//        Image icon = oricon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
//        ImageIcon iconchart = new ImageIcon(icon);

		// Tạo JLabel và gán ImageIcon
		JLabel iconLabel = new JLabel(oricon);
		iconLabel.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
		leftPanel.add(iconLabel);

		JPanel rightPanel = new JPanel();
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		rightPanel.setAlignmentX(Component.LEFT_ALIGNMENT); // Căn trái

		// Tạo font
		Font font1 = new Font("Times New Roman", Font.PLAIN, 20);

		// Tạo khoảng cách phía trên
		rightPanel.add(Box.createRigidArea(new Dimension(0, 50))); // Khoảng cách từ trên xuống

		// Tạo các JLabel và đặt thuộc tính
		JLabel manv = new JLabel("Mã Nhân Viên:");
		manv.setFont(font1);
		manv.setForeground(Color.BLACK);
		manv.setAlignmentX(Component.LEFT_ALIGNMENT); // Căn trái

		JLabel txtmanv = new JLabel();
		txtmanv.setFont(font1);
		txtmanv.setForeground(Color.BLACK);
		txtmanv.setAlignmentX(Component.LEFT_ALIGNMENT); // Căn trái

		JLabel tennv = new JLabel("Tên Nhân Viên:");
		tennv.setFont(font1);
		tennv.setForeground(Color.BLACK);
		tennv.setAlignmentX(Component.LEFT_ALIGNMENT); // Căn trái

		JLabel txtten = new JLabel();
		txtten.setFont(font1);
		txtten.setForeground(Color.BLACK);
		txtten.setAlignmentX(Component.LEFT_ALIGNMENT); // Căn trái

		JLabel namsinh = new JLabel("Năm Sinh:");
		namsinh.setFont(font1);
		namsinh.setForeground(Color.BLACK);
		namsinh.setAlignmentX(Component.LEFT_ALIGNMENT); // Căn trái

		JLabel txtnamsinh = new JLabel();
		txtnamsinh.setFont(font1);
		txtnamsinh.setForeground(Color.BLACK);
		txtnamsinh.setAlignmentX(Component.LEFT_ALIGNMENT); // Căn trái

		JLabel sdt = new JLabel("Số Điện Thoại:");
		sdt.setFont(font1);
		sdt.setForeground(Color.BLACK);
		sdt.setAlignmentX(Component.LEFT_ALIGNMENT); // Căn trái

		JLabel txtsdt = new JLabel();
		txtsdt.setFont(font1);
		txtsdt.setForeground(Color.BLACK);
		txtsdt.setAlignmentX(Component.LEFT_ALIGNMENT); // Căn trái

		// Thêm các JLabel vào JPanel
		rightPanel.add(manv);
		rightPanel.add(txtmanv);
		rightPanel.add(Box.createRigidArea(new Dimension(0, 25))); // Khoảng cách giữa các dòng
		rightPanel.add(tennv);
		rightPanel.add(txtten);
		rightPanel.add(Box.createRigidArea(new Dimension(0, 25))); // Khoảng cách giữa các dòng
		rightPanel.add(sdt);
		rightPanel.add(txtsdt);
		rightPanel.add(Box.createRigidArea(new Dimension(0, 25))); // Khoảng cách giữa các dòng

		rightPanel.add(namsinh);
		rightPanel.add(txtnamsinh);

		// Thêm các JPanel vào mainPanel
		mainPanel.add(leftPanel);

		mainPanel.add(rightPanel);

		// Thêm mainPanel vào JFrame
		add(mainPanel, BorderLayout.CENTER);

		JPanel pns = new JPanel();
		pns.setLayout(new BorderLayout()); // Đặt layout cho pnn

		// Chèn logo

		//ImageIcon oricon1 = new ImageIcon("src\\Images\\user.jpg"); // Đường dẫn tương đối

		// Thay đổi kích thước icon
//        Image logo = oricon1.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
//        ImageIcon logo1 = new ImageIcon(logo);

		// Tạo JLabel và gán ImageIcon
//		JLabel logo2 = new JLabel(logo1);
//		logo2.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 900));
//		pns.add(logo2);
		// Thêm tiêu đề vào pnn
		//pns.add(logo2, BorderLayout.SOUTH); // Thêm vào phần NORTH

		// Tạo và thêm JSeparator vào pnn
		JSeparator separator1 = new JSeparator();
		separator1.setPreferredSize(new Dimension(800, 2)); // Chiều rộng và chiều cao của đường
		separator1.setBackground(Color.BLACK); // Màu sắc
		separator1.setOpaque(true); // Làm cho đường rõ ràng

		// Tạo một JPanel để chứa JSeparator
		JPanel separatorPanel1 = new JPanel();
		separatorPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0)); // Căn trái với khoảng cách
		separatorPanel1.add(separator1); // Thêm JSeparator vào JPanel này
		separatorPanel1.setBackground(Color.WHITE); // Màu nền cho rõ ràng
		pns.add(separatorPanel1, BorderLayout.NORTH);
		// Thêm pnn vào phần NORTH của JFrame
		JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // Căn nút về phía bên phải
		JButton button = new JButton("Đổi Mật Khẩu"); // Tạo nút
		button.setPreferredSize(new Dimension(150, 40));
		southPanel.add(button); // Thêm nút vào panel
		pns.add(southPanel);
		add(pns, BorderLayout.SOUTH);

	}
}