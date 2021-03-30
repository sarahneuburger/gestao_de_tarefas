package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Toolkit;
import java.text.ParseException;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastrarTarefa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel telaInserirTarefa;
	private JTextField txtTituloTarefa;
	private JTextField textDetalhesTarefa;
	private JFormattedTextField dataConclusao;
	private MaskFormatter ftmData;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarTarefa frame = new TelaCadastrarTarefa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	 // @throws ParseException 
	public TelaCadastrarTarefa() throws ParseException {
		setBackground(new Color(32, 178, 170));
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastrarTarefa.class.getResource("/img/iconeInicial.PNG")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 586, 508);
		telaInserirTarefa = new JPanel();
		telaInserirTarefa.setBackground(new Color(32, 178, 170));
		telaInserirTarefa.setBorder(new EmptyBorder(5, 5, 5, 5));
		telaInserirTarefa.setLayout(new BorderLayout(0, 0));
		setContentPane(telaInserirTarefa);
		
		JPanel panelInserirTarefa = new JPanel();
		panelInserirTarefa.setForeground(new Color(255, 255, 255));
		panelInserirTarefa.setBackground(new Color(32, 178, 170));
		telaInserirTarefa.add(panelInserirTarefa, BorderLayout.CENTER);
		panelInserirTarefa.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("20dlu"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("50dlu"),},
			new RowSpec[] {
				RowSpec.decode("15dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("15dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("30dlu"),
				RowSpec.decode("15dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("50dlu"),
				RowSpec.decode("15dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("20dlu"),
				RowSpec.decode("15dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("15dlu"),}));
		
		JLabel lblTituloInserirTarefa = new JLabel("Inserir Nova Tarefa");
		lblTituloInserirTarefa.setFont(new Font("Monospaced", Font.BOLD, 26));
		lblTituloInserirTarefa.setForeground(new Color(255, 255, 255));
		panelInserirTarefa.add(lblTituloInserirTarefa, "2, 2");
		
		JLabel lblTituloTarefa = new JLabel("T\u00EDtulo:");
		lblTituloTarefa.setFont(new Font("Monospaced", Font.BOLD, 16));
		lblTituloTarefa.setForeground(new Color(255, 255, 255));
		panelInserirTarefa.add(lblTituloTarefa, "2, 4");
		
		txtTituloTarefa = new JTextField();
		txtTituloTarefa.setForeground(new Color(128, 128, 128));
		txtTituloTarefa.setText("Insira um breve t\u00EDtulo para a tarefa...");
		panelInserirTarefa.add(txtTituloTarefa, "2, 5, fill, fill");
		txtTituloTarefa.setColumns(10);
		
		JLabel lblDetalhesTarefa = new JLabel("Detalhes:");
		lblDetalhesTarefa.setForeground(Color.WHITE);
		lblDetalhesTarefa.setFont(new Font("Monospaced", Font.BOLD, 16));
		panelInserirTarefa.add(lblDetalhesTarefa, "2, 7");
		
		textDetalhesTarefa = new JTextField();
		textDetalhesTarefa.setToolTipText("");
		textDetalhesTarefa.setText("Insira os detalhes da tarefa...");
		textDetalhesTarefa.setForeground(Color.GRAY);
		textDetalhesTarefa.setColumns(10);
		panelInserirTarefa.add(textDetalhesTarefa, "2, 8, fill, fill");
		
		JLabel lblPrevConclusao = new JLabel("Previs\u00E3o para conclus\u00E3o:");
		lblPrevConclusao.setForeground(Color.WHITE);
		lblPrevConclusao.setFont(new Font("Monospaced", Font.BOLD, 16));
		panelInserirTarefa.add(lblPrevConclusao, "2, 10");
		
		ftmData = new MaskFormatter("##/##/####");
		ftmData.setValidCharacters("0123456789");
		dataConclusao = new JFormattedTextField(ftmData);
		dataConclusao.setForeground(Color.GRAY);
		panelInserirTarefa.add(dataConclusao, "2, 11, left, fill");
		dataConclusao.setColumns(10);
		
		JButton btnCadastrarTarefa = new JButton("Inserir Tarefa");
		btnCadastrarTarefa.setForeground(new Color(32, 178, 170));
		btnCadastrarTarefa.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnCadastrarTarefa.setBackground(new Color(255, 255, 255));
		panelInserirTarefa.add(btnCadastrarTarefa, "2, 13, right, default");
	}

}
