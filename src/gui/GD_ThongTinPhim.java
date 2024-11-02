package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import dao.Dao_ThongTinPhim;
import dulieutamthoi.ThongTinDatVe;

import javax.swing.JTextArea;

public class GD_ThongTinPhim extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTheLoai;
	private JTextField txtDaoDien;
	private JTextField txtThoiLuong;
	private JButton btnThu2;
	private JButton btnThu4;
	private JButton btnThu6;
	private JButton btnthu7;
	private JButton btnchunhat;
	private JButton btngioChieu1;
	private JButton btngiocchieu2;
	private JButton btngioChieu3;
	private JButton btnGioChieu4;
	private JButton btnGioChieu5;
	private JButton btnNext;
	private JTextField txtTenPhim;
	private JLabel lblimage;
	private JTextArea txtMoTa;
	private String selectedDate = "";
	private String selectedTime = "";
    // Danh sách các nút ngày và giờ
    private JButton[] dayButtons;
    private JButton[] timeButtons;
    Dao_ThongTinPhim ds = new Dao_ThongTinPhim();
    ThongTinDatVe ve = new ThongTinDatVe();
   /**
	 * Create the frame.
	 */
	public GD_ThongTinPhim() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
	
		setSize(1100, 700);
		setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(new Color(240, 240, 240));
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Thông tin Phim");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setIcon(new ImageIcon("src\\Images\\list.png"));
		
		JLabel lblNewLabel_2 = new JLabel("Tên Phim:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setForeground(Color.BLACK);
		
		JLabel lblTheLoai = new JLabel("Thể loại: ");
		lblTheLoai.setForeground(Color.BLACK);
		lblTheLoai.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtTheLoai = new JTextField();
		txtTheLoai.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtTheLoai.setEditable(false);
		txtTheLoai.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Đạo Diễn:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblNewLabel_4_1 = new JLabel("Thời lượng: ");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtDaoDien = new JTextField();
		txtDaoDien.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtDaoDien.setEditable(false);
		txtDaoDien.setColumns(10);
		
		txtThoiLuong = new JTextField();
		txtThoiLuong.setEditable(false);
		txtThoiLuong.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtThoiLuong.setColumns(10);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Mô Tả: ");
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Lịch Chiếu: ");
		lblNewLabel_4_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		btnThu2 = new JButton("28/10 Thứ Hai");
		btnThu2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		btnThu4 = new JButton("30/10 Thứ Tư");
		btnThu4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		btnThu6 = new JButton("32/10 Thứ 6");
		btnThu6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		btnthu7 = new JButton("33/10 Thứ 7");
		btnthu7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		btnchunhat = new JButton("34/10 Chủ nhật");
		btnchunhat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Giờ Chiếu: ");
		lblNewLabel_4_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		btngioChieu1 = new JButton("10:30");
		btngioChieu1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		btngiocchieu2 = new JButton("14:30");
		btngiocchieu2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		btngioChieu3 = new JButton("17:30");
		btngioChieu3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		btnGioChieu4 = new JButton("19:30");
		btnGioChieu4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		btnGioChieu5 = new JButton("22:30");
		btnGioChieu5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		btnNext = new JButton("Next");
		btnNext.setIcon(new ImageIcon("src\\Images\\arrow-circle-right.png"));
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtTenPhim = new JTextField();
		txtTenPhim.setEditable(false);
		txtTenPhim.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txtTenPhim.setColumns(10);
		
		JPanel pnlAnhPhim = new JPanel();
		pnlAnhPhim.setPreferredSize(new Dimension(240, 360));
		
		txtMoTa = new JTextArea();
		txtMoTa.setForeground(Color.BLACK);
		txtMoTa.setBackground(new Color(240, 240, 240)); // Đặt màu nền

		txtMoTa.setEditable(false);
		txtMoTa.setEnabled(false);
		txtMoTa.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtMoTa.setLineWrap(true); // Bật tính năng xuống dòng
		txtMoTa.setWrapStyleWord(true);
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(37)
									.addComponent(pnlAnhPhim, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
									.addGap(31)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_4_1)
												.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
											.addGap(56)
											.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
												.addComponent(txtMoTa, GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
												.addComponent(txtThoiLuong, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_4)
												.addComponent(lblTheLoai)
												.addComponent(lblNewLabel_2))
											.addGap(60)
											.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(txtDaoDien, Alignment.LEADING)
													.addComponent(txtTheLoai, Alignment.LEADING))
												.addComponent(txtTenPhim, GroupLayout.PREFERRED_SIZE, 445, GroupLayout.PREFERRED_SIZE))))
									.addGap(107))
								.addComponent(lblNewLabel)))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4_1_1_1_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addComponent(btngioChieu1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
											.addGap(27)
											.addComponent(btngiocchieu2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
											.addGap(28)
											.addComponent(btngioChieu3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnGioChieu4, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addComponent(btnThu2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
											.addGap(30)
											.addComponent(btnThu4, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
											.addGap(48)
											.addComponent(btnThu6, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
									.addGap(30)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
										.addComponent(btnthu7, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addGap(17)
											.addComponent(btnGioChieu5, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addGap(39)
											.addComponent(btnchunhat, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addGap(121)
											.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))))
								.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))))
					.addGap(83))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(txtTenPhim, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTheLoai)
								.addComponent(txtTheLoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4)
								.addComponent(txtDaoDien, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtThoiLuong, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(26)
									.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(18)
									.addComponent(txtMoTa, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
							.addGap(32))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(22)
							.addComponent(pnlAnhPhim, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(btnThu2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThu4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThu6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnthu7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnchunhat, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(lblNewLabel_4_1_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(btngioChieu1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btngiocchieu2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btngioChieu3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnGioChieu4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnGioChieu5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addGap(71))
		);
		
		lblimage = new JLabel("");
		String linkimg = ds.getLinkAnhByMaPhim(ve.getMaPhim());
		lblimage.setIcon(new ImageIcon(linkimg));

		pnlAnhPhim.add(lblimage);
		pnlCenter.setLayout(gl_pnlCenter);
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.setBackground(new Color(64, 64, 64));
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		btnThu2.addActionListener(this);
		
		
		btnNext.addActionListener(this); 
		btnThu2.addActionListener(this);
		btnThu4.addActionListener(this);
		btnThu6.addActionListener(this);
		btnthu7.addActionListener(this);
		btnchunhat.addActionListener(this);
		
		btngioChieu1.addActionListener(this);
		btngiocchieu2.addActionListener(this);
		btngioChieu3.addActionListener(this);
		btnGioChieu4.addActionListener(this);
		btnGioChieu5.addActionListener(this);
		 // Thêm các nút ngày và giờ vào danh sách
        dayButtons = new JButton[]{btnThu2, btnThu4, btnThu6, btnthu7, btnchunhat};
        timeButtons = new JButton[]{btngioChieu1, btngiocchieu2, btngioChieu3, btnGioChieu4, btnGioChieu5};
		
		add(contentPane);
		layThongTinPhim();
	}

	@Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();

        // Kiểm tra và xử lý các button ngày
        for (JButton btn : dayButtons) {
            if (o.equals(btn)) {
                resetDayButtonColors();
                toggleButtonColor(btn);
                selectedDate = btn.getText();
            }
        }

        // Kiểm tra và xử lý các button giờ chiếu
        for (JButton btn : timeButtons) {
            if (o.equals(btn)) {
                resetTimeButtonColors();
                toggleButtonColor(btn);
                selectedTime = btn.getText();
            }
        }

        // Kiểm tra button "Next"
     // Kiểm tra button "Next"
        if (o.equals(btnNext)) {
            // Kiểm tra nếu ngày và giờ đã được chọn
            if (selectedDate.isEmpty() || selectedTime.isEmpty()) {
                // Hiển thị thông báo lỗi nếu chưa chọn ngày hoặc giờ
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày và giờ chiếu trước khi tiếp tục!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return; // Dừng thực hiện nếu không đủ thông tin
            }

            // Nếu đã chọn ngày và giờ, thực hiện chuyển tiếp
            contentPane.removeAll();
            contentPane.add(new GD_Ghe(), BorderLayout.CENTER);
            contentPane.revalidate();
            contentPane.repaint();
            saveSelection();
            // In dữ liệu lên console để kiểm tra
            System.out.println("Ngày đã chọn: " + ThongTinDatVe.getSelectedDate());
            System.out.println("Giờ đã chọn: " + ThongTinDatVe.getSelectedTime());
        }

    }

    // Phương thức đặt lại màu của tất cả các nút ngày
    private void resetDayButtonColors() {
        for (JButton btn : dayButtons) {
            btn.setBackground(new Color(240, 240, 240));
        }
    }

    // Phương thức đặt lại màu của tất cả các nút giờ
    private void resetTimeButtonColors() {
        for (JButton btn : timeButtons) {
            btn.setBackground(new Color(240, 240, 240));
        }
    }

    // Phương thức đổi màu nền của nút được chọn
    private void toggleButtonColor(JButton button) {
        Color selectedColor = Color.RED; // Màu khi button được chọn
        button.setBackground(selectedColor);
    }

    public void saveSelection() {
        // Lưu thông tin ngày và giờ đã chọn vào SessionData
        ThongTinDatVe.setSelectedDate(selectedDate);
        ThongTinDatVe.setSelectedTime(selectedTime);
    }

	
	
	// lấy tên phim
    private void layThongTinPhim() {
        // Lấy mã phim từ txtMaPhim
    	String maPhim = ve.getMaPhim();
        Dao_ThongTinPhim ds = new Dao_ThongTinPhim();
        // Kiểm tra nếu mã phim không rỗng
        if (!maPhim.isEmpty()) {
            String tieuDe = ds.getTenPhimByMaPhim(maPhim);
            String TheLoai = ds.getTheLoaiByMaPhim(maPhim);
            String DD = ds.getDaoDienByMaPhim(maPhim);
            String ThoiLuong = ds.getThoiLuongByMaPhim(maPhim);
            String mota = ds.getMoTaByMaPhim(maPhim);
            
            txtTenPhim.setText(tieuDe);
            txtDaoDien.setText(DD);
            txtTheLoai.setText(TheLoai);
            txtThoiLuong.setText(ThoiLuong);
            txtMoTa.setText(mota);
        } 
    }
}