package java_projesi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Kampanyalar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kampanyalar frame = new Kampanyalar();
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
	public Kampanyalar() throws SQLException {
		 final String DB="jdbc:mysql://localhost:3306/Kampanyalar";
		 final String USER="root";
		 final String PASS="xsQj71IyXiibSja";  
		 Connection con=DriverManager.getConnection(DB,USER,PASS);
		 Statement st=con.createStatement(); 
		 /**
		 String sql2="CREATE TABLE DENEME "+
					"(id INTEGER not NULL, "+
					 "yemek adi VARCHAR(20), "+
					 "fiyat INTEGER, "+
					"PRIMARY KEY(id))";
					*/
		 //st.executeUpdate(sql2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Geri");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homecik h=new homecik();
				h.setVisible(true);
				dispose(); 
			}
		});
		btnNewButton.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("İskender+Kola+Künefe");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO Kampanyalar VALUES(1,'kampanya1',250)";
				
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(10, 41, 366, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Karışık Pide+ Ayran");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO Kampanyalar VALUES(2,'kampanya2',300)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(10, 125, 366, 44);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pizza+Patetes Kızartması+Kola");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO Kampanyalar VALUES(3,'kampanya3',400)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(10, 209, 366, 44);
		contentPane.add(btnNewButton_3);
	}
}
