package GUI;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Code.IgracRezultat;
import Code.IgrackiRezulatList;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;

public class Pocetna extends JFrame {

	private JPanel contentPane;
	private JLabel pozadina;
	private ImageIcon a1;
	private JLabel font;
	private JLabel logo_slika;
	private JLabel logo;
	private JButton btnNewButton;
	private JButton btnRezultati;
	public IgrackiRezulatList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pocetna frame = new Pocetna();
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
	public Pocetna() {
		setFont(new Font("Baskerville Old Face", Font.PLAIN, 16));
		list=new IgrackiRezulatList();
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Proxima\\Desktop\\IT\\4. SEMESTAR\\Programiranje 2\\SLAGALICA\\AleksandarMatovic2\\Resources\\bird.png"));
		setForeground(new Color(255, 255, 255));
		setTitle("Slagalica");
		setBackground(SystemColor.windowBorder);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 457);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(getLogo_slika());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnRezultati());
		contentPane.add(getLogo());
		contentPane.add(getPozadina());
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		
	}
	private JLabel getPozadina() {
		if (pozadina == null) {
			pozadina = new JLabel("Start");
			pozadina.setBounds(-110, 0, 1277, 698);
			pozadina.setBackground(new Color(245, 245, 245));
			pozadina.setForeground(new Color(255, 255, 0));
			pozadina.setIcon(new ImageIcon("C:\\Users\\Proxima\\Desktop\\IT\\4. SEMESTAR\\Programiranje 2\\SLAGALICA\\AleksandarMatovic2\\Resources\\pocetna_pozadina.jpg"));
		}
		return pozadina;
	}
	
	private JLabel getLogo_slika() {
		if (logo_slika == null) {
			logo_slika = new JLabel("");
			logo_slika.setBounds(185, 90, 186, 198);
			logo_slika.setIcon(new ImageIcon("C:\\\\Users\\\\Proxima\\\\Desktop\\\\IT\\\\4. SEMESTAR\\\\Programiranje 2\\\\SLAGALICA\\\\AleksandarMatovic2\\\\Resources\\\\bird.png"));
		}
		return logo_slika;
	}
	private JLabel getLogo() {
		if (logo == null) {
			logo = new JLabel("");
			logo.setBounds(-612, -35, 1241, 124);
			logo.setIcon(new ImageIcon("C:\\Users\\Proxima\\Desktop\\IT\\4. SEMESTAR\\Programiranje 2\\SLAGALICA\\AleksandarMatovic2\\Resources\\font.png"));
		}
		return logo;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Zapo\u010Dni igru");
			btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Difficulty d = new Difficulty();
					d.setVisible(true);
					
				}
			});
			btnNewButton.setBounds(59, 339, 216, 32);
			btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton.setBackground(Color.LIGHT_GRAY);
		}
		return btnNewButton;
	}
	private JButton getBtnRezultati() {
		if (btnRezultati == null) {
			btnRezultati = new JButton("Rezultati");
			btnRezultati.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
			btnRezultati.setBackground(Color.LIGHT_GRAY);
			btnRezultati.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnRezultati.setBounds(296, 339, 197, 33);
			btnRezultati.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					File file2 = new File("Rezultati.txt");

					BufferedReader read = null;
					try {
						read = new BufferedReader(new FileReader(file2));
					} catch (FileNotFoundException e1) {
						System.out.println("Fajl nije pronadjen");
					}
					String s = null;
					try {
						s = read.readLine();
						while (s != null) {
							String a[]=s.split(",");
							IgracRezultat u= new IgracRezultat(a[0], Integer.parseInt(a[1]));
							list.add(u);
							s=read.readLine();
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					System.out.println(s);
					try {
						read.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			Rezultati rezultati= new Rezultati(list);
			rezultati.setVisible(true);			
					
					
					
				}
			});
		}
		return btnRezultati;
	}
}
