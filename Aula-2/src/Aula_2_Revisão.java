import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Aula_2_Revisão {
    public static void main(String[] args) {
        //HelloWord();
        //idade();
        //numeroQuebrado();
        //modeloNumeral();
        //tamanhoString();
        //upperCase();
        //lowerCase();
        //possuiPalavra();
        //substituir();

    }


    public static void HelloWord(){
        JOptionPane.showMessageDialog(null, "Olá");
        System.out.println("Seja bem vindo");
    }


    public static void idade(){
        String idade = JOptionPane.showInputDialog(null,"Qual a Sua idade?");
        int idadeNum = Integer.parseInt(idade);
        JOptionPane.showMessageDialog(null,"sua idade é " + idadeNum);
    }


    public static void numeroQuebrado(){
        String preco = JOptionPane.showInputDialog(null,"Quanto custa 1kg de arroz?");
        double precoNum = Double.parseDouble(preco);
        double valorTrintaGramas = precoNum / 30;
        JOptionPane.showMessageDialog(null,valorTrintaGramas);
    }


    public static void modeloNumeral(){
        String preco = JOptionPane.showInputDialog(null,"Quanto custa 1kg de arroz?");
        double precoNum = Double.parseDouble(preco);
        double valorTrintaGramas = precoNum / 30;
        DecimalFormat transformador = new DecimalFormat("#0.00");
        String valorFormatado = transformador.format(valorTrintaGramas);
        JOptionPane.showMessageDialog(null,valorFormatado);
    }


    public static void tamanhoString(){
        String nome = JOptionPane.showInputDialog(null,"Qual o seu nome?");
        int tamanhoNome = nome.length();
        JOptionPane.showMessageDialog(null,"seu nome tem " + tamanhoNome + " letras");
    }


    public static void upperCase(){
        String nome = JOptionPane.showInputDialog(null,"Qual o seu nome?");
        String nomeMAIUSCULO = nome.toUpperCase();
        JOptionPane.showMessageDialog(null,nomeMAIUSCULO);
    }


    public static void lowerCase(){
        String nome = JOptionPane.showInputDialog(null,"Qual o seu nome?");
        String nomeMAIUSCULO = nome.toLowerCase();
        JOptionPane.showMessageDialog(null,nomeMAIUSCULO);
    }


    public static void possuiPalavra(){
        String frase = JOptionPane.showInputDialog(null,"Digite uma frase?");
        boolean possuiTermo = frase.contains("batata");
        JOptionPane.showMessageDialog(null,possuiTermo);
    }


    public static void substituir(){
        String frase = JOptionPane.showInputDialog(null,"Digite uma frase?");
        String tirarEspaços = frase.replace(" ", "-");
        JOptionPane.showMessageDialog(null,tirarEspaços);
    }
}
