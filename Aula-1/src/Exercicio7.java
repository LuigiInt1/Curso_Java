import javax.swing.JOptionPane;

/*7.	A gráfica Gambiarra está precisando de um sistema que calcule o valor a pagar para os freelances. Os freelances recebem por milheiros trabalhado. Cada milheiro trabalhado é pago a R$ 169.90. Pegar como entrada no sistema quantos milheiro foram feitos e mostrar na saída o total de milheiros e quantos deve ser pago no total bruto. Mostrar também desconto de 9% de imposto e o total líquido. Exemplo:
Milheiro(s) 15
Total a pagar R$: 2548.50
Imposto R$: 229. 36
Total líquido R$: 2319.14
 */
public class Exercicio7 {
    public static void main(String[] args) {
        double  uniMilheiro = 169.90;
        String textMilheiro = JOptionPane.showInputDialog(null, "Quantos milheiros foram feito?");
        int numMilheiro = Integer.parseInt(textMilheiro);
        double total = (numMilheiro * uniMilheiro);
        double imposto = (total * 0.09);
        double liquido = (total - imposto);
        JOptionPane.showMessageDialog(null, "Milheiros: " + numMilheiro + "\n" + "total a pagar: " + total + "\n" + "Imposto : " + imposto +  "\n" + "Total líquido: " + liquido );
    }
}
