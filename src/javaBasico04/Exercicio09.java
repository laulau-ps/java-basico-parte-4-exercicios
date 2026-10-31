package javaBasico04;
//9. Crie uma classe Celular com marca e modelo usando this no construtor.

class Celular{
    String marca;
    String modelo;

    Celular(String marcaCelular, String modeloCelular){
        this.marca = marcaCelular;
        this.modelo = modeloCelular;
    }
}

public class Exercicio09 {
    static void main(String[] args) {
        Celular celular = new Celular("Xiaomi", "Redmi Note 14");

        System.out.println("Marca do celular: " + celular.marca + " | Modelo do celular: " + celular.modelo);
    }
}
