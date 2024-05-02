package Controlador;

import Modelo.Caja;
import Modelo.Pokemon;

public class Tests {

    public static void main(String[] args) {
        Caja caja = new Caja("AlgunFondo", 1);

        //estas son instancias de prueba para pokemon
        Pokemon charmander = new Pokemon("Charmander", "Fuego", 14, 145, 56, true);
        Pokemon squirtle = new Pokemon("Squirtle", "Agua", 12, 132, 45, true);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Planta", 11, 128, 49, true);
        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 13, 155, 60, true);
        Pokemon jigglypuff = new Pokemon("Jigglypuff", "Normal", 10, 115, 55, true);
        Pokemon eevee = new Pokemon("Eevee", "Normal", 12, 135, 51, true);
        Pokemon magikarp = new Pokemon("Magikarp", "Agua", 9, 100, 30, true);
        Pokemon meowth = new Pokemon("Meowth", "Normal", 11, 120, 45, true);
        Pokemon charizard = new Pokemon("Charizard", "Fuego", 17, 170, 75, true);
        Pokemon blastoise = new Pokemon("Blastoise", "Agua", 16, 160, 80, true);
        Pokemon venusaur = new Pokemon("Venusaur", "Planta", 18, 180, 85, true);
        Pokemon raichu = new Pokemon("Raichu", "Eléctrico", 15, 160, 70, true);
        Pokemon snorlax = new Pokemon("Snorlax", "Normal", 20, 200, 120, true);
        Pokemon dragonite = new Pokemon("Dragonite", "Dragón", 21, 210, 100, true);
        Pokemon mewtwo = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon gengar = new Pokemon("Gengar", "Fantasma", 18, 175, 65, true);
        Pokemon alakazam = new Pokemon("Alakazam", "Psíquico", 16, 165, 55, true);
        Pokemon machamp = new Pokemon("Machamp", "Lucha", 19, 185, 90, true);
        Pokemon gyarados = new Pokemon("Gyarados", "Agua", 20, 200, 95, true);
        Pokemon mew = new Pokemon("Mew", "Psíquico", 18, 175, 70, true);
        Pokemon lapras = new Pokemon("Lapras", "Agua", 17, 170, 85, true);
        Pokemon articuno = new Pokemon("Articuno", "Hielo", 20, 190, 90, true);
        Pokemon zapdos = new Pokemon("Zapdos", "Eléctrico", 18, 180, 85, true);
        Pokemon moltres = new Pokemon("Moltres", "Fuego", 19, 185, 80, true);
        Pokemon moltres2 = new Pokemon("Moltres", "Fuego", 19, 185, 80, true);
        Pokemon dratini = new Pokemon("Dratini", "Dragón", 10, 100, 50, true);
        Pokemon dragonair = new Pokemon("Dragonair", "Dragón", 15, 150, 70, true);
        Pokemon mewtwo2 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo3 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo4 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo5 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo6 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo7 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo8 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo9 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo10 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo11 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo12 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo13 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo14 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo15 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo16 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo17 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo18 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo19 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);
        Pokemon mewtwo20 = new Pokemon("Mewtwo", "Psíquico", 22, 220, 90, true);

        System.out.println(caja.getPokemones().size());

        caja.agregar_Pokemon(pikachu, 0);
        caja.agregar_Pokemon(charizard, 1);
        caja.agregar_Pokemon(bulbasaur, 1);
        caja.agregar_Pokemon(bulbasaur, 4);
        caja.agregar_Pokemon(alakazam, 10);

        System.out.println(caja.getPokemones());

        
        /* esto es para probar los cambios de posicon con el método de mover pokemon
        caja.mover_Pokemon_posicion(1, 3);
        System.out.println(caja.getPokemones());
        caja.mover_Pokemon_posicion(0, 3);
        System.out.println(caja.getPokemones());
        caja.mover_Pokemon_posicion(0, 0);
        System.out.println(caja.getPokemones());
        caja.mover_Pokemon_posicion(2, 3);
        System.out.println(caja.getPokemones());
        */
    }
}
