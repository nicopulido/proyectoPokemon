package Modelo;

import java.util.ArrayList;
import java.util.HashSet;

public class Caja {

    //agregar los atributos
    private String fondo;
    private static int num_Espacios = 30; //porque solamente pueden haber 30 espacios por caja
    private int num_Caja;
    private ArrayList<Pokemon> pokemones;
    private Pokemon pokemon_seleccionado; //por si se cambia pokemon o se selecciona en la caja y no se puede intercambiar o poner en alguna posicion

    //constructores
    public Caja() {
    }

    public Caja(String fondo, int num_Caja) {
        this.fondo = fondo;
        this.num_Caja = num_Caja;
        this.pokemones = new ArrayList<Pokemon>(Caja.num_Espacios);
        this.pokemon_seleccionado = null;
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

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    //metodos
    public void Mostrar_Pokemon() {
    }

    public void mover_Pokemon_posicion(int posicion_salida, int posicion_llegada) { //la posición de salida es la posición que se quiere mover, y la de llegada es la posición a la que se va a mover
        if (posicion_salida >= 0 && posicion_llegada >= 0 && posicion_llegada <= this.pokemones.size() && posicion_salida <= this.pokemones.size()) {
            if (this.pokemones.get(posicion_salida) == null) {
                System.out.println("No hay ningun pokemón aquí");
            } else if (posicion_llegada != posicion_salida) {
                this.pokemon_seleccionado = pokemones.get(posicion_salida);
                System.out.println(this.pokemon_seleccionado);
                pokemones.set(posicion_salida, null);
                if (this.pokemones.get(posicion_llegada) != null) { //en ese if es para cambiar 2 pokemones de posicion
                    this.pokemones.set(posicion_salida, this.pokemones.get(posicion_llegada));
                    this.pokemones.set(posicion_llegada, this.pokemon_seleccionado);
                } else {//este else es para cuando en la posicon de llegada no hay pokemones, y setea la posición de salida a null porque no se cambia ningún pokemong
                    this.pokemones.set(posicion_llegada, this.pokemon_seleccionado);
                    this.pokemones.set(posicion_salida, null);
                }
                this.pokemon_seleccionado = null;
            }
        } else {
            System.out.println("La posición especificada está fuera de los límites del ArrayList.");
        }
    }

    public void agregar_Pokemon(Pokemon pokemon, int posicion) {
        if (posicion >= 0 && posicion < this.pokemones.size()) {
            if (this.pokemones.get(posicion) == null) {
                // Si la posición está vacía, agregar el Pokémon en esa posición
                this.pokemones.set(posicion, pokemon);
                System.out.println("Se agregó el Pokémon en la posición " + posicion);
            } else {
                System.out.println("La posición " + posicion + " está ocupada por otro Pokémon.");
            }
        } else {
            System.out.println("La posición especificada está fuera de los límites del ArrayList.");
        }
    }

    public void soltar_Pokemon(int posicion) {
        if (posicion >= 0 && posicion < this.pokemones.size()) {
            if (this.pokemones.get(posicion) == null) {
                System.out.println("No se puede liberar un pokemon de un espacio vacío");
            } else {
                this.pokemones.set(posicion, null);
                System.out.println("Pokemon liberado");
            }
        } else {
            System.out.println("La posición especificada está fuera de los límites del ArrayList.");
        }
    }

    public void intercambiarPosicionPokemón() {
    }

    public void llevarPokemonEquipo() {

    }

    public void quitarObjetoPokemon() {
        
    }
}
