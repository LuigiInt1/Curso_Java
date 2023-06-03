import javax.swing.JOptionPane;

/*Pegar dois nomes de pessoas. Mostrar os nomes e qual deles é o maior e qual é o menor ou se são do mesmo tamanho. */
public class Exercicio2 {
    public static void main(String[] args) {
        String textnome1 = JOptionPane.showInputDialog(null, "Digite o nome número 1! ");
        int caracteres1 = textnome1.length();

        String textnome2 = JOptionPane.showInputDialog(null, "Digite o nome número 2! ");
        int caracteres2 = textnome2.length();

        if(caracteres1 > caracteres2){
            JOptionPane.showMessageDialog(null, "Nome 1: " + textnome1  + "\n"+ "Nome 2: " + textnome2 + "\n" + "O primeiro nome tem " + caracteres1 + " caracteres e o segundo tem " + caracteres2 + " caracteres, portanto, o primeiro nome é maior");
        }
        else if (caracteres2 > caracteres1){
            JOptionPane.showMessageDialog(null, "Nome 1: " + textnome1  + "\n"+ "Nome 2: " + textnome2 + "\n" + "O primeiro nome tem " + caracteres1 + " caracteres e o segundo tem " + caracteres2 + " caracteres, portanto, o primeiro nome é maior");
        }
        else{
            JOptionPane.showMessageDialog(null, "Nome 1: " + textnome1  + "\n"+ "Nome 2: " + textnome2 + "\n" + "O primeiro nome tem " + caracteres1 + " caracteres e o segundo tem " + caracteres2 + " caracteres, portanto, eles tem o mesmo número de caracteres");
        };
    }
}
