import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;

public class InterfaceUpload extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceUpload frame = new InterfaceUpload();
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
	public InterfaceUpload() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(19, 19, 19));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(19, 19, 19));
		panel.setBounds(0, 0, 451, 393);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Upload de Livros");
		lblNewLabel.setBounds(133, 5, 185, 31);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 23));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Escolher Capa");
		btnNewButton.setBounds(133, 86, 185, 54);
		panel.add(btnNewButton);
		
		JButton btnEscolherPdf = new JButton("Escolher PDF");
		btnEscolherPdf.setBounds(135, 190, 185, 54);
		panel.add(btnEscolherPdf);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(176, 299, 104, 31);
		panel.add(btnAdicionar);
	}
}
