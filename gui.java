import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class gui extends JFrame implements ActionListener {
	
	JFrame f;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	
	gui(){
		
		f = new JFrame();		
		
		l1 = new JLabel("full name.");
		l1.setBounds(100,50,200,30);
		t1 = new JTextField();
		t1.setBounds(100,90,200,30);
		
		l2 = new JLabel("Roll No.");
		l2.setBounds(100,130,200,30);
		t2 = new JTextField();
		t2.setBounds(100,170,200,30);
		
		l3 = new JLabel("Total Marks");
		l3.setBounds(100,210,200,30);
		t3 = new JTextField();
		t3.setBounds(100,250,200,30);
		
		l4 = new JLabel("Max Marks");
		l4.setBounds(100,310,200,30);
		t4 = new JTextField();
		t4.setBounds(100,350,200,30);

		b1 = new JButton("Submit");
		b1.setBounds(100,390,100,30);
		b2 = new JButton("Cancel");
		b2.setBounds(210,390,100,30);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(b1);
		f.add(b2);
		
		f.setSize(800,600);
		f.setBackground(Color.WHITE);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("Assignment 3");
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == b1) {
		try {
		if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() ||
		t4.getText().isEmpty()) {
		JOptionPane.showMessageDialog(f, "Please fill in all fields", "Error", 0);
		} else {
		String s1 = "Name= " + t1.getText();
		String s2 = "Dept= " + t2.getText();
		String s3 = "Marks= " + t3.getText();
		String s4 = "Max Marks= " + t4.getText();
		
		int n1 = Integer.parseInt(t3.getText());
		int n2 = Integer.parseInt(t4.getText());
		double sum = n1 + n2 ;
		double avg = sum / 4;
		String per = "Percentage= " + String.valueOf(avg);
		String newmessage = s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n"; 
		String s = "Swing_Example";
		f.dispose();
		JOptionPane.showMessageDialog(f, newmessage, s,
		JOptionPane.INFORMATION_MESSAGE);}
		} catch (Exception e1) {
		JOptionPane.showMessageDialog(f, " Enter marks correctly", "Error",0);
		}
		} else if (obj == b2) {
		f.setVisible(false); 
		}
		
	}
	
	public static void main(String[] args) {
		
		new gui();
	}


}

//package com.manish;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//public class Class3 extends JFrame implements ActionListener {
//JLabel l1,l2,l3,l4,l5, l6, l7,l8;
//JFrame f;
//JTextField tf1,tf2, tf3, tf4, tf5, tf6, tf7,tf8;
//JButton b2, b1;
//Class3(){
//f= new JFrame();
//l1= new JLabel("Name.:");
//l1.setBounds(50, 20, 50, 20);
//tf1 = new JTextField();
//tf1.setBounds(50, 40, 150, 20);
//l2= new JLabel("Dept Name. :");
//l2.setBounds(50, 70, 50, 20);
//tf2 = new JTextField();
//tf2.setBounds(50, 90, 150, 20);
//l3= new JLabel("Roll No :");
//l3.setBounds(50, 120, 80, 20);
//tf3 = new JTextField();
//tf3.setBounds(50, 140, 150, 20);
//l4= new JLabel("Class :");
//l4.setBounds(50, 170, 80, 20);
//tf4 =new JTextField();
//tf4.setBounds(50, 190, 150, 20);
//l5= new JLabel("AJP Marks :");
//l5.setBounds(50, 220, 80, 20);
//tf5 =new JTextField();
//
//tf5.setBounds(50, 240, 150, 20);
//l6= new JLabel("PDC Marks :");
//l6.setBounds(50, 280, 80, 20);
//tf6 =new JTextField();
//tf6.setBounds(50, 300, 150, 20);
//l7= new JLabel("CN Marks :");
//l7.setBounds(50, 370, 80, 20);
//tf7 =new JTextField();
//tf7.setBounds(50, 400, 150, 20);
//l8= new JLabel("PM Marks :");
//l8.setBounds(50, 330, 80, 20);
// tf8 =new JTextField();
// tf8.setBounds(50, 350, 150, 20);
//b1 = new JButton("submit");
//b1.setBounds(50, 430, 100, 50);
//b2 = new JButton("cancel");
//b2.setBounds(200,430,100,50);
//b1.addActionListener(this);
//b2.addActionListener(this);
//f.add(tf1);
//f.add(tf2);
//f.add(tf3);
//f.add(tf4);
//f.add(tf5);
//f.add(tf6);
//f.add(tf7);
//f.add(tf8);
//f.add(b1);
//f.add(b2);
//f.add(l1);
//f.add(l2);
//f.add(l3);
//f.add(l4);
//f.add(l5);
//f.add(l6);
//f.add(l7);
//f.add(l8);
//
//f.setSize(500,500);
//f.setLayout(null);
//f.setVisible(true);
//f.setTitle("32341_Manish_Student-Marks");
//}
//@Override
//public void actionPerformed(ActionEvent e) {
//Object obj = e.getSource();
//if (obj == b1) {
//try {
//if (tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty() ||
//tf4.getText().isEmpty() || tf5.getText().isEmpty() || tf6.getText().isEmpty() ||
//tf7.getText().isEmpty() || tf8.getText().isEmpty()) {
//JOptionPane.showMessageDialog(f, "Please fill in all fields", "Error", 0);
//} else {
//String s1 = "Name= " + tf1.getText();
//String s2 = "Dept= " + tf2.getText();
//String s3 = "Roll No= " + tf3.getText();
//String s4 = "Class= " + tf4.getText();
//String i1 = tf5.getText();
//String i2 = tf6.getText();
//String i3 = tf7.getText();
//String i4 = tf8.getText();
//int n1 = Integer.parseInt(i1);
//int n2 = Integer.parseInt(i2);
//int n3 = Integer.parseInt(i3);
//int n4 = Integer.parseInt(i4);
//double sum = n1 + n2 + n3 + n4;
//double avg = sum / 4;
//String per = "Percentage= " + String.valueOf(avg);
//String newmessage = s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + "AJP = "
//+ i1 + "\n" + "PDC = " + i2 + "\n" + "CN = " + i3 + "\n" + "PM = "
//+ i4 + "\n" + per;
//String s = "Swing_Example";
//f.dispose();
//JOptionPane.showMessageDialog(f, newmessage, s,
//JOptionPane.INFORMATION_MESSAGE);}
//} catch (Exception e1) {
//JOptionPane.showMessageDialog(f, " Enter marks correctly", "Error",0);
//}
//} else if (obj == b2) {
//f.setVisible(false); }
//}
//public static void main(String[] args) {
//new Class3();
//}
//}
//