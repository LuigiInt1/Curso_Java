public class ExercicioWhile {
    public static void main(String[] args) {
        int ValorSimples = 1200;
        double jurosSimples = 1200 * 0.10;
        int valorComposto = 1200;
        int ano = 0;

        while (ValorSimples <= 5000){
            ano++;
            valorComposto *= 1.10;
            ValorSimples += jurosSimples;
            System.out.println("Saldo atual no ano com juros simples "+ ano + " ="+ ValorSimples +"\n" + "Saldo atual no ano com juros composto "+ ano + " ="+ valorComposto +"\n\n"); 
        }
    }
}