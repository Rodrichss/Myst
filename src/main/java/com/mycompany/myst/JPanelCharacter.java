/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myst;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author danio
 */
public class JPanelCharacter extends JPanel {
    public JPanelCharacter(Personaje p) {
        setLayout(new GridLayout(0, 1));
        add(new JLabel("Name: " + p.name));
        add(new JLabel("HP: " + p.hp));
        add(new JLabel("MP: " + p.mp));
        add(new JLabel("Ataque: " + p.attack));
        add(new JLabel("Defensa: " + p.defense));
        add(new JLabel("Habilidad: " + p.skill));
        add(new JLabel("Daño de habilidad: " + p.damage));
        add(new JLabel("Costo de habilidad: " + p.mp_cost));
        add(new JLabel("Oro: " + p.gold));
        add(new JLabel("Botín: " + p.loot));
    }
    
}
