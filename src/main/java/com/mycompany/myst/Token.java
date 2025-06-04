/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myst;

/**
 *
 * @author danio
 */

public class Token {
    private int line;
    private int column;
    private String lexeme;
    private String ER;
    //private Object value;

    // Tipos de token (deben coincidir con los definidos en el flex)
    private constantes tokenType;

    public Token(constantes tokenType, String lexeme, int line, int column, String ER) {
        this.tokenType = tokenType;
        this.lexeme = lexeme;
        this.line = line;
        this.column = column;
        this.ER = ER;
    }
    
    public Token(){
        
    }

    // Getters y Setters
    public void setTokenType(constantes tokenType) {
		this.tokenType= tokenType;
    }

    public constantes getTokenType() {
            return this.tokenType;
    }

    public String getLexeme() {
            return this.lexeme;
    }

    public void setLexeme(String lexema) {
            this.lexeme = lexema;
    }

    public String getER() {
            return this.ER;
    }

    public void setER(String ER) {
            this.ER = ER;
    }

    public int getLine() {
            return this.line;
    }

    public void setLine(int line) {
            this.line= line;
    }

    public int getColumn() {
            return this.column;
    }

    public void setColumn(int column) {
            this.column = column;
    }

    /*@Override
    public String toString() {
        return "Token{" +
                "line=" + line +
                ", column=" + column +
                ", lexeme='" + lexeme + '\'' +
                ", tokenType=" + tokenType +
                ", value=" + value +
                '}';
    }*/
}