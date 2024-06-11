/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Sanket
 */
public class Java_Quiz extends JFrame implements ActionListener{
    
    String question[][] = new String[10][5];
    String answers[][] = new String[10][2];

    JLabel qno,questions;
    JRadioButton opt1,opt2,opt3,opt4;
    public static int timer = 60;
    public static int ans_given = 0;
    ButtonGroup groupoptions;
    String useranswer[][]= new String[10][1];
    public static int count = 0;
    JButton next,submit;
    public static int score=0;
    String name;
    
    public Java_Quiz(String name) {
        this.name=name;
        setBounds(50, 0, 1440, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/One.jpg"));
       
   
               
        Image i2 = i1.getImage().getScaledInstance(1440, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1440, 800);
        add(image);
                
        qno = new JLabel("");
        qno.setBounds(170, 220, 50, 40);
        qno.setFont(new Font("Tahoma", Font.PLAIN,28));
        image.add(qno);
        
        questions = new JLabel("");
        questions.setBounds(200, 220, 1000, 40);
        questions.setFont(new Font("Tahoma", Font.PLAIN,28));
        image.add(questions);

        question[0][0]="Which component is used to compile, debug and execute the java programs?";
        question[0][1]="JRE";
        question[0][2]="JIT";
        question[0][3]="JDK";
        question[0][4]="JVM";
        
        question[1][0]="Which one of the following is not a Java feature?";
        question[1][1]="Object-oriented";
        question[1][2]="Use of pointers";
        question[1][3]="Portable";
        question[1][4]="Dynamic and Extensible";
        
        question[2][0]="What is the extension of java code files?";
        question[2][1]=".js";
        question[2][2]=".txt";
        question[2][3]=".class";
        question[2][4]=".java";
        
        question[3][0]="Which of the following is not an OOPS concept in Java?";
        question[3][1]="Polymorphism";
        question[3][2]="Inheritance";
        question[3][3]="Compilation";
        question[3][4]="Encapsulation";
        
        
        question[4][0]="What is not the use of “this” keyword in Java?";
        question[4][1]="Referring to the instance variable when a local variable has the same name";
        question[4][2]="Passing itself to the method of the same class";
        question[4][3]="Passing itself to another method";
        question[4][4]="Calling another constructor in constructor chaining";
        
        question[5][0]="Which of the following is a type of polymorphism in Java Programming?";
        question[5][1]="Multiple polymorphism";
        question[5][2]="Compile time polymorphism";
        question[5][3]="Multilevel polymorphism";
        question[5][4]="Execution time polymorphism";
        
        question[6][0]="Which exception is thrown when java is out of memory?";
        question[6][1]="MemoryError";
        question[6][2]="OutOfMemoryError";
        question[6][3]="MemoryOutOfBoundsException";
        question[6][4]="MemoryFullException";
        
        question[7][0]="Which of these keywords is used to define interfaces in Java?";
        question[7][1]="intf";
        question[7][2]="Intf";
        question[7][3]="interface";
        question[7][4]="Interface";
        
        question[8][0]="Which of the following is a superclass of every class in Java?";
        question[8][1]="ArrayList";
        question[8][2]="Abstract class";
        question[8][3]="Object class";
        question[8][4]="String";
        
        question[9][0]=" Which one of the following is not an access modifier?";
        question[9][1]="Protected";
        question[9][2]="Void";
        question[9][3]="Public";
        question[9][4]="Private";
        
        
        
        answers[0][1]="JDK";
        answers[1][1]="Use of pointers";
        answers[2][1]=".java";
        answers[3][1]="Compilation";
        answers[4][1]="Passing itself to the method of the same class";
        answers[5][1]="Compile time polymorphism"; 
        answers[6][1]="OutOfMemoryError";  
        answers[7][1]="interface";
        answers[8][1]="Object class";
        answers[9][1]="Void";
        
        
        opt1 = new JRadioButton();
        opt1.setBounds(180, 470, 470, 30);
        opt1.setBackground(new Color(0,8,47,255));
        opt1.setForeground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,24));
        image.add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(850, 470, 470, 30);
        opt2.setBackground(new Color(0,8,47,255));
        opt2.setForeground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,24));
        image.add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(180, 615, 470, 30);
        opt3.setBackground(new Color(0,8,47,255));
        opt3.setForeground(Color.WHITE);
        opt3.setFont(new Font("Dialog",Font.PLAIN,24));
        image.add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(850, 615, 470, 30);
        opt4.setBackground(new Color(0,8,47,255));
        opt4.setFont(new Font("Dialog",Font.PLAIN,24));
        opt4.setForeground(Color.WHITE);
        image.add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        
        next = new JButton("Next");
        next.setBounds(200, 700, 200, 40);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        image.add(next);
        
        submit = new JButton("Submit");
        submit.setBounds(800, 700, 200, 40);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        image.add(submit);
        
       
        
        start(count);
        
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           if(e.getSource()==next){
               repaint();
               
               ans_given=1;
               
                if(groupoptions.getSelection()==null){
               useranswer[count][count]="";
           }else{
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
               
           }
                
           if(count==8){
               next.setEnabled(false);
               submit.setEnabled(true);
                     
           }
               count++;
               start(count);
           }
           else if(e.getSource()==submit){
               ans_given=1;
                 if(groupoptions.getSelection()==null){
               useranswer[count][count]="";
           }else{
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
               
           }
                  
                  for(int i =0;i<useranswer.length;i++){
                      if(useranswer[i][0].equals(answers[i][1])){
                          score+=1;
                      }
                      else{
                          score+=0;
                      }
                  }
                  
                  setVisible(false);
                  new Java_Score(score);
               
           }
    }
    
    
    
    public void paint(Graphics g){
        super.paint(g);
        
        String time ="Time left "+ timer + " seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,20));
        
        if(timer>0){
            g.drawString(time, 1100, 150);
        } else{
            g.drawString("Times up!!", 1100, 150);
        }
        
        timer--;
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given==1){
            ans_given=0;
            timer = 60;
        }
        else if(timer<0){
            timer=60;
           
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){
                  if(groupoptions.getSelection()==null){
               useranswer[count][count]="";
           }else{
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
               
           }
                  
                  for(int i =0;i<useranswer.length;i++){
                      if(useranswer[i][0].equals(answers[i][1])){
                          score+=1;
                      }
                      else{
                          score+=0;
                      }
                  }
                  
                  setVisible(false);
                  new Java_Score(score);
            }else{
                if(groupoptions.getSelection()==null){
               useranswer[count][count]="";
           }else{
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
               
           }
           count++;
           start(count);
            }
            
           
        }
        
    }
    
    public void start(int count){
        qno.setText(""+ (count + 1) +". ");
        questions.setText(question[count][0]);
        opt1.setText(question[count][1]);
        opt1.setActionCommand(question[count][1]);
        opt2.setText(question[count][2]);
        opt2.setActionCommand(question[count][2]);
        opt3.setText(question[count][3]);
        opt3.setActionCommand(question[count][3]);
        opt4.setText(question[count][4]);
        opt4.setActionCommand(question[count][4]);
        
        groupoptions.clearSelection();
        
    }
    
    
    
    public static void main(String[] args) {
        new  Java_Quiz("User");
    }
    
}
