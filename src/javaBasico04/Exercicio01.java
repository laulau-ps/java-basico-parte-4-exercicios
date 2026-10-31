package javaBasico04;

//1. Crie a classe Pessoa com nome e idade. Instancie duas pessoas e exiba os dados.

class Pessoa {
    String nome;
    int idade;
}

public class Exercicio01 {
    static void main(String[] args) {

        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.nome = "Ana";
        primeiraPessoa.idade = 22;

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.nome = "Carlos";
        segundaPessoa.idade = 30;

        System.out.println("Pessoa 1 - Nome: " + primeiraPessoa.nome + ", Idade: " + primeiraPessoa.idade);
        System.out.println("Pessoa 2 - Nome: " + segundaPessoa.nome + ", Idade: " + segundaPessoa.idade);

    }

}
