import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class calc {
	
	String memoria1;
	String signo;
	String memoria2;

	private JFrame frame;
	private JTextField textresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	public static boolean existepunto(String cadena){
		boolean resultado;
		resultado=false;
		
		for(int i=0;i<cadena.length(); i++) {
			if(cadena.substring(i, i+1).equals(".")) {
				resultado=true;
				break;
			}
			
		}
		
		return resultado;
	}
	
	public static String calculadora(String memoria1, String memoria2, String signo) {
		Double resultado=0.0;
		String respuesta;
		
		if(signo.equals("-")) {
			resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
		}
		
		if(signo.equals("+")) {
			resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
		}
		if(signo.equals("*")) {
			resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
		}
		if(signo.equals("/")) {
			resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
		}
		
		respuesta=resultado.toString();
		return respuesta;
		
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 408, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("1");
		button1.setEnabled(false);
		button1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"1");
			}
		});
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.WHITE);
		button1.setBounds(55, 216, 48, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.setEnabled(false);
		button2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button2.setBackground(Color.BLACK);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"2");
			}
		});
		button2.setBounds(126, 216, 48, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.setEnabled(false);
		button3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button3.setBackground(Color.BLACK);
		button3.setForeground(Color.WHITE);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"3");
			}
		});
		button3.setBounds(198, 216, 48, 23);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.setEnabled(false);
		button4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button4.setBackground(Color.BLACK);
		button4.setForeground(Color.WHITE);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"4");
			}
		});
		button4.setBounds(55, 250, 48, 23);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.setEnabled(false);
		button5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button5.setBackground(Color.BLACK);
		button5.setForeground(Color.WHITE);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"5");
			}
		});
		button5.setBounds(126, 250, 48, 23);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.setEnabled(false);
		button6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button6.setBackground(Color.BLACK);
		button6.setForeground(Color.WHITE);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"6");
			}
		});
		button6.setBounds(198, 250, 48, 23);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.setEnabled(false);
		button7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button7.setBackground(Color.BLACK);
		button7.setForeground(Color.WHITE);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"7");
			}
		});
		button7.setBounds(55, 284, 48, 23);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.setEnabled(false);
		button8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button8.setBackground(Color.BLACK);
		button8.setForeground(Color.WHITE);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"8");
			}
		});
		button8.setBounds(126, 284, 48, 23);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.setEnabled(false);
		button9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button9.setBackground(Color.BLACK);
		button9.setForeground(Color.WHITE);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"9");
			}
		});
		button9.setBounds(198, 284, 48, 23);
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.setEnabled(false);
		button0.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button0.setBackground(Color.BLACK);
		button0.setForeground(Color.WHITE);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"0");
			}
		});
		button0.setBounds(90, 331, 119, 23);
		frame.getContentPane().add(button0);
		
		JButton button_igual = new JButton("=");
		button_igual.setEnabled(false);
		button_igual.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_igual.setBackground(Color.BLACK);
		button_igual.setForeground(Color.WHITE);
		button_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String resultado;
				memoria2=textresultado.getText();
				
				if(!memoria2.equals("")) {
					resultado=calculadora(memoria1, memoria2, signo);
					textresultado.setText(resultado);
					
				}
			}
		});
		button_igual.setBounds(314, 114, 48, 55);
		frame.getContentPane().add(button_igual);
		
		JButton button_div = new JButton("/");
		button_div.setEnabled(false);
		button_div.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textresultado.getText().equals("")) {
					memoria1=textresultado.getText();
					signo="/";
					textresultado.setText("");
					
				}
				
			}
		});
		button_div.setBackground(Color.BLACK);
		button_div.setForeground(Color.WHITE);
		button_div.setBounds(49, 114, 54, 23);
		frame.getContentPane().add(button_div);
		
		JButton button_mult = new JButton("*");
		button_mult.setEnabled(false);
		button_mult.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textresultado.getText().equals("")) {
					memoria1=textresultado.getText();
					signo="*";
					textresultado.setText("");
				}
			}
		});
		button_mult.setBackground(Color.BLACK);
		button_mult.setForeground(Color.WHITE);
		button_mult.setBounds(192, 148, 54, 23);
		frame.getContentPane().add(button_mult);
		
		JButton button_punto = new JButton(".");
		button_punto.setEnabled(false);
		button_punto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_punto.setBackground(Color.BLACK);
		button_punto.setForeground(Color.WHITE);
		button_punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena;
				cadena=textresultado.getText();
				
				if(cadena.length()<=0) {
					textresultado.setText("0.");
				}
				else {
					if(!existepunto(textresultado.getText())) {
						textresultado.setText(textresultado.getText()+".");
					}
				}
			}
		});
		
		
		button_punto.setBounds(314, 284, 54, 23);
		frame.getContentPane().add(button_punto);
		
		JButton button_suma = new JButton("+");
		button_suma.setEnabled(false);
		button_suma.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_suma.setBackground(Color.BLACK);
		button_suma.setForeground(Color.WHITE);
		button_suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textresultado.getText().equals("")) {
					memoria1=textresultado.getText();
					signo="+";
					textresultado.setText("");
				}
			}
		});
		button_suma.setBounds(192, 114, 54, 23);
		frame.getContentPane().add(button_suma);
		
		textresultado = new JTextField();
		textresultado.setEditable(false);
		textresultado.setBounds(55, 11, 307, 69);
		frame.getContentPane().add(textresultado);
		textresultado.setColumns(10);
		
		JButton btnCe = new JButton("CE");
		btnCe.setEnabled(false);
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText("");
			}
		});
		btnCe.setBackground(Color.BLACK);
		btnCe.setForeground(Color.WHITE);
		btnCe.setBounds(314, 250, 54, 23);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.setEnabled(false);
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnC.setBackground(Color.BLACK);
		btnC.setForeground(Color.WHITE);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena;
				cadena=textresultado.getText();
				
				if(cadena.length()>0) {
					cadena=cadena.substring(0, cadena.length()-1);
					textresultado.setText(cadena);
				}
			}
		});
		btnC.setBounds(314, 216, 54, 23);
		frame.getContentPane().add(btnC);
		
		JButton button_resta = new JButton("-");
		button_resta.setEnabled(false);
		button_resta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textresultado.getText().equals("")) {
					memoria1=textresultado.getText();
					signo="-";
					textresultado.setText("");
				}
			}
		});
		button_resta.setBackground(Color.BLACK);
		button_resta.setForeground(Color.WHITE);
		button_resta.setBounds(49, 148, 48, 23);
		frame.getContentPane().add(button_resta);
	}

}
