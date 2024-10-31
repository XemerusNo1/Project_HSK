package GUI;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import javax.swing.border.TitledBorder;

public class GD_Ghe extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPhong;
	private JTextField txtGiaTien;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtTenPhim;
	private JTextField textGhe;
	private JTextField txtSuatChieu;
	private JTextField txtTongTien;

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
		setSize(1190, 800);
		contentPane = new JPanel();
		
		contentPane.setPreferredSize(new Dimension(1090, 800));
		contentPane.setLayout(new BorderLayout(0, 0));
		add(contentPane);
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Quay lại");
		btnNewButton.setIcon(new ImageIcon("src\\Images\\back.png"));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
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
		
		JButton btnA001 = new JButton("A01");
		
		JButton btnA02 = new JButton("A02");
		
		JButton btnA03 = new JButton("A03");
		
		JButton btnA04 = new JButton("A04");
		
		JButton btnA05 = new JButton("A05");
		
		JButton btnA06 = new JButton("A06");
		
		JButton btnA07 = new JButton("A07");
		
		JButton btnA08 = new JButton("A08");
		
		JButton btnA09 = new JButton("A09");
		
		JButton btnB01 = new JButton("B01");
		
		JButton btnB02 = new JButton("B02");
		
		JButton btnB03 = new JButton("B03");
		
		JButton btnB04 = new JButton("B04");
		
		JButton btn05 = new JButton("B05");
		
		JButton btnB06 = new JButton("B06");
		
		JButton btnB07 = new JButton("B07");
		
		JButton btnB08 = new JButton("B09");
		
		JButton btnB09 = new JButton("B09");
		
		JButton btnC01 = new JButton("C01");
		
		JButton btnC02 = new JButton("C02");
		
		JButton btnC03 = new JButton("C03");
		
		JButton btnC04 = new JButton("C04");
		
		JButton btnC05 = new JButton("C05");
		
		JButton btnC06 = new JButton("C06");
		
		JButton btnC07 = new JButton("C07");
		
		JButton btnC08 = new JButton("C08");
		
		JButton btnC09 = new JButton("C09");
		
		JButton btnD01 = new JButton("D01");
		
		JButton btnD02 = new JButton("D02");
		
		JButton btnD03 = new JButton("D03");
		
		JButton btnD04 = new JButton("D04");
		
		JButton btnD05 = new JButton("D05");
		
		JButton btnD06 = new JButton("D06");
		
		JButton btnD07 = new JButton("D07");
		
		JButton btnD08 = new JButton("D08");
		
		JButton btnD09 = new JButton("D09");
		
		JButton btnE001 = new JButton("E001");
		
		JButton btnE02 = new JButton("E02");
		
		JButton btnE03 = new JButton("E03");
		
		JButton btnE04 = new JButton("E04");
		
		JButton btnE05 = new JButton("E05");
		
		JButton btnE06 = new JButton("E06");
		
		JButton btnE07 = new JButton("E07");
		
		JButton btnE08 = new JButton("E08");
		
		JButton btnE09 = new JButton("E09");
		
		JButton btnF01_Doi = new JButton("F01_Đôi");
		
		JButton btnF02_Doi = new JButton("F02_Đôi");
		
		JButton btnF03_Doi = new JButton("F03_Đôi");
		
		JButton btnF04_Doi = new JButton("F04_Đôi");
		
		JButton btnF05_Doi = new JButton("F05_Đôi");
		
		JButton btnNewButton_2 = new JButton("Ghế trống");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnNewButton_2_1 = new JButton("Ghế đã đặt");
		btnNewButton_2_1.setBackground(Color.GRAY);
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));

		JButton btnNewButton_2_1_1 = new JButton("Ghế đang chọn");
		btnNewButton_2_1_1.setBackground(Color.RED);
		btnNewButton_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnNewButton_3 = new JButton("A01");
		
		JButton btnNewButton_1_4_1 = new JButton("A001_Đôi");
		
		JLabel lblNewLabel_2 = new JLabel("Ghế Đơn");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_2_1 = new JLabel("Ghế Đôi");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("src\\Images\\BongNgo1.jpg"));
		
		JLabel lblNewLabel_4 = new JLabel("Bắp caramel");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtGiaTien = new JTextField();
		txtGiaTien.setFont(new Font("Times New Roman", Font.BOLD, 19));
		txtGiaTien.setEditable(false);
		txtGiaTien.setColumns(10);
		
		JSpinner spinner1 = new JSpinner();
		spinner1.setBackground(new Color(255, 255, 255));
		spinner1.setForeground(new Color(0, 0, 0));
		spinner1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		spinner1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("src\\Images\\BongNgo2.jpg"));
		
		JLabel lblNewLabel_4_1 = new JLabel("Bắp Phô Mai");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 19));
		textField.setEditable(false);
		textField.setColumns(10);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setForeground(Color.BLACK);
		spinner2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		spinner2.setBackground(Color.WHITE);
		spinner2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon("src\\Images\\Snack.jpg"));
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Snack");
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.setForeground(Color.BLACK);
		spinner3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		spinner3.setBackground(Color.WHITE);
		spinner3.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon("src\\Images\\CoCa.jpg"));
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("CoCa CoLa");
		lblNewLabel_4_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		JSpinner spinner4 = new JSpinner();
		spinner4.setForeground(Color.BLACK);
		spinner4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		spinner4.setBackground(Color.WHITE);
		spinner4.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		JLabel lblNewLabel_5 = new JLabel("Mã Khuyến mãi: ");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		textField_3.setColumns(10);
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton)
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
												.addComponent(btnF01_Doi, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_pnlCenter.createSequentialGroup()
													.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(gl_pnlCenter.createSequentialGroup()
															.addGap(69)
															.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																.addComponent(btnA001, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnB01, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnC01, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnD01, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnE001, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))))
													.addGap(27)))
											.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_pnlCenter.createSequentialGroup()
													.addComponent(btnF02_Doi, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
													.addGap(84)
													.addComponent(btnF03_Doi, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_pnlCenter.createSequentialGroup()
														.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
															.addComponent(btnA02, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnB02, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnC02, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnD02, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnE02, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
														.addGap(31)
														.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
															.addComponent(btnA03, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnB03, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnC03, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnD03, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnE03, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
														.addGap(35)
														.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
															.addComponent(btnA04, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnB04, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnC04, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnD04, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnE04, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
														.addGap(29)
														.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
															.addComponent(btnA05, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btn05, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnC05, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnD05, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnE05, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
														.addGap(28)
														.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
															.addComponent(btnA06, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnB06, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnC06, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnD06, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnE06, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
													.addGroup(gl_pnlCenter.createSequentialGroup()
														.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
														.addGap(52)
														.addComponent(btnNewButton_2_1_1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
													.addGroup(gl_pnlCenter.createSequentialGroup()
														.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
															.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
															.addComponent(textField, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
														.addGap(49)
														.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
															.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
															.addGroup(gl_pnlCenter.createSequentialGroup()
																.addGap(10)
																.addComponent(spinner3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))))))
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
																		.addComponent(btnA07, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnB07, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnC07, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnD07, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnE07, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
																	.addGap(26)
																	.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																		.addComponent(btnA08, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnB08, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnC08, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnD08, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnE08, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
																.addComponent(btnF04_Doi, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
															.addGap(25)
															.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_pnlCenter.createSequentialGroup()
																	.addGap(17)
																	.addComponent(btnF05_Doi, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
																.addComponent(btnE09, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnD09, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnC09, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnB09, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnA09, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
														.addGroup(gl_pnlCenter.createSequentialGroup()
															.addGap(22)
															.addComponent(lblNewLabel_2)
															.addGap(18)
															.addComponent(btnNewButton_1_4_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
															.addGap(18)
															.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))))
												.addGroup(gl_pnlCenter.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(lblNewLabel_3_1_1_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_pnlCenter.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
														.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
													.addGap(55)
													.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_5)
														.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_pnlCenter.createSequentialGroup()
													.addGap(24)
													.addComponent(spinner4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
											.addGap(13)))
									.addGap(27))))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(85)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4)
								.addComponent(txtGiaTien, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(104)
							.addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(131)
							.addComponent(spinner2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(95)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 958, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(261, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnA001)
						.addComponent(btnA02)
						.addComponent(btnA03)
						.addComponent(btnA04)
						.addComponent(btnA05)
						.addComponent(btnA06)
						.addComponent(btnA07)
						.addComponent(btnA08)
						.addComponent(btnA09)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnB01)
						.addComponent(btnB02)
						.addComponent(btnB03)
						.addComponent(btnB04)
						.addComponent(btn05)
						.addComponent(btnB06)
						.addComponent(btnB07)
						.addComponent(btnB08)
						.addComponent(btnB09)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(btnC01)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnD01)
								.addComponent(btnD02)
								.addComponent(btnD03)
								.addComponent(btnD04)
								.addComponent(btnD05)
								.addComponent(btnD06)
								.addComponent(btnD07)
								.addComponent(btnD08)
								.addComponent(btnD09))
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnE001)
								.addComponent(btnE02)
								.addComponent(btnE03)
								.addComponent(btnE04)
								.addComponent(btnE05)
								.addComponent(btnE06)
								.addComponent(btnE07)
								.addComponent(btnE08)
								.addComponent(btnE09))
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnF01_Doi)
								.addComponent(btnF02_Doi)
								.addComponent(btnF03_Doi)
								.addComponent(btnF05_Doi)
								.addComponent(btnF04_Doi)))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnC02)
								.addComponent(btnC03)
								.addComponent(btnC04)
								.addComponent(btnC05)
								.addComponent(btnC06)
								.addComponent(btnC07)
								.addComponent(btnC08)
								.addComponent(btnC09))))
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
								.addComponent(btnNewButton_2_1_1)
								.addComponent(btnNewButton_2_1)
								.addComponent(btnNewButton_2))))
					.addGap(39)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtGiaTien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_5)))
								.addComponent(lblNewLabel_3_1_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(spinner3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(spinner4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		pnlCenter.setLayout(gl_pnlCenter);
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnlSouth.setBorder(new TitledBorder(null, "Vé Phim", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSouth.setPreferredSize(new Dimension(1100, 100));
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
		txtTenPhim = new JTextField();
		txtTenPhim.setEditable(false);
		txtTenPhim.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtTenPhim.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Phim:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblNewLabel_6_1 = new JLabel("Ghế:");
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		textGhe = new JTextField();
		textGhe.setEditable(false);
		textGhe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textGhe.setColumns(10);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Suất:");
		lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtSuatChieu = new JTextField();
		txtSuatChieu.setEditable(false);
		txtSuatChieu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtSuatChieu.setColumns(10);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("Tổng Cộng:");
		lblNewLabel_6_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtTongTien = new JTextField();
		txtTongTien.setEditable(false);
		txtTongTien.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtTongTien.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Đặt Vé");
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		GroupLayout gl_pnlSouth = new GroupLayout(pnlSouth);
		gl_pnlSouth.setHorizontalGroup(
			gl_pnlSouth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSouth.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtTenPhim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textGhe, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(lblNewLabel_6_1_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSuatChieu, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_6_1_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addGap(116)
					.addComponent(btnNewButton_4)
					.addContainerGap(339, Short.MAX_VALUE))
		);
		gl_pnlSouth.setVerticalGroup(
			gl_pnlSouth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSouth.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlSouth.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(txtTenPhim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(textGhe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSuatChieu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		pnlSouth.setLayout(gl_pnlSouth);
	}


}