package Controlador;

import Modelo.Caja;
import Modelo.EquipoPokemon;
import Modelo.Mochila;
import Modelo.Objeto;
import Modelo.Pokemon;
import Vista.Vista;
import java.util.ArrayList;



//este es el controlador


public class PC {

    private ArrayList<Caja> cajas;
    private ArrayList<Objeto> objetos;
    private Pokemon pokemonSeleccionado;
    private EquipoPokemon equipoPokemon;
    private Objeto objeto;
    private Mochila mochila;
    private Vista vista;
    
    
    //constructores

    public PC() {
        this.cajas = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Caja caja = new Caja();
            this.cajas.add(caja);
        }
    }
    //constructor solo para pruebas
    public PC(Caja[] cajas, EquipoPokemon equipoPokemon, Mochila mochila){
        this.equipoPokemon = equipoPokemon;
        this.mochila = mochila;
        this.cajas = new ArrayList<>();
        for(Caja caja : cajas ){
            this.cajas.add(caja);
        }
        this.vista = new Vista(this);
        this.vista.getVentana().setVisible(true);
    }

    public PC(ArrayList<Caja> cajas, ArrayList<Objeto> objetos) {
        this.cajas = cajas;
        this.objetos = objetos;
    }

    //Getter and Setter
    public ArrayList<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(ArrayList<Caja> cajas) {
        this.cajas = cajas;
    }

    //netodos
    
    public void cambiarPokemondeCaja(int indexPokemonSalida, int indexPokemonLlegada, int numeroCajaSalida, int numeroCajaLlegada){
        Caja cajaSalida = this.cajas.get(numeroCajaSalida);
        Caja cajaLlegada = this.cajas.get(numeroCajaLlegada);
        Pokemon pokemonSalida = cajaSalida.obtenerPokemonEnPosicion(indexPokemonSalida);
        Pokemon pokemonLlegada = cajaLlegada.obtenerPokemonEnPosicion(indexPokemonLlegada);
        cajaSalida.soltar_Pokemon(indexPokemonSalida);
        cajaLlegada.soltar_Pokemon(indexPokemonLlegada);
        cajaSalida.agregar_Pokemon(pokemonLlegada, indexPokemonSalida);
        cajaLlegada.agregar_Pokemon(pokemonSalida, indexPokemonLlegada);
        System.out.println(pokemonSalida);
        System.out.println(pokemonLlegada);
    }
    
    public Pokemon obtenerPokemonEnPosicion(int numeroCaja,int posicionPokemon){
        return this.cajas.get(numeroCaja).obtenerPokemonEnPosicion(posicionPokemon);
    }
}
