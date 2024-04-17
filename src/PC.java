/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author ElPul
 */
public class PC {
    
	private ArrayList<Caja> cajas;
	private ArrayList<Objeto> objetos;
	//constructores
	
	public PC() {}
	public PC(ArrayList<Caja> cajas, ArrayList<Objeto> objetos) {
		this.cajas= cajas;
		this.objetos= objetos;
	}
	
	//Getter and Setter
	public ArrayList<Caja> getCajas() {
		return cajas;
	}
	public void setCajas(ArrayList<Caja> cajas) {
		this.cajas = cajas;
	}
	
	//netodos
	
	public void almacenar_Pokemon() {}
	public void eliminar_POkemon() {}
	public void almacenar_Objeto() {}
	public void eliminar_Objeto() {}

	
}
