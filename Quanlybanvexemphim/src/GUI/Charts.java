package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Charts extends JFrame {

    public Charts(String title, List<Double> doanhThuList) {
        super(title);
        CategoryDataset dataset = createDataset(doanhThuList);
        JFreeChart chart = ChartFactory.createBarChart(
                "Doanh Thu Theo Tháng",
                "Tháng",
                "Doanh Thu (VND)",
                dataset
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset(List<Double> doanhThuList) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < doanhThuList.size(); i++) {
            dataset.addValue(doanhThuList.get(i), "Doanh Thu", "Tháng " + (i + 1));
        }
        return dataset;
    }
}
