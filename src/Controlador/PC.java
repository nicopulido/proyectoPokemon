package Controlador;

import Modelo.Caja;
import Modelo.Objeto;
import Modelo.Pokemon;
import java.util.ArrayList;



//este es el controlador


public class PC {

    private ArrayList<Caja> cajas;
    private ArrayList<Objeto> objetos;
    private Pokemon pokemonSeleccionado;
    private Objeto objeto;
    
    
    //constructores

    public PC() {
        this.cajas = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Caja caja = new Caja();
            this.cajas.add(caja);
        }
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
