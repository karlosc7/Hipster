package hipster;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.TextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class hipster {

	/**
	 * @author Carlos del Cerro
	 * @version 1.0-Beta
	 * 
	 */

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hipster window = new hipster();
					window.frame.setVisible(true);
					window.frame.setTitle("Hipster");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	{
		for (@SuppressWarnings("unused")
		LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
			try {
				javax.swing.UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Create the application.
	 */
	public hipster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setEnabled(true);
		frame.setBounds(100, 100, 590, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Features",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));

		final JCheckBox chckbxGafasPasta = new JCheckBox("gafas pasta");
		chckbxGafasPasta.setSelected(true);
		panel_5.add(chckbxGafasPasta);

		final JCheckBox chckbxBarbita = new JCheckBox("barbita");
		chckbxBarbita.setSelected(true);
		panel_5.add(chckbxBarbita);

		final JCheckBox chckbxTupe = new JCheckBox("tup\u00E9");
		panel_5.add(chckbxTupe);

		final JCheckBox chckbxBotnCuello = new JCheckBox("bot\u00F3n cuello");
		panel_5.add(chckbxBotnCuello);

		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));

		JRadioButton rdbtnNewRadioButton = new JRadioButton("hombre");
		buttonGroup.add(rdbtnNewRadioButton);
		panel_6.add(rdbtnNewRadioButton);

		JRadioButton rdbtnMujer = new JRadioButton("mujer");
		buttonGroup.add(rdbtnMujer);
		rdbtnMujer.setSelected(true);
		panel_6.add(rdbtnMujer);

		JRadioButton rdbtnOtros = new JRadioButton("otros");
		buttonGroup.add(rdbtnOtros);
		panel_6.add(rdbtnOtros);

		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// Dialoging
				String message = "Esto es todo lo hipster que puedes ser??";
				String message2 = "Prueba con más opciones";
				getResource("/multiPane02/src/Images/camping.png");
				int answer = JOptionPane.showConfirmDialog(frame, message);
				if (answer == JOptionPane.YES_OPTION) {
					// User clicked YES.
				} else if (answer == JOptionPane.NO_OPTION) {
					// User clicked NO.
				}
			}

			private void getResource(String string) {
				// TODO Auto-generated method stub

			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent e) {
				TextComponent textArea = null;
				textArea.setText("");
			}

			@SuppressWarnings("unused")
			public String selection2Pane() {
				String text = "";
				if (chckbxGafasPasta.isSelected())
					text += "gafapasta\n";
				if (chckbxBarbita.isSelected())
					text += "barbas\n";
				if (chckbxTupe.isSelected())
					text += "flequillo/tupé\n";
				if (chckbxBotnCuello.isSelected())
					text += "botonaco en el cuello\n";
				if (chckbxBarbita.isSelected())
					text += "Femen\n";
				if (chckbxGafasPasta.isSelected())
					text += "Men\n";
				if (chckbxTupe.isSelected())
					text += "esa sexualidad diversa\n";
				return text;

			}
		});
		btnNewButton.setIcon(new ImageIcon(hipster.class
				.getResource("/img/Annoying-Hipster.png")));
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		panel_6.add(btnNewButton);
		btnNewButton.setToolTipText("Cambia tu estilo");

		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_2.add(tabbedPane);

		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("hipster", null, scrollPane, null);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("non hipster", null, scrollPane_1, null);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane_3);

		JTextArea textArea_2 = new JTextArea();
		scrollPane_3.setViewportView(textArea_2);

		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));

		JScrollPane scrollPane_2 = new JScrollPane();
		panel_3.add(scrollPane_2);

		JTextArea txtrreaDeTexto = new JTextArea();
		txtrreaDeTexto.setText("\u00E1rea de texto scrollable");
		scrollPane_2.setViewportView(txtrreaDeTexto);

		JPanel panel_4 = new JPanel();
		panel.add(panel_4);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("JMen\u00FA1");
		menuBar.add(mnNewMenu);

		JMenuItem mntmArchivo = new JMenuItem("File");
		mnNewMenu.add(mntmArchivo);

		JMenuItem mntmNewMenuItem = new JMenuItem("OpenFile");
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmClosefile = new JMenuItem("CloseFile");
		mnNewMenu.add(mntmClosefile);

		JMenuItem mntmSaveAs = new JMenuItem("Save As...");
		mnNewMenu.add(mntmSaveAs);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenu mnNewMenu_1 = new JMenu("JMen\u00FA2");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmHipster = new JMenuItem("Hipster");
		mnNewMenu_1.add(mntmHipster);

		JMenuItem mntmNoHipster = new JMenuItem("No Hipster");
		mnNewMenu_1.add(mntmNoHipster);
	}

}
