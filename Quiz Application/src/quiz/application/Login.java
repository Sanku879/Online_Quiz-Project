/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

/**
 *
 * @author Sanket
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
    
    JButton Start;
    JTextField tfname;
    Login() {
		
            
		getContentPane().setBackground(new Color(10,9,27,255));
		setLayout(null);
                
                
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/A.jpg"));
                Image i2 = i1.getImage().getScaledInstance(600,500, Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
                image.setBounds(600,0,600,470);
                
		add(image);
                
       
                
                JLabel heading = new JLabel("Online Quiz Platform");
                heading.setBounds(50, 90,500, 35);
		heading.setFont(new Font("Arial Black" , Font.BOLD, 40 ));
                heading.setForeground(new Color(41,84,163,255)); 
                add(heading);
                
                
                JLabel name = new JLabel("Enter Your Name");
                name.setBounds(160, 180,300, 45);
		name.setFont(new Font("MV Boli" , Font.BOLD, 23 ));
                name.setForeground(new Color(255,73,209,255)); 
                add(name);
                
                tfname = new JTextField();
                tfname.setBounds(120, 230, 300, 25);
                tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
                
                add(tfname);
                
                Start = new JButton("Start test");
                Start.setBounds(210, 280, 120, 25);
                Start.setBackground(new Color(131,253,255,255));
                Start.addActionListener(this);
                add(Start);
		
		setSize(1200,500);
		setLocation(200 , 150);
		setVisible(true);
              
		
	}

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==Start){
          String name =tfname.getText();
           setVisible(false);
           new Languages(name);
      }
    }
    
 
  
    
	public static void main(String[] args) {
		new Login();
	}
}
