package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r\n]+
%{
    public String lexeme;
%}
%%
int {lexeme=yytext(); return Int;}
if {lexeme=yytext(); return If;}
else {lexeme=yytext(); return Else;}
for {lexeme=yytext(); return For;}
return {lexeme=yytext(); return Return;}
case {lexeme=yytext(); return Case;}
main {lexeme=yytext(); return Main;}
class {lexeme=yytext(); return Class;}
switch {lexeme=yytext(); return Switch;}
console {lexeme=yytext(); return Console;}
function {lexeme=yytext(); return Function;}
const {lexeme=yytext(); return Const;}
get {lexeme=yytext(); return Get;}
set {lexeme=yytext(); return Set;}
new {lexeme=yytext(); return New;}
continue {lexeme=yytext(); return Continue;}
in {lexeme=yytext(); return In;}
try {lexeme=yytext(); return Try;}
document {lexeme=yytext(); return Document;}
do {lexeme=yytext(); return Do;}
while {lexeme=yytext(); return While;}
delete {lexeme=yytext(); return Delete;}
this {lexeme=yytext(); return This;}
default {lexeme=yytext(); return Default;}
with {lexeme=yytext(); return With;}
String {lexeme=yytext(); return String;}
char {lexeme=yytext(); return Char;}
byte {lexeme=yytext(); return Byte;}
short {lexeme=yytext(); return Short;}
double {lexeme=yytext(); return Double;}
float {lexeme=yytext(); return Float;}
long {lexeme=yytext(); return Long;}
boolean {lexeme=yytext(); return Boolean;}
final {lexeme=yytext(); return Final;}
true {lexeme=yytext(); return True;}
false {lexeme=yytext(); return False;}
null {lexeme=yytext(); return Null;}
public {lexeme=yytext(); return Public;}
protected {lexeme=yytext(); return Protected;}
private {lexeme=yytext(); return Private;}
System {lexeme=yytext(); return SYstem;}
println {lexeme=yytext(); return Println;}
print {lexeme=yytext(); return Print;}
out {lexeme=yytext(); return Out;}
void {lexeme=yytext(); return Void;}
import {lexeme=yytext(); return Import;}
Scanner {lexeme=yytext(); return SCanner;}
package {lexeme=yytext(); return Package;}
static {lexeme=yytext(); return Static;}
super {lexeme=yytext(); return Super;}
instanceof {lexeme=yytext(); return InstanceOf;}
nextInt {lexeme=yytext(); return NextInt;}
nextDouble {lexeme=yytext(); return NextDouble;}
nextFloat {lexeme=yytext(); return NextFloat;}
nextByte {lexeme=yytext(); return NextByte;}
nextLong {lexeme=yytext(); return NextLong;}
next {lexeme=yytext(); return Next;}
break {lexeme=yytext(); return Break;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {lexeme=yytext(); return Igual;}
"+" {lexeme=yytext(); return Suma;}
"-" {lexeme=yytext(); return Resta;}
"*" {lexeme=yytext(); return Multiplicacion;}
"/" {lexeme=yytext(); return Division;}
"++" {lexeme=yytext(); return Incremento;}
"--" {lexeme=yytext(); return Decremento;}
"%" {lexeme=yytext(); return Residuo;}
"<" {lexeme=yytext(); return Menor_que;}
">" {lexeme=yytext(); return Mayor_que;}
"==" {lexeme=yytext(); return Igual_que;}
"!=" {lexeme=yytext(); return Distinto_que;}
"<=" {lexeme=yytext(); return Menor_o_igual;}
">=" {lexeme=yytext(); return Mayor_o_igual;}
"+=" {lexeme=yytext(); return Suma_combinada;}
"-=" {lexeme=yytext(); return Resta_combinada;}
"*=" {lexeme=yytext(); return Producto_combinado;}
"/=" {lexeme=yytext(); return Division_combinada;}
"%=" {lexeme=yytext(); return Residuo_combinado;}
"!" {lexeme=yytext(); return Negacion;}
"|" {lexeme=yytext(); return NOT;}
"||" {lexeme=yytext(); return OR;}
"&&" {lexeme=yytext(); return AND;}
"(" {lexeme=yytext(); return Parentesis_a;}
")" {lexeme=yytext(); return Parentesis_c;}
"{" {lexeme=yytext(); return Llave_a;}
"}" {lexeme=yytext(); return Llave_c;}
"[" {lexeme=yytext(); return Corchete_a;}
"]" {lexeme=yytext(); return Corchete_c;}
";" {lexeme=yytext(); return P_coma;}
":" {lexeme=yytext(); return Dos_puntos;}
"\"" {lexeme=yytext(); return Comillas;}
"\'" {lexeme=yytext(); return Comilla;}
"."  {lexeme=yytext(); return Punto;}
","  {lexeme=yytext(); return Coma;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}

