package Controlador;

import Modelo.Caja;
import Modelo.EquipoPokemon;
import Modelo.Objeto;
import Modelo.Pokemon;

public class Tests {

    public static void main(String[] args) {
        Caja caja = new Caja("AlgunFondo", 1);
        EquipoPokemon equipo = new EquipoPokemon();

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

        //instancias de objetos
        Objeto pokeball = new Objeto("Pokeball", "Una esfera utilizada para capturar Pokémon.");
        Objeto poción = new Objeto("Poción", "Una poción que restaura algunos puntos de salud a un Pokémon.");
        Objeto superpoción = new Objeto("Superpoción", "Una poción más fuerte que restaura más puntos de salud a un Pokémon.");
        Objeto repelente = new Objeto("Repelente", "Un spray que repele Pokémon salvajes durante un tiempo limitado.");
        Objeto revive = new Objeto("Revive", "Un medicamento que revive a un Pokémon desmayado y restaura parte de su salud.");
        Objeto huevo = new Objeto("Huevo", "Un huevo misterioso que podría eclosionar en un Pokémon.");
        Objeto baya = new Objeto("Baya", "Una baya sabrosa que puede ser comida por un Pokémon para restaurar algo de salud.");
        Objeto piedra = new Objeto("Piedra", "Una piedra especial que puede inducir la evolución de ciertos Pokémon.");

        /*
        System.out.println(equipo);

        equipo.agregar_Pokemon(blastoise, 0);
        equipo.agregar_Pokemon(bulbasaur, 1);
        equipo.agregar_Pokemon(alakazam, 2);
        equipo.agregar_Pokemon(dragonair, 3);
        equipo.agregar_Pokemon(articuno, 4);
        equipo.agregar_Pokemon(gengar, 5);
        equipo.agregar_Pokemon(lapras, 6);
        equipo.agregar_Pokemon(dratini, 0);

        equipo.darObjetoPokemon(huevo, 5);

        System.out.println(equipo.getPokemones());
        System.out.println(equipo.getPokemones().get(5).getObjeto());
        equipo.quitarObjeto(5);
        System.out.println(equipo.getPokemones().get(5).getObjeto() + " " + equipo.getObjeto_seleccionado());
        equipo.darObjetoPokemon(huevo, 5);
        System.out.println(equipo.getPokemones().get(5).getObjeto());
        equipo.darObjetoPokemon(baya, 5);
        System.out.println(equipo.getPokemones().get(5).getObjeto());
        equipo.darObjetoPokemon(piedra, 0);
        System.out.println(equipo.getPokemones().get(0).getObjeto());
        System.out.println(equipo);
         */
 /*
        System.out.println(caja.getPokemones().size());

        caja.agregar_Pokemon(pikachu, 0);
        caja.agregar_Pokemon(charizard, 1);
        caja.agregar_Pokemon(bulbasaur, 1);
        caja.agregar_Pokemon(bulbasaur, 4);
        caja.agregar_Pokemon(alakazam, 10);

        System.out.println(caja.getPokemones());
        
        caja.soltar_Pokemon(0);
        
        /// System.out.println(caja.getPokemones());   PARA PROBAR LA LIBERACIÓN DE POKEMONES EN LA CAJA
        
         esto es para probar los cambios de posicon con el método de mover pokemon
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
