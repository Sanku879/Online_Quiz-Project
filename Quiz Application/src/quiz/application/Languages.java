/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;



import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Sanket
 */
public class Languages extends JFrame implements ActionListener{
    JButton Start,Start1,Start3;
    String name;
    
   
    public Languages(String name) {
        
//        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/quiz.jpg"));
       
   
               
        Image i2 = i1.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 500);
        add(image);


      
      
      
      pack();
        
        JLabel rule = new JLabel("Welcome "+ name);
        rule.setBounds(400,65,300,45);
        rule.setFont(new Font("Arial Narrow" , Font.BOLD, 35 ));
        rule.setForeground(new Color(179, 179, 255));
        image.add(rule);
        
        
        
        Start = new JButton("Java Quiz");
        Start.setBounds(130, 150, 300, 70);
        Start.setBackground(new Color(174, 226, 255));
        Start.setFont(new Font("MV Boli" , Font.BOLD, 30));
        Start.addActionListener(this);  
        image.add(Start);
        
        
        Start1 = new JButton("C++ Quiz");
        Start1.setBounds(130, 280, 300, 70);
        Start1.setBackground(new Color(174, 226, 255));
        Start1.setFont(new Font("MV Boli" , Font.BOLD, 30));
        Start1.addActionListener(this);  
        image.add(Start1);
        
//        Start2 = new JButton("C Quiz");
//        Start2.setBounds(50, 260, 350, 70);
//        Start2.setBackground(new Color(255, 255, 128));
//         Start2.setFont(new Font("MV Boli" , Font.BOLD, 30));
//
//        Start2.addActionListener(this);  
//        add(Start2);
//        
//        
         Start3 = new JButton("Python Quiz");
        Start3.setBounds(500, 150, 300, 70);
        Start3.setBackground(new Color(174, 226, 255));
        Start3.setFont(new Font("MV Boli" , Font.BOLD, 30));

        Start3.addActionListener(this);  
        image.add(Start3);
        
//        JLabel background;
        setSize(1000,500);
//        setLayout(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        ImageIcon img = new ImageIcon("C:\\Users\\DELL\\Downloads\\Project\\Quiz Application\\src\\Quiz Image\\quiz.jpg");
        
//        background = new JLabel("",img,JLabel.CENTER);
//        background.setBounds(0, 0, 1000, 500);
	setLocation(300 , 150);
//        add(background);
	setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==Start){
//          String name =tfname.getText();
           setVisible(false);
           new Java_Rules(name);
      }
      else if(e.getSource()==Start1){
          setVisible(false);
          new CPP_Rules(name);
      }
//       else if(e.getSource()==Start2){
//          setVisible(false);
//          new C_Rules(name);
//      }
       else if(e.getSource()==Start3){
          setVisible(false);
          new Python_Rules(name);
      }
    }
    
    
    public static void main(String[] args) {
        new Languages("User");
    }
        
    
    
}
