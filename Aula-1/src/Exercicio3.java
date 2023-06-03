import javax.swing.JOptionPane;

//3.	Crie um algoritmo que pegue o nome do usuário e guarde em uma variável, depois pegue o ano em que o usuário nasceu e guarde em outra variável. No final mostrar o nome do usuário e quantos anos ele tem aproximadamente. Pode haver erro de um ano devido ao mês.

public class Exercicio3 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        String anoNascimento = JOptionPane.showInputDialog(null, "Qual o ano de seu nascimento?");
        int numAnoNascimento = Integer.parseInt(anoNascimento );
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Idade: " + (2023 - numAnoNascimento ));
    }
}
