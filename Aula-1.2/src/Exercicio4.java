import javax.swing.JOptionPane;

/*Pedir para o usuário digitar 1 número, mostrar se é par ou ímpar e se é positivo ou negativo */
public class Exercicio4 {
    public static void main(String[] args) {
        String textNum1 = JOptionPane.showInputDialog(null, "Digite um número! ");
        int intNum1 = Integer.parseInt(textNum1);
        double resto = intNum1 %2;
        String resposta = "O número " + textNum1+ " é\n";
        if(resto == 0){
            resposta += "par e";
        }
        else{
            resposta += "impar e";
        }
        if(intNum1 > 0){
            resposta += " positivo";
        }
        else{
            resposta += " negativo";
        }
        JOptionPane.showMessageDialog(null, resposta);
    }
}
