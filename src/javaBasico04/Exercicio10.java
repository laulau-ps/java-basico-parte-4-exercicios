package javaBasico04;
//10. Crie um enum Turno com MANHA, TARDE e NOITE e percorra values().

public class Exercicio10 {
    enum Turno {
        MANHA, TARDE, NOITE
    }

    static void main(String[] args) {
        for (Turno turno : Turno.values()) {
            System.out.println("Turno: " + turno);
        }
    }
}