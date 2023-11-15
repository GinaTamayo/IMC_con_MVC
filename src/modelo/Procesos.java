package modelo;
import java.util.ArrayList;

public class Procesos {
	
	double imc;
	String imcMensaje;
	ArrayList<Persona> listaPersonas;
	
	public Procesos() {
		listaPersonas = new ArrayList<Persona>();
	}
	public String registrar(Persona miPersona) {
		String mensaje = "Registro exitoso:\n";
		mensaje += "Documento: " + miPersona.getDocumento()+ "\n";
		mensaje += "Nombre: " + miPersona.getNombre() + "\n";
		mensaje += "Edad:" + miPersona.getEdad() + "\n";
		mensaje += "Talla " + miPersona.getTalla() + "\n";
		mensaje += "Peso: " + miPersona.getPeso() + "\n";
		
		String imc = calcularIMC(miPersona.getTalla(), miPersona.getPeso());
		
		miPersona.setMensajeIMC(imcMensaje);
		mensaje += imc + "\n";
		miPersona.setReultadoIMC(this.imc);
		
		listaPersonas.add(miPersona);
		return mensaje;
	}
	
	
	public String calcularIMC(double talla, double peso) {
		imc = peso / (talla * talla);
		imcMensaje = "Su IMC indica que tiene: " + conclusionIMC(imc);
		return "IMC: " + imc + "\n" + imcMensaje;
	}
	
	private String conclusionIMC(double imc) {
		String mensaje="";
		
		if (imc < 18) {
			mensaje = "Anorexia";
		} else if (imc >= 18 && imc < 20) {
			mensaje = "Delgadez";
		} else if (imc >= 20 && imc < 27) {
			mensaje = "Normalidad";
		} else if (imc >= 27 && imc < 30) {
			mensaje = "Obesidad Grado 1";
		} else if (imc >= 30 && imc < 35) {
			mensaje = "Obesidad Grado 2";
		} else if (imc >= 35 && imc < 40) {
			mensaje = "Obesidad Grado 3";
		} else if (imc > 40) {
			mensaje = "Obesidad Morbida";
		}
		return mensaje;
	}
	
	public String consultarListaPersonas() {
		String mensaje = "";
		Persona p = null;
		for (int i = 0; i < listaPersonas.size(); i++) {
			p = listaPersonas.get(i);
			mensaje += "Documento: " + p.getDocumento()+ "\n";
			mensaje += "Nombre: " + p.getNombre() + "\n";
			mensaje += "Edad:" + p.getEdad() + "\n";
			mensaje += "Talla " + p.getTalla() + "\n";
			mensaje += "Peso: " + p.getPeso() + "\n";
			mensaje += "IMC: " + p.getReultadoIMC() + "\n";
			mensaje += p.getMensajeIMC() + "\n";
			mensaje += "-------------------------------\n";

		}
		return mensaje;
	}
	
	public String consultarPromedio() {
		double suma = 0;
		for (int i = 0; i < listaPersonas.size(); i++) {
			suma += listaPersonas.get(i).getReultadoIMC();
		}
		double promedio = suma / listaPersonas.size();
		return "El promedio de IMC es: " + promedio;
	}
}
