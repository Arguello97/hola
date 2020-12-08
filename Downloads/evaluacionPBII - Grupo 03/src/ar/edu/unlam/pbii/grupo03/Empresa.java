package ar.edu.unlam.pbii.grupo03;

import java.util.HashSet;



public class Empresa {

	private String nombre;
	private HashSet<Persona> personas;
	private HashSet<Producto> productos;

	public Empresa(String nombre) {
		this.nombre=nombre;
		this.personas=new HashSet<Persona>();
		this.productos=new HashSet<Producto>();
	}

	public HashSet<Producto> getProductos() {
		return productos;
	}

	public void setProductos(HashSet<Producto> productos) {
		this.productos = productos;
	}

	public HashSet<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(HashSet<Persona> personas) {
		this.personas = personas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean vincularPersona(Persona personaAAgregar) {
		return personas.add(personaAAgregar);
		
	}

	public Integer getCantidadDePersonasVinculadas() {
		
		return personas.size();
	}

	public Boolean agregarProducto(Producto aVender) {
		return productos.add(aVender);
		
	}

}
