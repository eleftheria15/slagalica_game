package GUI;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;

import Code.IgracRezultat;
import Code.IgrackiRezulatList;

import javax.swing.event.ChangeEvent;
import javax.swing.JProgressBar;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import java.awt.Color;

public class Glavna extends JFrame {

	private JPanel contentPane;
	private JLabel pozadina;

	private Button button_A2;
	private JTextField textA2;
	private JTextField textField_2;
	private Button button_A4;
	private JTextField textA3;
	private Button button;
	private Button button_1;
	private JTextField textA1;
	private Button button_A1;
	private JTextField textFieldA2;
	private Button button_2A2;
	private JTextField textField_A3;
	private Button button_A3;
	private JTextField textField_3;
	private Button button_4;
	private JTextField textField_4;
	private Button buttonA;
	private ButtonGroup buttonGroup;
	private JFrame frame;
	private javax.swing.Timer t = null;
	private int count = 400;

	public Glavna() {
		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent arg0) {
			}
		});
		frame = this;
		setResizable(false);
		setTitle("Asocijacije");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\\\Users\\\\Proxima\\\\Desktop\\\\IT\\\\4. SEMESTAR\\\\Programiranje 2\\\\SLAGALICA\\\\AleksandarMatovic2\\\\Resources\\\\bird.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getButton_A1());
		contentPane.add(getTextField_2());
		contentPane.add(getButton_2A2());
		contentPane.add(getTextField_3());
		contentPane.add(getButton_A3());
		contentPane.add(getTextField_1_1());
		contentPane.add(getButton_4());
		contentPane.add(getTextField_3_1());
		contentPane.add(getButtonA());
		contentPane.add(getTextField_4());
		contentPane.add(getButtonB1());
		contentPane.add(getTextB1());
		contentPane.add(getButtonB2());
		contentPane.add(getTextB2());
		contentPane.add(getButtonB3());
		contentPane.add(getTextB3());
		contentPane.add(getButtonB4());
		contentPane.add(getTextB4());
		contentPane.add(getButtonB());
		contentPane.add(getTextB());
		contentPane.add(getButtonC1());
		contentPane.add(getTextC1());
		contentPane.add(getButtonC2());
		contentPane.add(getTextC2());
		contentPane.add(getButtonC3());
		contentPane.add(getTextC3());
		contentPane.add(getButtonC4());
		contentPane.add(getTextC4());
		contentPane.add(getButtonC());
		contentPane.add(getTextC());
		contentPane.add(getButtonD());
		contentPane.add(getTextD());
		contentPane.add(getButtonD1());
		contentPane.add(getTextD1());
		contentPane.add(getButtonD2());
		contentPane.add(getTextD2());
		contentPane.add(getButtonD3());
		contentPane.add(getTextD3());
		contentPane.add(getButtonD4());
		contentPane.add(getTextD4());
		contentPane.add(getButton_2());
		contentPane.add(getKonacnoResenje());
		buttonGroup = new ButtonGroup();
		contentPane.add(getLogo());
		contentPane.add(getRezultat());
		contentPane.add(getLblNewLabel());
		contentPane.add(getNetacanOdgovor());
		contentPane.add(getTacanOdgovor());
		contentPane.add(getProgressBar_1());
		contentPane.add(getFb());
		contentPane.add(getTwitter());
		contentPane.add(getGooglePlus());
		contentPane.add(getLabel_2());
		contentPane.add(getPozadina());
		t = new javax.swing.Timer(400, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				count--;

				progressBar.setValue(count);
				if (progressBar.getValue() < 400) {
					progressBar.setValue(progressBar.getValue() - 1);
				}
				if (progressBar.getValue() == 0) {

					buttonD1.setVisible(false);
					buttonD2.setVisible(false);
					buttonD3.setVisible(false);
					buttonD4.setVisible(false);
					buttonC1.setVisible(false);
					buttonC2.setVisible(false);
					buttonC3.setVisible(false);
					buttonC4.setVisible(false);
					buttonB1.setVisible(false);
					buttonB2.setVisible(false);
					buttonB3.setVisible(false);
					buttonB4.setVisible(false);
					button_A1.setVisible(false);
					button_2A2.setVisible(false);
					button_A3.setVisible(false);
					button_4.setVisible(false);
					buttonA.setVisible(false);
					buttonB.setVisible(false);
					buttonC.setVisible(false);
					buttonD.setVisible(false);
					button_2.setVisible(false);
					textB.setText(kolonaBresenjaStringEasy);
					textC.setText(kolonaCresenjaStringEasy);
					textD.setText(kolonaDresenjaStringEasy);
					textField_4.setText(kolonaAresenjaStringEasy);
					KonacnoResenje.setText(konacnoResenjeEasy);
					JOptionPane.showMessageDialog(null, "Vrijeme je isteklo");
					System.exit(2);

				}
			}
		});

		t.start();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
	}

	String[] kolonaAEasy = { "Kuhinja", "Slano", "Natrijum", "Hlor" };
	String[] kolonaBEasy = { "Kiseonik", "Vodonik", "Okean", "Tekuca" };
	String[] kolonaCEasy = { "Humor", "Zlato", "Udovica", "Noc" };
	String[] kolonaDEasy = { "Odbojka", "Obala", "Suncobran", "Pjesak" };

	String kolonaAresenjaStringEasy = "So";
	String kolonaBresenjaStringEasy = "Voda";
	String kolonaCresenjaStringEasy = "Crna";
	String kolonaDresenjaStringEasy = "Plaza";
	String konacnoResenjeEasy = "More";

	String[] kolonaAMedium = { "Stablo", "Razdor", "Sok", "Crvena" };
	String[] kolonaBMedium = { "Sporost", "Masa", "Lenjost", "Kretanja" };
	String[] kolonaCMedium = { "Tezina", "Zemlja", "Sunce", "Privlacenje" };
	String[] kolonaDMedium = { "Pritisak", "Vuca", "Trenje", "Elasticnost" };

	String kolonaAresenjaStringMedium = "Jabuka";
	String kolonaBresenjaStringMedium = "Tromost";
	String kolonaCresenjaStringMedium = "Gravitacija";
	String kolonaDresenjaStringMedium = "Sila";
	String konacnoResenjeMedium = "Isak Njutn";

	String[] kolonaAHard = { "Pariz", "Revolucija", "Gali", "Alzas" };
	String[] kolonaBHard = { "Mjerne jedinice", "SI sistem", "Fizicke velicine", "Mjerni broj" };
	String[] kolonaCHard = { "Kolo", "Elektroni", "Joni", "Provodnik" };
	String[] kolonaDHard = { "Voltmetar", "Ampermetar", "Barometar", "Termometar" };

	String kolonaAresenjaStringHard = "Francuska";
	String kolonaBresenjaStringHard = "Merenje";
	String kolonaCresenjaStringHard = "Elektricna struja";
	String kolonaDresenjaStringHard = "Mjerni instrument";
	String konacnoResenjeHard = "Amper";

	private JLabel getPozadina() {
		if (pozadina == null) {
			pozadina = new JLabel("");
			pozadina.setForeground(Color.RED);
			pozadina.setBounds(0, 0, 997, 678);
			pozadina.setIcon(new ImageIcon(
					"C:\\\\Users\\\\Proxima\\\\Desktop\\\\IT\\\\4. SEMESTAR\\\\Programiranje 2\\\\SLAGALICA\\\\AleksandarMatovic2\\\\Resources\\\\pocetna_pozadina.jpg"));
		}
		return pozadina;
	}

	Difficulty d = new Difficulty();
	private Button buttonB1;
	private JTextField textB1;
	private Button buttonB2;
	private JTextField textB2;
	private Button buttonB3;
	private JTextField textB3;
	private Button buttonB4;
	private JTextField textB4;
	private Button buttonB;
	private JTextField textB;
	private Button buttonC1;
	private JTextField textC1;
	private Button buttonC2;
	private JTextField textC2;
	private Button buttonC3;
	private JTextField textC3;
	private Button buttonC4;
	private JTextField textC4;
	private Button buttonC;
	private JTextField textC;
	private Button buttonD;
	private JTextField textD;
	private Button buttonD1;
	private JTextField textD1;
	private Button buttonD2;
	private JTextField textD2;
	private Button buttonD3;
	private JTextField textD3;
	private Button buttonD4;
	private JTextField textD4;
	private JTextField KonacnoResenje;
	private Button button_2;
	private JLabel Logo;
	private JLabel Rezultat;

	private int score = 0;

	private JTextField textField;

	public JTextField getTextField_2() {
		if (textA1 == null) {
			textA1 = new JTextField();
			textA1.setFont(new Font("Tahoma", Font.BOLD, 15));
			textA1.setEditable(false);
			textA1.setHorizontalAlignment(SwingConstants.CENTER);

			for (int i = 0; i < kolonaAEasy.length; i++) {
				textA1.setText(kolonaAEasy[0]);

			}

			textA1.setBounds(32, 62, 150, 29);
			textA1.setColumns(10);
		}
		return textA1;
	}

	public Button getButton_A1() {
		if (button_A1 == null) {
			button_A1 = new Button("A1");
			button_A1.setBackground(Color.LIGHT_GRAY);
			button_A1.setForeground(Color.BLACK);
			button_A1.setFont(new Font("Tahoma", Font.BOLD, 15));
			button_A1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					button_A1.setVisible(false);
				}
			});
			button_A1.setBounds(32, 62, 150, 29);
		}
		return button_A1;
	}

	public JTextField getTextField_3() {
		if (textFieldA2 == null) {
			textFieldA2 = new JTextField();
			textFieldA2.setFont(new Font("Tahoma", Font.BOLD, 15));
			textFieldA2.setEditable(false);
			textFieldA2.setColumns(10);
			textFieldA2.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldA2.setBounds(60, 102, 150, 29);
			for (int i = 0; i < kolonaAEasy.length; i++) {
				textFieldA2.setText(kolonaAEasy[1]);
			}
		}
		return textFieldA2;
	}

	public Button getButton_2A2() {
		if (button_2A2 == null) {
			button_2A2 = new Button("A2");
			button_2A2.setBackground(Color.LIGHT_GRAY);
			button_2A2.setForeground(Color.BLACK);
			button_2A2.setFont(new Font("Tahoma", Font.BOLD, 15));
			button_2A2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					button_2A2.setVisible(false);
				}
			});
			button_2A2.setBounds(60, 102, 150, 29);
		}
		return button_2A2;
	}

	public JTextField getTextField_1_1() {
		if (textField_A3 == null) {
			textField_A3 = new JTextField();
			textField_A3.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_A3.setEditable(false);
			textField_A3.setColumns(10);
			textField_A3.setHorizontalAlignment(SwingConstants.CENTER);
			textField_A3.setBounds(94, 137, 150, 29);
			for (int i = 0; i < kolonaAEasy.length; i++) {
				textField_A3.setText(kolonaAEasy[2]);
			}
		}
		return textField_A3;
	}

	public Button getButton_A3() {
		if (button_A3 == null) {
			button_A3 = new Button("A3");
			button_A3.setBackground(Color.LIGHT_GRAY);
			button_A3.setForeground(Color.BLACK);
			button_A3.setFont(new Font("Tahoma", Font.BOLD, 15));
			button_A3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					button_A3.setVisible(false);
				}
			});
			button_A3.setBounds(94, 137, 150, 29);
		}
		return button_A3;
	}

	public JTextField getTextField_3_1() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_3.setEditable(false);
			textField_3.setColumns(10);
			textField_3.setHorizontalAlignment(SwingConstants.CENTER);
			textField_3.setBounds(130, 172, 150, 29);
			for (int i = 0; i < kolonaAEasy.length; i++) {
				textField_3.setText(kolonaAEasy[3]);
			}

		}
		return textField_3;
	}

	public Button getButton_4() {
		if (button_4 == null) {
			button_4 = new Button("A4");
			button_4.setBackground(Color.LIGHT_GRAY);
			button_4.setForeground(Color.BLACK);
			button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					button_4.setVisible(false);
				}
			});
			button_4.setBounds(130, 172, 150, 29);
		}
		return button_4;
	}

	public JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Tahoma", Font.BOLD, 15));
			textField_4.setHorizontalAlignment(SwingConstants.CENTER);
			textField_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (textField_4.getText().contains(kolonaAresenjaStringEasy)) {
						button_A1.setVisible(false);
						button_2A2.setVisible(false);
						button_A3.setVisible(false);
						button_4.setVisible(false);
						tacanOdgovor.setVisible(true);
						score = score + 10;
						lblNewLabel.setText("" + score);
						runTacan();
					} else {
						score = score - 10;
						lblNewLabel.setText("" + score);
						netacanOdgovor.setVisible(true);
						runNetacan();
					}

				}
			});
			textField_4.setColumns(10);
			textField_4.setBounds(162, 207, 150, 29);
		}
		return textField_4;
	}

	public Button getButtonA() {
		if (buttonA == null) {
			buttonA = new Button("A");
			buttonA.setBackground(Color.LIGHT_GRAY);
			buttonA.setForeground(Color.BLACK);
			buttonA.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonA.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					buttonA.setVisible(false);
				}
			});

			buttonA.setBounds(162, 207, 150, 29);
		}
		return buttonA;
	}

	private Button getButtonB1() {
		if (buttonB1 == null) {
			buttonB1 = new Button("B1");
			buttonB1.setBackground(Color.LIGHT_GRAY);
			buttonB1.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonB1.setBounds(674, 62, 150, 29);
			buttonB1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonB1.setVisible(false);
				}
			});

		}
		return buttonB1;
	}

	int easy = 0;
	int medium = 0;

	private JTextField getTextB1() {
		if (textB1 == null) {
			textB1 = new JTextField();
			textB1.setEditable(false);
			textB1.setFont(new Font("Tahoma", Font.BOLD, 15));
			textB1.setColumns(10);
			textB1.setHorizontalAlignment(SwingConstants.CENTER);
			textB1.setBounds(674, 62, 150, 29);

			if (easy == 0) {
				for (int i = 0; i < kolonaBEasy.length; i++) {
					textB1.setText(kolonaBEasy[0]);
				}
			}

			if (medium == 2) {
				for (int i = 0; i < kolonaBMedium.length; i++) {
					textB1.setText(kolonaBMedium[0]);
				}
			}

		}
		return textB1;
	}

	private Button getButtonB2() {
		if (buttonB2 == null) {
			buttonB2 = new Button("B2");
			buttonB2.setBackground(Color.LIGHT_GRAY);
			buttonB2.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonB2.setBounds(640, 102, 150, 29);
			buttonB2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonB2.setVisible(false);
				}
			});
		}
		return buttonB2;
	}

	private JTextField getTextB2() {
		if (textB2 == null) {
			textB2 = new JTextField();
			textB2.setFont(new Font("Tahoma", Font.BOLD, 15));
			textB2.setEditable(false);
			textB2.setColumns(10);
			textB2.setHorizontalAlignment(SwingConstants.CENTER);
			textB2.setBounds(640, 102, 150, 29);
			for (int i = 0; i < kolonaBEasy.length; i++) {
				textB2.setText(kolonaBEasy[1]);
			}
		}
		return textB2;
	}

	private Button getButtonB3() {
		if (buttonB3 == null) {
			buttonB3 = new Button("B3");
			buttonB3.setBackground(Color.LIGHT_GRAY);
			buttonB3.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonB3.setBounds(605, 137, 150, 29);
			buttonB3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonB3.setVisible(false);
				}
			});
		}
		return buttonB3;
	}

	private JTextField getTextB3() {
		if (textB3 == null) {
			textB3 = new JTextField();
			textB3.setFont(new Font("Tahoma", Font.BOLD, 15));
			textB3.setEditable(false);
			textB3.setColumns(10);
			textB3.setHorizontalAlignment(SwingConstants.CENTER);
			textB3.setBounds(605, 137, 150, 29);
			for (int i = 0; i < kolonaBEasy.length; i++) {
				textB3.setText(kolonaBEasy[2]);
			}
		}
		return textB3;
	}

	private Button getButtonB4() {
		if (buttonB4 == null) {
			buttonB4 = new Button("B4");
			buttonB4.setBackground(Color.LIGHT_GRAY);
			buttonB4.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonB4.setBounds(569, 172, 150, 29);
			buttonB4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonB4.setVisible(false);
				}
			});
		}
		return buttonB4;
	}

	private JTextField getTextB4() {
		if (textB4 == null) {
			textB4 = new JTextField();
			textB4.setFont(new Font("Tahoma", Font.BOLD, 15));
			textB4.setEditable(false);
			textB4.setColumns(10);
			textB4.setHorizontalAlignment(SwingConstants.CENTER);
			textB4.setBounds(569, 172, 150, 29);
			for (int i = 0; i < kolonaBEasy.length; i++) {
				textB4.setText(kolonaBEasy[3]);
			}
		}
		return textB4;
	}

	public Button getButtonB() {
		if (buttonB == null) {
			buttonB = new Button("B");
			buttonB.setBackground(Color.LIGHT_GRAY);
			buttonB.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonB.setBounds(527, 207, 150, 29);
			buttonB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonB.setVisible(false);
				}
			});
		}
		return buttonB;
	}

	private JTextField getTextB() {
		if (textB == null) {
			textB = new JTextField();
			textB.setFont(new Font("Tahoma", Font.BOLD, 15));
			textB.setColumns(10);
			textB.setBounds(527, 207, 150, 29);
			textB.setHorizontalAlignment(SwingConstants.CENTER);
			textB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (textB.getText().contains(kolonaBresenjaStringEasy)) {
						buttonB1.setVisible(false);
						buttonB2.setVisible(false);
						buttonB3.setVisible(false);
						buttonB4.setVisible(false);
						score = score + 10;
						lblNewLabel.setText("" + score);
						tacanOdgovor.setVisible(true);
						runTacan();

					} else {
						score = score - 10;
						lblNewLabel.setText("" + score);
						netacanOdgovor.setVisible(true);
						runNetacan();
					}

				}
			});
		}
		return textB;
	}

	private Button getButtonC1() {
		if (buttonC1 == null) {
			buttonC1 = new Button("C1");
			buttonC1.setBackground(Color.LIGHT_GRAY);
			buttonC1.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonC1.setBounds(32, 565, 150, 29);
			buttonC1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonC1.setVisible(false);
				}
			});
		}
		return buttonC1;
	}

	private JTextField getTextC1() {
		if (textC1 == null) {
			textC1 = new JTextField();
			textC1.setFont(new Font("Tahoma", Font.BOLD, 15));
			textC1.setEditable(false);
			textC1.setColumns(10);
			textC1.setHorizontalAlignment(SwingConstants.CENTER);
			textC1.setBounds(32, 565, 150, 29);
			for (int i = 0; i < kolonaCEasy.length; i++) {
				textC1.setText(kolonaCEasy[0]);
			}
		}
		return textC1;
	}

	private Button getButtonC2() {
		if (buttonC2 == null) {
			buttonC2 = new Button("C2");
			buttonC2.setBackground(Color.LIGHT_GRAY);
			buttonC2.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonC2.setBounds(60, 530, 150, 29);
			buttonC2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonC2.setVisible(false);
				}
			});
		}
		return buttonC2;
	}

	private JTextField getTextC2() {
		if (textC2 == null) {
			textC2 = new JTextField();
			textC2.setFont(new Font("Tahoma", Font.BOLD, 15));
			textC2.setEditable(false);
			textC2.setColumns(10);
			textC2.setHorizontalAlignment(SwingConstants.CENTER);
			textC2.setBounds(60, 530, 150, 29);
			for (int i = 0; i < kolonaCEasy.length; i++) {
				textC2.setText(kolonaCEasy[1]);
			}
		}
		return textC2;
	}

	private Button getButtonC3() {
		if (buttonC3 == null) {
			buttonC3 = new Button("C3");
			buttonC3.setBackground(Color.LIGHT_GRAY);
			buttonC3.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonC3.setBounds(94, 495, 150, 29);
			buttonC3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonC3.setVisible(false);
				}
			});
		}
		return buttonC3;
	}

	private JTextField getTextC3() {
		if (textC3 == null) {
			textC3 = new JTextField();
			textC3.setFont(new Font("Tahoma", Font.BOLD, 15));
			textC3.setEditable(false);
			textC3.setColumns(10);
			textC3.setBounds(94, 495, 150, 29);
			textC3.setHorizontalAlignment(SwingConstants.CENTER);
			for (int i = 0; i < kolonaCEasy.length; i++) {
				textC3.setText(kolonaCEasy[2]);
			}
		}
		return textC3;
	}

	private Button getButtonC4() {
		if (buttonC4 == null) {
			buttonC4 = new Button("C4");
			buttonC4.setBackground(Color.LIGHT_GRAY);
			buttonC4.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonC4.setBounds(119, 460, 150, 29);
			buttonC4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonC4.setVisible(false);
				}
			});
		}
		return buttonC4;
	}

	private JTextField getTextC4() {
		if (textC4 == null) {
			textC4 = new JTextField();
			textC4.setFont(new Font("Tahoma", Font.BOLD, 15));
			textC4.setEditable(false);
			textC4.setColumns(10);
			textC4.setBounds(119, 460, 150, 29);
			textC4.setHorizontalAlignment(SwingConstants.CENTER);
			for (int i = 0; i < kolonaCEasy.length; i++) {
				textC4.setText(kolonaCEasy[3]);
			}
		}
		return textC4;
	}

	public Button getButtonC() {
		if (buttonC == null) {
			buttonC = new Button("C");
			buttonC.setBackground(Color.LIGHT_GRAY);
			buttonC.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonC.setBounds(162, 425, 150, 29);
			buttonC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonC.setVisible(false);
				}
			});
		}
		return buttonC;
	}

	private JTextField getTextC() {
		if (textC == null) {
			textC = new JTextField();
			textC.setFont(new Font("Tahoma", Font.BOLD, 15));
			textC.setColumns(10);
			textC.setBounds(162, 425, 150, 29);
			textC.setHorizontalAlignment(SwingConstants.CENTER);
			textC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (textC.getText().contains(kolonaCresenjaStringEasy)) {
						buttonC1.setVisible(false);
						buttonC2.setVisible(false);
						buttonC3.setVisible(false);
						buttonC4.setVisible(false);
						score = score + 10;
						lblNewLabel.setText("" + score);
						tacanOdgovor.setVisible(true);
						runTacan();

					} else {
						score = score - 10;
						lblNewLabel.setText("" + score);
						netacanOdgovor.setVisible(true);
						runNetacan();
					}

				}
			});
		}
		return textC;
	}

	public Button getButtonD() {
		if (buttonD == null) {
			buttonD = new Button("D");
			buttonD.setBackground(Color.LIGHT_GRAY);
			buttonD.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonD.setBounds(510, 425, 150, 29);
			buttonD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonD.setVisible(false);
				}
			});
		}
		return buttonD;
	}

	private JTextField getTextD1() {
		if (textD1 == null) {
			textD1 = new JTextField();
			textD1.setFont(new Font("Tahoma", Font.BOLD, 15));
			textD1.setEditable(false);
			textD1.setColumns(10);
			textD1.setHorizontalAlignment(SwingConstants.CENTER);
			textD1.setBounds(538, 465, 150, 29);
			for (int i = 0; i < kolonaDEasy.length; i++) {
				textD1.setText(kolonaDEasy[0]);
			}

		}
		return textD1;
	}

	private Button getButtonD2() {
		if (buttonD2 == null) {
			buttonD2 = new Button("D2");
			buttonD2.setBackground(Color.LIGHT_GRAY);
			buttonD2.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonD2.setBounds(572, 500, 150, 29);
			buttonD2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonD2.setVisible(false);
				}
			});
		}
		return buttonD2;
	}

	private JTextField getTextD2() {
		if (textD2 == null) {
			textD2 = new JTextField();
			textD2.setFont(new Font("Tahoma", Font.BOLD, 15));
			textD2.setEditable(false);
			textD2.setColumns(10);
			textD2.setHorizontalAlignment(SwingConstants.CENTER);
			textD2.setBounds(572, 500, 150, 29);
			for (int i = 0; i < kolonaDEasy.length; i++) {
				textD2.setText(kolonaDEasy[1]);
				
			}
		}
		return textD2;
	}

	private Button getButtonD3() {
		if (buttonD3 == null) {
			buttonD3 = new Button("D3");
			buttonD3.setBackground(Color.LIGHT_GRAY);
			buttonD3.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonD3.setBounds(608, 535, 150, 29);
			buttonD3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonD3.setVisible(false);
				}
			});
		}
		return buttonD3;
	}

	private JTextField getTextD3() {
		if (textD3 == null) {
			textD3 = new JTextField();
			textD3.setFont(new Font("Tahoma", Font.BOLD, 15));
			textD3.setEditable(false);
			textD3.setColumns(10);
			textD3.setHorizontalAlignment(SwingConstants.CENTER);
			textD3.setBounds(608, 535, 150, 29);
			for (int i = 0; i < kolonaDEasy.length; i++) {
				textD3.setText(kolonaDEasy[2]);
			}
		}
		return textD3;
	}

	private Button getButtonD4() {
		if (buttonD4 == null) {
			buttonD4 = new Button("D");
			buttonD4.setBackground(Color.LIGHT_GRAY);
			buttonD4.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonD4.setBounds(640, 570, 150, 29);
			buttonD4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonD4.setVisible(false);
				}
			});
		}
		return buttonD4;
	}

	private JTextField getTextD4() {
		if (textD4 == null) {
			textD4 = new JTextField();
			textD4.setFont(new Font("Tahoma", Font.BOLD, 15));
			textD4.setEditable(false);
			textD4.setColumns(10);
			textD4.setBounds(640, 570, 150, 29);
			textD4.setHorizontalAlignment(SwingConstants.CENTER);
			for (int i = 0; i < kolonaDEasy.length; i++) {
				textD4.setText(kolonaDEasy[3]);
			}
		}
		return textD4;
	}

	private JTextField getTextD() {
		if (textD == null) {
			textD = new JTextField();
			textD.setFont(new Font("Tahoma", Font.BOLD, 15));
			textD.setColumns(10);
			textD.setBounds(510, 425, 150, 29);
			textD.setHorizontalAlignment(SwingConstants.CENTER);
			textD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (textD.getText().contains(kolonaDresenjaStringEasy)) {
						buttonD1.setVisible(false);
						buttonD2.setVisible(false);
						buttonD3.setVisible(false);
						buttonD4.setVisible(false);
						score = score + 10;
						lblNewLabel.setText("" + score);
						tacanOdgovor.setVisible(true);
						runTacan();
					} else {

						score = score - 10;
						lblNewLabel.setText("" + score);
						netacanOdgovor.setVisible(true);
						runNetacan();

					}

				}
			});
		}
		return textD;
	}

	private Button getButtonD1() {
		if (buttonD1 == null) {
			buttonD1 = new Button("D1");
			buttonD1.setBackground(Color.LIGHT_GRAY);
			buttonD1.setFont(new Font("Tahoma", Font.BOLD, 15));
			buttonD1.setBounds(538, 465, 150, 29);
			buttonD1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonD1.setVisible(false);
				}
			});
		}
		return buttonD1;
	}

	private JTextField getKonacnoResenje() {
		if (KonacnoResenje == null) {
			KonacnoResenje = new JTextField();
			KonacnoResenje.setFont(new Font("Tahoma", Font.BOLD, 25));
			KonacnoResenje.setBounds(263, 307, 308, 51);
			KonacnoResenje.setColumns(10);
			KonacnoResenje.setHorizontalAlignment(SwingConstants.CENTER);
			KonacnoResenje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (KonacnoResenje.getText().contains(konacnoResenjeEasy)) {
						buttonD1.setVisible(false);
						buttonD2.setVisible(false);
						buttonD3.setVisible(false);
						buttonD4.setVisible(false);
						buttonC1.setVisible(false);
						buttonC2.setVisible(false);
						buttonC3.setVisible(false);
						buttonC4.setVisible(false);
						buttonB1.setVisible(false);
						buttonB2.setVisible(false);
						buttonB3.setVisible(false);
						buttonB4.setVisible(false);
						button_A1.setVisible(false);
						button_2A2.setVisible(false);
						button_A3.setVisible(false);
						button_4.setVisible(false);
						buttonA.setVisible(false);
						buttonB.setVisible(false);
						buttonC.setVisible(false);
						buttonD.setVisible(false);
						textB.setText(kolonaBresenjaStringEasy);
						textC.setText(kolonaCresenjaStringEasy);
						textD.setText(kolonaDresenjaStringEasy);
						textField_4.setText(kolonaAresenjaStringEasy);
						score = score + 25;
						lblNewLabel.setText("" + score);
						tacanOdgovor.setVisible(true);
						runTacan();
						t.stop();
						
						String ime = JOptionPane.showInputDialog(frame, "Rezultat: " + score + "\nUnesite Vase ime?",
								JOptionPane.INFORMATION_MESSAGE);
						if (ime != null) {
							File file = new File("Rezultati.txt");
							BufferedWriter out = null;
							try {
								out = new BufferedWriter(new FileWriter(file, true));
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							try {
								out.append(ime + "," + score);
								out.newLine();
							} catch (IOException e1) {
								e1.printStackTrace();
							} finally {
								try {
									out.close();
								} catch (IOException e1) {
									e1.printStackTrace();
								}
							}

						}
						frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
					} else {
						score = score - 15;
						lblNewLabel.setText("" + score);
						netacanOdgovor.setVisible(true);
						runNetacan();
					}

				}
			});
		}
		return KonacnoResenje;
	}

	private Button getButton_2() {
		if (button_2 == null) {
			button_2 = new Button("???");
			button_2.setFont(new Font("Tahoma", Font.BOLD, 25));
			button_2.setBackground(Color.LIGHT_GRAY);
			button_2.setBounds(263, 307, 308, 51);
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					button_2.setVisible(false);
				}
			});
		}
		return button_2;
	}

	private JLabel getLogo() {
		if (Logo == null) {
			Logo = new JLabel("");
			Logo.setIcon(new ImageIcon(
					"C:\\Users\\Proxima\\Desktop\\IT\\4. SEMESTAR\\Programiranje 2\\SLAGALICA\\AleksandarMatovic2\\Resources\\rrr.png"));
			Logo.setBounds(356, 89, 138, 126);
		}
		return Logo;
	}

	private JLabel getRezultat() {
		if (Rezultat == null) {
			Rezultat = new JLabel("Rezultat:");
			Rezultat.setFont(new Font("Segoe UI Symbol", Font.BOLD, 19));
			Rezultat.setBounds(19, 302, 113, 52);
		}
		return Rezultat;
	}

	private JLabel lblNewLabel;
	private JLabel netacanOdgovor;
	private JLabel tacanOdgovor;
	private JProgressBar progressBar;
	private JLabel fb;
	private JLabel twitter;
	private JLabel googlePlus;
	private JLabel label_2;

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
			lblNewLabel.setBounds(142, 317, 102, 23);
			lblNewLabel.setText("" + score);
		}
		return lblNewLabel;
	}

	private JLabel getNetacanOdgovor() {
		if (netacanOdgovor == null) {
			netacanOdgovor = new JLabel("Neta\u010Dan odgovor!");
			netacanOdgovor.setForeground(Color.RED);
			netacanOdgovor.setFont(new Font("Tahoma", Font.BOLD, 17));
			netacanOdgovor.setBounds(333, 444, 199, 85);
			netacanOdgovor.setVisible(false);
		}
		return netacanOdgovor;
	}

	public void runTacan() {
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				tacanOdgovor.setVisible(false);
			}
		}, 1500);
	}

	public void runNetacan() {
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				netacanOdgovor.setVisible(false);
			}
		}, 1500);
	}

	private JLabel getTacanOdgovor() {
		if (tacanOdgovor == null) {
			tacanOdgovor = new JLabel("    Ta\u010Dan odgovor!");
			tacanOdgovor.setForeground(Color.RED);
			tacanOdgovor.setFont(new Font("Tahoma", Font.BOLD, 17));
			tacanOdgovor.setBounds(324, 530, 170, 46);
			tacanOdgovor.setVisible(false);

		}
		return tacanOdgovor;
	}

	public JProgressBar getProgressBar_1() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setBackground(Color.YELLOW);
			progressBar.setFont(new Font("Tahoma", Font.BOLD, 15));
			progressBar.setForeground(Color.BLACK);
			progressBar.setMaximum(count);
			progressBar.setBounds(295, 25, 276, 29);

			progressBar.setStringPainted(true);
			progressBar.setVisible(true);

		}
		return progressBar;
	}
	private JLabel getFb() {
		if (fb == null) {
			fb = new JLabel("");
			fb.setIcon(new ImageIcon("C:\\Users\\Proxima\\Desktop\\IT\\4. SEMESTAR\\Programiranje 2\\SLAGALICA\\AleksandarMatovic2\\Resources\\1489390060_Facebook-01.png"));
			fb.setBounds(743, 288, 57, 43);
		}
		return fb;
	}
	private JLabel getTwitter() {
		if (twitter == null) {
			twitter = new JLabel("");
			twitter.setIcon(new ImageIcon("C:\\Users\\Proxima\\Desktop\\IT\\4. SEMESTAR\\Programiranje 2\\SLAGALICA\\AleksandarMatovic2\\Resources\\1489390055_Vimeo-01.png"));
			twitter.setBounds(810, 288, 57, 43);
		}
		return twitter;
	}
	private JLabel getGooglePlus() {
		if (googlePlus == null) {
			googlePlus = new JLabel("");
			googlePlus.setIcon(new ImageIcon("C:\\Users\\Proxima\\Desktop\\IT\\4. SEMESTAR\\Programiranje 2\\SLAGALICA\\AleksandarMatovic2\\Resources\\1489390068_Google_Plus-01.png"));
			googlePlus.setBounds(743, 342, 57, 43);
		}
		return googlePlus;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon("C:\\Users\\Proxima\\Desktop\\IT\\4. SEMESTAR\\Programiranje 2\\SLAGALICA\\AleksandarMatovic2\\Resources\\1489390064_Twitter-01.png"));
			label_2.setBounds(810, 342, 57, 43);
		}
		return label_2;
	}
}
