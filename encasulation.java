package learnjava;

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
public class encapsulation extends JFrame {

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
					encapsultion frame = new encapsulation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	@SuppressWarnings("deprecation")
	public introduction() {
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
		
		JLabel lblWhatIsJava = new JLabel("INTRODUCTION TO ENCAPSULATION IN JAVA");
		lblWhatIsJava.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblWhatIsJava.setForeground(Color.WHITE);
		lblWhatIsJava.setBounds(30, 11, 346, 55);
		panel.add(lblWhatIsJava);
		
		JLabel lblJavaWasDeveloped = new JLabel("Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.\r\n");
		lblJavaWasDeveloped.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblJavaWasDeveloped.setForeground(Color.WHITE);
		lblJavaWasDeveloped.setBounds(40, 62, 987, 34);
		panel.add(lblJavaWasDeveloped);
		
		JLabel lblNewLabel = new JLabel("\r\nTechnically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(39, 95, 927, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n\r\nTo achieve encapsulation in Java −\r\n\r\n  ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(27, 130, 656, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1) Declare the variables of a class as private.");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(40, 165, 992, 24);
		panel.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("2) Provide public setter and getter methods to modify and view the variables values.");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(40, 225, 765, 24);
		panel.add(lblNewLabel_3);
		
		
		JLabel lblNewLabel_4 = new JLabel("Example Of Code:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(40, 330, 946, 24);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("/* File name : EncapTest.java */
public class EncapTest {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
}
/* File name : RunEncap.java */
public class RunEncap {

   public static void main(String args[]) {
      EncapTest encap = new EncapTest();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   }
} ");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(60, 365, 926, 24);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("OUTPUT");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(60, 400, 623, 24);
		panel.add(lblNewLabel_7);
		
		JLabel lblViewExample = new JLabel("Name : James Age : 20");
		lblViewExample.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				 introexample.main(null);
				 Component component = (Component) e.getSource();
			     JFrame dialog = (JFrame) SwingUtilities.getRoot(component);
			     dialog.dispose();
				
			}
		});
		lblViewExample.setBorder(new LineBorder(Color.WHITE));
		lblViewExample.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewExample.setForeground(Color.WHITE);
		lblViewExample.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblViewExample.setBounds(431, 449, 209, 34);
		panel.add(lblViewExample);
		
		
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
		
		JLabel lblMyProfile = new JLabel("INTRODUCTION TO ENCAPSULATION IN JAVA\r\n");
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
