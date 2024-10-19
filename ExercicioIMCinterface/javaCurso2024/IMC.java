package javaCurso2024;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IMC extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel resultadoIMC;
	private JLabel resultadoIAC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC frame = new IMC();
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
	public IMC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 756);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(58, 25, 629, 668);
		contentPane.add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBounds(72, 227, 106, 19);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Digite seu peso:");
		lblNewLabel.setBounds(72, 211, 107, 19);
		panel.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(72, 140, 106, 19);
		panel.add(textField_1);

		JLabel lblDigiteSuaAltura = new JLabel("Digite sua altura:");
		lblDigiteSuaAltura.setBounds(72, 125, 107, 19);
		panel.add(lblDigiteSuaAltura);

		JLabel lblCalculoDeImc = new JLabel("CALCULO DE IMC E IAC");
		lblCalculoDeImc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculoDeImc.setBounds(182, 31, 285, 36);
		panel.add(lblCalculoDeImc);
		lblCalculoDeImc.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(72, 320, 106, 19);
		panel.add(textField_2);

		JLabel lblDigiteSuaCircuferencia = new JLabel("Digite sua circunferência do quadril(cm):");
		lblDigiteSuaCircuferencia.setBounds(72, 301, 250, 19);
		panel.add(lblDigiteSuaCircuferencia);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(IMC.class.getResource("/imagem/iac(2).png")));
		lblNewLabel_1.setBounds(320, 116, 272, 240);
		panel.add(lblNewLabel_1);

		// Inicialize os JLabel para resultados
		resultadoIMC = new JLabel("IMC:");
		resultadoIMC.setFont(new Font("Tahoma", Font.BOLD, 16));
		resultadoIMC.setBounds(72, 448, 494, 43);
		panel.add(resultadoIMC);

		resultadoIAC = new JLabel("IAC:");
		resultadoIAC.setFont(new Font("Tahoma", Font.BOLD, 16));
		resultadoIAC.setBounds(72, 501, 494, 43);
		panel.add(resultadoIAC);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Noto Serif", Font.BOLD, 10));
		btnCalcular.setBackground(new Color(255, 255, 255));
		btnCalcular.setBounds(158, 385, 85, 21);
		panel.add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String peso = textField.getText();
				String altura = textField_1.getText();
				String quadril = textField_2.getText();

				try {
					double pes = Double.parseDouble(peso);
					double altCm = Double.parseDouble(altura);
					int qua = Integer.parseInt(quadril);
					

					double altM = altCm / 100.0;
					double imc = pes / (altM * altM);
					resultadoIMC.setText(String.format("IMC: %.2f", imc));

					if (imc < 18.5) {
						resultadoIMC.setText(resultadoIMC.getText() + " (Você está abaixo do peso!)");
					} else if (imc < 24.9) {
						resultadoIMC.setText(resultadoIMC.getText() + " (Peso normal)");
					} else if (imc < 29.9) {
						resultadoIMC.setText(resultadoIMC.getText() + " (Sobrepeso)");
					} else {
						resultadoIMC.setText(resultadoIMC.getText() + " (Obesidade)");
					}

					double iac = (qua / (altM * altM)) - 18;


					resultadoIAC.setText(String.format("IAC: %.2f", iac));

					if (iac < 8.0) {
						resultadoIAC.setText(resultadoIAC.getText() + "(Você é quase um palito!)");

					} else if (iac > 8.0 && iac <= 21.0) {
						resultadoIAC.setText(resultadoIAC.getText() + "(Sua adiposidade está normal.)");
					} else if (iac > 30.0) {
						resultadoIAC.setText(resultadoIAC.getText() + "(OBESO GORDO!!)");
					} 

				} catch (NumberFormatException ex) {
					resultadoIMC.setText("Por favor, insira valores válidos.");
					resultadoIAC.setText("");
				}
			}
		});
	}
}
