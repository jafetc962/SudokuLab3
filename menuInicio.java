/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author HP
 */
public class menuInicio extends JFrame{
    
menuInicio menu;
 private JPanel panelMenu;
 private JButton Jugar;
 private JButton Salir;
 
 public menuInicio(){
     
     setTitle("Menu Inicio");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(500,300);
     setResizable(false);
     setLocationRelativeTo(null);
     
     panelMenu=new JPanel();
     panelMenu.setLayout(null);
     panelMenu.setBackground(Color.red);
     
     Jugar=new JButton("JUGAR SUDOKU");
     Jugar.setBounds(150, 50, 200, 40);
     Jugar.setBackground(Color.BLUE);
     panelMenu.add(Jugar);
     
     Salir=new JButton("SALIR");
     Salir.setBounds(150, 110, 200, 40);
     Salir.setBackground(Color.PINK);
     panelMenu.add(Salir);
     
     add(panelMenu);
     
     setVisible(true);
     
     Jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                
                
            }
        });
     
    
     Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                System.exit(0);
                
            }
        });
     
 }
 
 
 
    
}
