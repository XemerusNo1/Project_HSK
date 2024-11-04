package gui;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.Arrays;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import javax.swing.border.TitledBorder;

import dao.DAO_Ghe;
import dulieutamthoi.ThongTinDatVe;

public class GD_Ghe extends JPanel implements ActionListener, MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPhong;
	private JTextField txtGiaTien1;
	private JTextField txtGiaTien2;
	private JTextField txtGiaTien3;
	private JTextField txtGiaTien4;
	private JTextField txtsumTienDoAn;
	private JButton btnQuoayLai;
	private DAO_Ghe daoGhe;

	private JButton A01, A02, A03, A04, A05, A06, A07, A08, A09;
	private JButton B01, B02, B03, B04, B05, B06, B07, B08, B09;
	private JButton C01, C02, C03, C04, C05, C06, C07, C08, C09;
	private JButton D01, D02, D03, D04, D05, D06, D07, D08, D09;
	private JButton E01, E02, E03, E04, E05, E06, E07, E08, E09;
	private JButton F01, F02, F03, F04, F05;
	private JButton[] buttons;
	private JButton btnNext;


//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GD_Ghe frame = new GD_Ghe();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public GD_Ghe() {
		
		setBounds(100, 100, 450, 300);
		setSize(1100, 700);
		contentPane = new JPanel();
		
		contentPane.setPreferredSize(new Dimension(1090, 800));
		contentPane.setLayout(new BorderLayout(0, 0));
		add(contentPane);
		JPanel pnlCenter = new JPanel(); 
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		btnQuoayLai = new JButton("Quay lại");
		btnQuoayLai.addActionListener(this);
		btnQuoayLai.setIcon(new ImageIcon("src\\Images\\back.png"));
		btnQuoayLai.setBackground(Color.LIGHT_GRAY);
		btnQuoayLai.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblNewLabel = new JLabel("Màn Hình");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("B");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_2 = new JLabel("C");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_3 =new JLabel("D");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_4 = new JLabel("E");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_5 = new JLabel("F");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		txtPhong = new JTextField();
		txtPhong.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPhong.setEditable(false);
		txtPhong.setColumns(10);
		
		JLabel lblNewLabel_1_6 = new JLabel("Phòng:");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		A01 = new JButton("A01");
		A01.addMouseListener(this);
		A02 = new JButton("A02");
		A02.addMouseListener(this);
		A03 = new JButton("A03");
		A03.addMouseListener(this);
		A04 = new JButton("A04");
		A04.addMouseListener(this);
		A05 = new JButton("A05");
		A05.addMouseListener(this);
		A06 = new JButton("A06");
		A06.addMouseListener(this);
		A07 = new JButton("A07");
		A07.addMouseListener(this);
		A08 = new JButton("A08");
		A08.addMouseListener(this);
		A09 = new JButton("A09");
		A09.addMouseListener(this);
		B01 = new JButton("B01");
		B01.addMouseListener(this);
		B02 = new JButton("B02");
		B02.addMouseListener(this);
		B03 = new JButton("B03");
		B03.addMouseListener(this);
		B04 = new JButton("B04");
		B04.addMouseListener(this);
		B05 = new JButton("B05");
		B05.addMouseListener(this);
		B06 = new JButton("B06");
		B06.addMouseListener(this);
		B07 = new JButton("B07");
		B07.addMouseListener(this);
		B08 = new JButton("B09");
		B08.addMouseListener(this);
		B09 = new JButton("B09");
		B09.addMouseListener(this);
		C01 = new JButton("C01");
		C01.addMouseListener(this);
		C02 = new JButton("C02");
		C02.addMouseListener(this);
		C03 = new JButton("C03");
		C03.addMouseListener(this);
		C04 = new JButton("C04");
		C04.addMouseListener(this);
		C05 = new JButton("C05");
		C05.addMouseListener(this);
		C06 = new JButton("C06");
		C06.addMouseListener(this);
		C07 = new JButton("C07");
		C07.addMouseListener(this);
		C08 = new JButton("C08");
		C08.addMouseListener(this);
		C09 = new JButton("C09");
		C09.addMouseListener(this);
		D01 = new JButton("D01");
		D01.addMouseListener(this);
		D02 = new JButton("D02");
		D02.addMouseListener(this);
		D03 = new JButton("D03");
		D03.addMouseListener(this);
		D04 = new JButton("D04");
		D04.addMouseListener(this);
		D05 = new JButton("D05");
		D05.addMouseListener(this);
		D06 = new JButton("D06");
		D06.addMouseListener(this);
		D07 = new JButton("D07");
		D07.addMouseListener(this);
		D08 = new JButton("D08");
		D08.addMouseListener(this);
		D09 = new JButton("D09");
		D09.addMouseListener(this);
		E01 = new JButton("E01");
		E01.addMouseListener(this);
		E02 = new JButton("E02");
		E02.addMouseListener(this);
		E03 = new JButton("E03");
		E03.addMouseListener(this);
		E04 = new JButton("E04");
		E04.addMouseListener(this);
		E05 = new JButton("E05");
		E05.addMouseListener(this);
		E06 = new JButton("E06");
		E06.addMouseListener(this);
		E07 = new JButton("E07");
		E07.addMouseListener(this);
		E08 = new JButton("E08");
		E08.addMouseListener(this);
		E09 = new JButton("E09");
		E09.addMouseListener(this);
		F01 = new JButton("F01_Đôi");
		F01.addMouseListener(this);
		F02 = new JButton("F02_Đôi");
		F02.addMouseListener(this);
		F03 = new JButton("F03_Đôi");
		F03.addMouseListener(this);
		F04 = new JButton("F04_Đôi");
		F04.addMouseListener(this);
		F05 = new JButton("F05_Đôi");
		F05.addMouseListener(this);
		
		JButton btnRong = new JButton("Ghế trống");
		btnRong.setBackground(new Color(212, 236, 239));
		btnRong.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnDaDat = new JButton("Ghế đã được đặt");
		btnDaDat.setBackground(Color.GRAY);
		btnDaDat.setFont(new Font("Times New Roman", Font.BOLD, 15));

		JButton btnDangChon = new JButton("Ghế đang chọn");
		btnDangChon.setBackground(Color.RED);
		btnDangChon.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnNewButton_3 = new JButton("A01");
		
		JButton btnNewButton_1_4_1 = new JButton("F01_Đôi");
		
		JLabel lblNewLabel_2 = new JLabel("Ghế Đơn");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_2_1 = new JLabel("Ghế Đôi");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("src\\Images\\BongNgo1.jpg"));
		
		JLabel lblNewLabel_4 = new JLabel("Bắp caramel : 25K");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtGiaTien1 = new JTextField();
		txtGiaTien1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtGiaTien1.setEditable(false);
		txtGiaTien1.setColumns(10);
		
		JSpinner spinner1 = new JSpinner();
		spinner1.setBackground(new Color(255, 255, 255));
		spinner1.setForeground(new Color(0, 0, 0));
		spinner1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		spinner1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("src\\Images\\BongNgo2.jpg"));
		
		JLabel lblNewLabel_4_1 = new JLabel("Bắp Phô Mai :25K");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtGiaTien2 = new JTextField();
		txtGiaTien2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtGiaTien2.setEditable(false);
		txtGiaTien2.setColumns(10);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setForeground(Color.BLACK);
		spinner2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		spinner2.setBackground(Color.WHITE);
		spinner2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon("src\\Images\\Snack.jpg"));
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Snack:10K");
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtGiaTien3 = new JTextField();
		txtGiaTien3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtGiaTien3.setEditable(false);
		txtGiaTien3.setColumns(10);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.setForeground(Color.BLACK);
		spinner3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		spinner3.setBackground(Color.WHITE);
		spinner3.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon("src\\Images\\CoCa.jpg"));
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("CoCa CoLa:10K");
		lblNewLabel_4_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtGiaTien4 = new JTextField();
		txtGiaTien4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtGiaTien4.setEditable(false);
		txtGiaTien4.setColumns(10);
		
		JSpinner spinner4 = new JSpinner();
		spinner4.setForeground(Color.BLACK);
		spinner4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		spinner4.setBackground(Color.WHITE);
		spinner4.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		JLabel lblNewLabel_5 = new JLabel("Tiền đồ ăn");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtsumTienDoAn = new JTextField();
		txtsumTienDoAn.setEditable(false);
		txtsumTienDoAn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtsumTienDoAn.setColumns(10);
		
		btnNext = new JButton("Next");
		btnNext.addActionListener(this);
		btnNext.setBackground(Color.GREEN);
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnQuoayLai)
							.addGap(383)
							.addComponent(lblNewLabel))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(40)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1_5, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
									.addGap(54)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addComponent(lblNewLabel_1_6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_pnlCenter.createSequentialGroup()
													.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
														.addComponent(F01, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_pnlCenter.createSequentialGroup()
															.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING, false)
																.addComponent(btnRong, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addGroup(gl_pnlCenter.createSequentialGroup()
																	.addGap(69)
																	.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																		.addComponent(A01, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(B01, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(C01, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(D01, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(E01, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))))
															.addGap(27)))
													.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
														.addGroup(gl_pnlCenter.createSequentialGroup()
															.addComponent(F02, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
															.addGap(84)
															.addComponent(F03, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
															.addGroup(gl_pnlCenter.createSequentialGroup()
																.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																	.addComponent(A02, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(B02, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(C02, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(D02, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(E02, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
																.addGap(31)
																.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																	.addComponent(A03, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(B03, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(C03, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(D03, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(E03, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
																.addGap(35)
																.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																	.addComponent(A04, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(B04, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(C04, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(D04, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(E04, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
																.addGap(29)
																.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																	.addComponent(A05, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(B05, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(C05, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(D05, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(E05, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
																.addGap(28)
																.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																	.addComponent(A06, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(B06, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(C06, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(D06, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																	.addComponent(E06, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
															.addGroup(gl_pnlCenter.createSequentialGroup()
																.addComponent(btnDaDat)
																.addGap(31)
																.addComponent(btnDangChon, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
															.addGroup(gl_pnlCenter.createSequentialGroup()
																.addGap(46)
																.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																	.addGroup(gl_pnlCenter.createSequentialGroup()
																		.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																			.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
																			.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
																		.addPreferredGap(ComponentPlacement.RELATED, 18, GroupLayout.PREFERRED_SIZE))
																	.addGroup(gl_pnlCenter.createSequentialGroup()
																		.addComponent(txtGiaTien2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)))
																.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																	.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
																	.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
																	.addComponent(txtGiaTien3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
																.addGap(44)))))
												.addGroup(gl_pnlCenter.createSequentialGroup()
													.addComponent(spinner2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
													.addGap(157)
													.addComponent(spinner3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
													.addGap(100)))
											.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnlCenter.createSequentialGroup()
													.addGap(16)
													.addComponent(btnNewButton_3)
													.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_pnlCenter.createSequentialGroup()
															.addPreferredGap(ComponentPlacement.RELATED)
															.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_pnlCenter.createSequentialGroup()
																	.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																		.addComponent(A07, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(B07, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(C07, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(D07, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(E07, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
																	.addGap(26)
																	.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																		.addComponent(A08, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(B08, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(C08, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(D08, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(E08, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
																.addComponent(F04, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
															.addGap(25)
															.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																.addComponent(E09, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(D09, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(C09, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(B09, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(A09, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
														.addGroup(gl_pnlCenter.createSequentialGroup()
															.addGap(22)
															.addComponent(lblNewLabel_2)
															.addGap(18)
															.addComponent(btnNewButton_1_4_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
															.addGap(18)
															.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))))
												.addGroup(gl_pnlCenter.createSequentialGroup()
													.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_pnlCenter.createSequentialGroup()
															.addGap(24)
															.addComponent(spinner4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_pnlCenter.createSequentialGroup()
															.addPreferredGap(ComponentPlacement.RELATED)
															.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																.addComponent(txtGiaTien4, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
																.addComponent(lblNewLabel_3_1_1_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
																.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_pnlCenter.createSequentialGroup()
															.addGap(41)
															.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
																.addComponent(txtsumTienDoAn, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
														.addGroup(Alignment.TRAILING, gl_pnlCenter.createSequentialGroup()
															.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
															.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
																.addComponent(btnNext)
																.addComponent(F05, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
															.addGap(9))))))))))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(85)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtGiaTien1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(104)
							.addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(95)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 958, GroupLayout.PREFERRED_SIZE)))
					.addGap(27))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel)
						.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
							.addComponent(btnNext)
							.addComponent(btnQuoayLai)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(A01)
						.addComponent(A02)
						.addComponent(A03)
						.addComponent(A04)
						.addComponent(A05)
						.addComponent(A06)
						.addComponent(A07)
						.addComponent(A08)
						.addComponent(A09)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(B01)
						.addComponent(B02)
						.addComponent(B03)
						.addComponent(B04)
						.addComponent(B05)
						.addComponent(B06)
						.addComponent(B07)
						.addComponent(B08)
						.addComponent(B09)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(C01)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(D01)
								.addComponent(D02)
								.addComponent(D03)
								.addComponent(D04)
								.addComponent(D05)
								.addComponent(D06)
								.addComponent(D07)
								.addComponent(D08)
								.addComponent(D09))
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(E01)
								.addComponent(E02)
								.addComponent(E03)
								.addComponent(E04)
								.addComponent(E05)
								.addComponent(E06)
								.addComponent(E07)
								.addComponent(E08)
								.addComponent(E09))
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(F01)
								.addComponent(F02)
								.addComponent(F03)
								.addComponent(F04)
								.addComponent(F05)))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(C02)
								.addComponent(C03)
								.addComponent(C04)
								.addComponent(C05)
								.addComponent(C06)
								.addComponent(C07)
								.addComponent(C08)
								.addComponent(C09))))
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(29)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_3)
								.addComponent(lblNewLabel_2)
								.addComponent(btnNewButton_1_4_1)
								.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDaDat)
								.addComponent(btnDangChon)
								.addComponent(btnRong))))
					.addGap(39)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtGiaTien1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtGiaTien2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(spinner2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_5)))
								.addComponent(lblNewLabel_3_1_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(txtsumTienDoAn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(txtGiaTien3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(spinner3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(txtGiaTien4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(16)
									.addComponent(spinner4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(148, Short.MAX_VALUE))
		);
		pnlCenter.setLayout(gl_pnlCenter);
		// Gọi phương thức để đặt màu nền
		setButtonBackground(new Color(212, 236, 239));
		buttons = new JButton[]{
		        A01, A02, A03, A04, A05, A06, A07, A08, A09,
		        B01, B02, B03, B04, B05, B06, B07, B08, B09,
		        C01, C02, C03, C04, C05, C06, C07, C08, C09,
		        D01, D02, D03, D04, D05, D06, D07, D08, D09,
		        E01, E02, E03, E04, E05, E06, E07, E08, E09,
		        F01, F02, F03, F04, F05
		    };
	
		
		// Thiết lập ChangeListener cho các spinner để cập nhật giá tiền sản phẩm và tổng tiền đồ ăn
		spinner1.addChangeListener(e -> tinhTienSanPham("SP01", txtGiaTien1, spinner1));
		spinner2.addChangeListener(e -> tinhTienSanPham("SP02", txtGiaTien2, spinner2));
		spinner3.addChangeListener(e -> tinhTienSanPham("SP03", txtGiaTien3, spinner3));
		spinner4.addChangeListener(e -> tinhTienSanPham("SP04", txtGiaTien4, spinner4));

		// Tính tổng tiền đồ ăn ngay khi mở giao diện
		tinhTongTienDoAn();

		    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 Object o = e.getSource();
		    if (o.equals(btnQuoayLai)) {
		        contentPane.removeAll();
		        contentPane.add(new GD_ThongTinPhim(), BorderLayout.CENTER);
		        contentPane.revalidate();
		        contentPane.repaint();
		    }
		    if (o.equals(btnNext)) {
		        // Xóa tất cả nội dung hiện tại trong contentPane
		        contentPane.removeAll();
		        saveSelection();
		        System.out.println("Tổng tiền đồ ăn đã chọn ở trang ghế: " + ThongTinDatVe.getTongTienDoAn());
		        
		        // Thêm giao diện mới vào contentPane
		        contentPane.add(new GD_DatVe(), BorderLayout.CENTER);
		        contentPane.revalidate();
		        contentPane.repaint();
		        
		        // Lưu giá trị tổng tiền vào bộ nhớ tạm trong ThongTinDatVe
		        
		    }

	}
	  public void saveSelection() {
	        // Lưu thông tin ngày và giờ đã chọn vào SessionData
		  String tongTien = txtsumTienDoAn.getText();
	      ThongTinDatVe.setTongTienDoAn(tongTien);
	    }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mousePressed(MouseEvent e) {
	    // TODO Auto-generated method stub
	    Object o = e.getSource();
	    
	    // Xử lý các nút button đổi màu khi chọn ghế
	    for (JButton btn : buttons) {
            if (o.equals(btn)) {
                toggleButtonColor(btn);
                
            }
        }
	}

	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//Phương thức đổi màu nền của button
	private void toggleButtonColor(JButton button) {
	 Color originalColor = new Color(212, 236, 239); 
	 Color selectedColor = Color.RED; 
	
	 // Kiểm tra màu hiện tại của button và đổi màu
	 if (button.getBackground().equals(originalColor)) {
	     button.setBackground(selectedColor);
	 } else {
	     button.setBackground(originalColor);
	 	}
	}
	private void setButtonBackground(Color color) {
	    JButton[] buttons = {
	        A01, A02, A03, A04, A05, A06, A07, A08, A09,
	        B01, B02, B03, B04, B05, B06, B07, B08, B09,
	        C01, C02, C03, C04, C05, C06, C07, C08, C09,
	        D01, D02, D03, D04, D05, D06, D07, D08, D09,
	        E01, E02, E03, E04, E05, E06, E07, E08, E09,
	        F01, F02, F03, F04, F05
	    };
	    
	    for (JButton button : buttons) {
	        button.setBackground(color);
	    }
	}
	// Phương thức để thiết lập giá tiền cho một JTextField cụ thể
	private void setGiaTienChoTextField(String maSP, JTextField textField) {
	    // Kiểm tra nếu daoGhe đã được khởi tạo
	    if (daoGhe == null) {
	        daoGhe = new DAO_Ghe();
	    }
	    
	    // Lấy giá sản phẩm từ daoGhe
	    String giaSanPham = daoGhe.getGiaSanPhamTheoMaSP(maSP);
	    
	    // Kiểm tra và cập nhật giá trị cho textField
	    if (giaSanPham != null) {
	        textField.setText(giaSanPham + " VNĐ");
	    } else {
	        textField.setText("Giá không có sẵn");
	    }
	}

	// Phương thức để tính tiền cho từng sản phẩm và cập nhật vào JTextField tương ứng
	private void tinhTienSanPham(String maSP, JTextField txtGiaTien, JSpinner spinner) {
	    if (daoGhe == null) {
	        daoGhe = new DAO_Ghe();
	    }

	    // Lấy giá sản phẩm từ database
	    String giaSanPhamStr = daoGhe.getGiaSanPhamTheoMaSP(maSP);

	    // Kiểm tra nếu giá sản phẩm hợp lệ
	    if (giaSanPhamStr != null) {
	        BigDecimal giaSanPham = new BigDecimal(giaSanPhamStr);
	        int soLuong = (Integer) spinner.getValue();
	        BigDecimal tongGia = giaSanPham.multiply(new BigDecimal(soLuong));
	        
	        // Cập nhật tổng giá của sản phẩm vào JTextField tương ứng
	        txtGiaTien.setText(tongGia + " VNĐ");
	    } else {
	        txtGiaTien.setText("Giá không có sẵn");
	    }
	    tinhTongTienDoAn();
	}

	// Phương thức để tính tổng tiền của tất cả sản phẩm và cập nhật vào txtsumTienDoAn
	private void tinhTongTienDoAn() {
	    BigDecimal tongTienDoAn = BigDecimal.ZERO;

	    // Lấy giá từ txtGiaTien của từng sản phẩm và cộng vào tổng tiền
	    for (JTextField txtGiaTien : Arrays.asList(txtGiaTien1, txtGiaTien2, txtGiaTien3, txtGiaTien4)) {
	        try {
	            String giaStr = txtGiaTien.getText().replace(" VNĐ", "");
	            if (!giaStr.isEmpty()) {
	                BigDecimal gia = new BigDecimal(giaStr);
	                tongTienDoAn = tongTienDoAn.add(gia);
	            }
	        } catch (NumberFormatException e) {
	            e.printStackTrace();
	        }
	    }

	    // Hiển thị tổng tiền đồ ăn vào txtsumTienDoAn
	    String tongTienStr = tongTienDoAn + " VNĐ";
	    txtsumTienDoAn.setText(tongTienStr);

	  
	}

}