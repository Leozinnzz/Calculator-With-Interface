package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Color;

	

public class Graphic extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtPantalla;
	
	
	//VARIABLES
	double numero1;
	double numero2;
	double resultado;
	String operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graphic frame = new Graphic();
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
	public Graphic() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 391);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(215, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Locale.setDefault(Locale.US);
		
		textField = new JTextField();
		textField.setBounds(291, 71, 0, 0);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 32, 0, 0);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtPantalla = new JTextField();
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setFont(new Font("Arial", Font.BOLD, 18));
		txtPantalla.setBounds(18, 10, 217, 43);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
			}
		});
		btnNewButton.setBounds(182, 67, 53, 52);
		contentPane.add(btnNewButton);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 3
				String ingreseNumero = txtPantalla.getText() + btn3.getText();	
				txtPantalla.setText(ingreseNumero);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 18));
		btn3.setBounds(125, 128, 53, 43);
		contentPane.add(btn3);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SOMA
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operation ="+";
			}
		});
		btnSuma.setForeground(new Color(255, 0, 0));
		btnSuma.setFont(new Font("Arial", Font.BOLD, 18));
		btnSuma.setBounds(182, 128, 53, 43);
		contentPane.add(btnSuma);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 2
				String ingreseNumero = txtPantalla.getText() + btn2.getText();	
				txtPantalla.setText(ingreseNumero);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 18));
		btn2.setBounds(69, 128, 53, 43);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//NUMERO 1
				String ingreseNumero = txtPantalla.getText() + btn1.getText();
				txtPantalla.setText(ingreseNumero);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 18));
		btn1.setBounds(10, 128, 53, 43);
		contentPane.add(btn1);
		
		
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 4
				String ingreseNumero = txtPantalla.getText() + btn4.getText();	
				txtPantalla.setText(ingreseNumero);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 18));
		btn4.setBounds(10, 181, 53, 43);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 5
				String ingreseNumero = txtPantalla.getText() + btn5.getText();	
				txtPantalla.setText(ingreseNumero);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 18));
		btn5.setBounds(69, 181, 53, 43);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 6
				String ingreseNumero = txtPantalla.getText() + btn6.getText();	
				txtPantalla.setText(ingreseNumero);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 18));
		btn6.setBounds(125, 181, 53, 43);
		contentPane.add(btn6);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SUBTRACTION
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operation ="-";
			}
		});
		btnResta.setForeground(new Color(255, 0, 0));
		btnResta.setFont(new Font("Arial", Font.BOLD, 35));
		btnResta.setBounds(182, 181, 53, 43);
		contentPane.add(btnResta);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 7
				String ingreseNumero = txtPantalla.getText() + btn7.getText();	
				txtPantalla.setText(ingreseNumero);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 18));
		btn7.setBounds(10, 234, 53, 43);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 8
				String ingreseNumero = txtPantalla.getText() + btn8.getText();	
				txtPantalla.setText(ingreseNumero);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 18));
		btn8.setBounds(69, 234, 53, 43);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//NUMERO 9
				String ingreseNumero = txtPantalla.getText() + btn9.getText();	
				txtPantalla.setText(ingreseNumero);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 18));
		btn9.setBounds(125, 234, 53, 43);
		contentPane.add(btn9);
		
		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PONTO
				String ingreseNumero = txtPantalla.getText() + btnPunto.getText();	
				txtPantalla.setText(ingreseNumero);
			}
		});
		btnPunto.setForeground(new Color(255, 0, 0));
		btnPunto.setFont(new Font("Arial", Font.BOLD, 25));
		btnPunto.setBounds(10, 287, 53, 43);
		contentPane.add(btnPunto);
		
		JButton btnCero = new JButton("0");
		btnCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ZERO
				String ingreseNumero = txtPantalla.getText() + btnCero.getText();	
				txtPantalla.setText(ingreseNumero);
			}
		});
		btnCero.setFont(new Font("Arial", Font.BOLD, 18));
		btnCero.setBounds(69, 287, 53, 43);
		contentPane.add(btnCero);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtPantalla.getText());
				
				if(operation == "+") {
					resultado = numero1 + numero2;
					selecionar = String.format("%.0f", resultado);
					txtPantalla.setText(selecionar);
				}
				
				else if(operation == "-") {
					resultado = numero1 - numero2;
					selecionar = String.format("%.0f", resultado);
					txtPantalla.setText(selecionar);
				}
				
				else if(operation == "*") {
					resultado = numero1 * numero2;
					selecionar = String.format("%.0f", resultado);
					txtPantalla.setText(selecionar);
				}
				else if(operation == "/") {
					resultado = numero1 / numero2;
					selecionar = String.format("%.2f", resultado);
					txtPantalla.setText(selecionar);
				}
				
				
				
				
			}
		});
		btnIgual.setForeground(new Color(255, 0, 0));
		btnIgual.setFont(new Font("Arial", Font.BOLD, 18));
		btnIgual.setBounds(125, 287, 53, 43);
		contentPane.add(btnIgual);
		
		JButton btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MULTIPLICATION
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operation ="*";
			}
		});
		btnMulti.setForeground(new Color(255, 0, 0));
		btnMulti.setFont(new Font("Arial", Font.BOLD, 18));
		btnMulti.setBounds(182, 234, 53, 43);
		contentPane.add(btnMulti);
		
		JButton btnDivi = new JButton("/");
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DIVISION
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operation ="/";
			}
		});
		btnDivi.setForeground(new Color(255, 0, 0));
		btnDivi.setFont(new Font("Arial", Font.BOLD, 25));
		btnDivi.setBounds(182, 287, 53, 43);
		contentPane.add(btnDivi);

	}
}

