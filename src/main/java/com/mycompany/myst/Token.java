/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myst;

/**
 *
 * @author Rodrigo
 */
public class Token {
    private int line;
    private int column;
    private String lexeme;
    private int tokenType;
    private Object value;

    // Tipos de token (deben coincidir con los definidos en el flex)
    public static final int CHARACTER = 1;
    public static final int ENEMY = 2;
    public static final int QUESTION = 3;
    public static final int DIALOGUE = 4;
    public static final int HP = 5;
    public static final int MP = 6;
    public static final int ATTACK = 7;
    public static final int DEFENSE = 8;
    public static final int LOOT = 9;
    public static final int REWARD = 10;
    public static final int OBJECTIVE = 11;
    public static final int SKILL = 12;
    public static final int DAMAGE = 13;
    public static final int MP_COST = 14;
    public static final int GOLD = 15;
    public static final int OPTION = 16;
    public static final int START = 17;
    public static final int END = 18;
    public static final int ARROW = 19;
    public static final int STRING = 20;
    public static final int NUMBER = 21;
    public static final int ID = 22;
    public static final int COLON = 23;
    public static final int EOF = 24;

    public Token(int tokenType, String lexeme, int line, int column) {
        this.tokenType = tokenType;
        this.lexeme = lexeme;
        this.line = line;
        this.column = column;
        this.value = null;
    }

    public Token(int tokenType, String lexeme, Object value, int line, int column) {
        this(tokenType, lexeme, line, column);
        this.value = value;
    }

    // Getters y Setters
    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getLexeme() {
        return lexeme;
    }

    public void setLexeme(String lexeme) {
        this.lexeme = lexeme;
    }

    public int getTokenType() {
        return tokenType;
    }

    public void setTokenType(int tokenType) {
        this.tokenType = tokenType;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Token{" +
                "line=" + line +
                ", column=" + column +
                ", lexeme='" + lexeme + '\'' +
                ", tokenType=" + tokenType +
                ", value=" + value +
                '}';
    }
}