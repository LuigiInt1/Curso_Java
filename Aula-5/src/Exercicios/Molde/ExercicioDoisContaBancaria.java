package Molde;
public class ExercicioDoisContaBancaria {
    /*Exercício 2:
    Crie uma classe chamada ContaBancaria com os seguintes atributos privados:
    numero (String)
    saldo (double)
    titular (String)
    Crie os métodos getters e setters para cada um dos atributos e o construtor para ela.
 */
    private String numero;
    private double saldo;
    private String titular;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }


    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    

    public ExercicioDoisContaBancaria(String numero, double saldo, String titular){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }
}
