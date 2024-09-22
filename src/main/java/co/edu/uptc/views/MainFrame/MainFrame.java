package co.edu.uptc.views.MainFrame;

import java.awt.CardLayout;

import javax.swing.*;
import co.edu.uptc.views.GlobalView;

public class MainFrame extends JFrame{
    
    private Aside aside;
    private Body body;
    private CardLayout bodyCardLayout;

    public MainFrame(){
        customizeFrame();
        customizeAside();
        customizeBody();
    }

    public void makeVisible(){
        this.setVisible(true);
    } 

    public void customizeFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("E-Vehicle DATA");
        this.setLayout(null);
        this.setSize(1193, 763);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(GlobalView.INFO_BACKGROUND);
    }

    public void customizeAside(){
        aside = new Aside();
        this.add(aside);
    }

    public void customizeBody(){
        bodyCardLayout = new CardLayout();
        body = new Body(bodyCardLayout);
        this.add(body);
    }
}
