import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {
        Calendar buscadorData = Calendar.getInstance();
        int diaAtual = buscadorData.get(Calendar.DAY_OF_MONTH);
        int mesAtual = 1 + buscadorData.get(Calendar.MONTH );
        int anoAtual = buscadorData.get(Calendar.YEAR);
        System.out.println(diaAtual + "/" + mesAtual  + "/" + anoAtual );
        
        
    }
}
