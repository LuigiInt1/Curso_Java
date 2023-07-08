package Revisao;
public class Batata{ 
    private String nome;
    private int idade;

    //Métoo setter 
    public void laNome(String nome){
        this.nome = nome;
    }
    public void laIdade(int idade){
        this.idade = idade;
    }

    //Método getter = retornam um informação privada
    public String reNome(){
        return this.nome;
    }
    public int reIdade(){
        return this.idade;
    }
}
