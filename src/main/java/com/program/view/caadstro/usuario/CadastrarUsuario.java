package com.program.view.caadstro.usuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;
import javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager;

import com.program.entites.Usuario;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CadastrarUsuario {

	private JFrame cadastrarUsuario;
	private JTextField textField_Nome;
	private JLabel lblLabel_Nome;
	private JLabel lblLabel_Usuario;
	private JTextField textField_Usuario;
	private JLabel lblLabel_Senha;
	private JPasswordField passwordField_CadastroUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarUsuario window = new CadastrarUsuario();
					window.cadastrarUsuario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastrarUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cadastrarUsuario = new JFrame();
		cadastrarUsuario.getContentPane().setBackground(new Color(255, 255, 255));
		cadastrarUsuario.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\wesle\\project-java\\program-mainframe\\target\\img\\icon-program.png"));
		cadastrarUsuario.setTitle("Cadastro de Usuário");
		cadastrarUsuario.setBounds(100, 100, 392, 230);
		cadastrarUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadastrarUsuario.getContentPane().setLayout(null);
		
		textField_Nome = new JTextField();
		textField_Nome.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_Nome.setForeground(new Color(0, 51, 102));
		textField_Nome.setBounds(10, 28, 211, 20);
		cadastrarUsuario.getContentPane().add(textField_Nome);
		textField_Nome.setColumns(10);
		
		lblLabel_Nome = new JLabel("Nome completo");
		lblLabel_Nome.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblLabel_Nome.setBounds(10, 11, 101, 17);
		cadastrarUsuario.getContentPane().add(lblLabel_Nome);
		
		lblLabel_Usuario = new JLabel("Usuário");
		lblLabel_Usuario.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblLabel_Usuario.setBounds(10, 59, 55, 17);
		cadastrarUsuario.getContentPane().add(lblLabel_Usuario);
		
		textField_Usuario = new JTextField();
		textField_Usuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_Usuario.setForeground(new Color(0, 51, 102));
		textField_Usuario.setColumns(10);
		textField_Usuario.setBounds(10, 75, 211, 20);
		cadastrarUsuario.getContentPane().add(textField_Usuario);
		
		lblLabel_Senha = new JLabel("Senha");
		lblLabel_Senha.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblLabel_Senha.setBounds(10, 106, 55, 17);
		cadastrarUsuario.getContentPane().add(lblLabel_Senha);
		
		passwordField_CadastroUsuario = new JPasswordField();
		passwordField_CadastroUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		passwordField_CadastroUsuario.setForeground(new Color(0, 51, 102));
		passwordField_CadastroUsuario.setBounds(10, 123, 211, 20);
		cadastrarUsuario.getContentPane().add(passwordField_CadastroUsuario);
		

		
		JButton btn_Deletar = new JButton("Deletar");
		btn_Deletar.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		btn_Deletar.setBackground(Color.WHITE);
		btn_Deletar.setForeground(new Color(0, 51, 102));
		btn_Deletar.setBounds(90, 161, 77, 23);
		cadastrarUsuario.getContentPane().add(btn_Deletar);
		
		JButton btn_Sair = new JButton("Sair");
		btn_Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTela();
			}
		});
		btn_Sair.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		btn_Sair.setForeground(new Color(0, 51, 102));
		btn_Sair.setBackground(Color.WHITE);
		btn_Sair.setBounds(177, 161, 70, 23);
		cadastrarUsuario.getContentPane().add(btn_Sair);
		
		JLabel lblLabel_LogoCadastroUsuario = new JLabel("");
		lblLabel_LogoCadastroUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("click aqui");
			}
		});
		lblLabel_LogoCadastroUsuario.setIcon(new ImageIcon("C:\\Users\\wesle\\project-java\\program-mainframe\\target\\img\\cadastro-usuário - medio.png"));
		lblLabel_LogoCadastroUsuario.setBounds(252, 59, 101, 100);
		cadastrarUsuario.getContentPane().add(lblLabel_LogoCadastroUsuario);
		
		final JComboBox comboBox_CadastroUsuario = new JComboBox();
		comboBox_CadastroUsuario.setBackground(new Color(255, 255, 255));
		comboBox_CadastroUsuario.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 11));
		comboBox_CadastroUsuario.setModel(new DefaultComboBoxModel(new String[] {"", "Vendedor Externo", "Vendedor Interno", "Operador de Caixa", "Limpeza", "Gerente", "Administrativo", "Auxiliar de Escritório"}));
		comboBox_CadastroUsuario.setSelectedIndex(0);
		comboBox_CadastroUsuario.setBounds(243, 27, 123, 20);
		cadastrarUsuario.getContentPane().add(comboBox_CadastroUsuario);
		
		JButton btn_Salvar = new JButton("Salvar");
		btn_Salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// SALVA USUÁRIO NO OBJETO USUÁRIO
				String nomeCompleto = textField_Nome.getText();
				String cargo = comboBox_CadastroUsuario.getSelectedItem().toString();   
				String cadastroUsuario = textField_Usuario.getText();
				String senhaUsuario = passwordField_CadastroUsuario.getText();
				 
				Usuario usuario = new Usuario(nomeCompleto, cargo, cadastroUsuario, senhaUsuario);
				
			}
			
		
		});
		btn_Salvar.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		btn_Salvar.setBackground(Color.WHITE);
		btn_Salvar.setForeground(new Color(0, 51, 102));
		btn_Salvar.setBounds(10, 161, 70, 23);
		cadastrarUsuario.getContentPane().add(btn_Salvar);
	}
	
	public void fechaTela() {
		cadastrarUsuario.setVisible(false);
	}
}
