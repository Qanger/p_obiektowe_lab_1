package lab_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

	JFrame frame = new JFrame("lab_1"); // Ramka w kt�rej wy�wietli si� tekst oraz przycisk
	JLabel label = new JLabel(); // Etykieta, miejsce w kt�rym pojawi si� tekst po u�yciu przycisku

	public MyFrame() {
		JButton button = new JButton("Click on me!"); 
		this.add(button); // zadeklarowany i utworzony przycisk z tekstem
		button.addActionListener(this); // dodanie "efektu" po wci�ni�ciu przycisku

		frame.getContentPane().add(BorderLayout.SOUTH, button); // Ustawienie przycisku i etykiety w ramce
		frame.getContentPane().add(BorderLayout.CENTER, label);

		frame.setSize(800, 600); // wymiary ramki
		frame.setVisible(true); // ramka jest widoczna po uruchomieniu programu

	}

	public void actionPerformed(ActionEvent action) { // metoda pozwalaj�ca na zadzia�anie przycisku
		label.setText("Hello World!"); // wy�wietla tekst etykiety w ramce
		System.out.print("Hello World!\n"); // wy�wietla tekst w konsoli
	}
}
