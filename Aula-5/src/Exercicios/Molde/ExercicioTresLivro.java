package Molde;
public class ExercicioTresLivro {
    /*Exercício 3:
Crie uma classe chamada Livro com os seguintes atributos privados:

titulo (String)
autor (String)
anoPublicacao (int)
Crie os métodos getters e setters para cada um dos atributos e um construtor que aceite os valores iniciais para todos os atributos.
 */
    private String titulo;
    private String autor;
    private int anoPublicacao;


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public ExercicioTresLivro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
}
