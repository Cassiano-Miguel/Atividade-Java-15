package br.com.alissonrs.polimorfismo;
import java.util.ArrayList;

public class Zoologico {

    public static void main(String[] args) {
        ArrayList<Mamifero> lista = new ArrayList<Mamifero>();
        lista.add(new Cachorro());
        lista.add(new Vaca());
        lista.add(new Gato());

        for (Mamifero m : lista) {
            m.emitirSom();
            m.mamar();
            m.correr();
        }

		Mamifero mama;
        Cachorro cachorro;
        Vaca vaca;

        mama = new Gato();
        cachorro = new Cachorro("Snoopy");
        vaca = new Vaca();

        mama.mamar();
        cachorro.mamar();
        vaca.mamar();

        mama.emitirSom();
        cachorro.emitirSom();
        vaca.emitirSom();
    }

}