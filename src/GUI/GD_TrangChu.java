package GUI;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GD_TrangChu extends JPanel{
	private Image backgroundImage;

    public GD_TrangChu() {
        setLayout(new BorderLayout());
        backgroundImage = new ImageIcon("src\\Images\\background.png").getImage();
        
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the background image, scaled to the panel's size
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
 
}
