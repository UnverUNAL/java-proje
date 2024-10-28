package java_projesi;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.Connection;
import java.sql.SQLDataException;
import java.sql.SQLException;

import Yemekler.Icecek;
import Yemekler.Yemekler;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class homecik extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homecik frame = new homecik();
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
	public homecik() {
		setTitle("WELCOME TO OUR RESTARUANT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); 
		contentPane.setLayout(null);
		
		JButton kampanya = new JButton("KAMPANYALAR");
		kampanya.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				Kampanyalar k = null;
				try {
					k = new Kampanyalar();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				k.setVisible(true);
				dispose();
			}
		});
		kampanya.setBounds(0, 10, 151, 75);
		contentPane.add(kampanya);
		
		JButton yemekler = new JButton("YEMEKLER");
		yemekler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yemekler y=new Yemekler();
				y.setVisible(true);
				dispose();
			}
		});
		yemekler.setBounds(285, 10, 151, 75);
		contentPane.add(yemekler);
		
		JButton YANINDAGİDER = new JButton("YANINDA İYİ GİDER");
		YANINDAGİDER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yaninda_gider yg = null;
				try {
					yg = new Yaninda_gider();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				yg.setVisible(true);
				dispose();
				
			}
		});
		YANINDAGİDER.setBounds(0, 178, 151, 75);
		contentPane.add(YANINDAGİDER);
		
		JButton içecek = new JButton("İÇECEKLER");
		içecek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Icecek i = null;
				try {
					i = new Icecek();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				i.setVisible(true);
				dispose();
			}
		});
		içecek.setBounds(285, 178, 151, 75);
		contentPane.add(içecek);
	}
}
