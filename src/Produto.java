public class Produto {
    private int codigo;
    private String nome;
    private int preco;

    public Produto(int codigo, int preco, String nome){
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
