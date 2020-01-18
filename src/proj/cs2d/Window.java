package proj.cs2d;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Window extends JFrame {
	private JPanel contentPane;

	public Window() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setTitle("CounterStrike 2D");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}