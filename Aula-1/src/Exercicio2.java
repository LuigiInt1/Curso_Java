import javax.swing.JOptionPane;

//2.	Crie um algoritmo que pegue o nome do usuário e guarde em uma variável, depois pegue a idade do usuário e guarde em outra variável. No final mostrar o nome do usuário e quantos anos ele tem.
public class Exercicio2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        String idade = JOptionPane.showInputDialog(null, "Qual a sua idade?");
        int numeroIdade = Integer.parseInt(idade);
        JOptionPane.showMessageDialog(null, "Nome: " + nome +"\n"+ "Idade: " + numeroIdade);
    };
}
