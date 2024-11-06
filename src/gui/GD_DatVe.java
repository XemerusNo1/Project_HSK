package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import dao.DAO_DatVe;
import dulieutamthoi.ThongTinDatVe;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.List;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

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
	private JDateChooser txtNgayTao;
	private BigDecimal SumGiaVe =  setTongTien();
	private JButton btnDatVe;
	private Double tongTienGhe;
	

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
		
		btnDatVe = new JButton("Đặt Vé");
		btnDatVe.addActionListener(this);
		btnDatVe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDatVe.setBackground(Color.GREEN);
		
		JLabel lblPhng = new JLabel("Phòng:");
		lblPhng.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtPhong = new JTextField();
		txtPhong.setText("Phong01");
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
		
		JLabel lblNgyTo = new JLabel("Ngày Tạo:");
		lblNgyTo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtNgayTao = new JDateChooser();
		txtNgayTao.setSize(new Dimension(30, 20));
		txtNgayTao.setDateFormatString("yyyy-MM-dd");
		txtNgayTao.setDate(new java.util.Date());
		txtNgayTao.getDateEditor().setEnabled(false);
	
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(198, Short.MAX_VALUE)
					.addComponent(btnQuayLai)
					.addGap(108)
					.addComponent(btnDatVe, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(132))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(49)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNgyTo, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
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
											.addComponent(lblTenPhim)
											.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
											.addComponent(txtTenPhim, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblGiChiu, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
											.addComponent(txtNgayChieu, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
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
												.addComponent(txtPhong, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblTngTinV, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtNgayTao)
												.addComponent(txtTienVe, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))))
									.addGap(101))))))
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
						.addComponent(txtGioChieu, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGi, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGiChiu, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNgayChieu, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
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
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNgyTo, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNgayTao, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnQuayLai)
						.addComponent(btnDatVe))
					.addGap(85))
		);
		panel.setLayout(gl_panel);
		
		
		
		setThongTinVeTextField();
		setTienDoan() ;
		updateSeatSelection();
		tongTienGhe = setTongGiaGhe();
		txtGiaGhe.setText(String.format("%.2f VNĐ", tongTienGhe));

	    
	    
	    txtTienVe.setText(String.format("%.2f VNĐ", SumGiaVe));
	
}

	// Phương thức để thiết lập giá tiền cho txtGiaTien1
	private void setThongTinVeTextField() {
		String maPhim1 = ve.getMaPhim();
		String ngaychieu = ve.getSelectedDate();
		String GioChieu = ve.getSelectedTime();
		
	    if (daoDatVe == null) {
	    	daoDatVe = new DAO_DatVe();
	    }
	    String tenPhim = daoDatVe.getTenPhimByMaPhim(maPhim1);
	    if (tenPhim != null) {
	    	txtTenPhim.setText(tenPhim);
	    	txtNgayChieu.setText(ngaychieu);
	    	txtGioChieu.setText(GioChieu);
	    	
	    } else {
	    	txtTenPhim.setText("Lỗi không kết nối được với phim đã chọn");
	    }
	}
	
	// phương thúc tính tổng tiền đồ ăn 
	public void setTienDoan() {
	    if (daoDatVe == null) {
	        daoDatVe = new DAO_DatVe();
	    }

	    BigDecimal tienDoAn = ThongTinDatVe.getTongTienDoAn(); 
	    if (tienDoAn != null && tienDoAn.compareTo(BigDecimal.ZERO) > 0) { 
	        txtTienDoAn.setText(String.format("%.2f VNĐ", tienDoAn));
	    } else {
	        txtTienDoAn.setText("0.00 VNĐ");
	    }
	}


	// Set the seat cost and update total
	public double setTongGiaGhe() {
	    if (daoDatVe == null) {
	        daoDatVe = new DAO_DatVe();
	    }

	    String maPhim1 = ve.getMaPhim();
	    List<String> selectedSeats = ThongTinDatVe.getSelectedSeats();

	    double giaPhim = daoDatVe.getGiaPhimByMaPhim(maPhim1);
	    double tongGiaGhe = 0.0;

	    for (String maGhe : selectedSeats) {
	        tongGiaGhe += daoDatVe.getGiaGheByMaGhe(maGhe);
	    }

	    double tongTien = giaPhim + tongGiaGhe;
	    return tongTien;
	}
	

	
	// Calculate and set the total cost by summing food and seat costs
	public BigDecimal setTongTien() {
	    if (daoDatVe == null) {
	        daoDatVe = new DAO_DatVe();
	    }

	    // Retrieve food cost
	    BigDecimal tienDoAn = ThongTinDatVe.getTongTienDoAn();
	    if (tienDoAn == null) {
	        tienDoAn = BigDecimal.ZERO;
	    }

	    // Retrieve seat cost
	    String maPhim1 = ThongTinDatVe.getMaPhim();
	    List<String> selectedSeats = ThongTinDatVe.getSelectedSeats();

	    double giaPhim = daoDatVe.getGiaPhimByMaPhim(maPhim1);
	    double tongGiaGhe = 0.0;

	    for (String maGhe : selectedSeats) {
	        tongGiaGhe += daoDatVe.getGiaGheByMaGhe(maGhe);
	    }

	    // Convert tongGiaGhe to BigDecimal and calculate total
	    BigDecimal tongGiaGheBD = BigDecimal.valueOf(tongGiaGhe);
	    BigDecimal tongTien = tienDoAn.add(tongGiaGheBD.add(BigDecimal.valueOf(giaPhim)));

	    return tongTien;
	   
	}




	
	private void updateSeatSelection() {
	    // Lấy danh sách ghế đã chọn từ bộ nhớ tạm
	    List<String> selectedSeats = ThongTinDatVe.getSelectedSeats(); 

	    // Cập nhật txtGhe với danh sách ghế đã chọn, nối tên các ghế thành một chuỗi
	    txtGhe.setText(String.join(", ", selectedSeats));

	    // Cập nhật txtSLGhe với số lượng ghế đã chọn
	    txtSLGhe.setText(String.valueOf(selectedSeats.size()));
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
	    if (o.equals(btnDatVe)) {
	    	// insert table thời gian chiếu
	    	String maPhim = ve.getMaPhim();
			String maPhong = txtPhong.getText();
			String GioChieu = ve.getSelectedTime();
			String NgayChieu = ve.getSelectedDate();
			int maGioChieu = daoDatVe.insertThoiGianChieu(maPhim, maPhong, GioChieu, NgayChieu);
			
	        // Gọi phương thức insertHoaDon và lưu giá trị trả về	    
	        java.util.Date ngayTao = txtNgayTao.getDate(); 
	        java.sql.Date ngayBan = new java.sql.Date(ngayTao.getTime());
	        int maHoaDon = daoDatVe.insertHoaDon(SumGiaVe, ngayBan); 

	        // Kiểm tra nếu maHoaDon hợp lệ trước khi chèn vào SanPhamOrder
	        if (maHoaDon > 0 && maGioChieu > 0 ) {
	        	int SLGhe = Integer.parseInt(txtSLGhe.getText());
	        	String danhSachGhe = txtGhe.getText();
	        	daoDatVe.insertVePhim(maGioChieu, maHoaDon, tongTienGhe, SLGhe, danhSachGhe);
	        } else {
	            System.out.println("Failed to insert HoaDon, SanPhamOrder not inserted.");
	        }
	    }
	}

}
