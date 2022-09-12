import java.util.ArrayList;

public class PontoDeVenda {
    public int calcularTotal(ArrayList<Produto> carrinho){
        int soma = 0;
        for (Produto produto: carrinho) {
            soma += produto.getPreco();
        }
        return soma;
    }

    public void venda(Cliente cliente){
       int total = this.calcularTotal(cliente.getCarrinho());
       int saldoAtual = cliente.getSaldo();
       if (cliente.getSaldo() >= total){
           System.out.println("Compra realizada com sucesso!");
           cliente.setSaldo(saldoAtual-total);
       }
       else {
           System.out.println("Compra negada.");
       }
    }
}
