package br.com.alissonrs.polimorfismo;

public class Gato extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void mamar() {
        System.out.println("MIAU! chuck, chuck");
    }

    @Override
    public void correr() {
        System.out.println("CORRE MIAU");
    }
}
