package Yemekler;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Ara_Sicak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ara_Sicak frame = new Ara_Sicak();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();  
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Ara_Sicak() throws SQLException {
		 final String DB="jdbc:mysql://localhost:3306/Ara_sicak";
		 final String USER="root";
		 final String PASS="xsQj71IyXiibSja";  
		 Connection con=DriverManager.getConnection(DB,USER,PASS);
		 Statement st=con.createStatement();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null); 
		
		JButton btnNewButton = new JButton("Geri");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yemekler y=new Yemekler();
				y.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Paçanga Böreği ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO Ara_Sicak VALUES(1,'Paçanga böreği',30)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();  
				} 
			} 
		});
		btnNewButton_1.setBounds(29, 77, 112, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Humus");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO Ara_Sicak VALUES(2,'Humus',80)"; 
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(320, 77, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("İçli Köfte ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO Ara_Sicak VALUES(3,'içli köfte',60)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(29, 194, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Etli Yaprak Sarma ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO Ara_Sicak VALUES(4,'etli yaprak sarma ',120)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(282, 194, 123, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Kaşarlı Patates Kroket ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO Ara_Sicak VALUES(5,'kaşarlı patates kroket ',50)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.setBounds(148, 116, 144, 21);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Kuru Patlıcan Dolması");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO Ara_Sicak VALUES(6,'kuru patlıcan dolması',80)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_6.setBounds(148, 160, 129, 21); 
		contentPane.add(btnNewButton_6);
	}

}
