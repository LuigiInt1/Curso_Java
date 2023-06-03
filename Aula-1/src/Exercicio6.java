import javax.swing.JOptionPane;

/*6.	Maria dos Bugs trabalha como desenvolvedora de sistema e precisa saber quanto ela deve pagar de imposto de renda. Vamos supor que o desconto em porcentagem seja de 15%. Faça um algoritmo que peça para digitar o salário de Maria. Na saída mostre o valor do salário, o valor do desconto e o salário líquido. (Salário menos o desconto).
Exemplo:
Salário Bruto R$: 5500.00
Desconto R$: 825.00
Salário Líquido R$: 4650.00
 */
public class Exercicio6 {
    public static void main(String[] args) {
        String textSalario = JOptionPane.showInputDialog(null, "Digite o saláro de Maria");
        int numSalario = Integer.parseInt(textSalario);
        double desconto = (numSalario * 0.15);
        double liquido = (numSalario - desconto);
        JOptionPane.showMessageDialog(null, "Salário bruto: " + numSalario + "\n" + "desconto: " + desconto + "\n" + "Salário líquido: " + liquido );
    }
}
