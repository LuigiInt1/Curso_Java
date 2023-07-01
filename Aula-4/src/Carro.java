import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class Carro {
    String cor;
    String modelo;
    boolean ligado;
    int velocidadeAtual;
    int velocidadeMaxima;

    void mostrarCarros(){
        System.out.println("Cor: " + cor + "\nModelo: " + modelo + "\nLigado: " + ligado + "\nVelocidade atual: " + velocidadeAtual + "\nVelocidade máxima: " + velocidadeMaxima + "\n\n" );
    }

    void ligarCarro(){
        if(this.ligado == true){
            System.out.println("O carro já está LIGADO IMBECILLLL");
        }
        else
        this.ligado = true;
    }

    void desligarCarro(){
        if(this.ligado == false){
            System.out.println("O carro já está DESLIGADO IMBECILLLL");
        }
        else
        this.ligado = true;
    }

    void acelelar(int addAcelelar) throws InterruptedException{
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR);
        int minuto = data.get(Calendar.MINUTE);
        
        long tempoEspera = 80;
        for(int i=0; this.velocidadeAtual != addAcelelar; i++){
            if(this.velocidadeAtual < this.velocidadeMaxima && this.velocidadeAtual < addAcelelar && this.ligado){
                this.velocidadeAtual += 1;
                if(velocidadeAtual == 30){
                    JOptionPane.showConfirmDialog(null, "Você quer ultrapassar o limite de velocidade?");
                }
                if(velocidadeAtual == 50){
                    JOptionPane.showConfirmDialog(null, "Cara tu vai tomar uma multa fudida, tu tem certeza que vai continuar?????");
                }
                if(velocidadeAtual == 100){
                    JOptionPane.showConfirmDialog(null, "MLKKK tu Ta de PALIOOOOOOOO, isso aqui é rua residencial tu vai matar alguem, tu realmente quer continuar?????");
                }
                if(velocidadeAtual == 150){
                    JOptionPane.showConfirmDialog(null, "FODASE");
                }
                if(velocidadeAtual == 200){
                    JOptionPane.showConfirmDialog(null, "Hora do obito "+hora +":"+ minuto);
                }
                
                System.out.println(velocidadeAtual+" Km/h");
            }
            else{
                System.out.println("Não é possivel acelerar");
                break;  
            }
            TimeUnit.MILLISECONDS.sleep(tempoEspera);
           
        }
        
        

        
    }

    void freiar(int addFreiar){

    }
}


