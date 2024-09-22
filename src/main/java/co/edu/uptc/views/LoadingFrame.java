package co.edu.uptc.views;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import co.edu.uptc.utilities.PropertiesService;

import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
import java.awt.*;

public class LoadingFrame extends JWindow{
    private PropertiesService p;
    private JPanel panel;
    private JLabel mainMessage;
    private JLabel loadingMessage;

    public LoadingFrame(){
        p = new PropertiesService();
        customizePanel();
        customizeWindow();
        try {
            customizeMainMessage();
            customizeLoadingMessage();
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
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
    }

    public void makeVisible(){
        this.setVisible(true);
    } 

    public void makeInvisible(){
        this.setVisible(false);
    }

    public void customizeMainMessage() throws FontFormatException, IOException{
        mainMessage = new JLabel("<html><div style='text-align: center;'>Datos Estadounidenses de<br> Vehículos Eléctricos</div><html>", SwingConstants.CENTER);
        Font mainFont = Font.createFont(Font.TRUETYPE_FONT, new File(p.getKeyValue(("MainFont")))).deriveFont(47f);
        mainMessage.setFont(mainFont);
        mainMessage.setForeground(GlobalView.MAIN_TEXT_COLOR);
        mainMessage.setBounds(61, 177, 677, 142);
        panel.add(mainMessage);
    }
    
    public void customizeLoadingMessage() throws FontFormatException, IOException{
        loadingMessage = new JLabel("Cargando Información...", SwingConstants.LEFT);
        Font mainFont = Font.createFont(Font.TRUETYPE_FONT, new File(p.getKeyValue(("MainFont")))).deriveFont(47f);
        loadingMessage.setFont(mainFont);
        loadingMessage.setForeground(GlobalView.SECONDARY_TEXT_COLOR);
        loadingMessage.setBounds(158, 345, 484, 60);
        loadingMessage.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(loadingMessage);
    }
}
