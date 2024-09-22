package co.edu.uptc.views.MainFrame;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

import co.edu.uptc.utilities.PropertiesService;
import co.edu.uptc.views.GlobalView;
import co.edu.uptc.views.VehicleManagerView;

public class Aside extends JPanel{
    private VehicleManagerView vehicleManagerView;
    private JLabel asideTitle;
    private JButton geoAnalisis;
    private JButton carAnalisis;

    PropertiesService ps = new PropertiesService();
    
    public Aside(VehicleManagerView vehicleManagerView){
        this.vehicleManagerView = vehicleManagerView;
        customizeAside();
        try {
            customizeAsideTitle();
            customizeGeoAnalisis();
            customizeCarAnalisis();
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public void customizeAside(){
        this.setBounds(0, 0, 343, 765);
        this.setBackground(GlobalView.MAIN_BACKGROUND_COLOR);
        this.setLayout(null);
    }

    public void customizeAsideTitle() throws FontFormatException, IOException{
        asideTitle = new JLabel("<html><div style='text-align: center;'>Datos<br>Vehiculares</div><html>", SwingConstants.CENTER);
        asideTitle.setBounds(0,175,349,170);
        asideTitle.setForeground(GlobalView.MAIN_TEXT_COLOR);
        asideTitle.setFont(Font.createFont(Font.TRUETYPE_FONT, new File(ps.getKeyValue("MainFont"))).deriveFont(40f));
        this.add(asideTitle);
    }

    public void customizeGeoAnalisis() throws FontFormatException, IOException{
        geoAnalisis = new JButton("Análisis Geográfico");
        geoAnalisis.setBounds(81,471,188,68);
        geoAnalisis.setBackground(GlobalView.BUTTONS_COLOR);
        geoAnalisis.setForeground(GlobalView.MAIN_TEXT_COLOR);
        geoAnalisis.setFont(Font.createFont(Font.TRUETYPE_FONT, new File(ps.getKeyValue("SecondaryFont"))).deriveFont(13f));
        geoAnalisis.setFocusable(false);
        geoAnalisis.addActionListener(new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {
                vehicleManagerView.showGeoAnalisis();
            }});
        this.add(geoAnalisis);
    }

    public void customizeCarAnalisis() throws FontFormatException, IOException{
        carAnalisis = new JButton("Análisis Vehicular");
        carAnalisis.setBounds(81, 374, 188, 68);
        carAnalisis.setBackground(GlobalView.BUTTONS_COLOR);
        carAnalisis.setForeground(GlobalView.MAIN_TEXT_COLOR);
        carAnalisis.setFont(Font.createFont(Font.TRUETYPE_FONT, new File(ps.getKeyValue("SecondaryFont"))).deriveFont(13f));
        carAnalisis.setFocusable(false);
        carAnalisis.addActionListener(new ActionListener() {
            @Override
           public void actionPerformed(ActionEvent e) {
               vehicleManagerView.showCarAnalisis();
           }});
        this.add(carAnalisis);
    }
}
