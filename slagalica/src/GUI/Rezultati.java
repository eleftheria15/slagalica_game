package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Code.IgrackiRezulatList;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Font;

public class Rezultati extends JFrame {

	private JPanel contentPane;
	private JLabel pozadina;
	private IgrackiRezulatList list;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel textRezultat;
	
	
	
	
	
	public Rezultati(IgrackiRezulatList list) {
		setTitle("Rezultati");
		this.list = list;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\aleks\\Desktop\\WorkSpace\\Programiranje 2\\AleksandarMatovic\\Resources\\bird.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getScrollPane());
		contentPane.add(getTextRezultat());
		contentPane.add(getPozadina());
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
	}

	private JLabel getPozadina() {
		if (pozadina == null) {
			pozadina = new JLabel("");
			pozadina.setBounds(0, 0, 677, 418);
			pozadina.setIcon(new ImageIcon("C:\\Users\\aleks\\Desktop\\WorkSpace\\Programiranje 2\\AleksandarMatovic\\Resources\\pocetna_pozadina.jpg"));
		}
		return pozadina;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(81, 69, 476, 325);
			scrollPane.setViewportView(getTextArea_1());
		}
		return scrollPane;
	}
	private JTextArea getTextArea_1() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
			textArea.setText(this.list.toString());
		}
		return textArea;
	}
	private JLabel getTextRezultat() {
		if (textRezultat == null) {
			textRezultat = new JLabel("                      Rezultati");
			textRezultat.setFont(new Font("Tahoma", Font.BOLD, 25));
			textRezultat.setBounds(88, 27, 440, 31);
		}
		return textRezultat;
	}
}
