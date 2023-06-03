import javax.swing.JOptionPane;

public class DESAFIO {
    public static void main(String[] args) {
        String textNum1 = JOptionPane.showInputDialog(null, "Digite o primeiro número");
        String textNum2 = JOptionPane.showInputDialog(null, "Digite o segundo número");
        int num1 = Integer.parseInt(textNum1);
        int num2 = Integer.parseInt(textNum2);
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "Número 1: " + num1 + "\n" + "Número 2: " + num2 + "\nNúmero 1 é maior que o Número 2 ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Número 1: " + num1 + "\n" + "Número 2: " + num2 + "\nNúmero 2 é maior que o Número 1 ");
        };
    }
   
}
