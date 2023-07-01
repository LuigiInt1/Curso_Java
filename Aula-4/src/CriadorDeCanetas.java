public class CriadorDeCanetas {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        Caneta caneta2 = new Caneta();
        caneta1.modelo ="Bic";
        caneta1.cor="Azul";
        caneta1.ponta=0.8;
        caneta1.tampada=true;
        caneta2.modelo ="Nike";
        caneta2.cor="vermelho";
        caneta2.ponta=10.0;
        caneta2.tampada=false;
        caneta1.mostrarStatus();
        caneta2.mostrarStatus();
        

    }
    
}
