/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myst;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author danio
 */
public class VistaCompleta extends JFrame {

    private JPanel panelContenedor;

    public VistaCompleta() {
        setTitle("Visualizador de Personajes y Enemigos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        panelContenedor = new JPanel();
        panelContenedor.setLayout(new BoxLayout(panelContenedor, BoxLayout.Y_AXIS)); // Para que los paneles se apilen verticalmente
        JScrollPane scrollPane = new JScrollPane(panelContenedor);

        add(scrollPane, BorderLayout.CENTER);
        setSize(400, 600); // o lo que prefieras
    }

    public JPanel getPanelContenedor() {
        return panelContenedor;
    }
}
