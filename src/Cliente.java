import java.util.ArrayList;

public class Cliente {
    private int saldo;
    private ArrayList<Produto> carrinho;

    public Cliente(int saldo, ArrayList<Produto> carrinho ) {
        this.saldo = saldo;
        this.carrinho = carrinho;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }
}
