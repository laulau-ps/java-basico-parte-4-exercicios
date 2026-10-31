package javaBasico04;
//2. Crie a classe Produto com nome e preco. Crie três objetos e mostre o mais caro.

class Produto {
    String nomeProduto;
    double precoProduto;
}

public class Exercicio02 {
    static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nomeProduto = "Teclado";
        produto1.precoProduto = 135.60;

        Produto produto2 = new Produto();
        produto2.nomeProduto = "Mouse";
        produto2.precoProduto = 50.00;

        Produto produto3 = new Produto();
        produto3.nomeProduto = "Mousepad";
        produto3.precoProduto = 25.90;

        Produto produtoMaisCaro = null;

        if (produto1.precoProduto > produto2.precoProduto && produto1.precoProduto > produto3.precoProduto) {
            produtoMaisCaro = produto1;
        } else if (produto2.precoProduto > produto1.precoProduto && produto2.precoProduto > produto3.precoProduto) {
            produtoMaisCaro = produto2;
        } else {
            produtoMaisCaro = produto3;
        }

        System.out.println("Produto mais caro: " + produtoMaisCaro.nomeProduto + ". Valor: R$" + produtoMaisCaro.precoProduto);
    }
}