public class Revisao_Aula_3 {
    public static void main(String[] args) {
        //For();
        While();
    }

    public static void For(){
        String[] carros = {"Gol", "Palio", "Uno", "Fox", "Fiat", "Ferrari"};
        for(String carro: carros){
            System.out.println("Nome do carro " + carro);
        }
        for(int i=0; i<carros.length; i++){
            System.out.println("Nome do carro novamente " + carros[i]);
        }
    }
    public static void While(){
        int saldo = 100;
        while (saldo> 0){
            saldo -=10;
            System.out.println("Saldo atual " + saldo);
        }
    }
}
