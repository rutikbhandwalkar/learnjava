
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.JTextPane;

//@SuppressWarnings("serial")
public class thread extends JFrame {

	private JPanel contentPane;

	static int x=0;
	static int posX=0;
	static int posY=0;
	static String arg_uname;
	
	
	public static void main(String[] args) {
		
		//arg_uname=args[0];
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thread frame = new thread();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	@SuppressWarnings("deprecation")
	public thread() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\eclipse-workspace\\ModAgroSpark\\Images\\update me 40.png"));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 50, 1052, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(54, 33, 89));
		panel.setBounds(0, 58, 1052, 522);
		contentPane.add(panel);
		panel.setLayout(null);

//*********************************************************************SHOW DATA FROM DATABASE******************************************************//
		/* try {
			Connection conn = null;
			String url = "jdbc:mysql://localhost:3306/";
			String dbName = "modagrospark";
			String driver = "com.mysql.cj.jdbc.Driver";
			String userName = "root";
			String password = "";
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url+dbName,userName,password);
			
			
			String sql = "SELECT * from user_info where username =?";
			 PreparedStatement stmt = conn.prepareStatement(sql);
			 stmt.setString(1, arg_uname);
			ResultSet rs = stmt.executeQuery();
			
		
			if(rs.next()) {
				//txt_name.setText(rs.getString(4));
				//txt_city.setText(rs.getString(5));
				//txt_locality.setText(rs.getString(6));
				//txt_state.setText(rs.getString(7));
				//txt_pin.setText(rs.getString(8));
				//txt_email.setText(rs.getString(9));
				//txt_mobile.setText(rs.getString(10));
				
			}
	
			conn.close();
		}catch(Exception err) {
			  
			JOptionPane.showMessageDialog(null,
					"Something wents wrong, Try again later..!!");
			
		}*/
//*******************************************************************************************************************************//
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(110, 89, 222));
		panel_2.setBounds(0, 512, 1052, 10);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(110, 89, 222));
		panel_3.setBounds(0, 0, 10, 522);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(110, 89, 222));
		panel_4.setBounds(1042, 0, 10, 541);
		panel.add(panel_4);
		
		JLabel lbl_uname = new JLabel(arg_uname);
		lbl_uname.setForeground(Color.WHITE);
		lbl_uname.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		lbl_uname.setBackground(Color.WHITE);
		lbl_uname.setBounds(352, 42, 306, 24);
		panel.add(lbl_uname);
		
		JLabel lblWhatIsJava = new JLabel("Threads:");
		lblWhatIsJava.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblWhatIsJava.setForeground(Color.WHITE);
		lblWhatIsJava.setBounds(30, 11, 287, 55);
		panel.add(lblWhatIsJava);
		
		JLabel lblJavaWasDeveloped = new JLabel("Java provides built-in support for multithreaded programming. A multi-threaded program contains two or more parts that can run concurrently.  .\r\n");
		lblJavaWasDeveloped.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblJavaWasDeveloped.setForeground(Color.WHITE);
		lblJavaWasDeveloped.setBounds(40, 62, 987, 34);
		panel.add(lblJavaWasDeveloped);
		
		JLabel lblNewLabel = new JLabel("Java provides built-in support for multithreaded programming. A multi-threaded program contains two or more parts that can run concurrently. \r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(39, 95, 987, 24);
		panel.add(lblNewLabel);
		

		JLabel object1 = new JLabel("Properties : \r\n");
		object1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		object1.setForeground(Color.WHITE);
		object1.setBounds(60, 120, 987, 28);
		panel.add(object1);
		



		JLabel object2 = new JLabel("It is the thread from which other child threads will be spawned.\r\n");
		object2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object2.setForeground(Color.WHITE);
		object2.setBounds(80, 140, 987, 24);
		panel.add(object2);
		
		JLabel object3 = new JLabel("Often, it must be the last thread to finish execution because it performs various shutdown actions:\r\n");
		object3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object3.setForeground(Color.WHITE);
		object3.setBounds(80, 160, 987, 24);
		panel.add(object3);


		JLabel object4 = new JLabel("Exception :\r\n");
		object4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object4.setForeground(Color.WHITE);
		object4.setBounds(30, 200, 987, 34);
		panel.add(object4);


		JLabel object5 = new JLabel("An exception (or exceptional event) is a problem that arises during the execution of a program.\r\n");
		object5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object5.setForeground(Color.WHITE);
		object5.setBounds(80, 220, 987, 24);
		panel.add(object5);



		JLabel object6 = new JLabel(" Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.\r\n");
		object6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object6.setForeground(Color.WHITE);
		object6.setBounds(90, 250, 987, 24);
		panel.add(object6);


	JLabel object7 = new JLabel("An exception can occur for many different reasons. Following are some scenarios where an exception occurs. \r\n");
		object7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object7.setForeground(Color.WHITE);
		object7.setBounds(90, 270, 987, 24);
		panel.add(object7);


			JLabel object8 = new JLabel("A user has entered an invalid data. \r\n");
		object8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object8.setForeground(Color.WHITE);
		object8.setBounds(110, 290, 987, 24);
		panel.add(object8);


		JLabel object9 = new JLabel("A file that needs to be opened cannot be found. \r\n");
		object9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object9.setForeground(Color.WHITE);
		object9.setBounds(110, 310, 987, 34);
		panel.add(object9);





		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				/*Component e1 = null;*/
				posX=e.getX();
				posY=e.getY();
			}
		});
		
		
		panel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Component component = (Component) e.getSource();
			     JFrame dialog = (JFrame) SwingUtilities.getRoot(component);
			     //dialog.dispose();
				dialog.setLocation(e.getXOnScreen()-posX,e.getYOnScreen()-posY);
			}
		});
		
		
		panel_1.setBackground(new Color(110, 89, 222));
		panel_1.setBounds(0, 0, 1052, 59);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMyProfile = new JLabel("Threads and Exception \r\n");
		lblMyProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyProfile.setForeground(Color.WHITE);
		lblMyProfile.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 22));
		lblMyProfile.setBounds(349, 0, 400, 58);
		panel_1.add(lblMyProfile);
		
		JLabel label_1 = new JLabel("X");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 Component component = (Component) e.getSource();
			     JFrame win = (JFrame) SwingUtilities.getRoot(component);
			     win.dispose();
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial Black", Font.BOLD, 21));
		label_1.setBounds(1017, 0, 35, 31);
		panel_1.add(label_1);
	}
}
