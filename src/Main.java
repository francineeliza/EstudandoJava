import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto leite = new Produto(1,2,"leite parmalat integral uht longa vida");
        Produto leite2 = new Produto(11,22,"leite leitissimo integral uht longa vida premium");
        Produto ovo = new Produto(33, 40,"label rouge ovo de granja jumbo");
        Produto pao = new Produto(55, 3, "pão pullman integral artesano");
        ArrayList<Produto> carrinhoDoAndre = new ArrayList<Produto>();
        carrinhoDoAndre.add(leite);
        carrinhoDoAndre.add(ovo);
        carrinhoDoAndre.add(pao);
        carrinhoDoAndre.remove(leite);
        carrinhoDoAndre.add(leite2);
        Cliente andre = new Cliente(200,carrinhoDoAndre);
        PontoDeVenda mercadinho = new PontoDeVenda();
        mercadinho.venda(andre);
        System.out.println("Saldo do André após a compra: " + andre.getSaldo());
    }
}