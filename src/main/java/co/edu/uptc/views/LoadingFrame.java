package co.edu.uptc.views;

import javax.swing.*;

import co.edu.uptc.utilities.PropertiesService;

import java.awt.geom.*;
import java.awt.*;
import java.io.*;

public class LoadingFrame extends JWindow{
    PropertiesService ps = new PropertiesService();
    private JPanel panel;
    private JLabel mainMessage;
    private JLabel loadingMessage;

    public LoadingFrame(){
        customizePanel();
        customizeWindow();
        customizeMainMessage();
        customizeLoadingMessage();
    }

    public void customizePanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(GlobalView.MAIN_BACKGROUND_COLOR);
        this.add(panel);
    }



    public void customizeWindow(){
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setBackground(GlobalView.MAIN_BACKGROUND_COLOR);
        Shape roundedShape = new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), 30, 30);
        this.setShape(roundedShape);
        this.setBackground(new Color(0,0,0,0));
    }

    public void makeVisible(){
        this.setVisible(true);
    } 

    public void makeInvisible(){
        this.setVisible(false);
    }

    public void customizeMainMessage(){
        mainMessage = new JLabel("<html><div style='text-align: center;'>Datos Estadounidenses de<br> Vehículos Eléctricos</div><html>", SwingConstants.CENTER);
        try {
            mainMessage.setFont(Font.createFont(Font.TRUETYPE_FONT, new File(ps.getKeyValue("MainFont"))).deriveFont(47));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        mainMessage.setForeground(GlobalView.MAIN_TEXT_COLOR);
        mainMessage.setBounds(61, 177, 677, 142);
        panel.add(mainMessage);
    }

    public void customizeLoadingMessage(){
        loadingMessage = new JLabel("Cargando Información...", SwingConstants.CENTER);
        try {
            loadingMessage.setFont(Font.createFont(Font.TRUETYPE_FONT, new File(ps.getKeyValue("MainFont"))));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        loadingMessage.setForeground(GlobalView.SECONDARY_TEXT_COLOR);
        loadingMessage.setBounds(158, 345, 484, 60);
        panel.add(loadingMessage);
    }
}
