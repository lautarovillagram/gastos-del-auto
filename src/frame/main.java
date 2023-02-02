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
import javax.swing.JComboBox;

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
		setBounds(100, 100, 714, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVehiculo = new JLabel("Modelo del vehiculo");
		lblVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVehiculo.setBounds(249, 77, 176, 25);
		contentPane.add(lblVehiculo);
		
		fldDolar = new JTextField();
		fldDolar.setBounds(574, 82, 86, 20);
		contentPane.add(fldDolar);
		fldDolar.setColumns(10);
		
		JLabel lblValorDolar = new JLabel("Valor USD");
		lblValorDolar.setBounds(505, 85, 59, 14);
		contentPane.add(lblValorDolar);
		
		JLabel lblValorSeguro = new JLabel("Valor seguro");
		lblValorSeguro.setBounds(423, 285, 92, 14);
		contentPane.add(lblValorSeguro);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 113, 310, 449);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		fldSeguro = new JTextField();
		fldSeguro.setColumns(10);
		fldSeguro.setBounds(505, 282, 86, 20);
		contentPane.add(fldSeguro);
		
		JLabel lblAgregarGasto = new JLabel("Agregar gasto");
		lblAgregarGasto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAgregarGasto.setBounds(464, 313, 92, 19);
		contentPane.add(lblAgregarGasto);
		
		fldConceptoGasto = new JTextField();
		fldConceptoGasto.setBounds(405, 343, 282, 20);
		contentPane.add(fldConceptoGasto);
		fldConceptoGasto.setColumns(10);
		
		JLabel lblConceptoGasto = new JLabel("Concepto");
		lblConceptoGasto.setBounds(337, 346, 58, 14);
		contentPane.add(lblConceptoGasto);
		
		fldValorGasto = new JTextField();
		fldValorGasto.setBounds(405, 374, 86, 20);
		contentPane.add(fldValorGasto);
		fldValorGasto.setColumns(10);
		
		JButton btnAgregarGasto = new JButton("Agregar");
		btnAgregarGasto.setBounds(532, 373, 106, 23);
		contentPane.add(btnAgregarGasto);
		
		JLabel lblValorGasto = new JLabel("Valor");
		lblValorGasto.setBounds(347, 377, 46, 14);
		contentPane.add(lblValorGasto);
		
		JLabel lblCombustible = new JLabel("Combustible");
		lblCombustible.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCombustible.setBounds(464, 448, 92, 20);
		contentPane.add(lblCombustible);
		
		fldCantidadLitros = new JTextField();
		fldCantidadLitros.setBounds(410, 498, 86, 20);
		contentPane.add(fldCantidadLitros);
		fldCantidadLitros.setColumns(10);
		
		JLabel lblLitros = new JLabel("litros");
		lblLitros.setBounds(354, 501, 46, 14);
		contentPane.add(lblLitros);
		
		JLabel lblValorCombustible = new JLabel("valor");
		lblValorCombustible.setBounds(521, 501, 46, 14);
		contentPane.add(lblValorCombustible);
		
		fldValorCombustible = new JTextField();
		fldValorCombustible.setBounds(565, 498, 86, 20);
		contentPane.add(fldValorCombustible);
		fldValorCombustible.setColumns(10);
		
		JButton btnAgregarCombustible = new JButton("Agregar");
		btnAgregarCombustible.setBounds(456, 539, 89, 23);
		contentPane.add(btnAgregarCombustible);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(347, 413, 144, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblGastosDelmesActual = new JLabel("Gastos del mes actual");
		lblGastosDelmesActual.setBounds(354, 151, 137, 14);
		contentPane.add(lblGastosDelmesActual);
		
		JLabel lblGastosDelMesAnterior = new JLabel("Gastos del mes anterior");
		lblGastosDelMesAnterior.setBounds(538, 151, 140, 14);
		contentPane.add(lblGastosDelMesAnterior);
		
		JLabel lblGastosActual = new JLabel("");
		lblGastosActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGastosActual.setBounds(354, 176, 115, 25);
		contentPane.add(lblGastosActual);
		
		JLabel lblGastosAnterior = new JLabel("");
		lblGastosAnterior.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGastosAnterior.setBounds(538, 176, 113, 25);
		contentPane.add(lblGastosAnterior);
		
		JButton btnNewButton_1 = new JButton("ver mensual");
		btnNewButton_1.setBounds(330, 222, 117, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("ver anual");
		btnNewButton_1_1.setBounds(464, 222, 101, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("ver historico");
		btnNewButton_1_1_1.setBounds(575, 222, 112, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Administrar vehiculos");
		btnNewButton_2.setBounds(10, 11, 133, 25);
		contentPane.add(btnNewButton_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(387, 13, 161, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton_3 = new JButton("seleccionar");
		btnNewButton_3.setBounds(584, 13, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
