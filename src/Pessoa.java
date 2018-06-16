
public class Pessoa {

    private String nome = null;
    private String cep = null;
    private String endereco = null;
    private Integer numero = null;
    private String complemento = null;
    private String bairro = null;
    private String cidade = null;
    private String estado = null;
    private String telefone = null;

    Pessoa(String nome, String cep, String endereco, Integer numero, String complemento, String bairro, String cidade, String estado, String telefone){

        this.nome = nome;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;

    }

    public String obterInformacoes(){
        return "Nome: "+this.nome
              +", CEP: "+this.cep
              +", Endereço: "+this.endereco
              +", Número: " +this.numero
              +", Complemento: "+this.complemento
              +", Bairro: "+this.bairro
              +", Cidade: "+this.cidade
              +", Estado: "+this.estado
              +", Telefone: "+this.telefone;
    }

    public String getNome(){
        return this.nome;
    }

}
