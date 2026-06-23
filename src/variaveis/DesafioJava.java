package variaveis;

public class DesafioJava {
    public static void main(String[] args) {

        // Desafio Java e praticando para ver oque eu lembro e funciona

        int estoqueAtual = 15;
        int estoqueMinimo = 20;
        double precoProduto = 55.40;
        String nomeProduto = "Teclado";

        double valorTotalEstoque = estoqueAtual * precoProduto;
        boolean precisaComprarMais = estoqueAtual < estoqueMinimo;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor total em estoque: R$ " + valorTotalEstoque);
        System.out.println("Precisa comprar mais? " + precisaComprarMais);


    }
}
