package co.edu.uptc.views.MainFrame;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.utilities.PropertiesService;

public class Body extends JPanel{

    private JPanel carImagePanel;
    private JPanel carAnalisis;
    private JPanel geoAnálisis;

    private ImageIcon carImageIcon;

    PropertiesService ps = new PropertiesService();
    
    public Body(){

    }

    public void customizeCarImage(){
        carImageIcon = new ImageIcon(ps.getKeyValue("CarImage"));
        Image carImage = carImageIcon.getImage();
        Image scaledCarImage = carImage.getScaledInstance(1193, 763, Image.SCALE_SMOOTH);
        carImageIcon = new ImageIcon(scaledCarImage);
        JLabel imageContainer = new JLabel(carImageIcon);
        imageContainer.setBounds(216, 0, 1193, 763);
        carImagePanel.add(imageContainer);
    }
}
