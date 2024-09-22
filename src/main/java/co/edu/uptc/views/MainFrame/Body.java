package co.edu.uptc.views.MainFrame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import co.edu.uptc.utilities.PropertiesService;

public class Body extends JPanel{

    private JPanel carImagePanel;
    private JPanel carAnalisis;
    private JPanel geoAnalisis;

    PropertiesService ps = new PropertiesService();
    
    public Body(CardLayout cl){
        customizeBody(cl);
        customizeCarImage();
        customizeGeoAnálisis();
        customizeCarAnalisis();
    }

    public void customizeBody(CardLayout cl){
        this.setLayout(cl);
        this.setBounds(343, 0, 850, 765);
    }

    public void customizeCarAnalisis(){
        carAnalisis = new JPanel();
        carAnalisis.setBackground(Color.black);
        this.add(carAnalisis, "CarAnalisis");
    }

    public void customizeGeoAnálisis(){
        geoAnalisis = new JPanel();
        geoAnalisis.setBackground(Color.green);
        this.add(geoAnalisis, "GeoAnalisis");
    }

    public void customizeCarImage(){

        carImagePanel = new JPanel();
        carImagePanel.setLayout(new BorderLayout());
        carImagePanel.setBackground(Color.blue);
        
        
        ImageIcon carImageIcon = new ImageIcon(ps.getKeyValue("CarImage"));
        Image carImage = carImageIcon.getImage();
        Image scaledCarImage = carImage.getScaledInstance(1252, 796, Image.SCALE_SMOOTH);
        carImageIcon = new ImageIcon(scaledCarImage);
        
        JLabel imageContainer = new JLabel(carImageIcon);
        imageContainer.setOpaque(true);
        carImagePanel.add(imageContainer, BorderLayout.CENTER);


        this.add(carImagePanel, "CarImage");
    }


}
