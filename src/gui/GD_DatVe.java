package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.DAO_DatVe;
import dulieutamthoi.ThongTinDatVe;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class GD_DatVe extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenPhim;
	private JTextField txtNgayChieu;
	private JTextField txtGhe;
	private JTextField txtGiaGhe;
	private JTextField txtSLGhe;
	private JTextField txtTienDoAn;
	private JTextField txtTienVe;
	private JTextField txtPhong;
	private ThongTinDatVe ve ;
	private DAO_DatVe daoDatVe;
	private JTextField txtGioChieu;
	private JButton btnQuayLai;
	

	/**
	 * Create the frame.
	 */
	public GD_DatVe() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1100, 700);
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel PnlNorth = new JPanel();
		contentPane.add(PnlNorth, BorderLayout.NORTH);
		
		JLabel lbltieuDe = new JLabel("Đặt Vé");
		lbltieuDe.setFont(new Font("Times New Roman", Font.BOLD, 25));
		PnlNorth.add(lbltieuDe);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblTenPhim = new JLabel("Tên Phim:");
		lblTenPhim.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtTenPhim = new JTextField();
		txtTenPhim.setEditable(false);
		txtTenPhim.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtTenPhim.setColumns(10);
		
		JLabel lblGiChiu = new JLabel("Ngày Chiếu: ");
		lblGiChiu.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtNgayChieu = new JTextField();
		txtNgayChieu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtNgayChieu.setEditable(false);
		txtNgayChieu.setColumns(10);
		
		JLabel lblGhNgi = new JLabel("Ghế Ngồi: ");
		lblGhNgi.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtGhe = new JTextField();
		txtGhe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtGhe.setEditable(false);
		txtGhe.setColumns(10);
		
		JLabel lblGiXemPhim = new JLabel("Giá ghế: ");
		lblGiXemPhim.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtGiaGhe = new JTextField();
		txtGiaGhe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtGiaGhe.setEditable(false);
		txtGiaGhe.setColumns(10);
		
		txtSLGhe = new JTextField();
		txtSLGhe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtSLGhe.setEditable(false);
		txtSLGhe.setColumns(10);
		
		JLabel lblTinn = new JLabel("Tiền đồ ăn:");
		lblTinn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtTienDoAn = new JTextField();
		txtTienDoAn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtTienDoAn.setEditable(false);
		txtTienDoAn.setColumns(10);
		
		JLabel lblTngTinV = new JLabel("Tổng Tiền Vé:");
		lblTngTinV.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtTienVe = new JTextField();
		txtTienVe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtTienVe.setEditable(false);
		txtTienVe.setColumns(10);
		
		JButton btnNewButton = new JButton("Đặt Vé");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBackground(Color.GREEN);
		
		JLabel lblPhng = new JLabel("Phòng:");
		lblPhng.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtPhong = new JTextField();
		txtPhong.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPhong.setEditable(false);
		txtPhong.setColumns(10);
		
		JLabel lblGi = new JLabel("Giờ:");
		lblGi.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtGioChieu = new JTextField();
		txtGioChieu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtGioChieu.setEditable(false);
		txtGioChieu.setColumns(10);
		
		btnQuayLai = new JButton("Quay Lại");
		btnQuayLai.addActionListener(this);
		btnQuayLai.setIcon(new ImageIcon("src\\Images\\back.png"));
		btnQuayLai.setBackground(Color.LIGHT_GRAY);
		btnQuayLai.setFont(new Font("Times New Roman", Font.BOLD, 17));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(198, Short.MAX_VALUE)
					.addComponent(btnQuayLai)
					.addGap(108)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(132))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(49)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblPhng, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblGhNgi, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblTinn, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
										.addGap(18)
										.addComponent(txtTienDoAn, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblTngTinV, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
										.addComponent(txtTienVe, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblTenPhim)
										.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
										.addComponent(txtTenPhim, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblGiChiu, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
										.addComponent(txtNgayChieu, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(lblGi, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addGap(29)
										.addComponent(txtGioChieu, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblGiXemPhim, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(txtGhe, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(txtSLGhe, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
											.addComponent(txtGiaGhe, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtPhong, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))))
								.addGap(101)))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTenPhim, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTenPhim))
					.addGap(25)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNgayChieu, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtGioChieu, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGi, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGiChiu, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addComponent(lblPhng, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(txtPhong, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
					.addGap(17)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtGhe, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtSLGhe, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblGhNgi, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtGiaGhe, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGiXemPhim, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTienDoAn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTinn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTienVe, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTngTinV, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnQuayLai))
					.addGap(111))
		);
		panel.setLayout(gl_panel);
		
		
		
		setGiaTienChoTextField();
		setTienDoan() ;
	}
	
	// Phương thức để thiết lập giá tiền cho txtGiaTien1
	private void setGiaTienChoTextField() {
	    // Kiểm tra nếu daoGhe đã được khởi tạo
		String maPhim1 = ve.getMaPhim();
		String ngaychieu = ve.getSelectedDate();
		String GioChieu = ve.getSelectedTime();
		
	    if (daoDatVe == null) {
	    	daoDatVe = new DAO_DatVe();
	    }
	    
	    // Lấy giá sản phẩm từ daoGhe
	    String tenPhim = daoDatVe.getTenPhimByMaPhim(maPhim1);
	    
	    // Kiểm tra và cập nhật giá trị cho txtGiaTien1
	    if (tenPhim != null) {
	    	txtTenPhim.setText(tenPhim);
	    	txtNgayChieu.setText(ngaychieu);
	    	txtGioChieu.setText(GioChieu);
	    	
	    } else {
	    	txtTenPhim.setText("Lỗi không kết nối được với phim đã chọn");
	    }
	}
	
	// set tiền đồ ăn
	public void setTienDoan() {
		if (daoDatVe == null) {
	    	daoDatVe = new DAO_DatVe();
	    }
	
		String tienDoAn = ve.getTongTienDoAn();
	
		if (tienDoAn != null && !tienDoAn.isEmpty()) {
	        txtTienDoAn.setText(tienDoAn);
	    } else {
	        txtTienDoAn.setText("0.00" +"VNĐ");
	    }
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
	    if (o.equals(btnQuayLai)) {
	        contentPane.removeAll();
	        contentPane.add(new GD_Ghe(), BorderLayout.CENTER);
	        contentPane.revalidate();
	        contentPane.repaint();
	    }
	}

}
