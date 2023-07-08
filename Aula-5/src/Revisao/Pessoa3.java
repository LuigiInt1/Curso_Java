package Revisao;
public class Pessoa3 {
    private String nome;
    private int idade;
    private String cpf;
    private String cidade;


   /* ------------------NOME------------------ */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

/* ------------------IDADE------------------ */
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

/* ------------------CPF------------------ */
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

/* ------------------CIDADE------------------ */
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


/* ------------------CONSTRUTOR------------------ */
    public Pessoa3(String nome, int idade, String cpf, String cidade)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cidade = cidade;
    }
    /* ------------------MOSTRA VALORES INSERIDOS------------------ */
    void mostrarStatus(){
        System.out.println(nome+ "\n" + idade+ "\n" + cpf+ "\n" + cidade+ "\n" );
    }


}
