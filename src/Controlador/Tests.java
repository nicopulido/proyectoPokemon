package Controlador;

import Modelo.Caja;
import Modelo.EquipoPokemon;
import Modelo.Objeto;
import Modelo.Pokemon;

public class Tests {

    public static void main(String[] args) {
        Caja caja = new Caja("AlgunFondo", 1);
        EquipoPokemon equipo = new EquipoPokemon();

       System.out.println(equipo);
       
       Pokemon pikachu= new Pokemon("Bonito","Electrico",23,34,43,true);
       
       equipo.agregar_Pokemon(pikachu, 5);
       System.out.println(equipo);
       
       caja.agregar_Pokemon(pikachu, 0);
       
       System.out.println(caja);
       
    }
    
}