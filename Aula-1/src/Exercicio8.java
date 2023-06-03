import javax.swing.JOptionPane;

/*8.	Faça um algoritmo que converta ºC (Celsius) em ºF (Fahrenheit). Sabendo que a formula é F = C * 1.8 + 32. Pegue do usuário o valor de ºC e mostre o valor solicitado em Celsius e depois o valor convertido em fahrenheit. Exemplo: 37 ºC é 98.6 ºF. */
public class Exercicio8 {
    public static void main(String[] args) {
        String textCelsius = JOptionPane.showInputDialog(null, "Digite a temperatura para ser convertida!");
        int numCelsius = Integer.parseInt(textCelsius);
        double Fahrenheit = (numCelsius * 1.8) + 32;
        JOptionPane.showMessageDialog(null, numCelsius + "ºC são " + Fahrenheit + "ºF" );
    }
}
