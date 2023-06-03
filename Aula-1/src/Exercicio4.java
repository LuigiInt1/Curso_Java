import javax.swing.JOptionPane;

//4.	Crie um algoritmo que pegue do usuário um número qualquer e mostre como saída o número digitado, seu dobro e os três próximos números referente ao número digitado.

public class Exercicio4 {
    public static void main(String[] args) {
        String numString = JOptionPane.showInputDialog(null, "Digite um número");
        int numInt = Integer.parseInt(numString);
        JOptionPane.showMessageDialog(null, "O numero que você digitou é: " + numInt + "\n" + "O dobro é: " + (numInt * 2) + "\n" + "Seus 3 próximos números serão: " + (numInt + 1) + ", " + (numInt + 2) + ", " + (numInt + 3) );
    }
}
