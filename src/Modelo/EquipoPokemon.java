package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author ElPul
 */
public class EquipoPokemon {

    //atributos
    private int num_Pokemon = 6;
    private ArrayList<Pokemon> pokemones;
    private Pokemon pokemon_seleccionado;
    private Objeto objeto_seleccionado;

    //Constructores
    public EquipoPokemon() {
        this.pokemones = new ArrayList<Pokemon>(num_Pokemon);
        this.pokemon_seleccionado = null;
        this.objeto_seleccionado = null;
        for (int i = 0; i < 6; i++) {
            this.pokemones.add(null);
        }
    }

    public EquipoPokemon(ArrayList<Pokemon> Pokemones) {
        this.pokemon_seleccionado = null;
        for (int i = 0; i < 6; i++) {
            this.pokemones.add(null);
        }
        this.pokemones = Pokemones;
    }

    //Getters and Setters
    public int getNum_Pokemon() {
        return num_Pokemon;
    }

    public void setNum_Pokemon(int num_Pokemon) {
        this.num_Pokemon = num_Pokemon;
    }

    public ArrayList<Pokemon> getPokemones() {
        return this.pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    public Pokemon getPokemon_seleccionado() {
        return pokemon_seleccionado;
    }

    public void setPokemon_seleccionado(Pokemon pokemon_seleccionado) {
        this.pokemon_seleccionado = pokemon_seleccionado;
    }

    public Objeto getObjeto_seleccionado() {
        return objeto_seleccionado;
    }

    public void setObjeto_seleccionado(Objeto objeto_seleccionado) {
        this.objeto_seleccionado = objeto_seleccionado;
    }

    //Metodos
    public void mover_Pokemon_posicion(int posicion_salida, int posicion_llegada) {
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

    public void quitarObjeto(int posicion) {
        if (posicion >= 0 && posicion < this.num_Pokemon) {
            if (this.pokemones.get(posicion) != null) {
                if (this.pokemones.get(posicion).getObjeto() != null) {
                    this.objeto_seleccionado = this.pokemones.get(posicion).getObjeto();
                    this.pokemones.get(posicion).setObjeto(null);
                } else {
                    System.out.println("Este pokemón no tiene objeto");
                }
            } else {
                System.out.println("No hay ningún pokemón en esta posición");
            }
        } else {
            System.out.println("La posición especificada está fuera de los límites del ArrayList.");
        }
    }

    public void darObjetoPokemon(Objeto objeto, int posicion) {
        if (posicion >= 0 && posicion < this.num_Pokemon) {
            if (this.pokemones.get(posicion) != null) {
                if (this.pokemones.get(posicion).getObjeto() == null) {
                    this.pokemones.get(posicion).setObjeto(objeto);
                } else {
                    System.out.println("Este pokemón ya tiene objeto");
                }
            } else {
                System.out.println("No hay ningún pokemón en esta posición");
            }
        } else {
            System.out.println("La posición especificada está fuera de los límites del ArrayList.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pokemones);
        return sb.toString();
    }

}
