/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.myst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

/**
 *
 * @author danio
 */
public class Myst {

    /**
     * @param args the command line arguments
     */
    /*public static void main( String[] args ) throws IOException
    {
        System.out.println( "----- Ejemplo 1 -----" );
        String entrada = "character -> option attack mp 12 : damage { } \"esto es un texto\"";
        Reader sr = new StringReader(entrada);
        Lexer lx = new Lexer(sr);
        
        Token tk = lx.next_token();
        while(tk.getLexeme()!=null) {
        	System.out.println("Tipo: " + tk.getTokenType() + "| Expresión: " + tk.getER());
        	tk = lx.next_token();
        }
        System.out.println( "----- Fin ejemplo 1 -----" );

    }*/
    
    public static void main(String[] args) throws IOException {
        System.out.println("----- Ejemplo 1 -----");
        System.out.println("Escribe la entrada y presiona Enter:");

        // Lee desde la entrada estándar (teclado)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada = br.readLine();

        Reader sr = new StringReader(entrada);
        Lexer lx = new Lexer(sr);

        Token tk = lx.next_token();
        while (tk.getLexeme() != null) {
            System.out.println("Tipo: " + tk.getTokenType() + " | Expresión: " + tk.getER());
            tk = lx.next_token();
        }

        System.out.println("----- Fin ejemplo 1 -----");
    }
    
}
