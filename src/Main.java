import java.util.ArrayList;

class Main {
    public static void main(String[] args){

        Produto primeiroProduto = new Produto("Faca", 10.00);
        Produto segundoProduto = new Produto("Naifa", 10.50);
        Produto terceiroProduto = new Produto("Zinca", 60.50);
        Produto quartoProduto = new Produto("Espada", 100.00);
        Produto quintoProduto = new Produto("Foice", 140.00);

        Pedido pedido = new Pedido();
        pedido.adicionarProduto(primeiroProduto);
        pedido.adicionarProduto(segundoProduto);
        pedido.adicionarProduto(terceiroProduto);
        pedido.adicionarProduto(quartoProduto);
        pedido.adicionarProduto(quintoProduto);

        pedido.exibirProdutos();
        System.out.println("------------------------");
        System.out.println("Valor total:"+pedido.calcularTotal());

//        Pato pato = new PatoDeCabecaVermelha();
//        Pato patoCiber = new PatoCibernetico();
//
//        pato.voar();
//        patoCiber.voar();


//      Macaco macaco = new Macaco();
//
//      macaco.andar();
//
//      System.out.println("O que fez o macaco? : "+" e "+macaco.comerBanana());


//      Pessoa pessoa = new Pessoa("Thiago","12312-123", "Rua tal", 123, "Casa da frente",
//      "Centro", "Ripo preto", "SP", "(99)99999-9999");
//
//
//      System.out.println("Endereço completo de "+pessoa.getNome());
//
//      System.out.println(pessoa.obterInformacoes());
//
//      pessoa.setNome("Thiago Almeida");
//
//      System.out.println(pessoa.obterInformacoes());

    }
}
