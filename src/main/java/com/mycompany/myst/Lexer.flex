import java_cup.runtime.*;

%%

%class Lexer
%unicode
%cup
%line
%column

%{
    private Token token(int type) {
        return new Token(type, yytext(), yyline + 1, yycolumn + 1);
    }
    
    private Token token(int type, Object value) {
        return new Token(type, yytext(), value, yyline + 1, yycolumn + 1);
    }
%}

%%

"character"     { return token(Token.CHARACTER); }
"enemy"         { return token(Token.ENEMY); }
"question"      { return token(Token.QUESTION); }
"dialogue"      { return token(Token.DIALOGUE); }
"hp"            { return token(Token.HP); }
"mp"            { return token(Token.MP); }
"attack"        { return token(Token.ATTACK); }
"defense"       { return token(Token.DEFENSE); }
"loot"          { return token(Token.LOOT); }
"reward"        { return token(Token.REWARD); }
"objective"     { return token(Token.OBJECTIVE); }
"skill"         { return token(Token.SKILL); }
"damage"        { return token(Token.DAMAGE); }
"mp.cost"       { return token(Token.MP_COST); }
"gold"          { return token(Token.GOLD); }
"option"        { return token(Token.OPTION); }
"start"         { return token(Token.START); }
"end"           { return token(Token.END); }
"->"            { return token(Token.ARROW); }
":"             { return token(Token.COLON); }
\"[^\"]*\"      { return token(Token.STRING, yytext().substring(1, yytext().length()-1)); }
[0-9]+          { return token(Token.NUMBER, Integer.parseInt(yytext())); }
[a-zA-Z][a-zA-Z0-9_]* { return token(Token.ID, yytext()); }
[ \t\r\n\f]     { /* Ignorar espacios en blanco */ }
.               { System.err.println("Carácter ilegal: '" + yytext() + "'"); }
