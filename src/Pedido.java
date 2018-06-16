import java.util.ArrayList;

public class Pedido {

    private Double total = 0.0;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public Double calcularTotal(){
        produtos.stream().forEach((item)->{
            total += item.getValor();
        });
        return this.total;
    }

    public void exibirProdutos(){
        produtos.stream().forEach((item)->{
            System.out.println(item.getProduto());
        });
    }




}
