/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author user
 */
public class GreetingsGUI extends JFrame{
         private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingAreaPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    //labels
    private  JLabel headingLbl;
    private  JLabel nameLbl;
    private  JLabel surnameLbl;
    
    //textfields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //textArea
    private JTextArea greetingsTxtArea;
    
    //buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    /**
     *
     */
    public  GreetingsGUI() {
         setLayout(new BorderLayout());
       setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700, 750);
        setBackground(Color.yellow);
        
        //create thr panels
       namePnl = new JPanel(new FlowLayout());
       surnamePnl = new JPanel(new FlowLayout());
       nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
       
       greetingAreaPnl = new JPanel(new FlowLayout());
       greetingAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings"));
       
       btnPnl = new JPanel(new FlowLayout());
       mainPnl = new JPanel(new FlowLayout());
       
       headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
       headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
       
       
       //create labals for name and surname
       nameLbl = new JLabel("Name :");
       surnameLbl = new JLabel("Surname :");
       headingLbl = new JLabel("Greetings App");
       
       //create textfields name and surname
       nameTxtFld = new JTextField(20);
       surnameTxtFld = new JTextField(20);
       
       //create textArea 
       greetingsTxtArea = new JTextArea(20, 50);
       greetingsTxtArea.setEditable(false);
       greetingsTxtArea.setText("Hello[name] [surname]");
       
       //creating buttons
       clearBtn = new JButton("Clear");
       exitBtn = new JButton("Exit");
       greetBtn = new JButton("Greet");
       
       //add heading
       headingPnl.add(headingLbl);
       
       //adding name to the JPanel
       namePnl.add(nameLbl);
       namePnl.add(nameTxtFld);
       
       //adding surname to the jpanel
       surnamePnl.add(surnameLbl);
       surnamePnl.add(surnameTxtFld);
       
       //adding to the textArea
       greetingAreaPnl.add(greetingsTxtArea);
       
        //add name and surname 
       nameAndSurnamePnl.add(namePnl);
       nameAndSurnamePnl.add(surnamePnl);
       
       //adding buttons 
       btnPnl.add(greetBtn);
       btnPnl.add(clearBtn);
       btnPnl.add(exitBtn);
       
       //main adding
      
       mainPnl.add(nameAndSurnamePnl,BorderLayout.NORTH);
       mainPnl.add(greetingAreaPnl,BorderLayout.CENTER);
       mainPnl.add(btnPnl,BorderLayout.SOUTH);
       
       //adding on JFrame
        add(headingPnl,BorderLayout.NORTH);
        add(mainPnl,BorderLayout.CENTER);
       
        setVisible(true);
    }
}
