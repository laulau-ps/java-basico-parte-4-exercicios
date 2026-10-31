package javaBasico04;
//6. Crie a classe Aluno com duas notas e metodo calcularMedia().

import java.util.Scanner;

class Aluno{
    double nota1;
    double nota2;

    double calcularMedia(){
        return (nota1 + nota2) / 2;
    }
}

public class Exercicio06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite a primeira nota do aluno:");
        aluno.nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        aluno.nota2 = sc.nextDouble();

        double mediaAluno = aluno.calcularMedia();

        System.out.println("A média do aluno é: " + mediaAluno);
    }
}