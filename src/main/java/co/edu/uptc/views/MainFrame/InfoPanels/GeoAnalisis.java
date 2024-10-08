package co.edu.uptc.views.MainFrame.InfoPanels;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.uptc.utilities.ListToObjectParser;
import co.edu.uptc.utilities.PropertiesService;
import co.edu.uptc.views.GlobalView;
import co.edu.uptc.views.VehicleManagerView;

public class GeoAnalisis extends JPanel{

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel infoPanel;
    private CardLayout infoCardLayout;
    private VehicleManagerView view;

    PropertiesService ps = new PropertiesService();

    public GeoAnalisis(VehicleManagerView view){
        this.view = view;
        try {
            customizeInfoPanel();
            customizeButton1();
            customizeButton2();
            customizeButton3();
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public void customizeButton1() throws FontFormatException, IOException{
        button1 = new JButton("Registros por Estado");
        button1.setForeground(GlobalView.MAIN_TEXT_COLOR);
        button1.setBackground(GlobalView.BUTTONS_COLOR);
        button1.setBounds(47, 35, 182, 58);
        button1.setFont(Font.createFont(Font.TRUETYPE_FONT, new File(ps.getKeyValue("SecondaryFont"))).deriveFont(13f));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPanel1();
            }
        });
        button1.setFocusable(false);
        this.add(button1);
    }

    public void customizeButton2() throws FontFormatException, IOException{
        button2 = new JButton("Registros por Condado");
        button2.setForeground(GlobalView.MAIN_TEXT_COLOR);
        button2.setBackground(GlobalView.BUTTONS_COLOR_2);
        button2.setBounds(243, 35, 183, 58);
        button2.setFont(Font.createFont(Font.TRUETYPE_FONT, new File(ps.getKeyValue("SecondaryFont"))).deriveFont(13f));
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPanel2();
            }
        });
        button2.setFocusable(false);
        this.add(button2);
    }

    public void customizeButton3() throws FontFormatException, IOException{
        button3 = new JButton("Ciudad con más registros");
        button3.setForeground(GlobalView.MAIN_TEXT_COLOR);
        button3.setBackground(GlobalView.BUTTONS_COLOR);
        button3.setBounds(440, 35, 227, 58);
        button3.setFont(Font.createFont(Font.TRUETYPE_FONT, new File(ps.getKeyValue("SecondaryFont"))).deriveFont(13f));
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPanel3();
            }
        });
        button3.setFocusable(false);
        this.add(button3);
    }

    public void customizeInfoPanel(){
        infoCardLayout = new CardLayout();
        infoPanel = new JPanel(infoCardLayout);
        infoPanel.setBounds (21, 100, 809, 650);

        JPanel panel1 = new InfoTable(new String[]{"Estado", "Numero de registros"}, ListToObjectParser.parseState(view.askState()));
        JPanel panel2 = new InfoTable(new String[]{"Estado", "Condado", "Numero de registros"}, ListToObjectParser.parseCounty(view.askCounty()));
        JPanel panel3 = new InfoTable(new String[]{"Ciudad", "Numero de registros"}, ListToObjectParser.parseCity(view.askCity()));

        infoPanel.add(panel1, "Panel1");
        infoPanel.add(panel2, "Panel2");
        infoPanel.add(panel3, "Panel3");
        
        this.add(infoPanel);
    }

    public void showPanel1(){
        infoCardLayout.show(infoPanel, "Panel1");
    }

    public void showPanel2(){
        infoCardLayout.show(infoPanel, "Panel2");
    }

    public void showPanel3(){
        infoCardLayout.show(infoPanel, "Panel3");
    }
}
