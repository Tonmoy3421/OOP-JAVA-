//step 0
import javax.swing.*; //package for GUI components
import java.awt.*; //package for Font, Color 

//step 1
public class FrameSample extends JFrame
{
	//step 2
	private JPanel panel;
	private JLabel label1, label2, label3;
	private JTextField tf1;
	private JPasswordField pf1;
	
	//step 3
	private Color c1, c2;
	private Font f1, f2;
	
	//step 4
	public FrameSample()
	{
		//step 4(a)
		super("Student Management System");
		//super.setSize(800,400); //(width, height)
		super.setBounds(600, 200, 800,400); //(x, y, width, height)
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//step 4(b)
		panel = new JPanel();
		panel.setLayout(null);
		
		//step 4(c)
		c1 = new Color(255, 0, 0);
		f1 = new Font("Cambria", Font.BOLD, 30);
		
		c2 = new Color(0, 0, 0);
		f2 = new Font("Cambria", Font.BOLD, 20);
		
		//step 4(d)
		label1 = new JLabel("OOP1[A]");
		label1.setBounds(300,0,200,50);
		panel.add(label1);
		
		label2 = new JLabel("Enter your name");
		label2.setBounds(20,30,200,80);
		panel.add(label2);
		
		tf1 = new JTextField();
		tf1.setBounds(220,50,200,40);
		panel.add(tf1);
		
		label3 = new JLabel("Enter your password");
		label3.setBounds(20,90,200,80);
		panel.add(label3);
		
		pf1 = new JPasswordField();
		pf1.setBounds(220,110,200,40);
		panel.add(pf1);
		
		//step 4 (e)
		panel.setBackground(Color.YELLOW);
		
		label1.setForeground(c1);
		label1.setFont(f1);
		
		label2.setForeground(c2);
		label2.setFont(f2);
		
		tf1.setForeground(c2);
		tf1.setFont(f2);
		
		label3.setForeground(c2);
		label3.setFont(f2);
		
		pf1.setForeground(c2);
		pf1.setFont(f2);
		pf1.setEchoChar('*');
		
		//step 4(f)
		super.add(panel);
	}
}