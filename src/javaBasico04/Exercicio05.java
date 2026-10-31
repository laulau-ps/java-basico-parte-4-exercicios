package javaBasico04;
//5. Crie a classe Lampada com atributo ligada e métodos ligar() e desligar().

class Lampada{
    boolean ligada;

    void ligarLampada(){
        ligada = true;
    }

    void desligarLampada(){
        ligada = false;
    }
}

public class Exercicio05 {
    static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligarLampada();

        System.out.println("A lâmpada está ligada? " + lampada.ligada);

        lampada.desligarLampada();
        System.out.println("A lâmpada está ligada? " + lampada.ligada);
    }
}