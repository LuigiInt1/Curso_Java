package Revisao;
import java.lang.annotation.Retention;

public class Caneta {
String modelo;
String cor;
double ponta;
boolean tampada;
void tampar(){
    this.tampada = true;
}
void destampar(){
    this.tampada = false;
} 
String retornarModelo(){
    return this.modelo;
}
}
