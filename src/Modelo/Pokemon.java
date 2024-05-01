package Modelo;


import Modelo.Objeto;


public class Pokemon {

    //aquí van los atributos
    private String nombre;
    private String tipo;
    private int nivel;
    private float altura;
    private float peso;
    private Objeto objeto;
    private boolean a;

    //para crear un pokemón completo sin objeto
    public Pokemon(String nombre, String tipo, int nivel, float altura, float peso, boolean a) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.altura = altura;
        this.peso = peso;
        this.a=a;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

	public boolean isA() {
		return a;
	}

	public void setA(boolean a) {
		this.a = a;
	}
    

}
