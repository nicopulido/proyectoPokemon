package Modelo;

import java.util.ArrayList;

public class Caja {

    //agregar los atributos
    private String fondo;
    private static int num_Espacios = 30; //porque solamente pueden haber 30 espacios por caja
    private int num_Caja;
    private boolean espacio_Ocupado;
    private ArrayList<Pokemon> pokemones;

    //constructores
    public Caja() {
    }

    public Caja(String fondo, int num_Caja, boolean espacio_Ocupado) {
        this.espacio_Ocupado = espacio_Ocupado;
        this.fondo = fondo;
        this.num_Caja = num_Caja;
        this.pokemones = new ArrayList<Pokemon>(Caja.num_Espacios);
        for (int i = 0; i < 30; i++) {
            this.pokemones.add(null);
        }
    }

    //Getter and Setter
    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }

    public int getNum_Espacios() {
        return num_Espacios;
    }

    public int getNum_Caja() {
        return num_Caja;
    }

    public void setNum_Caja(int num_Caja) {
        this.num_Caja = num_Caja;
    }

    public boolean isEspacio_Ocupado() {
        return espacio_Ocupado;
    }

    public void setEspacio_Ocupado(boolean espacio_Ocupado) {
        this.espacio_Ocupado = espacio_Ocupado;
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    //metodos
    public void Mostrar_Pokemon() {
    }

    public void Mover_Pokemon_posicion(Pokemon pokemon1, int posicion) {
        if (this.pokemones.size() < 30) {

        }
    }

    public void agregar_Pokemon(Pokemon pokemon, int posicion) {
        if (posicion >= 0 && posicion <= pokemones.size()) {
            if (pokemones.get(posicion) == null) {
                // Si la posición está vacía, agregar el Pokémon en esa posición
                pokemones.set(posicion, pokemon);
                System.out.println("Se agregó el Pokémon en la posición " + posicion);
            } else {
                System.out.println("La posición " + posicion + " está ocupada por otro Pokémon.");
            }
        } else {
            System.out.println("La posición especificada está fuera de los límites del ArrayList.");
        }
    }

    public void soltar_Pokemon() {
    }

    public void intercambiarPosicionPokemón() {
    }

    public void llevarPokemonEquipo() {

    }

    public void quitarObjetoPokemon() {

    }
}
