package controlador;
import java.awt.EventQueue;

import modelo.Procesos;
import vista.Ventana;

public class Principal {
	public static void main(String[] args) {
		Ventana miVentana;
		Procesos misProcesos;
		Coordinador miCoordinador;
		
		miVentana = new Ventana();
		misProcesos = new Procesos();
		miCoordinador = new Coordinador();
		
		miVentana.setCoordinador(miCoordinador);

		miCoordinador.setVentana(miVentana);
		miCoordinador.setProcesos(misProcesos);
		
	    miVentana.setVisible(true);
	}
}
