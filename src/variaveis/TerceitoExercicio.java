package variaveis;

public class TerceitoExercicio {
    public static void main(String[] args) {

        boolean isMatriculaAtiva = true;
        double mediaNotas = 8.5;
        double valorMensalidade = 1200;
        double desconto = 250;

        boolean isDescontoAprovado = isMatriculaAtiva && mediaNotas >= 7;
        valorMensalidade -= desconto;
        System.out.println("isDescontoAprovado " + isDescontoAprovado);
        System.out.println( "isValorMensalidade" + valorMensalidade);

    }
}
