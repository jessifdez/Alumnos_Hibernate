package alumnoshibernate;

public class Alumno {
	private String nombre;
	private float nota;
	private int id;
	
	public Alumno() {
	}
	public Alumno(String nombre, float nota, int id) {
		this.nombre = nombre;
		this.nota = nota;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
