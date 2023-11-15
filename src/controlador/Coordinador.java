package controlador;
import modelo.Persona;
import modelo.Procesos;
import vista.Ventana;

public class Coordinador {
	private Ventana miVentana;
	private Procesos misProcesos;
	
	public void setVentana (Ventana miVentana) {
		this.miVentana = miVentana;
	}
	
	public void setProcesos (Procesos misProcesos) {
		this.misProcesos = misProcesos;
	}
	
	
	public String calcularIMC(double talla, double peso) {
		return misProcesos.calcularIMC(talla, peso);
	}
	
	public String registrarPersona (Persona miPersona) {
		return misProcesos.registrar(miPersona);
	}
	
	public String consultarListaPersonas () {
		return misProcesos.consultarListaPersonas();
	}
	
	public String consultarPromedio () {
		return misProcesos.consultarPromedio();
	}
}
