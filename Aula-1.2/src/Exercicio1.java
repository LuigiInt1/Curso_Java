import javax.swing.JOptionPane;

/*Pedir para o usuário digitar o nome da rua e depois mostrar o nome da rua e quantos caracteres existe no nome e se a quantidade de letras do nome da rua é maior ou menor de 15 caracteres.
Exemplo: Rua Antonieta de Barros tem 23 caracteres
                 Tem mais que 15 caracteres. 
 */
public class Exercicio1 {
    public static void main(String[] args) {
        String textRua = JOptionPane.showInputDialog(null, "Digite o nome da sua rua! ");
        int caracteres = textRua.length();
       
        if(caracteres > 15){
            JOptionPane.showMessageDialog(null, "A rua " + textRua  + " tem " + caracteres + " caracteres e tem mais que 15 caracteres! ");
        }
        else{
            JOptionPane.showMessageDialog(null, "A rua " + textRua  + " tem " + caracteres + " caracteres e tem menos que 15 caracteres! ");
        };
    }
}
