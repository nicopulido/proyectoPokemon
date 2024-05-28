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
    public void almacenar_Pokemon() {
    	pokemonSeleccionado.setA(true);
    }

    public void eliminar_Pokemon() {
    	pokemonSeleccionado.setA(false);
    }

    public void almacenar_Objeto(Objeto objeto) {
    	objetos.add(objeto);
    }

    public void eliminar_Objeto(Objeto objeto) {
    	objetos.remove(objeto);
    	
    }
    
    
}
