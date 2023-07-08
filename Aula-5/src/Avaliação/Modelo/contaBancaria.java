package Avaliação.Modelo;

import java.util.function.DoubleBinaryOperator;

import javax.swing.JOptionPane;

public class contaBancaria {
        /*-----CRIANDO ATRIBUTOS------*/
    private String conta;
    private String titular;
    private double saldo;

        /*-------CONTA-------*/
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {

        this.conta = conta;
    }

        /*-------TITULAR-------*/
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

       
    /*-------SALDO-------*/
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*-------CONSTRUCTOR-------*/
    public contaBancaria(){}

    public contaBancaria(String conta, String titular, double saldo) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    /*MÉTODO PARA DEPOSITAR DINHEIRO*/
    public void depositar(Double deposito){
        if(conta != null   ){
            if(deposito > 0){
                this.saldo += deposito;
            }
            else
            System.out.println("Deposito invalido");
            
        }
        else 
        System.out.println("Voce não possui conta");
        
    }

    /*MÉTODO PARA SACAR DINHEIRO*/
    public void sacar (Double saque){
        if(conta != null){
            if(this.saldo >= saque && this.saldo !=0){

                this.saldo -= saque;
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Voce não possui conta");
        }
        
        
    }

    public void opcaoUm(){
        String contaString = JOptionPane.showInputDialog("Digite o numero de sua conta");
        setConta(contaString);
        System.out.println(contaString);
    }

    public void opcaoDois(){
        if(conta != null){
            String depositoString = JOptionPane.showInputDialog("Digite o valor de depósito");
            double depositoInt = Double.parseDouble(depositoString);
            depositar(depositoInt);
        }
        else
        System.out.println("Voce não possui conta");
    }

    public void opcaoTres(){
        if(conta != null){
        String saqueString = JOptionPane.showInputDialog("Digite o valor do saque");
        double saqueInt = Double.parseDouble(saqueString);
        sacar(saqueInt);
        }
        else
        System.out.println("Voce não possui conta");
    }

    public void opcaoQuatro(){
        if(conta != null){
       JOptionPane.showMessageDialog(null, "Seu saldo é de: " + saldo);
        }

       else
        System.out.println("Voce não possui conta");
    }

    public void opcaoCinco(){
        JOptionPane.showMessageDialog(null, "Tenha um ótimo dia!");

        
    }

    
}
