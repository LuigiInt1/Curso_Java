package Avaliação.Criar;

import javax.swing.JOptionPane;

import Avaliação.Modelo.contaBancaria;

public class contaBancariaCriar {
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria();
        int j = 0;
        for( int i = 0; i != 5; i= j){
           String opcaoString = JOptionPane.showInputDialog("Qual opção você deseja?" + "\n" + "(1)Cadastrar conta" + "\n" + "(2)Realizar deposito" + "\n" + "(3)Realizar saque" + "\n" + "(4)Consultar saldo" + "\n" + "(5)Sair" );
           int opcaoInt = Integer.parseInt(opcaoString);

           if(opcaoInt == 1){
            conta.opcaoUm();
           }

           else if(opcaoInt == 2){
            conta.opcaoDois();
           }

           else if(opcaoInt == 3){
            conta.opcaoTres();
           }

           else if(opcaoInt == 4){
            conta.opcaoQuatro();
           }

           else if (opcaoInt == 5){
            conta.opcaoCinco();
            j = 5;
           }

           else{
            JOptionPane.showMessageDialog(null, "Opção invalida. Digite novamente");

           }
        }
    }
}
