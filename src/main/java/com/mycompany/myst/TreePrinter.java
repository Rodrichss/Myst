/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myst;

/**
 *
 * @author danio
 */
public class TreePrinter {
    private static int indent = 0;
    
    public static void print(String msg) {
        for(int i = 0; i < indent; i++)
            System.out.print(" ");
        System.out.println(msg);
    }
    
    public static void enter(String msg) {
        print(msg + "{");
        indent++;
    }
    
    public static void exit() {
        indent--;
        print("}");
    }
}
