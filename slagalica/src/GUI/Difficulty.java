package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Difficulty extends JFrame {

	private JPanel contentPane;
	private JButton buttonEasy;
	private JButton btnMedium;
	private JButton buttonHard;
	private JLabel Tezin;
	private JLabel Pozadina;

	
	public Difficulty() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\aleks\\Desktop\\WorkSpace\\Programiranje 2\\AleksandarMatovic\\Resources\\bird.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getButton_3());
		contentPane.add(getButton_1_1());
		contentPane.add(getButton_2_1());
		contentPane.add(getTezin());
		contentPane.add(getPozadina());
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
	}
	public JButton getButton_3() {
		if (buttonEasy == null) {
			buttonEasy = new JButton("Easy");
			buttonEasy.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Glavna s = new Glavna();
						s.setVisible(true);
					
				}
			});
			buttonEasy.setBounds(44, 88, 89, 23);
		}
		return buttonEasy;
	}
	public JButton getButton_1_1() {
		if (btnMedium == null) {
			btnMedium = new JButton("Medium");
			btnMedium.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Glavna s = new Glavna();
						s.setVisible(true);
					
				}
			});
			btnMedium.setBounds(160, 88, 89, 23);
		}
		return btnMedium;
	}
	public JButton getButton_2_1() {
		if (buttonHard == null) {
			buttonHard = new JButton("Hard");
			buttonHard.setBounds(277, 88, 89, 23);
			buttonHard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Glavna s = new Glavna();
						s.setVisible(true);
					
				}
			});
			
		}
		return buttonHard;
	}
	private JLabel getTezin() {
		if (Tezin == null) {
			Tezin = new JLabel("             Izaberite te\u017Einu");
			Tezin.setVerticalAlignment(SwingConstants.CENTER);
			Tezin.setFont(new Font("Tahoma", Font.BOLD, 17));
			Tezin.setBounds(68, 24, 254, 23);
		}
		return Tezin;
	}
	private JLabel getPozadina() {
		if (Pozadina == null) {
			Pozadina = new JLabel("");
			Pozadina.setIcon(new ImageIcon("C:\\Users\\aleks\\Desktop\\WorkSpace\\Programiranje 2\\AleksandarMatovic\\Resources\\pocetna_pozadina.jpg"));
			Pozadina.setBounds(0, 0, 402, 173);
		}
		return Pozadina;
	}
}
