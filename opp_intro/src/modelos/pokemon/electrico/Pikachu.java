package modelos.pokemon.electrico;

import modelos.pokemon.utils.Ataques;
import modelos.pokemon.utils.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pikachu {
    
    private String nombre;
    private Color colorCachetes;

    public Pikachu(String nombre, Color colorCachetes) {
        this.nombre = nombre;
        this.colorCachetes = colorCachetes;
        ataques = new ArrayList<Ataques>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColorCachetes() {
        return colorCachetes;
    }

    public void setColorCachetes(Color colorCachetes) {
        this.colorCachetes = colorCachetes;
    }

    private ArrayList <Ataques> ataques = new ArrayList<>();

    public ArrayList<Ataques> getAtaques() {
        return ataques;
    }

    public void setAtaques() {
        System.out.println("Ingresa los ataques:");
        Ataques ListaAtaques[] = Ataques.values();
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa el ataque:");
            for(Ataques ataque: Ataques.values()){
            if(ataque != null)
                System.out.println("Ataque:" + ataque);
            }
            try (Scanner scanner = new Scanner(System.in)) {
                String ataqueS = scanner.next();
                Ataques ataquen = Ataques.valueOf(ataqueS);
                ataques.add(ataquen);
                ListaAtaques[Arrays.binarySearch(ListaAtaques, ataquen)] = null;
            }
        }
    }


}
