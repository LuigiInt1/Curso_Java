import java.util.Calendar;

import javax.swing.JOptionPane;

public class Exercicios {
    public static void main(String[] args) {
        // Exercicio_1();
        // Exercicio_2();
        // Exercicio_3();
    }

    public static void Exercicio_1() {
        /* Pegar o mês pelo sistema. Mostrar o mês e se esse mês é par ou ímpar. */
        Calendar buscadorData = Calendar.getInstance();
        int mesAtual = 1 + buscadorData.get(Calendar.MONTH);
        int resto = mesAtual % 2;
        if (resto == 0)
            JOptionPane.showMessageDialog(null, "O mês " + mesAtual + " é par");
        else
            JOptionPane.showMessageDialog(null, "O mês " + mesAtual + " é impar");
    }

    public static void Exercicio_2() {
        /*
         * Criar um sistema para cobrar o boleto de prestação. Pegar do usuário o valor
         * do boleto e o dia do vencimento. Se o boleto estiver em atraso cobrar juros
         * de 8 %. Mostrar a saída como no exemplo:
         * Sem Atraso – valor prestação: R$ 150.0 total: R$ 150.0
         */
        Calendar buscadorData = Calendar.getInstance();
        int diaAtual = buscadorData.get(Calendar.DAY_OF_MONTH);
        String valorString = JOptionPane.showInputDialog(null, "Qual o valor do boleto?");
        double valorNum = Integer.parseInt(valorString);
        String vencimentoString = JOptionPane.showInputDialog(null, "Qual o dia de vencimento?");
        int vencimentoNum = Integer.parseInt(vencimentoString);

        if (vencimentoNum < diaAtual) {
            valorNum = valorNum + (valorNum * 0.08);
            JOptionPane.showMessageDialog(null, "Seu boleto está vencido" + "\n" + "Valor a pagar: R$" + valorNum);
        } else
            JOptionPane.showMessageDialog(null,
                    "Seu boleto não está vencido ainda" + "\n" + "Valor a pagar: R$" + valorNum);
    }

    public static void Exercicio_3() {
        /*
         * Crie um sistema que solicite ao usuário o dia, mês e ano de nascimento, e com
         * base nessa informação, verifique se a pessoa já atingiu a maioridade. Utilize
         * a biblioteca Calendar do Java para obter a data atual e realizar a
         * comparação.
         */
        Calendar buscadorData = Calendar.getInstance();
        int diaAtual = buscadorData.get(Calendar.DAY_OF_MONTH);
        int mesAtual = 1 + buscadorData.get(Calendar.MONTH);
        int anoAtual = buscadorData.get(Calendar.YEAR);

        String diaNascimentoString = JOptionPane.showInputDialog(null, "Qual o dia do seu nascimento?");
        int diaNascimentoNum = Integer.parseInt(diaNascimentoString);

        String mesNascimentoString = JOptionPane.showInputDialog(null, "Qual o mês do seu nascimento?");
        int mesNascimentoNum = Integer.parseInt(mesNascimentoString);

        String anoNascimentoString = JOptionPane.showInputDialog(null, "Qual o ano do seu nascimento?");
        int anoNascimentoNum = Integer.parseInt(anoNascimentoString);

        int verificaAno = anoAtual - anoNascimentoNum;

        System.out.println(verificaAno);

        if (verificaAno > 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade1!");
        } else if (verificaAno == 18 && mesNascimentoNum <= mesAtual) {

            if (diaNascimentoNum < diaAtual) {
                JOptionPane.showMessageDialog(null, "Você é maior de idade!");
            } else
                JOptionPane.showMessageDialog(null, "Você é menor de idade!");

        }

        else
            JOptionPane.showMessageDialog(null, "Você é menor de idade!");

    }

}
