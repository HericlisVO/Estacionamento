package impacta.ead.estacionamento.apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import impacta.ead.estacionamento.controle.EstacionamentoController;
import impacta.ead.estacionamento.controle.EstacionamentoException;
import impacta.ead.estacionamento.controle.VeiculoException;

public class TelaEntradaVeiculo extends JFrame implements ActionListener{
	JFrame parent;
	private JTextField txtMarca;
	private JTextField txtCor;
	private JFormattedTextField txfPlaca;
	private JButton btnOk ;
	private JButton btnCancel;
	private JTextField txtModelo;
	// TODO temporario
	
	public static void main(String[] args) {
		TelaEntradaVeiculo tela = new TelaEntradaVeiculo(null);
		tela.setVisible(true);
	}

	public TelaEntradaVeiculo(JFrame parent) {
		setTitle("Entrada de Veiculo");
		setSize(400, 300);
		setResizable(false);

		
		
		this.parent = parent;
		getContentPane().setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(73, 34, 49, 14);
		getContentPane().add(lblPlaca);
		
		JLabel lblModelo = new JLabel("Modelo :");
		lblModelo.setBounds(73, 122, 49, 14);
		getContentPane().add(lblModelo);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(73, 74, 49, 14);
		getContentPane().add(lblMarca);
		
		JLabel lblCor = new JLabel("Cor :");
		lblCor.setBounds(73, 167, 49, 14);
		getContentPane().add(lblCor);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(177, 74, 117, 20);
		getContentPane().add(txtMarca);
		txtMarca.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setBounds(177, 170, 117, 20);
		getContentPane().add(txtCor);
		txtCor.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		btnOk.setBounds(51, 229, 89, 23);
		getContentPane().add(btnOk);
		
		
		btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("cancel");
		
		btnCancel.setBounds(222, 229, 89, 23);
		getContentPane().add(btnCancel);
		
		try {
			txfPlaca = new JFormattedTextField(new MaskFormatter("UUU-####"));
		} catch (ParseException e) {
			assert false : "Padrão de Placa errado!";
			setLocationRelativeTo(null);
		}
		txfPlaca.setColumns(40);
		txfPlaca.setBounds(177, 34, 117, 20);
		getContentPane().add(txfPlaca);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(177, 119, 117, 20);
		getContentPane().add(txtModelo);
		txtModelo.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals("ok")) {
			EstacionamentoController controle = new EstacionamentoController();
			try {
				controle.processarEntrada(txfPlaca.getText(), txtMarca.getText(), txtModelo.getText(), txtCor.getText());

				JOptionPane.showMessageDialog(null, "Veiculo Registrado com sucesso","Entrada de Veiculo", JOptionPane.INFORMATION_MESSAGE);
				
			} catch (EstacionamentoException | VeiculoException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(),"Falha na Entrada", JOptionPane.ERROR_MESSAGE);
			}
			
		
		}
			
			this.parent.setVisible(true);
			this.dispose();
	}
}
