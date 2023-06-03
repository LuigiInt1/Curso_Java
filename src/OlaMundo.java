import javax.swing.JOptionPane;

public class OlaMundo {
    public static void main(String[] args) {
        //Todos os Códigos de Lógica fircaram aqui
        //JOptionPane.showMessageDialog(null, "Ola Mundo", null, 0);
        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        JOptionPane.showMessageDialog(null,  "Seu nome é " + nome );
        
    }
}

