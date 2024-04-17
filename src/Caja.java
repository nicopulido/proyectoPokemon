/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ElPul
 */
public class Caja {
    
	//agregar los atributos
	
	private String fondo;
	private int num_Espacios;
	private int num_Caja;
	private boolean espacio_Ocupado;
	
	//constructores
	public Caja () {}
	
	public Caja (String fondo, int num_Espacios, int num_Caja, boolean espacio_Ocupado) {
		this.espacio_Ocupado= espacio_Ocupado;
		this.fondo= fondo;
		this.num_Caja= num_Caja;
		this.num_Espacios= num_Espacios;
	}

	//Getter and Setter
	public String getFondo() {
		return fondo;
	}

	public void setFondo(String fondo) {
		this.fondo = fondo;
	}

	public int getNum_Espacios() {
		return num_Espacios;
	}

	public void setNum_Espacios(int num_Espacios) {
		this.num_Espacios = num_Espacios;
	}

	public int getNum_Caja() {
		return num_Caja;
	}

	public void setNum_Caja(int num_Caja) {
		this.num_Caja = num_Caja;
	}

	public boolean isEspacio_Ocupado() {
		return espacio_Ocupado;
	}

	public void setEspacio_Ocupado(boolean espacio_Ocupado) {
		this.espacio_Ocupado = espacio_Ocupado;
	}
	
	//metodos
	
	public void Mostrar_Pokemon() {}
	public void Mover_Pokemon() {}
	public void soltar_Pokemon() {}
}
