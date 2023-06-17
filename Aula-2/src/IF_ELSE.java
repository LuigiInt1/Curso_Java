import javax.swing.JOptionPane;

public class IF_ELSE {
    public static void main(String[] args) {
        //idade();
        votacao();
    }
    public static void idade(){
        String idade = JOptionPane.showInputDialog(null,"Qual a Sua idade?");
        int idadeNum = Integer.parseInt(idade);
        if(idadeNum<18)
        JOptionPane.showMessageDialog(null,"Você é menor de idade"  );
        else
        JOptionPane.showMessageDialog(null,"Você é maior de idade"  );

    }
    public static void votacao(){
        String idade = JOptionPane.showInputDialog(null,"Qual a Sua idade?");
        int idadeNum = Integer.parseInt(idade);

        if(idadeNum>=18)
        JOptionPane.showMessageDialog(null,"Voto OBRIGATÓRIO");
        else if
        (idadeNum<16)
        JOptionPane.showMessageDialog(null,"Não pode votar");
        else 
        JOptionPane.showMessageDialog(null,"voto OPCIONAL");
    }
}
