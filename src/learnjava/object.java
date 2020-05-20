
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
public class object extends JFrame {

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
					object frame = new object();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	@SuppressWarnings("deprecation")
	public object() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\eclipse-workspace\\ModAgroSpark\\Images\\update me 40.png"));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 50, 1052, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255,69,0));
		panel.setBackground(new Color(255,99,71));
		panel.setBounds(0, 58, 1052, 700);
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
		panel_2.setBackground(new Color(110, 89, 25));
		panel_2.setBounds(0, 660, 1052, 10);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(110, 89, 152));
		panel_3.setBounds(0, 0, 10, 700);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(110, 89, 22));
		panel_4.setBounds(1042, 0, 10, 700);
		panel.add(panel_4);
		
		JLabel lbl_uname = new JLabel(arg_uname);
		lbl_uname.setForeground(Color.WHITE);
		lbl_uname.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		lbl_uname.setBackground(Color.WHITE);
		lbl_uname.setBounds(352, 42, 306, 24);
		panel.add(lbl_uname);
		
		JLabel lblWhatIsJava = new JLabel("Classes :");
		lblWhatIsJava.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblWhatIsJava.setForeground(Color.WHITE);
		lblWhatIsJava.setBounds(30, 11, 287, 55);
		panel.add(lblWhatIsJava);
		
		JLabel lblJavaWasDeveloped = new JLabel("A class is a user defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components.\r\n");
		lblJavaWasDeveloped.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblJavaWasDeveloped.setForeground(Color.WHITE);
		lblJavaWasDeveloped.setBounds(40, 62, 987, 34);
		panel.add(lblJavaWasDeveloped);
		
		JLabel object1 = new JLabel("1. Modifiers : A class can be public or has default access .\r\n");
		object1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object1.setForeground(Color.WHITE);
		object1.setBounds(60, 120, 987, 34);
		panel.add(object1);
		
		JLabel object2 = new JLabel("2. Class name: The name should begin with a initial letter (capitalized by convention).\r\n");
		object2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object2.setForeground(Color.WHITE);
		object2.setBounds(60, 140, 987, 34);
		panel.add(object2);
		
		JLabel object3 = new JLabel("3. Superclass: The name of the class parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.\r\n");
		object3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object3.setForeground(Color.WHITE);
		object3.setBounds(60, 160, 987, 34);
		panel.add(object3);


		JLabel object4 = new JLabel("4. Interfaces: A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.\r\n");
		object4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object4.setForeground(Color.WHITE);
		object4.setBounds(60, 180, 987, 34);
		panel.add(object4);






				JLabel object5 = new JLabel("5. Body: The class body surrounded by braces, { }..\r\n");
		object5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object5.setForeground(Color.WHITE);
		object5.setBounds(60, 200, 987, 34);
		panel.add(object5);





			JLabel object6 = new JLabel(" Object\r\n");
		object6.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		object6.setForeground(Color.WHITE);
		object6.setBounds(20, 240, 987, 34);
		panel.add(object6);



			JLabel object7 = new JLabel(" It is a basic unit of Object Oriented Programming and represents the real life entities.  A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of :\r\n");
		object7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object7.setForeground(Color.WHITE);
		object7.setBounds(40, 280, 1987, 34);
		panel.add(object7);

			JLabel object8 = new JLabel("1. State : It is represented by attributes of an object. It also reflects the properties of an object.\r\n");
		object8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object8.setForeground(Color.WHITE);
		object8.setBounds(60, 300, 987, 34);
		panel.add(object8);



			



		JLabel object11 = new JLabel("2. Behavior : It is represented by methods of an object. It also reflects the response of an object with other objects. :\r\n");
		object11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object11.setForeground(Color.WHITE);
		object11.setBounds(60, 320, 987, 34);
		panel.add(object11);

			JLabel object12 = new JLabel("3. Identity : It gives a unique name to an object and enables one object to interact with other objects.\r\n");
		object12.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object12.setForeground(Color.WHITE);
		object12.setBounds(60, 340, 987, 34);
		panel.add(object12);

			JLabel object13 = new JLabel("Example of an object : Dog.\r\n");
		object13.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		object13.setForeground(Color.WHITE);
		object13.setBounds(100, 380, 987, 34);
		panel.add(object13);


		ImageIcon objectex=new ImageIcon("objectex.png");
		JLabel object10 = new JLabel(objectex);
		panel.add(object10);
		object10.setBounds(40, 400, 980, 204);
		
	
		
		
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
		
		
		panel_1.setBackground(new Color(120, 65, 140));
		panel_1.setBounds(0, 0, 1052, 59);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMyProfile = new JLabel("Classes and Objects in Java\r\n");
		lblMyProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyProfile.setForeground(Color.WHITE);
		lblMyProfile.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 22));
		lblMyProfile.setBounds(349, 0, 340, 58);
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
