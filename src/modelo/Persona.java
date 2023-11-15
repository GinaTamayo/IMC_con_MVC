package modelo;

public class Persona {
	
	private int edad;
	private String documento, nombre, mensajeIMC;
	private double peso, talla, reultadoIMC;
	
	public Persona () {
		
	}
	
	public Persona(int edad, String documento, String nombre, double peso, double talla, double reultadoIMC, String mensajeIMC) {
		super();
		this.edad = edad;
		this.documento = documento;
		this.nombre = nombre;
		this.peso = peso;
		this.talla = talla;
		this.reultadoIMC = reultadoIMC;
		this.mensajeIMC = mensajeIMC;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public double getReultadoIMC() {
		return reultadoIMC;
	}

	public void setReultadoIMC(double reultadoIMC) {
		this.reultadoIMC = reultadoIMC;
	}

	public String getMensajeIMC() {
		return mensajeIMC;
	}

	public void setMensajeIMC(String mensajeIMC) {
		this.mensajeIMC = mensajeIMC;
	}
}
