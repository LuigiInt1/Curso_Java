public class VerificaPessoa {
    public static void main(String[] args) {
        Pessoa ruan = new Pessoa();
        System.out.println(ruan.getNome());
        System.out.println(ruan.getIdade());
        ruan.setNome("Tafarel");
        System.out.println(ruan.getNome());
    }
}
