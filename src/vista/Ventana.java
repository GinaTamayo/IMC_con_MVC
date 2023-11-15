package vista;
import controlador.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import modelo.Persona;
import modelo.Procesos;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Ventana extends JFrame implements ActionListener{
	private Coordinador miCoordinador;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDocumento;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtTalla;
	private JLabel etiResultado;
	private JButton btnCalcularIMC;
	private JButton btnCalcularPromedio;
	private JButton btnRegistrar;
	private JButton btnListarPersonas;
	private JTextArea areaResultado;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiTitulo = new JLabel("formulario");
		etiTitulo.setBounds(193, 10, 48, 14);
		etiTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(etiTitulo);
		
		JLabel etiNombre = new JLabel("Nombre");
		etiNombre.setBounds(58, 55, 54, 14);
		etiNombre.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(etiNombre);
		
		JLabel etiDocumento = new JLabel("Documento");
		etiDocumento.setBounds(58, 80, 68, 14);
		etiDocumento.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(etiDocumento);
		
		JLabel etiEdad = new JLabel("Edad");
		etiEdad.setBounds(58, 105, 48, 14);
		etiEdad.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(etiEdad);
		
		JLabel etiPeso = new JLabel("Peso");
		etiPeso.setBounds(58, 129, 48, 14);
		etiPeso.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(etiPeso);
		
		JLabel etiTalla = new JLabel("Talla");
		etiTalla.setBounds(58, 154, 48, 14);
		etiTalla.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(etiTalla);
		
		etiResultado = new JLabel("Resultado");
		etiResultado.setBounds(28, 214, 98, 37);
		etiResultado.setHorizontalAlignment(SwingConstants.CENTER);
		etiResultado.scrollRectToVisible(getBounds());
		contentPane.add(etiResultado);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(122, 52, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(136, 77, 86, 20);
		txtDocumento.setColumns(10);
		contentPane.add(txtDocumento);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(116, 102, 86, 20);
		txtEdad.setColumns(10);
		contentPane.add(txtEdad);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(116, 126, 86, 20);
		txtPeso.setColumns(10);
		contentPane.add(txtPeso);
		
		txtTalla = new JTextField();
		txtTalla.setBounds(116, 151, 86, 20);
		txtTalla.setColumns(10);
		contentPane.add(txtTalla);
		
		btnCalcularIMC = new JButton("Calcular IMC");
		btnCalcularIMC.setBounds(230, 488, 124, 23);
		btnCalcularIMC.addActionListener(this);
		contentPane.add(btnCalcularIMC);
		
		btnCalcularPromedio = new JButton("Calcular Promedio");
		btnCalcularPromedio.setBounds(38, 488, 151, 23);
		btnCalcularPromedio.addActionListener(this);
		contentPane.add(btnCalcularPromedio);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(230, 519, 124, 23);
		btnRegistrar.addActionListener(this);
		contentPane.add(btnRegistrar);
		
		btnListarPersonas = new JButton("Listar Personas");
		btnListarPersonas.setBounds(37, 519, 152, 23);
		btnListarPersonas.addActionListener(this);
		contentPane.add(btnListarPersonas);
		
		areaResultado = new JTextArea();
		areaResultado.setBounds(28, 262, 336, 103);
		areaResultado.setLineWrap(true);
		JScrollPane scrollArea = new JScrollPane();
		scrollArea.setViewportView(areaResultado);
		scrollArea.setBounds(28, 262, 339, 215);
		contentPane.add(scrollArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnCalcularIMC) {
			double talla = Double.parseDouble(txtTalla.getText());
			double peso = Double.parseDouble(txtPeso.getText());
			String resultado = miCoordinador.calcularIMC(talla, peso);
			areaResultado.setText(resultado);
		} else if (e.getSource() == btnCalcularPromedio) {
			areaResultado.setText(miCoordinador.consultarPromedio());
		} else if (e.getSource() == btnRegistrar) {
			Persona miPersona = new Persona();
			
			miPersona.setDocumento(txtDocumento.getText());
			miPersona.setNombre(txtNombre.getText());
			miPersona.setEdad(Integer.parseInt(txtEdad.getText()));
			miPersona.setTalla(Double.parseDouble(txtTalla.getText()));
			miPersona.setPeso(Double.parseDouble(txtPeso.getText()));
			
			areaResultado.setText(miCoordinador.registrarPersona(miPersona));
		} else if (e.getSource() == btnListarPersonas) {
			areaResultado.setText(miCoordinador.consultarListaPersonas());
		}
	}

	public void setCoordinador(Coordinador miCoordinador) {
		// TODO Auto-generated method stub
		this.miCoordinador = miCoordinador;
	}
}
