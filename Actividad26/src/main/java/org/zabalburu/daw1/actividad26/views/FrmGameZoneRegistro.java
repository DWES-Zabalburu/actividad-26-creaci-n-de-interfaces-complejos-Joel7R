/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad26.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class FrmGameZoneRegistro extends JFrame {
    
    private Dimension dmVentana = new Dimension(520, 490);
        
    private JLabel lblTitulo = new JLabel("GAME ZONE");
    
    private JLabel lblTag = new JLabel("GAMETAG");
    private JTextField txtTag = new JTextField();
    private JLabel lblMail = new JLabel("EMAIL");
    private JTextField txtMail = new JTextField();
    private JLabel lblContraseña = new JLabel("PASSWORD");
    private JPasswordField pwdContraseña = new JPasswordField();
    
    private JButton btnRegistrar = new JButton("REGISTRARSE");
    private JButton btnCancelar = new JButton("CANCELAR");
        
    private JPanel pnlCentro = new JPanel(new GridLayout(0,1));
    private JPanel pnlSur = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    private final Color COLOR_VERDE = new Color(0, 255,170);  
    private final Color COLOR_ROJO = new Color(255, 67, 67);
    private final Color COLOR_GRIS_OSCURO = new Color(24,24,36);  
    private final Color COLOR_GRIS = new Color(44,44,64); 
    private final Color COLOR_BLANCO = new Color(255, 255, 255);
    private final Font FUENTE_TITULO = new Font("Impact", Font.PLAIN, 32);
    private final Font FUENTE = new Font("Impact", Font.PLAIN, 18);
    
    public FrmGameZoneRegistro() {
        this.setTitle("GameZone - Registro");
        this.setSize(dmVentana);
        
        lblTitulo.setBackground(COLOR_GRIS);
        lblTitulo.setOpaque(true);
        lblTitulo.setFont(FUENTE_TITULO);
        lblTitulo.setForeground(COLOR_VERDE);
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblTitulo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, COLOR_VERDE));
        this.add(lblTitulo, BorderLayout.NORTH);
        
        lblTag.setFont(FUENTE);
        lblTag.setForeground(COLOR_VERDE);
        pnlCentro.add(lblTag);
        txtTag.setForeground(COLOR_BLANCO);
        txtTag.setBackground(COLOR_GRIS);
        txtTag.setBorder(BorderFactory.createMatteBorder(1, 2, 1, 1, COLOR_VERDE));
        pnlCentro.add(txtTag);
        lblMail.setFont(FUENTE);
        lblMail.setForeground(COLOR_VERDE);
        pnlCentro.add(lblMail);
        txtMail.setForeground(COLOR_BLANCO);
        txtMail.setBackground(COLOR_GRIS);
        txtMail.setBorder(BorderFactory.createMatteBorder(1, 2, 1, 1, COLOR_VERDE));
        pnlCentro.add(txtMail);
        lblContraseña.setFont(FUENTE);
        lblContraseña.setForeground(COLOR_VERDE);
        pnlCentro.add(lblContraseña);
        pwdContraseña.setForeground(COLOR_BLANCO);
        pwdContraseña.setBackground(COLOR_GRIS);
        pwdContraseña.setBorder(BorderFactory.createMatteBorder(1, 2, 1, 1, COLOR_VERDE));
        pnlCentro.add(pwdContraseña);
        pnlCentro.setBackground(COLOR_GRIS_OSCURO);
        pnlCentro.setBorder(BorderFactory.createEmptyBorder(10, 30, 20, 30));
        this.add(pnlCentro, BorderLayout.CENTER);
        
        btnRegistrar.setBackground(COLOR_VERDE);
        btnCancelar.setBackground(COLOR_ROJO);
        pnlSur.add(btnRegistrar);
        pnlSur.add(btnCancelar);
        pnlSur.setBackground(COLOR_GRIS_OSCURO);
        pnlSur.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        this.add(pnlSur, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
