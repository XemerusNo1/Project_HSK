package DAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class baoCao {

    private DefaultTableModel tableModel;

    public baoCao(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
// lưu báo cáo doanh thu các năm
    public void doanhThuNam(String filePath) {
        StringBuilder csvData = new StringBuilder();

        // Thêm tiêu đề cho báo cáo
        csvData.append("Báo cáo doanh thu các năm\n");
        csvData.append("STT,Thời gian,Doanh thu\n");

        // Lấy dữ liệu từ tableModel và thêm vào csvData
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                csvData.append(tableModel.getValueAt(i, j));
                if (j < tableModel.getColumnCount() - 1) {
                    csvData.append(","); // Thêm dấu phẩy giữa các giá trị
                }
            }
            csvData.append("\n"); // Thêm dòng mới sau mỗi hàng
        }

        // Ghi vào file CSV
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(csvData.toString());
            JOptionPane.showMessageDialog(null, "Xuất báo cáo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất báo cáo!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // lưu báo cáo doanh thu các tháng
    public void doanhThuThang(String filePath) {
        StringBuilder csvData = new StringBuilder();

        // Thêm tiêu đề cho báo cáo
        csvData.append("Báo cáo doanh thu các tháng trong năm\n");
        csvData.append("STT,Thời gian,Doanh thu\n");

        // Lấy dữ liệu từ tableModel và thêm vào csvData
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                csvData.append(tableModel.getValueAt(i, j));
                if (j < tableModel.getColumnCount() - 1) {
                    csvData.append(","); // Thêm dấu phẩy giữa các giá trị
                }
            }
            csvData.append("\n"); // Thêm dòng mới sau mỗi hàng
        }

        // Ghi vào file CSV
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(csvData.toString());
            JOptionPane.showMessageDialog(null, "Xuất báo cáo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất báo cáo!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    // lưu báo cáo doanh thu các ngày trong tháng
    public void doanhThuCacNgay(String filePath) {
        StringBuilder csvData = new StringBuilder();

        // Thêm tiêu đề cho báo cáo
        csvData.append("Báo cáo doanh thu các ngày trong tháng\n");
        csvData.append("STT,Thời gian,Doanh thu\n");

        // Lấy dữ liệu từ tableModel và thêm vào csvData
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                csvData.append(tableModel.getValueAt(i, j));
                if (j < tableModel.getColumnCount() - 1) {
                    csvData.append(","); // Thêm dấu phẩy giữa các giá trị
                }
            }
            csvData.append("\n"); // Thêm dòng mới sau mỗi hàng
        }

        // Ghi vào file CSV
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(csvData.toString());
            JOptionPane.showMessageDialog(null, "Xuất báo cáo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất báo cáo!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
	public void doanhThuNam1(String filePath) {
		// TODO Auto-generated method stub
		  StringBuilder csvData = new StringBuilder();

	        // Thêm tiêu đề cho báo cáo
	        csvData.append("Báo cáo doanh thu các năm\n");
	        csvData.append("STT,Thời gian,Doanh thu\n");

	        // Lấy dữ liệu từ tableModel và thêm vào csvData
	        for (int i = 0; i < tableModel.getRowCount(); i++) {
	            for (int j = 0; j < tableModel.getColumnCount(); j++) {
	                csvData.append(tableModel.getValueAt(i, j));
	                if (j < tableModel.getColumnCount() - 1) {
	                    csvData.append(","); // Thêm dấu phẩy giữa các giá trị
	                }
	            }
	            csvData.append("\n"); // Thêm dòng mới sau mỗi hàng
	        }

	        // Ghi vào file CSV
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	            writer.write(csvData.toString());
	            JOptionPane.showMessageDialog(null, "Xuất báo cáo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	        } catch (IOException e) {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(null, "Lỗi khi xuất báo cáo!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	        }
		
	}

}
