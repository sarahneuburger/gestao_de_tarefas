package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JButton;

public class TelaTarefasEmAndamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel telaTarefasEmAndamento;
	private JTable tableTarefasEmAndamento;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTarefasEmAndamento frame = new TelaTarefasEmAndamento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaTarefasEmAndamento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaTarefasEmAndamento.class.getResource("/img/iconeInicial.PNG")));
		setBackground(new Color(32, 178, 170));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 586, 508);
		telaTarefasEmAndamento = new JPanel();
		telaTarefasEmAndamento.setBackground(new Color(32, 178, 170));
		telaTarefasEmAndamento.setBorder(new EmptyBorder(5, 5, 5, 5));
		telaTarefasEmAndamento.setLayout(new BorderLayout(0, 0));
		setContentPane(telaTarefasEmAndamento);
		
		JPanel panelTarefasEmAndamento = new JPanel();
		panelTarefasEmAndamento.setBackground(new Color(32, 178, 170));
		telaTarefasEmAndamento.add(panelTarefasEmAndamento, BorderLayout.CENTER);
		panelTarefasEmAndamento.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("15dlu"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("15dlu"),},
			new RowSpec[] {
				RowSpec.decode("15dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("15dlu"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("10dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("15dlu"),}));
		
		JLabel lblTarefasEmAndamento = new JLabel("Tarefas em Andamento");
		lblTarefasEmAndamento.setForeground(new Color(255, 255, 255));
		lblTarefasEmAndamento.setFont(new Font("Monospaced", Font.BOLD, 26));
		panelTarefasEmAndamento.add(lblTarefasEmAndamento, "2, 2");
		
		JScrollPane scrollTarefasEmAndamento = new JScrollPane();
		scrollTarefasEmAndamento.setViewportBorder(new LineBorder(new Color(0, 153, 153)));
		panelTarefasEmAndamento.add(scrollTarefasEmAndamento, "2, 4, fill, fill");
		
		tableTarefasEmAndamento = new JTable();
		tableTarefasEmAndamento.setCellSelectionEnabled(true);
		tableTarefasEmAndamento.setBackground(new Color(102, 205, 170));
		scrollTarefasEmAndamento.setViewportView(tableTarefasEmAndamento);
		
		JButton btnNewButton = new JButton("Concluir Tarefa");
		btnNewButton.setForeground(new Color(32, 178, 170));
		btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 255, 255));
		panelTarefasEmAndamento.add(btnNewButton, "2, 6, right, default");
	}

}
