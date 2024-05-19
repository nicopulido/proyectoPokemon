package Modelo;

import java.util.ArrayList;

public class Mochila {

    private ArrayList<Objeto> objetos;

    public Mochila(ArrayList<Objeto> objetos) {
        this.objetos = objetos;
    }

    public Mochila() {
        this.objetos = new ArrayList<>();
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<Objeto> objetos) {
        this.objetos = objetos;
    }

    public void darObjetoPokemonEquipo(int posicionObjeto, int posicionPokemon, EquipoPokemon equipoPokemon) {
        Objeto objeto = this.objetos.get(posicionObjeto);
        if (posicionObjeto >= 0 && posicionObjeto < this.objetos.size()) {
            equipoPokemon.darObjetoPokemon(objeto, posicionPokemon);
            this.objetos.set(posicionObjeto, null);
        } else {
            System.out.println("Posición del objeto invalida");
        }
    }

    public void darObjetoPokemonCaja(int posicionObjeto, int posicionPokemon, Caja caja) {
        Objeto objeto = this.objetos.get(posicionObjeto);
        if (posicionObjeto >= 0 && posicionObjeto < this.objetos.size()) {
            caja.darObjetoPokemon(objeto, posicionPokemon);
            this.objetos.set(posicionObjeto, null);
        } else {
            System.out.println("Posición del objeto invalida");
        }
    }

    public void eliminarObjeto() {

    }

}
