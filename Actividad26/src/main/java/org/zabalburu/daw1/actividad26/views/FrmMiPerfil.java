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
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class FrmMiPerfil extends JFrame {
    
    private Dimension dmVentana = new Dimension(520, 490);
        
    private JLabel lblTitulo = new JLabel("Actualizar Perfil");
    
    private JLabel lblNombre = new JLabel("Nombre Completo");
    private JTextField txtNombre = new JTextField();
    private JLabel lblCorreo = new JLabel("Correo Electronico");
    private JTextField txtCorreo = new JTextField();
    private JLabel lblTelefono = new JLabel("Telefono");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblDireccion = new JLabel("Dirección");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblWeb = new JLabel("Sitio Web");
    private JTextField txtWeb = new JTextField();
    
    private JButton btnEnviar = new JButton("Guardar Cambios");
    private JButton btnCancelar = new JButton("Cancelar");
        
    private JPanel pnlCentro = new JPanel(new GridLayout(0,1));
    private JPanel pnlSur = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    private final Color COLOR_AZUL = new Color(0, 120, 191);
    private final Color COLOR_GRIS = new Color(159, 163, 165);
    private final Color COLOR_BLANCO = new Color(255, 255, 255);
    //private final Font FUENTE = new Font("Calibri", Font.PLAIN, 22);
    
    public FrmMiPerfil() {
        this.setTitle("Mi Perfil");
        this.setSize(dmVentana);
        
        lblTitulo.setBackground(COLOR_AZUL);
        lblTitulo.setOpaque(true);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setForeground(COLOR_BLANCO);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(lblTitulo, BorderLayout.NORTH);
        
        pnlCentro.add(lblNombre);
        txtNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_AZUL));
        pnlCentro.add(txtNombre);
        pnlCentro.add(lblCorreo);
        txtCorreo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, COLOR_AZUL));
        pnlCentro.add(txtCorreo);
        pnlCentro.add(lblTelefono);
        txtTelefono.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_AZUL));
        pnlCentro.add(txtTelefono);
        pnlCentro.add(lblDireccion);
        txtDireccion.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, COLOR_AZUL));
        pnlCentro.add(txtDireccion);
        pnlCentro.add(lblWeb);
        txtWeb.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_AZUL));
        pnlCentro.add(txtWeb);
        pnlCentro.setBackground(new Color(250, 250, 250));
        pnlCentro.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        this.add(pnlCentro, BorderLayout.CENTER);
        
        btnCancelar.setBackground(COLOR_GRIS);
        btnCancelar.setForeground(COLOR_BLANCO);
        btnEnviar.setBackground(COLOR_AZUL);
        btnEnviar.setForeground(COLOR_BLANCO);
        pnlSur.add(btnCancelar);
        pnlSur.add(btnEnviar);
        pnlSur.setBackground(new Color(250, 250, 250));
        this.add(pnlSur, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
