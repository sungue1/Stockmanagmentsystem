package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonEditListener;
import listeners.ButtonSellListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel {

	WindowFrame frame;

	public MenuSelection(WindowFrame frame) {
		this.frame = frame;

		this.setLayout(new BorderLayout());

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");

		JButton button1 = new JButton("Buy Stock");
		JButton button2 = new JButton("View Stock");
		JButton button3 = new JButton("Sell Stock");
		JButton button4 = new JButton("Edit Stock");
		JButton button5 = new JButton("Exit Program");

		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		button3.addActionListener(new ButtonSellListener(frame));
		button4.addActionListener(new ButtonEditListener(frame));

		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);

		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);

	}
}
