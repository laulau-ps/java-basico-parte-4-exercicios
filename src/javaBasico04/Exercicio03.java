package javaBasico04;
//3. Crie a classe Retangulo com largura e altura e um metodo area().

import java.util.Scanner;

class Retangulo{
    double largura;
    double altura;

    double area(){
        return largura * altura;
    }
}

public class Exercicio03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Informe a altura do retângulo:");
        retangulo.altura = sc.nextDouble();

        System.out.println("Informe a largura do retângulo:");
        retangulo.largura = sc.nextDouble();

        double areaRetangulo = retangulo.area();

        System.out.println("A área do retângulo é: " + areaRetangulo);
    }
}