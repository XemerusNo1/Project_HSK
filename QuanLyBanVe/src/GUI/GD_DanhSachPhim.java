package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class GD_DanhSachPhim extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTimPHim;
	private JButton btnDatVe1;
	private JButton btnDatVe2;
	private JButton btnDatVe3;
	private JButton btnDatVe4;
	private JButton btnDatVe5;
	private JButton btnDatVe6;
	private JButton btnDatVe7;
	private JButton btnDatVe8;


	public GD_DanhSachPhim() {
		
		setLayout(new BorderLayout(0, 0));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setSize(1100, 700);

	
		contentPane.setLayout(new BorderLayout(0, 0));
		add(contentPane);
		JPanel pnlNorth = new JPanel();
		pnlNorth.setBackground(new Color(240, 240, 240));
		pnlNorth.setPreferredSize(new Dimension(1000, 50));
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		pnlNorth.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
//		JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
		
		JLabel lblDS = new JLabel("Danh sách phim");
		lblDS.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDS.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\img\\list.png"));
		lblDS.setForeground(Color.BLACK);
		
		JLabel lblNewLabel = new JLabel("Tìm kiếm phim:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.BLACK);
		
		textTimPHim = new JTextField();
		textTimPHim.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textTimPHim.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		GroupLayout gl_pnlNorth = new GroupLayout(pnlNorth);
		gl_pnlNorth.setHorizontalGroup(
			gl_pnlNorth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlNorth.createSequentialGroup()
					.addGap(26)
					.addComponent(lblDS)
					.addPreferredGap(ComponentPlacement.RELATED, 476, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(32)
					.addComponent(textTimPHim, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton)
					.addGap(143))
		);
		gl_pnlNorth.setVerticalGroup(
			gl_pnlNorth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlNorth.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlNorth.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDS)
						.addComponent(textTimPHim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(btnNewButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlNorth.setLayout(gl_pnlNorth);
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(new Color(240, 240, 240));
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JPanel pnlPhim1 = new JPanel();
		pnlPhim1.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim1.setBackground(new Color(64, 64, 64));
		
		JPanel pnlPhim6 = new JPanel();
		pnlPhim6.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim6.setBackground(Color.DARK_GRAY);
		
		btnDatVe3 = new JButton("Mua Vé");
		btnDatVe3.setBackground(new Color(255, 69, 0));
		
		JLabel lblNewLabel_5_1 = new JLabel("Thời Lượng: 113 Phút");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_1 = new JLabel("Thể loại: Hoạt Hình");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_1 = new JLabel("TransFormer một");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\img\\List_TransFormers.jpg"));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		GroupLayout gl_pnlPhim6 = new GroupLayout(pnlPhim6);
		gl_pnlPhim6.setHorizontalGroup(
			gl_pnlPhim6.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim6.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_1)
					.addContainerGap(84, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlPhim6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlPhim6.createSequentialGroup()
							.addGap(10)
							.addComponent(btnDatVe3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_1))
					.addContainerGap(55, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_pnlPhim6.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_1)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_pnlPhim6.setVerticalGroup(
			gl_pnlPhim6.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim6.createSequentialGroup()
					.addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(lblNewLabel_3_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe3)
					.addGap(21))
		);
		pnlPhim6.setLayout(gl_pnlPhim6);
		
		JPanel pnlPhim7 = new JPanel();
		pnlPhim7.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim7.setBackground(Color.DARK_GRAY);
		
		btnDatVe4 = new JButton("Mua Vé");
		btnDatVe4.setBackground(new Color(255, 69, 0));
		
		JLabel lblNewLabel_5_2 = new JLabel("Thời Lượng: 134 phút");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_2 = new JLabel("Thể loại: Hoạt Hình");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_2 = new JLabel("Bạch Xà 3");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\img\\BachXa3.jpg"));
		lblNewLabel_2_2.setForeground(Color.WHITE);
		GroupLayout gl_pnlPhim7 = new GroupLayout(pnlPhim7);
		gl_pnlPhim7.setHorizontalGroup(
			gl_pnlPhim7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim7.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_2)
					.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim7.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_2)
					.addContainerGap(55, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim7.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlPhim7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlPhim7.createSequentialGroup()
							.addGap(10)
							.addComponent(btnDatVe4, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_2))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_pnlPhim7.setVerticalGroup(
			gl_pnlPhim7.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim7.createSequentialGroup()
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe4)
					.addGap(17))
		);
		pnlPhim7.setLayout(gl_pnlPhim7);
		
		JPanel pnlPhim2 = new JPanel();
		pnlPhim2.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim2.setBackground(Color.DARK_GRAY);
		
		btnDatVe5 = new JButton("Mua Vé");
		btnDatVe5.setBackground(new Color(255, 69, 0));
		
		JLabel lblNewLabel_5_4 = new JLabel("Thời Lượng: 143 phút");
		lblNewLabel_5_4.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_4 = new JLabel("Thể loại: Kinh Di");
		lblNewLabel_4_4.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_4 = new JLabel("Quỷ Ăn Tạng");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\img\\QuyAnTang2.jpg"));
		lblNewLabel_2_4.setForeground(Color.WHITE);
		GroupLayout gl_pnlPhim2 = new GroupLayout(pnlPhim2);
		gl_pnlPhim2.setHorizontalGroup(
			gl_pnlPhim2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_4)
					.addContainerGap(89, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_4)
					.addContainerGap(44, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlPhim2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlPhim2.createSequentialGroup()
							.addGap(10)
							.addComponent(btnDatVe5, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_4))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_pnlPhim2.setVerticalGroup(
			gl_pnlPhim2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim2.createSequentialGroup()
					.addComponent(lblNewLabel_2_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_4)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe5)
					.addGap(19))
		);
		pnlPhim2.setLayout(gl_pnlPhim2);
		
		JPanel pnlPhim5 = new JPanel();
		pnlPhim5.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim5.setBackground(Color.DARK_GRAY);
		
		btnDatVe7 = new JButton("Mua Vé");
		btnDatVe7.setBackground(new Color(255, 69, 0));
		
		JLabel lblNewLabel_5_5 = new JLabel("Thời Lượng: 111 phút");
		lblNewLabel_5_5.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_5 = new JLabel("Thể loại: Kinh Dị");
		lblNewLabel_4_5.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_5 = new JLabel("Cám");
		lblNewLabel_3_5.setForeground(Color.WHITE);
		lblNewLabel_3_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_5 = new JLabel("");
		lblNewLabel_2_5.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\img\\Cam.jpg"));
		lblNewLabel_2_5.setForeground(Color.WHITE);
		GroupLayout gl_pnlPhim5 = new GroupLayout(pnlPhim5);
		gl_pnlPhim5.setHorizontalGroup(
			gl_pnlPhim5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_5)
					.addContainerGap(99, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_5)
					.addContainerGap(142, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlPhim5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlPhim5.createSequentialGroup()
							.addGap(10)
							.addComponent(btnDatVe7, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_5))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		gl_pnlPhim5.setVerticalGroup(
			gl_pnlPhim5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim5.createSequentialGroup()
					.addComponent(lblNewLabel_2_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_5)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe7)
					.addGap(20))
		);
		pnlPhim5.setLayout(gl_pnlPhim5);
		
		JPanel pnlPhim8 = new JPanel();
		pnlPhim8.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim8.setBackground(Color.DARK_GRAY);
		
		btnDatVe8 = new JButton("Mua Vé");
		btnDatVe8.setBackground(new Color(255, 69, 0));
		
		JLabel lblNewLabel_5_6 = new JLabel("Thời Lượng: 112 phút");
		lblNewLabel_5_6.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_6 = new JLabel("Thể loại: Hành Động");
		lblNewLabel_4_6.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_6 = new JLabel("Quán Vật VENOM");
		lblNewLabel_3_6.setForeground(Color.WHITE);
		lblNewLabel_3_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_6 = new JLabel("");
		lblNewLabel_2_6.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\img\\Venom.jpg"));
		lblNewLabel_2_6.setForeground(Color.WHITE);
		GroupLayout gl_pnlPhim8 = new GroupLayout(pnlPhim8);
		gl_pnlPhim8.setHorizontalGroup(
			gl_pnlPhim8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim8.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_6)
					.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim8.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_6)
					.addContainerGap(55, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlPhim8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlPhim8.createSequentialGroup()
							.addGap(10)
							.addComponent(btnDatVe8, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_6))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_pnlPhim8.setVerticalGroup(
			gl_pnlPhim8.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim8.createSequentialGroup()
					.addComponent(lblNewLabel_2_6, GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_6)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe8)
					.addGap(17))
		);
		pnlPhim8.setLayout(gl_pnlPhim8);
		
		JPanel pnlPhim4 = new JPanel();
		pnlPhim4.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim4.setBackground(Color.DARK_GRAY);
		
		JLabel lblNewLabel_5_3 = new JLabel("Thời Lượng:121 phút");
		lblNewLabel_5_3.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_3 = new JLabel("Thể loại: Kinh Dị");
		lblNewLabel_4_3.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_3 = new JLabel("KUMMATHONG");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\img\\LIST_KUMATHONG.jpg"));
		lblNewLabel_2_3.setForeground(Color.WHITE);
		
		btnDatVe2 = new JButton("Mua Vé");
		btnDatVe2.setBackground(new Color(255, 69, 0));
		GroupLayout gl_pnlPhim4 = new GroupLayout(pnlPhim4);
		gl_pnlPhim4.setHorizontalGroup(
			gl_pnlPhim4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim4.createSequentialGroup()
					.addGroup(gl_pnlPhim4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
						.addGroup(gl_pnlPhim4.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3_3))
						.addGroup(gl_pnlPhim4.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_4_3))
						.addGroup(gl_pnlPhim4.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_pnlPhim4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlPhim4.createSequentialGroup()
									.addGap(10)
									.addComponent(btnDatVe2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_5_3))))
					.addContainerGap())
		);
		gl_pnlPhim4.setVerticalGroup(
			gl_pnlPhim4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim4.createSequentialGroup()
					.addComponent(lblNewLabel_2_3, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe2)
					.addGap(18))
		);
		pnlPhim4.setLayout(gl_pnlPhim4);
		
		JPanel pnlPhim3 = new JPanel();
		pnlPhim3.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim3.setBackground(Color.DARK_GRAY);
		
		JLabel lblNewLabel_5_7 = new JLabel("Thời Lượng: 123 phút");
		lblNewLabel_5_7.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_7 = new JLabel("Thể loại: Tâm Lý");
		lblNewLabel_4_7.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_7 = new JLabel("JOKER");
		lblNewLabel_3_7.setForeground(Color.WHITE);
		lblNewLabel_3_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_7 = new JLabel("");
		lblNewLabel_2_7.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\img\\Joker.jpg"));
		lblNewLabel_2_7.setForeground(Color.WHITE);
		
		btnDatVe6 = new JButton("Mua Vé");
		btnDatVe6.setBackground(new Color(255, 69, 0));
		GroupLayout gl_pnlPhim3 = new GroupLayout(pnlPhim3);
		gl_pnlPhim3.setHorizontalGroup(
			gl_pnlPhim3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_7)
					.addContainerGap(87, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_7)
					.addContainerGap(110, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_7, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlPhim3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlPhim3.createSequentialGroup()
							.addGap(10)
							.addComponent(btnDatVe6, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_7))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_pnlPhim3.setVerticalGroup(
			gl_pnlPhim3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim3.createSequentialGroup()
					.addComponent(lblNewLabel_2_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_7)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe6)
					.addGap(19))
		);
		pnlPhim3.setLayout(gl_pnlPhim3);
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlPhim1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim2, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
					.addGap(116)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlPhim3, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim4, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(90)
							.addComponent(pnlPhim5, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_pnlCenter.createSequentialGroup()
							.addGap(90)
							.addComponent(pnlPhim6, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)))
					.addGap(109)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlPhim7, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim8, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(228, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlPhim1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim7, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim4, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim6, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
					.addGap(54)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlPhim2, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim8, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim3, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim5, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(134, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\img\\list_MoDomDom.jpg"));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3 = new JLabel("Mộ Đom Đóm");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblNewLabel_4 = new JLabel("Thể loại: Hoạt Hình");
		lblNewLabel_4.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_5 = new JLabel("Thời Lượng: 89 phút");
		lblNewLabel_5.setForeground(Color.WHITE);
		
		btnDatVe1 = new JButton("Mua Vé");
		btnDatVe1.setBackground(new Color(255, 69, 0));
		GroupLayout gl_pnlPhim1 = new GroupLayout(pnlPhim1);
		gl_pnlPhim1.setHorizontalGroup(
			gl_pnlPhim1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4)
					.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3)
					.addContainerGap(55, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlPhim1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlPhim1.createSequentialGroup()
							.addGap(10)
							.addComponent(btnDatVe1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_pnlPhim1.setVerticalGroup(
			gl_pnlPhim1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim1.createSequentialGroup()
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe1)
					.addGap(21))
		);
		pnlPhim1.setLayout(gl_pnlPhim1);
		pnlCenter.setLayout(gl_pnlCenter);
		
		btnDatVe1.addActionListener(this);
		btnDatVe2.addActionListener(this);
		btnDatVe3.addActionListener(this);
		btnDatVe4.addActionListener(this);
		btnDatVe5.addActionListener(this);
		btnDatVe6.addActionListener(this);
		btnDatVe7.addActionListener(this);
		btnDatVe8.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	    Object o = e.getSource();
	    if (o.equals(btnDatVe1)) {
	        contentPane.removeAll();
	        contentPane.add(new GD_ThongTinPhim(), BorderLayout.CENTER);
	        contentPane.revalidate();
	        contentPane.repaint();
	    }
	}
//	public static void main(String[] args) {
//        GD_DanhSachPhim frame = new GD_DanhSachPhim();
//        frame.setVisible(true);
//    }
	
}