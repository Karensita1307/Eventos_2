import java.util.Arrays;

import modelos.pokemon.electrico.Pikachu;
import modelos.pokemon.utils.Color;

public class Main {
    public static void main(String[] args) {
        Pikachu pika1 = new Pikachu("Bryan", Color.ROJO);
        Pikachu pika2 = new Pikachu("Bryan", Color.ROJO);
        Pikachu pika3 = new Pikachu("Bryan", Color.AZUL);
        System.out.println(pika1);
        System.out.println(pika1.equals(pika2));
        System.out.println(pika1.equals(pika3));
        System.out.println(pika1.equals(pika1));
        pika1.setAtaques();
        System.out.println(Arrays.toString(pika1.getAtaques().toArray()));
    
    }

}
