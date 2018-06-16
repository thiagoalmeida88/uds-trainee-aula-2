
class Main {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Thiago","12312-123", "Rua tal", 123, "Casa da frente",
        "Centro", "Ripo preto", "SP", "(99)99999-9999");


        System.out.println("Endereço completo de "+pessoa.getNome());

        System.out.println(pessoa.obterInformacoes());



    }
}
