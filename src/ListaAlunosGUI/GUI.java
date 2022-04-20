package ListaAlunosGUI;
import TAD.*;
import br.pucrs.adt.OldTrees.BinaryTreeABPTAD;
import br.pucrs.adt.OldTrees.BinaryTreeLinked;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
	private JLabel nomeLabel = null;
	private JTextField nomeField = null;
	private JLabel matrLabel = null;
	private JTextField matrField = null;
	private JButton okBut = null;
	private JButton limpaBut = null;
	private JTextArea listaField = null;
	private JScrollPane listaScroll = null;
	
	private BinaryTreeABPTAD<Aluno> arv = new BinaryTreeLinked<Aluno>();
	
	GUI(String titulo)
	{
		super(titulo);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		getContentPane().setLayout(new GridLayout(1,2));
		
		nomeLabel = new JLabel("Nome:");
		nomeField = new JTextField(20);
		matrLabel = new JLabel("Matricula:");
		matrField = new JTextField(18);
		okBut = new JButton("OK");
		limpaBut = new JButton("Limpa");
		
		JPanel painelEntrada = new JPanel();
		painelEntrada.setLayout(new GridLayout(3,1));
		JPanel painelNome = new JPanel();
		painelNome.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel painelMatr = new JPanel();
		painelMatr.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel painelBut = new JPanel();
		painelBut.setLayout(new FlowLayout(FlowLayout.CENTER));

		painelMatr.add(matrLabel);
		painelMatr.add(matrField);
		painelEntrada.add(painelMatr);
		painelNome.add(nomeLabel);
		painelNome.add(nomeField);
		painelEntrada.add(painelNome);
		painelBut.add(okBut);
		painelBut.add(limpaBut);
		painelEntrada.add(painelBut);
		
		getContentPane().add(painelEntrada);
		
		listaField = new JTextArea();
		listaField.setEditable(false);
		listaScroll = new JScrollPane(listaField);
		getContentPane().add(listaScroll);
		
		JTextArea textArea = new JTextArea();
	    JScrollPane scrollableTextArea = new JScrollPane(textArea);

		
		okBut.addActionListener(this);
		limpaBut.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == limpaBut)
		{
			nomeField.setText("");
			matrField.setText("");
		}
		else if (e.getSource() == okBut)
		{
			Aluno aux = new Aluno();
			aux.setMatr(Integer.parseInt(matrField.getText()));
			aux.setNome(nomeField.getText());
			
			arv.addABP(aux);
			
			listaField.setText(arv.strTraversalCentral());
		}
	}
	
	public static void main(String[] argc)
	{
		GUI janela = new GUI("ListaArranjos Alunos");
		
		janela.pack();
        janela.setVisible(true);
	}
}
