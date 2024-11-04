package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import ConnectDB.connectDB;
import DAO.DAO_ThongKe;
import DAO.baoCao;
import Entity.RevenueRecord;

public class GD_ThongKe extends JPanel {
	private JLabel CNam;
	private JLabel CThang;
	private JComboBox<String> yearComboBox;
	private JComboBox<String> monthComboBox;
	private JComboBox<String> fromDateComboBox;
	private JComboBox<String> toDateComboBox;
	private JRadioButton CRNam;
	private JRadioButton CRThang;
	private JComboBox<String> fromDay;
	private JComboBox<String> fromMonth;
	private JComboBox<String> fromYear;
	private JLabel ToNgay;
	private JLabel FromNgay;
	private Component toDay;
	private Component toMonth;
	private Component toYear;
	private JSpinner dateTimeSpinner;
	private JRadioButton CRNgay;
	private JRadioButton CRKNgay;
	private DefaultTableModel tableModel;
	private JTable table;
	private Box frame;
	private Font font;
	private JLabel Frday;
	private JLabel Tday;
	private String[] years1;
	private static JLabel maxValue;
	private static JLabel minValue;
	private JSpinner fromDateSpinner; // Declare at the class level
	private JSpinner toDateSpinner;

	public GD_ThongKe() {
		setSize(1100, 700);

		Box box = Box.createVerticalBox();
		box.add(Box.createVerticalStrut(20));
		Box b1, b2;
		box.add(b1 = Box.createHorizontalBox());
		box.add(Box.createVerticalStrut(20));
		b1.add(Box.createHorizontalStrut(10));
		b1.add(CNam = new JLabel("Chọn Năm"));
		CNam.setFont(font = new Font("Times New Roman", Font.PLAIN, 20));

		int currentYear = LocalDate.now().getYear();

		String[] years = new String[10]; // Ví dụ: tạo mảng chứa 10 năm
		for (int i = 0; i < years.length; i++) {
			years1 = years;
			years1[i] = String.valueOf(currentYear - (years.length - 1 - i)); // Thêm năm từ hiện tại trở về trước
		}
		JComboBox<String> yearComboBox = new JComboBox<>(years);
		yearComboBox.setSelectedItem(String.valueOf(currentYear));

		yearComboBox.setPreferredSize(new Dimension(100, 5));
		b1.add(Box.createHorizontalStrut(10)); // Khoảng cách ngang
		b1.add(yearComboBox);
//	        loadYearsFromDatabase();
		b1.add(Box.createHorizontalStrut(10));
		b1.add(CThang = new JLabel("Chọn Tháng"));
		CThang.setFont(font = new Font("Times New Roman", Font.PLAIN, 20));
		String[] month = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		JComboBox<String> monthComboBox = new JComboBox<>(month);
		monthComboBox.setPreferredSize(new Dimension(100, 5));
		b1.add(Box.createHorizontalStrut(10)); // Khoảng cách ngang
		b1.add(monthComboBox);
		b1.add(Box.createHorizontalStrut(10));

		fromDateSpinner = new JSpinner(new SpinnerDateModel());
		Calendar lich = Calendar.getInstance();
		Date ngayhientai = lich.getTime();
		SpinnerDateModel model = new SpinnerDateModel(ngayhientai, null, null, Calendar.DATE);
		// dateTimeSpinner = new JSpinner(model);
		// Đặt định dạng cho JSpinner
		JSpinner.DateEditor editor = new JSpinner.DateEditor(fromDateSpinner, "dd/MM/yyyy");
		fromDateSpinner.setEditor(editor);
		// Tạo panel để chứa JSpinner
		b1.add(Frday = new JLabel("Từ Ngày"));
		Frday.setFont(font = new Font("Times New Roman", Font.PLAIN, 20));
		b1.add(Box.createHorizontalStrut(10));
		b1.add(fromDateSpinner);
		b1.add(Box.createHorizontalStrut(10));

		toDateSpinner = new JSpinner(new SpinnerDateModel());
		Calendar lich1 = Calendar.getInstance();
		Date ngayhientai1 = lich1.getTime();
		SpinnerDateModel model1 = new SpinnerDateModel(ngayhientai1, null, null, Calendar.DATE);
		// dateTimeSpinner = new JSpinner(model1);
		// Đặt định dạng cho JSpinner
		JSpinner.DateEditor editor1 = new JSpinner.DateEditor(toDateSpinner, "dd/MM/yyyy");
		toDateSpinner.setEditor(editor1);
		// Tạo panel để chứa JSpinner
		b1.add(Tday = new JLabel("Đến Ngày"));
		Tday.setFont(font = new Font("Times New Roman", Font.PLAIN, 20));
		b1.add(Box.createHorizontalStrut(10));
		b1.add(toDateSpinner);

		Font radioButtonFont = new Font("Times New Roman", Font.PLAIN, 18);
		box.add(b2 = Box.createHorizontalBox());
		box.add(Box.createVerticalStrut(10));
		b2.add(Box.createHorizontalStrut(30));
		b2.add(CRNam = new JRadioButton("Theo Năm"));
		CRNam.setFont(radioButtonFont);
		b2.add(Box.createHorizontalStrut(30));
		b2.add(CRThang = new JRadioButton("Theo Tháng Trong Năm"));
		CRThang.setFont(radioButtonFont);
		b2.add(Box.createHorizontalStrut(30));
		b2.add(CRNgay = new JRadioButton("Theo Ngày Trong Tháng"));
		CRNgay.setFont(radioButtonFont);
		b2.add(Box.createHorizontalStrut(30));
		b2.add(CRKNgay = new JRadioButton("Theo Khoảng Ngày"));
		CRKNgay.setFont(radioButtonFont);
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(CRNam);
		radioGroup.add(CRThang);
		radioGroup.add(CRNgay);
		radioGroup.add(CRKNgay);

		Box btable = Box.createVerticalBox();
		String[] headers = "STT;Thời gian;Doanh thu".split(";");
		tableModel = new DefaultTableModel(headers, 0);
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(table = new JTable(tableModel));
		table.setRowHeight(25);
		table.setAutoCreateRowSorter(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		table.getTableHeader().setReorderingAllowed(false);

		btable.add(scroll);
		box.add(btable);
		add(box, BorderLayout.CENTER);

		// Tạo panel cho thông tin

		JPanel infoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JLabel maxLabel = new JLabel("Cao Nhất:");
		maxValue = new JLabel();
		JLabel minLabel = new JLabel("Thấp Nhất: ");
		minValue = new JLabel();
		infoPanel.add(maxLabel);
		infoPanel.add(maxValue);
		infoPanel.add(minLabel);
		infoPanel.add(minValue);

		// Tạo panel cho nút
		JPanel btn = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		ImageIcon oricon = new ImageIcon("src\\Images\\chart.jpg"); // Đường dẫn tương đối

		// Thay đổi kích thước icon
		Image icon = oricon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon iconchart = new ImageIcon(icon);
		JButton btnchart = new JButton("Xem biểu đồ doanh thu");
		// Thay đổi đường dẫn đến hình ảnh của bạn

		// Thêm icon vào JButton

		ImageIcon oriconex = new ImageIcon("src\\Images\\excelicon.jpg");
		// Thay đổi kích thước icon
		Image iconex = oriconex.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon iconexcel = new ImageIcon(iconex);
		JButton btnexcel = new JButton("Xuất báo cáo doanh thu");
		btnchart.setIcon(iconchart);
		btnexcel.setIcon(iconexcel);
		btn.add(btnchart);
		btn.add(btnexcel);

		// Tạo panel chính cho phần south
		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.add(infoPanel, BorderLayout.WEST);
		southPanel.add(btn, BorderLayout.EAST);
		// getMinMaxValues();

		add(southPanel, BorderLayout.SOUTH);

		setVisible(true);
		// Xử lý nút radio theo năm
		CRNam.addActionListener(e -> {
			if (CRNam.isSelected()) {
				doanhThuCacNam();
			}
		});
		// Xử lý nút radio theo tháng
		CRThang.addActionListener(e -> {
			if (CRThang.isSelected()) {
				String selectedYear = (String) yearComboBox.getSelectedItem();
				String year = selectedYear;
				doanhThuCacThang(year);

			}
		});
		// Xử lý nút radio theo ngày trong tháng
		CRNgay.addActionListener(e -> {
			if (CRNgay.isSelected()) {
				String selectedYear = (String) yearComboBox.getSelectedItem();
				String selectedMonth = (String) monthComboBox.getSelectedItem();
				doanhThuCacNgayInThang(selectedYear, selectedMonth); // Tải doanh thu theo ngày
			}
		});
// xử lý khoảng ngày
		CRKNgay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (CRKNgay.isSelected()) {
					fromDateSpinner.setEnabled(true);
					toDateSpinner.setEnabled(true);
					try {
						// Get the selected dates from the spinners
						Date selectedFromDate = (Date) fromDateSpinner.getValue();
						Date selectedToDate = (Date) toDateSpinner.getValue();

						// Validate dates
						if (selectedFromDate.after(selectedToDate)) {
							JOptionPane.showMessageDialog(null, "Ngày bắt đầu phải nhỏ hơn ngày kết thúc!", "Thông báo",
									JOptionPane.WARNING_MESSAGE);
						} else {
							// Call the method to load revenue data between dates
							doanhthucacngay(selectedFromDate, selectedToDate);
						}
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày hợp lệ!", "Lỗi",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		///
/// xử lý xuất báo cáo 
		btnexcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String filePath = "fileexxccel"; // Thay đổi đường dẫn và tên tệp theo ý muốn
				baoCao exporter = new baoCao(tableModel);

				if (CRNam.isSelected()) {
					exporter.doanhThuNam(filePath + "//doanhthutheonam.csv");
				} else if (CRThang.isSelected()) {
					exporter.doanhThuThang(filePath + "//doanhthutheothang.csv");
				} else if (CRNgay.isSelected()) {
					exporter.doanhThuCacNgay(filePath + "//+doanhthutheongay.csv");
				} else {
					JOptionPane.showMessageDialog(null, "Vui lòng chọn loại báo cáo để xuất!", "Thông báo",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

//////xử lý vẽ biểu đồ 
		btnchart.addActionListener(e -> {
		    // Gọi phương thức để tạo biểu đồ doanh thu
		    bieuDo();
		});

		
	}


// xủ lý action năm
	private void doanhThuCacNam() {
		tableModel.setRowCount(0); // Clear existing data

		try (Connection connection = connectDB.getConnection()) {
			// Create RevenueDataLoader
			DAO_ThongKe dataLoader = new DAO_ThongKe(connection);

			// Load data
			List<RevenueRecord> revenueRecords = dataLoader.doanhThuCacNam();
			System.out.println("Số bản ghi tải về: " + revenueRecords.size());
			// Populate table model
			for (int i = 0; i < revenueRecords.size(); i++) {
				RevenueRecord record = revenueRecords.get(i);
				tableModel.addRow(new Object[] { record.getStt(), record.getThoigian(), record.getDoanhThu() });
			}
			updateValues(revenueRecords);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

// xử lý action tháng

	private void doanhThuCacThang(String year) {
		tableModel.setRowCount(0);
		try (Connection connection = connectDB.getConnection()) {
			DAO_ThongKe dataLoader = new DAO_ThongKe(connection);
			List<RevenueRecord> revenueRecords = dataLoader.doanhThuCacThang(year);

			for (RevenueRecord record : revenueRecords) {
				tableModel.addRow(new Object[] { record.getStt(), record.getThoigian(), record.getDoanhThu() });
			}

			updateValues(revenueRecords);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// xử lý action ngày
	private void doanhThuCacNgayInThang(String year, String month) {
		tableModel.setRowCount(0); // Clear existing data
		try (Connection connection = connectDB.getConnection()) {
			// Create RevenueDataLoader
			DAO_ThongKe dataLoader = new DAO_ThongKe(connection);
			// Call the stored procedure
			List<RevenueRecord> revenueRecords = dataLoader.doanhThuCacNgayTrongThang(year, month);

			for (RevenueRecord record : revenueRecords) {
				tableModel.addRow(new Object[] { record.getStt(), record.getThoigian(), record.getDoanhThu() });
			}

			updateValues(revenueRecords);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

// xử lý khoảng ngày
	private void doanhthucacngay(Date fromDate, Date toDate) {
		tableModel.setRowCount(0); // Clear existing data

		try (Connection connection = connectDB.getConnection()) {
			DAO_ThongKe dataLoader = new DAO_ThongKe(connection);

			// Convert to SQL Date
			java.sql.Date sqlFromDate = new java.sql.Date(fromDate.getTime());
			java.sql.Date sqlToDate = new java.sql.Date(toDate.getTime());

			// Load data from the database
			List<RevenueRecord> revenueRecords = dataLoader.doanhThuCacNgay(sqlFromDate, sqlToDate);

			// Populate table model
			for (RevenueRecord record : revenueRecords) {
				tableModel.addRow(new Object[] { record.getStt(), record.getThoigian(), record.getDoanhThu() });
			}

			// Update min/max values
			updateValues(revenueRecords);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu doanh thu: " + e.getMessage(), "Lỗi",
					JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	// cập nhập giá trị min,max
	public static void updateValues(List<RevenueRecord> revenueRecords) {
		double maxRevenue = Double.MIN_VALUE; // Khởi tạo max
		double minRevenue = Double.MAX_VALUE; // Khởi tạo min
		if (revenueRecords.isEmpty()) {
			// Cập nhật giá trị vào JLabel nếu không có dữ liệu
			maxValue.setText(String.valueOf(0));
			minValue.setText(String.valueOf(0));
			return; // Kết thúc hàm
		} else {
			// Populate table model and calculate max/min
			for (RevenueRecord record : revenueRecords) {
				double doanhThu = record.getDoanhThu();

				if (doanhThu > maxRevenue) {
					maxRevenue = doanhThu; // Cập nhật giá trị cao nhất
				}
				if (doanhThu < minRevenue) {
					minRevenue = doanhThu; // Cập nhật giá trị thấp nhất
				}
			}
		}

		// Cập nhật giá trị vào JLabel
		maxValue.setText(String.valueOf(maxRevenue));
		minValue.setText(String.valueOf(minRevenue));
	}

	// xử lý nút biểu đồ
	private void bieuDo() {
		TimeSeries series = new TimeSeries("Doanh thu");

	    if (CRKNgay.isSelected()) {
	        for (int row = 0; row < tableModel.getRowCount(); row++) {
	            Object thoigian = tableModel.getValueAt(row, 1); // Giả sử cột 1 là thời gian
	            Object doanhthu = tableModel.getValueAt(row, 2); // Giả sử cột 2 là doanh thu
	            
	            // In ra dữ liệu để kiểm tra
	            System.out.println("Row " + row + ": Thời gian = " + thoigian + ", Doanh thu = " + doanhthu);
	            
	            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	            try {
	                Date date = format.parse(thoigian.toString());
	                series.add(new Day(date), Double.parseDouble(doanhthu.toString())); // Sử dụng Day để chỉ cần ngày
	            } catch (ParseException e) {
	                e.printStackTrace(); // Xử lý lỗi nếu cần
	            }
	        }

	        // Tạo dataset từ series
	        TimeSeriesCollection datasetLine = new TimeSeriesCollection(series);

	        // Tạo biểu đồ đường
	        JFreeChart lineChart = ChartFactory.createTimeSeriesChart(
	                "Biểu Đồ Doanh Thu", // Tiêu đề biểu đồ
	                "Thời gian", // Nhãn trục X
	                "Doanh Thu", // Nhãn trục Y
	                datasetLine, // Dữ liệu
	                true, // Hiển thị chú thích
	                true, // Hiển thị tooltip
	                false // Không sử dụng URL
	        );

	        // Định dạng trục X để hiển thị ngày theo định dạng mong muốn
	        DateAxis xAxis = (DateAxis) lineChart.getXYPlot().getDomainAxis();
	        xAxis.setDateFormatOverride(new SimpleDateFormat("d/M")); // Định dạng ngày theo "ngày/tháng"

	        // Tạo ChartPanel để hiển thị biểu đồ
	        ChartPanel chartPanel = new ChartPanel(lineChart);
	        chartPanel.setPreferredSize(new Dimension(800, 600));

	        JFrame chartFrame = new JFrame("Biểu Đồ Doanh Thu Các Ngày");
	        chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        chartFrame.getContentPane().add(chartPanel, BorderLayout.CENTER);
	        chartFrame.pack();
	        chartFrame.setLocationRelativeTo(null);
	        chartFrame.setResizable(false);
	        chartFrame.setVisible(true);
	    } else {
		    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	        // Biểu đồ cột
	        for (int row = 0; row < tableModel.getRowCount(); row++) {
	            Object timePeriod = tableModel.getValueAt(row, 1); // Giả sử cột 1 là thời gian
	            Object revenue = tableModel.getValueAt(row, 2); // Giả sử cột 2 là doanh thu
	            System.out.println("Row " + row + ": Thời gian = " + timePeriod + ", Doanh thu = " + revenue);
	            if (timePeriod != null && revenue != null) {
	                dataset.addValue(Double.parseDouble(revenue.toString()), "Doanh thu", timePeriod.toString());
	            }
	        }

	        JFreeChart barChart = ChartFactory.createBarChart(
	                "Biểu Đồ Doanh Thu", // Tiêu đề biểu đồ
	                "Thời gian", // Nhãn trục X
	                "Doanh Thu", // Nhãn trục Y
	                dataset // Dữ liệu
	        );

	        ChartPanel chartPanel = new ChartPanel(barChart);
	        chartPanel.setPreferredSize(new Dimension(800, 600));

	        JFrame chartFrame = new JFrame("Biểu Đồ Doanh Thu Các Năm");
	        chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        chartFrame.getContentPane().add(chartPanel, BorderLayout.CENTER);
	        chartFrame.pack();
	        chartFrame.setLocationRelativeTo(null);
	        chartFrame.setVisible(true);
	    }
	}

}