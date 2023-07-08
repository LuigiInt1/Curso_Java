package Molde;


public class ExercicioUmPessoa {
    /*Exercício 1:
    Crie uma classe chamada Pessoa com os seguintes atributos privados:

    nome (String)
    idade (int)
    email (String)
    Crie os métodos getters e setters para cada um dos atributos e um construtor padrão que inicialize os valores com dados padrões.
 */
    private String nome;
    private int idade;
    private String email;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public ExercicioUmPessoa(String nome, int idade, String email)
    {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    

    
}
