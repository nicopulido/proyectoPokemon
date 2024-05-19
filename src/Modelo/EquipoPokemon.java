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
    private final int num_Pokemon = 6;
    private ArrayList<Pokemon> pokemones;

    //Constructores
    public EquipoPokemon() {
        this.pokemones = new ArrayList<Pokemon>(num_Pokemon);
        for (int i = 0; i < 6; i++) {
            this.pokemones.add(null);
        }
    }

    public EquipoPokemon(ArrayList<Pokemon> Pokemones) {
        for (int i = 0; i < 6; i++) {
            this.pokemones.add(null);
        }
        this.pokemones = Pokemones;
    }

    //Getters and Setters
    public int getNum_Pokemon() {
        return num_Pokemon;
    }

    public ArrayList<Pokemon> getPokemones() {
        return this.pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    //Metodos
    //COrregir este método para algo similar a lo que se hizo en la caja
    public void mover_Pokemon_posicion(int posicion_salida, int posicion_llegada) {
        if (posicion_salida >= 0 && posicion_llegada >= 0 && posicion_llegada <= this.pokemones.size() && posicion_salida <= this.pokemones.size()) {
            if (this.pokemones.get(posicion_salida) == null) {
                System.out.println("No hay ningun pokemón aquí, Posicion: " + posicion_salida);
            } else if (posicion_llegada != posicion_salida) {
                Pokemon pokemonLlegada = pokemones.get(posicion_llegada);
                Pokemon pokemonSalida = pokemones.get(posicion_salida);
                this.pokemones.set(posicion_salida, pokemonLlegada);
                this.pokemones.set(posicion_llegada, pokemonSalida);
            }
        } else {
            System.out.println("Alguna de las posiciones no está en los límites");
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
            System.out.println("La posición " + posicion + " no existe en el quipo");
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
            System.out.println("La posición " + posicion + " no existe en el quipo");
        }
    }

    public void quitarObjeto(int posicionPokemon, Mochila mochila) {
        if (posicionPokemon >= 0 && posicionPokemon < this.num_Pokemon) {
            if (this.pokemones.get(posicionPokemon) != null) {
                if (this.pokemones.get(posicionPokemon).getObjeto() != null) {
                    mochila.getObjetos().add(this.pokemones.get(posicionPokemon).getObjeto());
                    this.pokemones.get(posicionPokemon).setObjeto(null);
                } else {
                    System.out.println("Este pokemón no tiene objeto");
                }
            } else {
                System.out.println("No hay ningún pokemón en esta posición");
            }
        } else {
            System.out.println("La posición " + posicionPokemon + " no existe en el quipo");
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
            System.out.println("La posición " + posicion + " no existe en el quipo");
        }
    }
    
    public void llevarPokemonACaja(int posicionCaja, int posicionEquipo, Caja caja) {
        if (posicionCaja >= 0 && posicionCaja < caja.getNum_Espacios()) {
            if (posicionEquipo < this.num_Pokemon && posicionEquipo >= 0) {
                if (this.pokemones.get(posicionEquipo) != null) {
                    Pokemon pokemonEquipo = this.pokemones.get(posicionEquipo);
                    Pokemon pokemonCaja = caja.getPokemones().get(posicionCaja);
                    this.pokemones.set(posicionEquipo, pokemonCaja);
                    caja.getPokemones().set(posicionCaja, pokemonEquipo);
                } else {
                    System.out.println("No hay ningún pokemón en la posición " + posicionEquipo +" del equipo");
                }
            } else {
                System.out.println("La posición en el equipo no es valida");
            }
        } else {
            System.out.println("La posición en la caja no es valida");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pokemones);
        return sb.toString();
    }

}
