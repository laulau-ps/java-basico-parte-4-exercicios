package javaBasico04;
//8. Crie uma classe Curso com construtor que receba nome e carga horaria.

class Curso{
    String nome;
    int cargaHoraria;

    Curso(String nomeDoCurso, int cargaHorariaCurso){
        nome = nomeDoCurso;
        cargaHoraria = cargaHorariaCurso;
    }
}

public class Exercicio08 {
    static void main(String[] args) {

        Curso curso = new Curso("Java Básico", 40);

        System.out.println("Nome do curso: " + curso.nome + " | Carga horária: " + curso.cargaHoraria);
    }
}