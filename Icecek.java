package Yemekler;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java_projesi.homecik;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Icecek extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {  
			public void run() {
				try {
					Icecek frame = new Icecek();
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
	public Icecek() throws SQLException {
		 final String DB="jdbc:mysql://localhost:3306/ıcecek";
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
				homecik h=new homecik();
				h.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(0, 10, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ayran");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO ıcecek VALUES(1,'Ayran',20)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(32, 80, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kola");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO ıcecek VALUES(2,'Kola',25)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(274, 80, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Gazoz");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO ıcecek VALUES(3,'Gazoz',25)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(32, 139, 85, 21); 
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Şalgam");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO ıcecek VALUES(4,'Şalgam',20)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(274, 139, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Sade Soda");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO ıcecek VALUES(5,'Sade Soda',15)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.setBounds(32, 211, 85, 21);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Meyveli Soda");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO ıcecek VALUES(6,'Meyveli Soda',20)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_6.setBounds(274, 211, 85, 21);
		contentPane.add(btnNewButton_6); 
		
		JButton btnNewButton_7 = new JButton("Soğuk Çay");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO ıcecek VALUES(7,'Soğuk Çay',25)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		btnNewButton_7.setBounds(157, 109, 85, 21);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Su");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="INSERT INTO ıcecek VALUES(8,'Su',10)";
				try {
					st.executeUpdate(sql3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_8.setBounds(157, 184, 85, 21);
		contentPane.add(btnNewButton_8);
	}

}
 