package frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField fldDolar;
	private JTextField textField_1;
	private JTextField fldSeguro;
	private JTextField fldConceptoGasto;
	private JTextField fldValorGasto;
	private JTextField fldCantidadLitros;
	private JTextField fldValorCombustible;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVehiculo = new JLabel("Modelo del vehiculo");
		lblVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVehiculo.setBounds(241, 11, 176, 25);
		contentPane.add(lblVehiculo);
		
		fldDolar = new JTextField();
		fldDolar.setBounds(601, 17, 86, 20);
		contentPane.add(fldDolar);
		fldDolar.setColumns(10);
		
		JLabel lblValorDolar = new JLabel("Valor USD");
		lblValorDolar.setBounds(532, 20, 59, 14);
		contentPane.add(lblValorDolar);
		
		JLabel lblValorSeguro = new JLabel("Valor seguro");
		lblValorSeguro.setBounds(423, 63, 92, 14);
		contentPane.add(lblValorSeguro);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 60, 310, 351);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		fldSeguro = new JTextField();
		fldSeguro.setColumns(10);
		fldSeguro.setBounds(505, 60, 86, 20);
		contentPane.add(fldSeguro);
		
		JLabel lblAgregarGasto = new JLabel("Agregar gasto");
		lblAgregarGasto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAgregarGasto.setBounds(464, 113, 92, 19);
		contentPane.add(lblAgregarGasto);
		
		fldConceptoGasto = new JTextField();
		fldConceptoGasto.setBounds(405, 143, 282, 20);
		contentPane.add(fldConceptoGasto);
		fldConceptoGasto.setColumns(10);
		
		JLabel lblConceptoGasto = new JLabel("Concepto");
		lblConceptoGasto.setBounds(337, 146, 58, 14);
		contentPane.add(lblConceptoGasto);
		
		fldValorGasto = new JTextField();
		fldValorGasto.setBounds(405, 174, 86, 20);
		contentPane.add(fldValorGasto);
		fldValorGasto.setColumns(10);
		
		JButton btnAgregarGasto = new JButton("Agregar");
		btnAgregarGasto.setBounds(532, 173, 106, 23);
		contentPane.add(btnAgregarGasto);
		
		JLabel lblValorGasto = new JLabel("Valor");
		lblValorGasto.setBounds(347, 177, 46, 14);
		contentPane.add(lblValorGasto);
		
		JLabel lblCombustible = new JLabel("Combustible");
		lblCombustible.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCombustible.setBounds(464, 248, 92, 20);
		contentPane.add(lblCombustible);
		
		fldCantidadLitros = new JTextField();
		fldCantidadLitros.setBounds(410, 298, 86, 20);
		contentPane.add(fldCantidadLitros);
		fldCantidadLitros.setColumns(10);
		
		JLabel lblLitros = new JLabel("litros");
		lblLitros.setBounds(354, 301, 46, 14);
		contentPane.add(lblLitros);
		
		JLabel lblValorCombustible = new JLabel("valor");
		lblValorCombustible.setBounds(521, 301, 46, 14);
		contentPane.add(lblValorCombustible);
		
		fldValorCombustible = new JTextField();
		fldValorCombustible.setBounds(565, 298, 86, 20);
		contentPane.add(fldValorCombustible);
		fldValorCombustible.setColumns(10);
		
		JButton btnAgregarCombustible = new JButton("Agregar");
		btnAgregarCombustible.setBounds(456, 339, 89, 23);
		contentPane.add(btnAgregarCombustible);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(347, 213, 144, 23);
		contentPane.add(btnNewButton);
	}
}
