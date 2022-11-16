package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPadrão extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPadrão frame = new TelaPadrão();
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
	public TelaPadrão() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setBackground(new Color(250, 235, 215));
		txtPesquisa.setBounds(20, 11, 228, 20);
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JComboBox cbFiltro = new JComboBox();
		cbFiltro.setBackground(new Color(128, 0, 128));
		cbFiltro.setBounds(364, 10, 60, 22);
		contentPane.add(cbFiltro);
		
		JTextArea txtAreaDiscos = new JTextArea();
		txtAreaDiscos.setBackground(new Color(250, 240, 230));
		txtAreaDiscos.setBounds(10, 56, 251, 194);
		contentPane.add(txtAreaDiscos);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setBounds(258, 10, 89, 23);
		contentPane.add(btnPesquisar);
		
		JButton btnDeslogar = new JButton("Deslogar");
		btnDeslogar.setBackground(new Color(128, 0, 128));
		btnDeslogar.setBounds(333, 208, 101, 53);
		contentPane.add(btnDeslogar);
	}
}
