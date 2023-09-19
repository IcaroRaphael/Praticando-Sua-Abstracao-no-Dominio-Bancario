package desafios_java.abrindo_contas;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
        System.out.println(contaBancaria);
    }
}

class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return  "Conta: " + numero
                + "\nTitular: " + titular
                + "\nSaldo: R$ " + String.format("%.1f", saldo);
    }
}
