package javaCurso2024;
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoGUI extends JFrame {
	
	public OlaMundoGUI() {
		//Configurando a Tela:
		setTitle("Olá Mundo em JAVA"); // titulo da janela
		setSize(820,720); //Definindo tamanho da tela.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);

		
		//Criando um botão
		JButton botao =  new JButton("<html><body style='text-align: center; border: solid; padding: 10px; font-size: 16px;'> Clique em Mim</body></html>");
		botao.setBackground(Color.MAGENTA);
		botao.setForeground(Color.BLACK);
		botao.setMaximumSize(new Dimension(150,50));
		
		//Adicinar um Action Listener ao botão:
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Exibir um popup com a mensagem "Ola Mundo"
				JOptionPane.showMessageDialog(null, "Olá Mundo!");
				
			}
		});
		
		
		// Adiciona o botão na janela:
		add(botao);
		//Torna a janela visivel:
		setVisible(true);
	}
	public static void main(String[] args) {
		//Executar a interface gráfica:
		new OlaMundoGUI();
		
	}

}
