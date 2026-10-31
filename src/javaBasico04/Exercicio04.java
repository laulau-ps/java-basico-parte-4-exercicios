package javaBasico04;
//4. Crie a classe Conta com saldo e um metodo depositar(double valor).

import java.util.Scanner;

class Conta{
    double saldo;

    void depositar(double valor){
        saldo += valor;
    }
}

public class Exercicio04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();
        conta.saldo = 100.00;

        System.out.println("Saldo atual: " + conta.saldo);
        System.out.println("Informe o valor a depositar na conta:");
        conta.depositar(sc.nextDouble());

        System.out.println("Saldo atualizado: " + conta.saldo);
    }
}