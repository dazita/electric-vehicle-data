package co.edu.uptc.views.MainFrame.InfoPanels;

import java.awt.BorderLayout;
import java.awt.ScrollPane;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import co.edu.uptc.utilities.SimpleList;

public class InfoTable extends JPanel{

    private JScrollPane scroll;
    private JTable table;
    
    public InfoTable(String[] columns, Object[][] list){
        customizeInfoTable();
        customizeTable(columns, list);
        scroll = new JScrollPane(table);
        this.add(scroll, BorderLayout.CENTER);
    }

    public void customizeInfoTable(){
        this.setLayout(new BorderLayout());
    }

    public void customizeTable(String[] columns, Object[][] list){
        table = new JTable(list, columns);
    }
}
