import javax.swing.JOptionPane;

public class MetodosString {
    public static void main(String[] args) {
        String nomeDaRua = JOptionPane.showInputDialog(null, "Digite o nome da sua Rua");
        int qntdCaracter = nomeDaRua.length();

        if(qntdCaracter > 15){
            JOptionPane.showMessageDialog(null, "A rua " + nomeDaRua + " tem " + qntdCaracter + " caracteres e tem mais que 15 caracteres");
        }else{
            JOptionPane.showMessageDialog(null, "A rua " + nomeDaRua + " tem " + qntdCaracter + " caracteres e tem menos que 15 caracteres");
        }
    }
}
