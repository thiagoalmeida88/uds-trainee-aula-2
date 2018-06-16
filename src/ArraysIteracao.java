import java.util.ArrayList;

class ArraysIteracao {
    public static void main(String[] args) {

        ArrayList<String> enderecoPessoa = new ArrayList<>();

        enderecoPessoa.add("Eduardo");
        enderecoPessoa.add("00000-000");
        enderecoPessoa.add("Rua Tal");
        enderecoPessoa.add("123");
        enderecoPessoa.add("Casa da frente");
        enderecoPessoa.add("Centro");
        enderecoPessoa.add("Curitiba");
        enderecoPessoa.add("PR");
        enderecoPessoa.add("(99)9999-9999");

        enderecoPessoa.stream().forEach((item) -> {
            System.out.println(item);
        });
    }
}