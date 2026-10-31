package javaBasico04;
//7. Crie a classe Livro com titulo e disponivel. Implemente emprestar() e devolver().

class Livro{
    String tituloLivro;
    boolean disponivel;

    void emprestado(){
        disponivel = false;
    }

    void devolvido(){
        disponivel = true;
    }
}

public class Exercicio07 {
    static void main(String[] args) {

        Livro livro = new Livro();

        livro.tituloLivro = "Cemitério Maldito";

        livro.emprestado();
        System.out.println("Disponível após empréstimo?: " + livro.disponivel);

        livro.devolvido();
        System.out.println("Disponível após devolução?: " + livro.disponivel);
    }
}