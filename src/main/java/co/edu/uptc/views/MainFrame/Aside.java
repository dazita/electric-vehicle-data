package co.edu.uptc.views.MainFrame;

import java.awt.Font;

import javax.swing.*;

import co.edu.uptc.views.GlobalView;

public class Aside extends JPanel{
    private JLabel asideTitle;
    private JButton geoAnalisis;
    private JButton carAnalisis;
    
    public Aside(){

    }

    public void customizeAside(){
        this.setBounds(0, 0, 343, 765);
        this.setBackground(GlobalView.MAIN_BACKGROUND_COLOR);
        this.setLayout(null);
    }

    public void customizeAsideTitle(){
        asideTitle = new JLabel("");
    }

    public void customizeGeoAnalisis(){
        geoAnalisis = new JButton("Análisis Geográfico");
        geoAnalisis.setBackground(GlobalView.BUTTONS_COLOR);
        geoAnalisis.setForeground(GlobalView.MAIN_TEXT_COLOR);
        geoAnalisis.setFont(new Font("Poppins", Font.BOLD, 13));
        this.add(geoAnalisis);
    }

    public void customizeCarAnalisis(){
        carAnalisis = new JButton("Análisis Vehicular");
        carAnalisis.setBackground(GlobalView.BUTTONS_COLOR);
        carAnalisis.setForeground(GlobalView.MAIN_TEXT_COLOR);
        carAnalisis.setFont(new Font("Poppins", Font.BOLD, 13));
        this.add(carAnalisis);
    }
}
