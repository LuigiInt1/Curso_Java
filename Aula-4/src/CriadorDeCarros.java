public class CriadorDeCarros {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.cor = "Verde";
        carro1.modelo = "Palio";
        carro1.ligado = true;
        carro1.velocidadeAtual = 0;
        carro1.velocidadeMaxima = 200;
        try{
        carro1.acelelar(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    
}
