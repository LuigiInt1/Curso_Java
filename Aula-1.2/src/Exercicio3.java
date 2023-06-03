import javax.swing.JOptionPane;

/*Pedir 2 números aleatórios para o usuário e mostrar qual é o maior e qual é o menor ou se são iguais. */

public class Exercicio3 {
    public static void main(String[] args) {
        String textNum1 = JOptionPane.showInputDialog(null, "Digite o número 1! ");
        int intNum1 = Integer.parseInt(textNum1);

        String textNum2 = JOptionPane.showInputDialog(null, "Digite o nome número 2! ");
        int intNum2 = Integer.parseInt(textNum2);

        if(intNum1 > intNum2){
            JOptionPane.showMessageDialog(null, "O numero 1 é maior que o número dois!");
        }
        else if (intNum2 > intNum1){
            JOptionPane.showMessageDialog(null, "O numero 2 é maior que o número dois!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Eles são iguais");
        };
    }
}
