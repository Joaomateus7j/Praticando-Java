package laco;

public class exercicio7 {
    static void main(String[] args) {

        double meta = 100;
        double saldoAtual = 0;
        double deposito = 15;
        int depositosRealizados = 0;

        while (saldoAtual < meta ) {
            saldoAtual += deposito;
            depositosRealizados++;

            System.out.println("Depósito " + depositosRealizados + ": R$ " + saldoAtual);

        }

        System.out.println("Meta atingida com sucesso!");
    }
}
