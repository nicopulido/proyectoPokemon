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
    private ArrayList<Pokemon> Pokemones;

    //Constructores
    public EquipoPokemon() {
    }

    public EquipoPokemon(int num_Pokemon, ArrayList<Pokemon> Pokemones) {
        this.num_Pokemon = num_Pokemon;
        this.Pokemones = Pokemones;
    }

    //Getters and Setters
    public int getNum_Pokemon() {
        return num_Pokemon;
    }

    public void setNum_Pokemon(int num_Pokemon) {
        this.num_Pokemon = num_Pokemon;
    }

    public ArrayList<Pokemon> getPokemones() {
        return Pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        Pokemones = pokemones;
    }

    //Metodos
    public void cambiar_Orden(ArrayList<Pokemon> Pokemones) {
    }

    public void agregar_Pokemon() {
    }

    public void sacar_Pokemon() {
    }

    public void quitarObjeto() {
    }
    
    public void darObjetoPokemon() {
        
    }

}
