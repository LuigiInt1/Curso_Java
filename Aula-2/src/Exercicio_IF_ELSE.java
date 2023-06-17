import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio_IF_ELSE {
    public static void main(String[] args) {
        String pesoString = JOptionPane.showInputDialog(null,"Qual seu peso em KG?"); 
        String alturaString = JOptionPane.showInputDialog(null,"Qual sua altura?");
        int pesoNum = Integer.parseInt(pesoString);
        double alturaNum = Double.parseDouble(alturaString);
        double IMC = pesoNum / (alturaNum * 2);
        DecimalFormat transformador = new DecimalFormat("#0.0");
        String IMCArredondado = transformador.format(IMC);
        System.out.println(IMC);
        
        if(IMC <18.5)
        JOptionPane.showMessageDialog(null, IMCArredondado + " você está abaixo do peso");
        else if (IMC >= 18.5 && IMC <= 24.9 )
        JOptionPane.showMessageDialog(null,IMCArredondado + " você está no peso ideal");
        else if (IMC >= 25.0 && IMC <= 29.9 )
        JOptionPane.showMessageDialog(null,IMCArredondado + " voce está acima do peso");
        else if (IMC >= 30.0 && IMC <= 34.9 )
        JOptionPane.showMessageDialog(null,IMCArredondado + " obesidade classe I");
        else if (IMC >= 35.0 && IMC <= 39.9 )
        JOptionPane.showMessageDialog(null,IMCArredondado + " obesidade classe II");
        else
        JOptionPane.showMessageDialog(null,IMCArredondado + " obesidade classe III");
        
    }
}
