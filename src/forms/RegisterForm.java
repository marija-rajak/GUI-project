package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterForm extends JFrame {
	private JTextField txtName;
	private JTextField txtLastName;
	private JTextField txtUserName;
	private JPasswordField passwordField;
	private JPanel contentPane;
	private JTextField txtBirthDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 387);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 255), 2, true), "Prvi deo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 255)));
		panel.setBounds(10, 10, 386, 172);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Ime");
		lblName.setBounds(0, 10, 100, 30);
		panel.add(lblName);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblLastName = new JLabel("Prezime");
		lblLastName.setBounds(0, 50, 100, 30);
		panel.add(lblLastName);
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblUserName = new JLabel("Kor. ime");
		lblUserName.setBounds(0, 90, 100, 30);
		panel.add(lblUserName);
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblPassword = new JLabel("Lozinka");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(0, 130, 100, 30);
		panel.add(lblPassword);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.ITALIC, 16));
		txtName.setBounds(110, 10, 250, 30);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Tahoma", Font.ITALIC, 16));
		txtLastName.setColumns(10);
		txtLastName.setBounds(110, 50, 250, 30);
		panel.add(txtLastName);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Tahoma", Font.ITALIC, 16));
		txtUserName.setColumns(10);
		txtUserName.setBounds(110, 90, 250, 30);
		panel.add(txtUserName);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(110, 130, 250, 30);
		panel.add(passwordField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 2, true), "Drugi deo", TitledBorder.TRAILING, TitledBorder.TOP, null, Color.BLUE));
		panel_1.setBounds(10, 200, 386, 90);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBirthDate = new JLabel("Dat. rodjenja");
		lblBirthDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBirthDate.setBounds(0, 10, 100, 30);
		panel_1.add(lblBirthDate);
		
		JLabel lblGender = new JLabel("Pol");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender.setBounds(0, 50, 100, 30);
		panel_1.add(lblGender);
		
		txtBirthDate = new JTextField();
		txtBirthDate.setFont(new Font("Tahoma", Font.ITALIC, 16));
		txtBirthDate.setColumns(10);
		txtBirthDate.setBounds(110, 10, 250, 30);
		panel_1.add(txtBirthDate);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(110, 50, 250, 30);
		panel_1.add(comboBox);
		
		JButton btnRegister = new JButton("Registrujte se");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRegister.setBounds(128, 310, 150, 30);
		contentPane.add(btnRegister);
	}
}
