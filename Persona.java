package examenEntornos;

/**
 * 
 * La clase persona es una superclase que proviene de estudiante, con ella podemos trabajar de forma mas general con mas empleados del centro
 * o de cualquier otro lugar
 * @author Sergio Vera Jurado
 * @version 1.0.0
 */

public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String nif;

	public Persona() {
		super();
	}

	/**
	 * @return Devuelve el nombre que le hemos insertado
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param insertamos el nombre
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return Nos devuelve los apellidos insertados
	 */
	protected String getApellidos() {
		return apellidos;
	}

	/**
	 * @param Insertamos los apellidos
	 */
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return nos devuelve el Nif de la persona
	 */
	protected String getNif() {
		return nif;
	}

	/**
	 * @param Insertamos el Nif de la persona
	 */
	protected void setNif(String nif) {
		this.nif = nif;
	}

}