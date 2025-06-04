package com.mycompany.myst;

import java.io.*;
import java.util.ArrayList;

%%
%public
%class Lexer
%function next_token

digito = [0-9]
letra = [a-zA-Z]

%type Token
%eofval{
    return new Token(constantes.EOF, null, -1, -1, null);
%eofval}

%%

<YYINITIAL>"character"     { return new Token(constantes.CHARACTER, yytext(), yyline, yycolumn, "personaje"); }
<YYINITIAL>"enemy"         { return new Token(constantes.ENEMY, yytext(), yyline, yycolumn, "enemigo"); }
<YYINITIAL>"quest"      { return new Token(constantes.QUEST, yytext(), yyline, yycolumn, "mision"); }
<YYINITIAL>"dialogue"      { return new Token(constantes.DIALOGUE, yytext(), yyline, yycolumn, "dialogo"); }
<YYINITIAL>"hp"            { return new Token(constantes.HP, yytext(), yyline, yycolumn, "puntos de salud"); }
<YYINITIAL>"mp"            { return new Token(constantes.MP, yytext(), yyline, yycolumn, "puntos de magia"); }
<YYINITIAL>"attack"        { return new Token(constantes.ATTACK, yytext(), yyline, yycolumn, "ataque"); }
<YYINITIAL>"defense"       { return new Token(constantes.DEFENSE, yytext(), yyline, yycolumn, "defensa"); }
<YYINITIAL>"loot"          { return new Token(constantes.LOOT, yytext(), yyline, yycolumn, "botín"); }
<YYINITIAL>"reward"        { return new Token(constantes.REWARD, yytext(), yyline, yycolumn, "recompensa"); }
<YYINITIAL>"goal"          { return new Token(constantes.GOAL, yytext(), yyline, yycolumn, "objetivo"); }
<YYINITIAL>"skill"         { return new Token(constantes.SKILL, yytext(), yyline, yycolumn, "habilidad"); }
<YYINITIAL>"damage"        { return new Token(constantes.DAMAGE, yytext(), yyline, yycolumn, "daño"); }
<YYINITIAL>"mp_cost"       { return new Token(constantes.MP_COST, yytext(), yyline, yycolumn, "costo de puntos de magia"); }
<YYINITIAL>"gold"          { return new Token(constantes.GOLD, yytext(), yyline, yycolumn, "oro"); }
<YYINITIAL>"option"        { return new Token(constantes.OPTION, yytext(), yyline, yycolumn, "opcion"); }
<YYINITIAL>"text"          { return new Token(constantes.TEXT, yytext(), yyline, yycolumn, "texto"); }
<YYINITIAL>"start"         { return new Token(constantes.START, yytext(), yyline, yycolumn, "inicio"); }
<YYINITIAL>"end"           { return new Token(constantes.END, yytext(), yyline, yycolumn, "fin"); }
<YYINITIAL>"->"            { return new Token(constantes.ARROW, yytext(), yyline, yycolumn, "->"); }
<YYINITIAL>":"             { return new Token(constantes.COLON, yytext(), yyline, yycolumn, ":"); }
<YYINITIAL>"{"             { return new Token(constantes.LLO, yytext(), yyline, yycolumn, "{"); }
<YYINITIAL>"}"             { return new Token(constantes.LLC, yytext(), yyline, yycolumn, "}"); }
<YYINITIAL>\"[^\"]*\"      { return new Token(constantes.STRING, yytext(), yyline, yycolumn, "cadena de texto"); }
<YYINITIAL>{digito}({digito})*          { return new Token(constantes.NUMBER, yytext(), yyline, yycolumn, "numero"); }
<YYINITIAL>{letra}({letra}|{digito})* { return new Token(constantes.ID, yytext(), yyline, yycolumn, "id"); }
[ \t\r\f]     { yycolumn++; }
\n              { yyline++; yycolumn = 1; }
.               { System.err.println("warning: Unrecognized character '" + yytext()+"' -- ignored" + " at : "+ (yyline+1) + " " + (yycolumn+1) + " " + yychar); }

