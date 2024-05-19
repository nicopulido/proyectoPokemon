package Modelo;

import java.util.ArrayList;

public class Caja {

    //agregar los atributos
    private final static int num_Espacios = 30; //porque solamente pueden haber 30 espacios por caja
    private static int num_Caja = 0;
    private ArrayList<Pokemon> pokemones;

    //constructores
    public Caja() {
        this.num_Caja += 1;
        this.pokemones = new ArrayList<Pokemon>(Caja.num_Espacios);
        for (int i = 0; i < 30; i++) {
            this.pokemones.add(null);
        }
    }

    //Getter and Setter
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
                System.out.println("No hay ningun pokemón aquí, Posicion: " + posicion_salida);
            } else if (posicion_llegada != posicion_salida) {
                Pokemon pokemonLlegada = pokemones.get(posicion_llegada);
                Pokemon pokemonSalida = pokemones.get(posicion_salida);
                this.pokemones.set(posicion_salida, pokemonLlegada);
                this.pokemones.set(posicion_llegada, pokemonSalida);
            }
        } else {
            System.out.println("Alguna de las 2 posiciones no está dentro de los límites");
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
            System.out.println("No hay ningún pokemón en la posición " + posicion + " de la caja");
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
            System.out.println("No hay ningún pokemón en la posición " + posicion + " de la caja");
        }
    }

    public void llevarPokemonAEquipo(int posicionCaja, int posicionEquipo, EquipoPokemon equipoPokemon) {
        if (posicionCaja >= 0 && posicionCaja < this.pokemones.size()) {
            if (posicionEquipo < equipoPokemon.getNum_Pokemon() && posicionEquipo >= 0) {
                if (this.pokemones.get(posicionCaja) != null) {
                    Pokemon pokemonCaja = this.pokemones.get(posicionCaja);
                    Pokemon pokemonEquipo = equipoPokemon.getPokemones().get(posicionEquipo);
                    this.pokemones.set(posicionCaja, pokemonEquipo);
                    equipoPokemon.getPokemones().set(posicionEquipo, pokemonCaja);
                } else {
                    System.out.println("No hay ningún pokemón en la posición " + posicionCaja + " de la caja");
                }
            } else {
                System.out.println("La posición en el equipo no es valida");
            }
        } else {
            System.out.println("La posición en la caja no es valida");
        }
    }

    public void quitarObjetoPokemon(int posicionPokemon, Mochila mochila) {
        if (posicionPokemon >= 0 && posicionPokemon < Caja.num_Espacios) {
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
            System.out.println("No hay ningún pokemón en la posición " + posicionPokemon + " de la caja");
        }

    }

    public void darObjetoPokemon(Objeto objeto, int posicion) {
        if (posicion >= 0 && posicion < Caja.num_Espacios) {
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
            System.out.println("No hay ningún pokemón en la posición " + posicion + " de la caja");
        }
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pokemones);
        return sb.toString();
    }
}
