/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.event_management_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author salai
 */
public class Dashboard extends JFrame {
    Dashboard() {
        super("Event MANAGEMENT SYSTEM");
    setBounds(300,300,1366,768);
        
        
        ImageIcon i1 = new ImageIcon("C:/Users/salai/OneDrive/Documents/NetBeansProjects/event_management_system/src/main/java/com/mycompany/event_management_system/images/salai.jpg");
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel eventManagementSystem = new JLabel("Light Up Events Welcomes You");
	eventManagementSystem.setForeground(Color.WHITE);
        eventManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
	eventManagementSystem.setBounds(200, 100, 1000, 85);
	NewLabel.add(eventManagementSystem);
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
        
        
        JMenu jm1 = new JMenu("Reception");
        jm1.setForeground(Color.BLACK);
	menuBar.add(jm1);
        
        JMenuItem a1 = new JMenuItem("Admin");
	jm1.add(a1);
        
        
        
        JMenuItem a2 = new JMenuItem("Add hotels");
	jm1.add(a2);
        a2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    String s[] = new String[]{"id","name","hotelimage","price","capacity","facilites","description"}; 
                    setVisible(false);
                    new addtodb(s,"venue").setVisible(true);
                }catch(Exception e ){}
            }
	});
        JMenuItem a3 = new JMenuItem("Add Photographer");
	jm1.add(a3);
        a3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    String s[] = new String[]{"id","name","contact_id","price","duration"}; 
                    setVisible(false);
                    new addtodb(s,"photographer").setVisible(true);
                    
                }catch(Exception e ){}
            }
	});
        JMenuItem a4 = new JMenuItem("Add Caterer");
	jm1.add(a4);
        a4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    String s[] = new String[]{"id","Caterer","Menu","Budget/Plate"}; 
                    setVisible(false);
                    new addtodb(s,"caterer").setVisible(true);
                    
                }catch(Exception e ){}
            }
	});
        
        JMenuItem b2 = new JMenuItem("Back");
	b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    setVisible(false);
                    new Event_Management_System().setVisible(true);
                
                
                }catch(Exception e ){}
                
    }
        }
        );
	
	jm1.add(b2);
        
        
        
        JMenu jm2 = new JMenu("Event MANAGEMENT");
        jm2.setForeground(Color.BLACK);
	menuBar.add(jm2);
        
        JMenuItem venue = new JMenuItem("Venue");
	jm2.add(venue);
        venue.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new viewdetails("venue").setVisible(true);
                }catch(Exception e ){}
            }
	});
        JMenuItem photographer = new JMenuItem("photographer");
	jm2.add(photographer);
        photographer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new viewdetails("photographer").setVisible(true);
                }catch(Exception e ){}
            }
	});
        JMenuItem caterer = new JMenuItem("Caterer");
	jm2.add(caterer);
        caterer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new viewdetails("caterer").setVisible(true);
                }catch(Exception e ){}
            }
	});
		
        setLayout(null);
        
        
        setVisible(true);
        
        
}
    public static void main(String args[]){
        Dashboard d = new Dashboard();
        
    }
    
}