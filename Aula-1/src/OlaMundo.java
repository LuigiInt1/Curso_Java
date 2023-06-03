import javax.swing.JOptionPane;

public class OlaMundo {
    public static void main(String[] args) {
        
        //Todos os Códigos de Lógica fircaram aqui
        String anoNascimento = JOptionPane.showInputDialog(null, "Qual o ano que você NASCEU??");
        int anoNumerico = Integer.parseInt(anoNascimento);
        JOptionPane.showMessageDialog(null,  "Sua idade é " + (2023 - anoNumerico) );
        
    }
}

