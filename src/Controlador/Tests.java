package Controlador;

import Modelo.Caja;
import Modelo.EquipoPokemon;
import Modelo.Mochila;
import Modelo.Objeto;
import Modelo.Pokemon;
import java.util.Random;
import java.util.Scanner;

public class Tests {

    public static void main(String[] args) {
        // Crear instancias de las cajas
        Caja caja1 = new Caja();
        Caja caja2 = new Caja();
        Caja caja3 = new Caja();

        // Crear una instancia del equipo y la mochila
        EquipoPokemon equipo = new EquipoPokemon();
        Mochila mochila = new Mochila();

//<<<<<<< HEAD
       System.out.println(equipo);
       
       Pokemon pikachu= new Pokemon("Bonito","Electrico",23,34,43,true);
       
       equipo.agregar_Pokemon(pikachu, 5);
       System.out.println(equipo);
       
       caja1.agregar_Pokemon(pikachu, 0);
       
       System.out.println(caja1);
       
//=======
        // Crear instancias de Pokémon
        Pokemon[] pokemons = {
            new Pokemon("Charmander", "Fuego", 14, 145, 56, true),
            new Pokemon("Squirtle", "Agua", 12, 132, 45, true),
            new Pokemon("Bulbasaur", "Planta", 11, 128, 49, true),
            new Pokemon("Pikachu", "Eléctrico", 13, 155, 60, true),
            new Pokemon("Jigglypuff", "Normal", 10, 115, 55, true),
            new Pokemon("Eevee", "Normal", 12, 135, 51, true),
            new Pokemon("Magikarp", "Agua", 9, 100, 30, true),
            new Pokemon("Meowth", "Normal", 11, 120, 45, true),
            new Pokemon("Charizard", "Fuego", 17, 170, 75, true),
            new Pokemon("Blastoise", "Agua", 16, 160, 80, true),
            new Pokemon("Venusaur", "Planta", 18, 180, 85, true),
            new Pokemon("Raichu", "Eléctrico", 15, 160, 70, true),
            new Pokemon("Snorlax", "Normal", 20, 200, 120, true),
            new Pokemon("Dragonite", "Dragón", 21, 210, 100, true),
            new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true),
            new Pokemon("Gengar", "Fantasma", 18, 175, 65, true),
            new Pokemon("Alakazam", "Psíquico", 16, 165, 55, true),
            new Pokemon("Machamp", "Lucha", 19, 185, 90, true),
            new Pokemon("Gyarados", "Agua", 20, 200, 95, true),
            new Pokemon("Mew", "Psíquico", 18, 175, 70, true),
            new Pokemon("Lapras", "Agua", 17, 170, 85, true),
            new Pokemon("Articuno", "Hielo", 20, 190, 90, true),
            new Pokemon("Zapdos", "Eléctrico", 18, 180, 85, true),
            new Pokemon("Moltres", "Fuego", 19, 185, 80, true),
            new Pokemon("Moltres", "Fuego", 19, 185, 80, true),
            new Pokemon("Dratini", "Dragón", 10, 100, 50, true),
            new Pokemon("Dragonair", "Dragón", 15, 150, 70, true),
            new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true),};

        // Crear instancias de objetos
        Objeto pokeball = new Objeto("Pokeball", "Una esfera utilizada para capturar Pokémon.");
        Objeto poción = new Objeto("Poción", "Una poción que restaura algunos puntos de salud a un Pokémon.");
        Objeto superpoción = new Objeto("Superpoción", "Una poción más fuerte que restaura más puntos de salud a un Pokémon.");
        Objeto repelente = new Objeto("Repelente", "Un spray que repele Pokémon salvajes durante un tiempo limitado.");
        Objeto revive = new Objeto("Revive", "Un medicamento que revive a un Pokémon desmayado y restaura parte de su salud.");
        Objeto huevo = new Objeto("Huevo", "Un huevo misterioso que podría eclosionar en un Pokémon.");
        Objeto baya = new Objeto("Baya", "Una baya sabrosa que puede ser comida por un Pokémon para restaurar algo de salud.");
        Objeto piedra = new Objeto("Piedra", "Una piedra especial que puede inducir la evolución de ciertos Pokémon.");

        // Agregar Pokémon a las cajas en posiciones aleatorias
        Random random = new Random();
        Caja[] cajas = {caja1, caja2, caja3};

        for (Pokemon pokemon : pokemons) {
            int cajaIndex = random.nextInt(cajas.length); // Selecciona una caja aleatoria
            int posicion = random.nextInt(30); // Supongamos que cada caja tiene 30 posiciones
            cajas[cajaIndex].agregar_Pokemon(pokemon, posicion);
        }

        // Mostrar el equipo
        // Agregar Pokémon al equipo
        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(pokemons.length);
            equipo.agregar_Pokemon(pokemons[randomIndex], i);
        }
        // Mostrar el equipo
        
        PC pc = new PC(cajas, equipo, mochila);
        
        /*
        caja1.soltar_Pokemon(0);
        caja1.soltar_Pokemon(1);
        caja1.soltar_Pokemon(4);
        caja1.soltar_Pokemon(7);
        caja1.soltar_Pokemon(8);
        
        caja1.agregar_Pokemon(pokemons[4], 0);
        caja1.agregar_Pokemon(pokemons[5], 1);
        caja1.agregar_Pokemon(pokemons[6], 4);
        caja1.agregar_Pokemon(pokemons[7], 7);
        caja1.agregar_Pokemon(pokemons[8], 8);
        
        System.out.println("\n");
        System.out.println(equipo);
        System.out.println(caja1);
        System.out.println("\n");
        
        
        caja1.llevarPokemonAEquipo(0, 0, equipo);
        System.out.println(equipo);
        System.out.println(caja1);
        
        */
        
        
        
//>>>>>>> branch 'main' of https://github.com/nicopulido/proyectoPokemon
    }
    
}