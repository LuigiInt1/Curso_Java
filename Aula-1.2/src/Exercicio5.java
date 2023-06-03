import javax.swing.JOptionPane;

/*Pedir para o usuário digitar o nome do animal de estimação e depois verificar se o nome do animal contém a letra "i". Mostrar o nome e se contém ou não a letra "i". */
public class Exercicio5 {
    public static void main(String[] args) {
        String animal = JOptionPane.showInputDialog(null, "Digite o nome do seu animal ");
        String i = "Seu animal ";
        if(animal.contains("i")){
            i += " possui a letra I ";
        }else{
            i += "não possui a letra I";
        }
        JOptionPane.showMessageDialog(null, i);
    }
    
}
