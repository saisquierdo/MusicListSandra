package com.sandra.musiclist.forms;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 831, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnParentList = new JMenu("Parents");
		mnParentList.setFont(new Font("Arial", Font.PLAIN, 18));
		menuBar.add(mnParentList);
		
		JMenuItem mntmAddParent = new JMenuItem("Add Parent");
		mntmAddParent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AddParent.main(null);
			}
		});
		mnParentList.add(mntmAddParent);
		
		JMenu mnList = new JMenu("List");
		mnParentList.add(mnList);
		
		JMenu mnEnterANew = new JMenu("Enter a new music list");
		mnParentList.add(mnEnterANew);
		
		JMenu mnMusics = new JMenu("Musics");
		mnMusics.setFont(new Font("Arial", Font.PLAIN, 18));
		menuBar.add(mnMusics);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the parents music");
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 29));
		frame.getContentPane().add(lblWelcomeToThe, BorderLayout.CENTER);
	}

}
