package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int ventas;
	
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais (String nombre){
		this.nombre = nombre;
		
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	
	public int getVentas() {
		return ventas;
	}
	
	public void agregarVenta() {
		ventas++;
	}
	
	public static Pais paisMasVendedor () {
		Pais masVendedor = null;
		int mayoresVentas = 0;
		
		for (int i = 0; i < paises.size(); i++) {
			if (paises.get(i).ventas > mayoresVentas) {
				masVendedor = null;
				masVendedor = paises.get(i);
				mayoresVentas = paises.get(i).ventas;
			}
	    }
		
		return masVendedor;
	}
	
}
