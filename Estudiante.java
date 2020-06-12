package examenEntornos;

/**
 * @author Jaime Rabasco Ronda
 * 
 * La clase estudiantes nos permite conocer los datos sobre los estudiantes del centro
 */
/*Refactorizacion
Extrae una superclase con los campos
	nombre
	apellidos
	nif
y los metodos
	getNombre(), setNombre()
	getApellidos(), setApellidos()
	getNif(), setNif()*/
	
enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};

public class Estudiante extends Persona{
	Curso curso;
	/**
	 * @param nombre
	 * 
	 * Aqui insertamos el nombre del alumno
	 * 
	 * @param apellidos
	 * 
	 * Aqui insertamos el apellido del alumno
	 * 
	 * @param nif
	 * 
	 * Aqui insertamos el Nif del alumno
	 * 
	 * @param curso
	 * 
	 * Aqui insertamos el Curso al que pertenece el alumno
	 */
	protected Estudiante(String nombre, String apellidos, String nif,
			Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.curso = curso;
	}

	/**
	 * @return Nos devuelve el curso al que pertenece el alumno
	 */
	protected Curso getCurso() {
		return curso;
	}

	/**
	 * @param Insertamos el curso al que pertenece el alumno, los cursos solo pueden ser: PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
	 */
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}