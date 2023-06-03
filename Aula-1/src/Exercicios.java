import javax.swing.JOptionPane;

public class Exercicios {
    public static void main(String[] args) {

        /*Exercícios
        Exercicio1
        Exercicio2
        Exercicio3
        Exercicio4
        Exercicio5
        Exercicio6
        Exercicio7
        Exercicio8
        Exercicio9
        DESAFIO
        Digite o nome do exercício para ver o funcionamento. EX: Exercicio1()  */

        Exercicio2();
    }


static void Exercicio1(){
    String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
    JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome + "!");
}

/*--------------------------------------------------------------------------------------------------------------- */

static void Exercicio2(){
    String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        String idade = JOptionPane.showInputDialog(null, "Qual a sua idade?");
        int numeroIdade = Integer.parseInt(idade);
        JOptionPane.showMessageDialog(null, "Nome: " + nome +"\n"+ "Idade: " + numeroIdade);
}

/*--------------------------------------------------------------------------------------------------------------- */

static void Exercicio3(){
    String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        String anoNascimento = JOptionPane.showInputDialog(null, "Qual o ano de seu nascimento?");
        int numAnoNascimento = Integer.parseInt(anoNascimento );
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Idade: " + (2023 - numAnoNascimento ));
}

/*--------------------------------------------------------------------------------------------------------------- */

static void Exercicio4(){
    String numString = JOptionPane.showInputDialog(null, "Digite um número");
        int numInt = Integer.parseInt(numString);
        JOptionPane.showMessageDialog(null, "O numero que você digitou é: " + numInt + "\n" + "O dobro é: " + (numInt * 2) + "\n" + "Seus 3 próximos números serão: " + (numInt + 1) + ", " + (numInt + 2) + ", " + (numInt + 3) );
}

/*--------------------------------------------------------------------------------------------------------------- */

static void Exercicio5(){
    double valorPao = 0.20;
    double valorLeite = 5.50;
    String textPaes = JOptionPane.showInputDialog(null, "Bom dia!!! SEJA BEM VINDO!" + "\n" + "Quantos pães você vai querer?");
    int numPaes = Integer.parseInt(textPaes);
    String textLeite = JOptionPane.showInputDialog(null, "Quantas caixas de leite você vai querer?");
    int numLeite = Integer.parseInt(textLeite);
    double valorTotal = (numLeite * valorLeite) + (numPaes * valorPao);
    JOptionPane.showMessageDialog(null, "Pães - " + numPaes + " unidade(s)" +  "\n" + "Caixa de leite - " + numLeite +  " unidade(s)" + "\n" + "Valor total: R$ " + valorTotal );
}

/*--------------------------------------------------------------------------------------------------------------- */

static void Exercicio6(){
    String textSalario = JOptionPane.showInputDialog(null, "Digite o saláro de Maria");
        int numSalario = Integer.parseInt(textSalario);
        double desconto = (numSalario * 0.15);
        double liquido = (numSalario - desconto);
        JOptionPane.showMessageDialog(null, "Salário bruto: " + numSalario + "\n" + "desconto: " + desconto + "\n" + "Salário líquido: " + liquido );
}

/*--------------------------------------------------------------------------------------------------------------- */

static void Exercicio7(){
    double  uniMilheiro = 169.90;
        String textMilheiro = JOptionPane.showInputDialog(null, "Quantos milheiros foram feito?");
        int numMilheiro = Integer.parseInt(textMilheiro);
        double total = (numMilheiro * uniMilheiro);
        double imposto = (total * 0.09);
        double liquido = (total - imposto);
        JOptionPane.showMessageDialog(null, "Milheiros: " + numMilheiro + "\n" + "total a pagar: " + total + "\n" + "Imposto : " + imposto +  "\n" + "Total líquido: " + liquido );
}

/*--------------------------------------------------------------------------------------------------------------- */

static void Exercicio8(){
    String textCelsius = JOptionPane.showInputDialog(null, "Digite a temperatura para ser convertida!");
    int numCelsius = Integer.parseInt(textCelsius);
    double Fahrenheit = (numCelsius * 1.8) + 32;
    JOptionPane.showMessageDialog(null, numCelsius + "ºC são " + Fahrenheit + "ºF" );
}

/*--------------------------------------------------------------------------------------------------------------- */

static void Exercicio9(){
    String textNum = JOptionPane.showInputDialog(null, "Digite um número para saber sua tabuada");
    int intNum = Integer.parseInt(textNum);
    textNum = ("Tabuada do " + textNum + ":\n");
    int x = 10;
    int tabuada [] = new int [x];
    for(int i = 0; i<x; i++)
    {
        tabuada[i] = (intNum * (i + 1));
        textNum += i + 1 + " X" + intNum + " = " + tabuada[i] + "\n" ;
    }
    JOptionPane.showMessageDialog(null, textNum );
}

/*--------------------------------------------------------------------------------------------------------------- */

static void DESAFIO(){
    String textNum1 = JOptionPane.showInputDialog(null, "Digite o primeiro número");
        String textNum2 = JOptionPane.showInputDialog(null, "Digite o segundo número");
        int num1 = Integer.parseInt(textNum1);
        int num2 = Integer.parseInt(textNum2);
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "Número 1: " + num1 + "\n" + "Número 2: " + num2 + "\nNúmero 1 é maior que o Número 2 ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Número 1: " + num1 + "\n" + "Número 2: " + num2 + "\nNúmero 2 é maior que o Número 1 ");
        };
}

}
