import javax.swing.JOptionPane;

/*9.	Pegue do usuário um número qualquer e mostre a tabuada desse número do 1 ao 10. Exemplo se o usuário digitar 5:
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
.
.
.
5 X 10 = 50
 */
public class Exercicio9 {
    public static void main(String[] args) {
        String textNum = JOptionPane.showInputDialog(null, "Digite um número para saber sua tabuada");
        int intNum = Integer.parseInt(textNum);
        textNum = ("Tabuada do " + textNum + ":\n");
        int x = 10;
        int tabuada [] = new int [x];
        for(int i = 0; i<x; i++)
        {
            tabuada[i] = (intNum * (i + 1));
            textNum += i + 1 + " X" + intNum + " = " + tabuada[i] + "\n" ;
        }
        JOptionPane.showMessageDialog(null, textNum );
    }
}
