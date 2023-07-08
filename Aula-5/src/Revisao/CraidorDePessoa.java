package Revisao;
public class CraidorDePessoa {
    public static void main(String[] args) {
        Batata pessoa1 = new Batata();
        pessoa1.laNome("Luigi");
        pessoa1.laIdade(19);
        String nomeDaPessoa = pessoa1.reNome();
        int idadeDaPessoa = pessoa1.reIdade();
        System.out.println(nomeDaPessoa);
        System.out.println(idadeDaPessoa);
        
    }
}
