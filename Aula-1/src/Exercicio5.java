import javax.swing.JOptionPane;

/*5.	Crie um algoritmo para fazer um pedido na padaria do Zé da padaria. O sistema deverá perguntar quantos pães e quantos pacotes de leite. Sabendo que cada pãozinho custa R$ 0,20 e cada pacote de leite custa R$ 5.50. Como saída mostrar por exemplo:
Pão 5  unidades
Leite 2 unidades
Total R$: 12.00*/

public class Exercicio5 {
    public static void main(String[] args) {
        double valorPao = 0.20;
        double valorLeite = 5.50;
        String textPaes = JOptionPane.showInputDialog(null, "Bom dia!!! SEJA BEM VINDO!" + "\n" + "Quantos pães você vai querer?");
        int numPaes = Integer.parseInt(textPaes);
        String textLeite = JOptionPane.showInputDialog(null, "Quantas caixas de leite você vai querer?");
        int numLeite = Integer.parseInt(textLeite);
        double valorTotal = (numLeite * valorLeite) + (numPaes * valorPao);
        JOptionPane.showMessageDialog(null, "Pães - " + numPaes + " unidade(s)" +  "\n" + "Caixa de leite - " + numLeite +  " unidade(s)" + "\n" + "Valor total: R$ " + valorTotal );
    }
}
