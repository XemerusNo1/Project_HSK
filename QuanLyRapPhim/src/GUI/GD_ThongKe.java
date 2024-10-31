package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.Calendar;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

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
	private static JLabel maxValue;
	private static JLabel minValue;
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
		String[] years = {};
		JComboBox<String> yearComboBox = new JComboBox<>(years);
		yearComboBox.setPreferredSize(new Dimension(100, 5)); 
		b1.add(Box.createHorizontalStrut(10)); // Khoảng cách ngang
		b1.add(yearComboBox);
//	        loadYearsFromDatabase();
		b1.add(Box.createHorizontalStrut(10));
		b1.add(CThang = new JLabel("Chọn Tháng"));
		CThang.setFont(font = new Font("Times New Roman", Font.PLAIN, 20));
		String[] month = {};
		JComboBox<String> monthComboBox = new JComboBox<>(month);
		monthComboBox.setPreferredSize(new Dimension(100, 5));
		b1.add(Box.createHorizontalStrut(10)); // Khoảng cách ngang
		b1.add(monthComboBox);
		b1.add(Box.createHorizontalStrut(10));
		
		Calendar calendar = Calendar.getInstance();
		Date initialDate = calendar.getTime();
		SpinnerDateModel model = new SpinnerDateModel(initialDate, null, null, Calendar.DATE);
		dateTimeSpinner = new JSpinner(model);
		// Đặt định dạng cho JSpinner
		JSpinner.DateEditor editor = new JSpinner.DateEditor(dateTimeSpinner, "dd/MM/yyyy");
		dateTimeSpinner.setEditor(editor);
		// Tạo panel để chứa JSpinner
		b1.add(Frday =new JLabel("Từ Ngày"));
		Frday.setFont(font = new Font("Times New Roman", Font.PLAIN, 20));
		b1.add(Box.createHorizontalStrut(10));
		b1.add(dateTimeSpinner);
		b1.add(Box.createHorizontalStrut(10));
		
		Calendar calendar1 = Calendar.getInstance();
		Date initialDate1 = calendar.getTime();
		SpinnerDateModel model1 = new SpinnerDateModel(initialDate, null, null, Calendar.DATE);
		dateTimeSpinner = new JSpinner(model1);
		// Đặt định dạng cho JSpinner
		JSpinner.DateEditor editor1 = new JSpinner.DateEditor(dateTimeSpinner, "dd/MM/yyyy");
		dateTimeSpinner.setEditor(editor1);
		// Tạo panel để chứa JSpinner
		b1.add(Tday = new JLabel("Đến Ngày"));
		Tday.setFont(font = new Font("Times New Roman", Font.PLAIN, 20));
		b1.add(Box.createHorizontalStrut(10));
		b1.add(dateTimeSpinner);
		
		Font radioButtonFont = new Font("Times New Roman", Font.PLAIN, 18); 
		box.add(b2=Box.createHorizontalBox());
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
	
		
		Box btable = Box.createVerticalBox();
		String [] headers = "STT;Thời gian;Doanh thu".split(";");
		tableModel=new DefaultTableModel(headers,0);
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
        infoPanel.add( maxValue);
        infoPanel.add(minLabel);
        infoPanel.add( minValue);

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
        Image iconex = oriconex .getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
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
        //getMinMaxValues();
        
        add(southPanel, BorderLayout.SOUTH);
       
		setVisible(true);
	}

//	 private void getMinMaxValues() {
//	       ConnectThongke dbHelper = new ConnectThongke();
//	        int[] minMaxValues = dbHelper.getMinMaxValues();
//
//	        // Cập nhật giá trị trên giao diện người dùng
//	        updateValues(minMaxValues[1], minMaxValues[0]); // max, min
//	    }

	    public static void updateValues(int max, int min) {
	        maxValue.setText(String.valueOf(max));
	        minValue.setText(String.valueOf(min));
	    }
	public static void main(String[] args) {
		SwingUtilities.invokeLater(GD_ThongKe::new);
	}
}