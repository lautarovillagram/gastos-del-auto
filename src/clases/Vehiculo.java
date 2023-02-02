package clases;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

	private String modelo;
	private List<Gasto> gastos = new ArrayList<>();

	public Vehiculo(String modelo) {
		super();

		this.modelo = modelo;

	}

	public List<Gasto> getGastos() {
		return gastos;
	}

	public void setGastos(List<Gasto> gastos) {
		this.gastos = gastos;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String toString() {
		return getModelo();
	}
	
	

}
