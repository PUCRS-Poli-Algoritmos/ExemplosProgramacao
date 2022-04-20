package br.pucrs.exerprog.dicionarios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgendaGUIA extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaGUIA frame = new AgendaGUIA();
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
	public AgendaGUIA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAgenda = new JMenu("Agenda");
		menuBar.add(mnAgenda);
		
		JMenuItem mntmAdiciona = new JMenuItem("Adiciona");
		mntmAdiciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel adicionaPainel = new JPanel();
			}
		});
		mnAgenda.add(mntmAdiciona);
		
		JMenuItem mntmBusca = new JMenuItem("Busca");
		mnAgenda.add(mntmBusca);
		
		JMenuItem mntmRemove = new JMenuItem("Remove");
		mnAgenda.add(mntmRemove);
		
		JMenuItem mntmTodos = new JMenuItem("Todos");
		mnAgenda.add(mntmTodos);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		menuBar.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
