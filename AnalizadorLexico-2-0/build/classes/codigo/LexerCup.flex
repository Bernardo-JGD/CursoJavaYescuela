package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
TextoString=[\"]([^\"\n]|(\\\"))*[\"]+
  
espacio=[ \t\r\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
int {return new Symbol(sym.Int, yychar, yyline, yytext());}
if {return new Symbol (sym.If, yychar, yyline, yytext());}
else {return new Symbol (sym.Else, yychar, yyline, yytext());}
for {return new Symbol (sym.For, yychar, yyline, yytext());}
return {return new Symbol (sym.Return, yychar, yyline, yytext());}
case {return new Symbol (sym.Case, yychar, yyline, yytext());}
main {return new Symbol (sym.Main, yychar, yyline, yytext());}
class {return new Symbol (sym.Class, yychar, yyline, yytext());}
switch {return new Symbol (sym.Switch, yychar, yyline, yytext());}
console {return new Symbol (sym.Console, yychar, yyline, yytext());}
function {return new Symbol (sym.Function, yychar, yyline, yytext());}
const {return new Symbol (sym.Const, yychar, yyline, yytext());}
get {return new Symbol (sym.Get, yychar, yyline, yytext());}
set {return new Symbol (sym.Set, yychar, yyline, yytext());}
new {return new Symbol (sym.New, yychar, yyline, yytext());}
continue {return new Symbol (sym.Continue, yychar, yyline, yytext());}
in {return new Symbol (sym.In, yychar, yyline, yytext());}
try {return new Symbol (sym.Try, yychar, yyline, yytext());}
document {return new Symbol (sym.Document, yychar, yyline, yytext());}
do {return new Symbol (sym.Do, yychar, yyline, yytext());}
while {return new Symbol (sym.While, yychar, yyline, yytext());}
delete {return new Symbol (sym.Delete, yychar, yyline, yytext());}
this {return new Symbol (sym.This, yychar, yyline, yytext());}
default {return new Symbol (sym.Default, yychar, yyline, yytext());}
with {return new Symbol (sym.With, yychar, yyline, yytext());}
String {return new Symbol (sym.String, yychar, yyline, yytext());}
char {return new Symbol (sym.Char, yychar, yyline, yytext());}
byte {return new Symbol (sym.Byte, yychar, yyline, yytext());}
short {return new Symbol (sym.Short, yychar, yyline, yytext());}
double {return new Symbol (sym.Double, yychar, yyline, yytext());}
float {return new Symbol (sym.Float, yychar, yyline, yytext());}
long {return new Symbol (sym.Long, yychar, yyline, yytext());}
boolean {return new Symbol (sym.Boolean, yychar, yyline, yytext());}
final {return new Symbol (sym.Final, yychar, yyline, yytext());}
true {return new Symbol (sym.True, yychar, yyline, yytext());}
false {return new Symbol (sym.False, yychar, yyline, yytext());}
null {return new Symbol (sym.Null, yychar, yyline, yytext());}
public {return new Symbol (sym.Public, yychar, yyline, yytext());}
protected {return new Symbol (sym.Protected, yychar, yyline, yytext());}
private {return new Symbol (sym.Private, yychar, yyline, yytext());}
System {return new Symbol (sym.SYstem, yychar, yyline, yytext());}
println {return new Symbol (sym.Println, yychar, yyline, yytext());}
print {return new Symbol (sym.Print, yychar, yyline, yytext());}
out {return new Symbol (sym.Out, yychar, yyline, yytext());}
void {return new Symbol (sym.Void, yychar, yyline, yytext());}
import {return new Symbol (sym.Import, yychar, yyline, yytext());}
Scanner {return new Symbol (sym.SCanner, yychar, yyline, yytext());}
package {return new Symbol (sym.Package, yychar, yyline, yytext());}
static {return new Symbol (sym.Static, yychar, yyline, yytext());}
super {return new Symbol (sym.Super, yychar, yyline, yytext());}
instanceof {return new Symbol (sym.InstanceOf, yychar, yyline, yytext());}
nextInt {return new Symbol (sym.NextInt, yychar, yyline, yytext());}
nextDouble {return new Symbol (sym.NextDouble, yychar, yyline, yytext());}
nextFloat {return new Symbol (sym.NextFloat, yychar, yyline, yytext());}
nextByte {return new Symbol (sym.NextByte, yychar, yyline, yytext());}
nextLong {return new Symbol (sym.NextLong, yychar, yyline, yytext());}
next {return new Symbol (sym.Next, yychar, yyline, yytext());}
break {return new Symbol (sym.Break, yychar, yyline, yytext());}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"/" [^] ~"*/" {/*Ignore*/}
"=" {return new Symbol (sym.Igual, yychar, yyline, yytext());}
"+" {return new Symbol (sym.Suma, yychar, yyline, yytext());}
"-" {return new Symbol (sym.Resta, yychar, yyline, yytext());}
"*" {return new Symbol (sym.Multiplicacion, yychar, yyline, yytext());}
"/" {return new Symbol (sym.Division, yychar, yyline, yytext());}
"++" {return new Symbol (sym.Incremento, yychar, yyline, yytext());}
"--" {return new Symbol (sym.Decremento, yychar, yyline, yytext());}
"%" {return new Symbol (sym.Residuo, yychar, yyline, yytext());}
"<" {return new Symbol (sym.Menor_que, yychar, yyline, yytext());}
">" {return new Symbol (sym.Mayor_que, yychar, yyline, yytext());}
"==" {return new Symbol (sym.Igual_que, yychar, yyline, yytext());}
"!=" {return new Symbol (sym.Distinto_que, yychar, yyline, yytext());}
"<=" {return new Symbol (sym.Menor_o_igual, yychar, yyline, yytext());}
">=" {return new Symbol (sym.Mayor_o_igual, yychar, yyline, yytext());}
"+=" {return new Symbol (sym.Suma_combinada, yychar, yyline, yytext());}
"-=" {return new Symbol (sym.Resta_combinada, yychar, yyline, yytext());}
"*=" {return new Symbol (sym.Producto_combinado, yychar, yyline, yytext());}
"/=" {return new Symbol (sym.Division_combinada, yychar, yyline, yytext());}
"%=" {return new Symbol (sym.Residuo_combinado, yychar, yyline, yytext());}
"!" {return new Symbol (sym.Negacion, yychar, yyline, yytext());}
"|" {return new Symbol (sym.NOT, yychar, yyline, yytext());}
"||" {return new Symbol (sym.OR, yychar, yyline, yytext());}
"&&" {return new Symbol (sym.AND, yychar, yyline, yytext());}
"(" {return new Symbol (sym.Parentesis_a, yychar, yyline, yytext());}
")" {return new Symbol (sym.Parentesis_c, yychar, yyline, yytext());}
"{" {return new Symbol (sym.Llave_a, yychar, yyline, yytext());}
"}" {return new Symbol (sym.Llave_c, yychar, yyline, yytext());}
"[" {return new Symbol (sym.Corchete_a, yychar, yyline, yytext());}
"]" {return new Symbol (sym.Corchete_c, yychar, yyline, yytext());}
";" {return new Symbol (sym.P_coma, yychar, yyline, yytext());}
":" {return new Symbol (sym.Dos_puntos, yychar, yyline, yytext());}
"\"" {return new Symbol (sym.Comillas, yychar, yyline, yytext());}
"\'" {return new Symbol (sym.Comilla, yychar, yyline, yytext());}
"."  {return new Symbol (sym.Punto, yychar, yyline, yytext());}
","  {return new Symbol (sym.Coma, yychar, yyline, yytext());}
{L}({L}|{D})* {return new Symbol (sym.Identificador, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol (sym.Numero, yychar, yyline, yytext());}
{TextoString} {return new Symbol (sym.TS, yychar, yyline, yytext());}
 . {return new Symbol (sym.ERROR, yychar, yyline, yytext());}

