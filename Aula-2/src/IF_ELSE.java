import javax.swing.JOptionPane;

public class IF_ELSE {
    public static void main(String[] args) {
        //idade();
        //votacao();
        //ParOuImpar();
        //condicional_E();
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


    public static void ParOuImpar(){

        String numero = JOptionPane.showInputDialog(null,"Digite um valor");
        int numeroNum = Integer.parseInt(numero);
        int resto = numeroNum % 2;
        if(resto == 0)
        JOptionPane.showMessageDialog(null,"O número que você digitou é par");
        else
        JOptionPane.showMessageDialog(null,"O número que você digitou é impar");
    }
     
    
    public static void condicional_E(){
        String usuario = "Luigi";
        String senha = "bla";
        String digitarUsuario = JOptionPane.showInputDialog(null,"Qual seu nome de usuário?");
        String digitarSenha = JOptionPane.showInputDialog(null,"Digite sua senha");
        if(usuario.equals(digitarUsuario) && senha.equals(digitarSenha) )
        JOptionPane.showMessageDialog(null,"Login efetuado");
        else
        JOptionPane.showMessageDialog(null,"Senha ou Cadatro incorretos");
        

     }
    


}
