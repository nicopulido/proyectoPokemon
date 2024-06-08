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
    private EquipoPokemon equipoPokemon;
    private Mochila mochila;
    private Vista vista;
    private Reproductor reproductor;

    //constructores
    public PC() {
        this.cajas = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Caja caja = new Caja();
            this.cajas.add(caja);
        }
    }

    //constructor solo para pruebas
    public PC(Caja[] cajas, EquipoPokemon equipoPokemon, Mochila mochila) {
        this.reproductor = new Reproductor();
        this.reproductor.cargarSonido("src/Banda Sonora/Pueblo Terracota - OST .wav");
        this.reproductor.reproducirLoop();
        this.equipoPokemon = equipoPokemon;
        this.mochila = mochila;
        this.cajas = new ArrayList<>();
        for (Caja caja : cajas) {
            this.cajas.add(caja);
        }
        this.vista = new Vista(this);
        this.vista.getVentana().setVisible(true);
    }

    public PC(ArrayList<Caja> cajas, ArrayList<Objeto> objetos) {
        this.cajas = cajas;
    }

    //Getter and Setter
    public ArrayList<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(ArrayList<Caja> cajas) {
        this.cajas = cajas;
    }

    //netodos
    public void cambiarPokemondeCaja(int indexPokemonSalida, int indexPokemonLlegada, int numeroCajaSalida, int numeroCajaLlegada) {
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

    public Pokemon obtenerPokemonEnPosicion(int numeroCaja, int posicionPokemon) {
        return this.cajas.get(numeroCaja).obtenerPokemonEnPosicion(posicionPokemon);
    }

    public void soltarPokemon(int numeroCaja, int posicionPokemon) {
        Caja caja = this.cajas.get(numeroCaja);
        caja.soltar_Pokemon(posicionPokemon);
    }

    public void quitarObjetoPokemonCaja(int numeroCaja, int posicionPokemon) {
        Caja caja = this.cajas.get(numeroCaja);
        caja.quitarObjetoPokemon(posicionPokemon, this.mochila);
    }

    public void quitarObjetoPokemonEquipo(int posicionPokemon) {
        this.equipoPokemon.quitarObjeto(posicionPokemon, this.mochila);
    }

    public void liberarPokemonEquipo(int posicionPokemon) {
        this.equipoPokemon.soltar_Pokemon(posicionPokemon);
    }

    public void moverCajaEquipo(int numeroCaja, int posicionPokemonCaja, int posicionPokemonEquipo) {
        Caja caja = this.cajas.get(numeroCaja);
        Pokemon pokemonCaja = caja.obtenerPokemonEnPosicion(posicionPokemonCaja);
        Pokemon pokemonEquipo = this.equipoPokemon.obtenerPokemonPosicion(posicionPokemonEquipo);
        caja.soltar_Pokemon(posicionPokemonCaja);
        this.equipoPokemon.soltar_Pokemon(posicionPokemonEquipo);
        caja.agregar_Pokemon(pokemonEquipo, posicionPokemonCaja);
        this.equipoPokemon.agregar_Pokemon(pokemonCaja, posicionPokemonEquipo);
    }
    
    public void moverPosicionEquipo(int posicionLlegada, int posicionSalida){
        this.equipoPokemon.mover_Pokemon_posicion(posicionSalida, posicionLlegada);
    }


    public EquipoPokemon getEquipoPokemon() {
        return equipoPokemon;
    }

    public void setEquipoPokemon(EquipoPokemon equipoPokemon) {
        this.equipoPokemon = equipoPokemon;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }
    
    public void darObjetoCaja(int posicionObjeto, int posicionPokemon,int indexCaja){
        Caja caja = this.cajas.get(indexCaja);
        this.mochila.darObjetoPokemonCaja(posicionObjeto,posicionPokemon, caja);
    }
    
    public void darObjetoEquipo(int posicionObjeto, int posicionPokemon){
        this.mochila.darObjetoPokemonEquipo(posicionObjeto, posicionPokemon, this.equipoPokemon);
    }

}
