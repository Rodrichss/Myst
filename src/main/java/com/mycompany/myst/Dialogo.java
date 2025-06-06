/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myst;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author danio
 */
public class Dialogo {
    public String name = "undefined";
    public String text = "undefined";
    public Map<String, String> options;
    
    public Dialogo() {
        options = new LinkedHashMap<>();
    }
}
