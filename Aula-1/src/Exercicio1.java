import javax.swing.JOptionPane;

//1. Declare uma variável para guardar o nome do aluno. Depois mostre a mensagem “Seja bem-vindo ” mais o nome do aluno que foi armazenado.

public class Exercicio1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome + "!");
    };
}
