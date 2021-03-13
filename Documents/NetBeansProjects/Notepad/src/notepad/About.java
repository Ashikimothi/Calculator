/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.Image;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
    JButton b1;
    About(){
        setBounds(600,20,700,600);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/windows.png"));
        Image i2= i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel ll = new JLabel(i3);
        ll.setBounds(40,40,400,80);
        add(ll);
        
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/notepad.png"));
        Image i5= i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6= new ImageIcon(i5);
        JLabel ll2 = new JLabel(i6);
        ll2.setBounds(50,180,70,70);
        add(ll2);
        JLabel l3= new JLabel("<html>NOTEPAD<br>Version 2021<br>Issued by Ashi, All Rights Reserved.<br> Notepad is a word processing program <br>which allows changing of text in computer file.<br> Notepad is a text editing program<br> which enables computer used to create documents.</html>"
        l3.setBounds(150,130,500,300);
        l3.setFont(new Font ("SAN SERIF",Font.PLAIN, 15));
        add(l3);
        
        
        b1= new JButton("OK");
        b1.setBounds(580,500,100,20);
        b1.addActionListener(this);
        add(b1);
    }
    public static void main(String[] args){
        new About().setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
       this.setVisible(false);
    }
}
