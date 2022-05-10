package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	
	private int ventas;
	
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante (String nombre, Pais pais){
		this.nombre = nombre;
		this.pais = pais;
		
		fabricantes.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	
	public int getVentas() {
		return ventas;
	}
	
	public void agregarVenta() {
		ventas++;
		pais.agregarVenta();
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas () {
		return new Fabricante("", new Pais(""));
	}
	
}
