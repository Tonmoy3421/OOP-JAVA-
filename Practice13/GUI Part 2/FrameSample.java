//step 0
import javax.swing.*; //package for GUI components
import java.awt.*; //package for Font, Color 
import java.awt.event.*; //package for interfaces

//step 1
public class FrameSample extends JFrame implements ActionListener
{
	//step 2
	private JPanel panel;
	private JLabel label1, label2, label3, label4, label5, label6, label7;
	private JTextField tf1;
	private JPasswordField pf1;
	private JRadioButton rb1, rb2;
	private ButtonGroup bg;
	private JButton bt1, bt2;
	private JCheckBox cb1, cb2, cb3;
	private JComboBox jb;
	private ImageIcon img;
	
	//step 3
	private Color c1, c2;
	private Font f1, f2;
	
	//step 4
	public FrameSample()
	{
		//step 4(a)
		super("Student Management System");
		//super.setSize(800,400); //(width, height)
		super.setBounds(600, 200, 800,800); //(x, y, width, height)
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
		
		label4 = new JLabel("Enter your gender");
		label4.setBounds(20,150,200,80);
		panel.add(label4);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(220,170,100,40);
		panel.add(rb1);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(350,170,100,40);
		panel.add(rb2);
		
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		bt1 = new JButton("Save");
		bt1.setBounds(350,650,100,40);
		panel.add(bt1);
		
		bt2 = new JButton("Close");
		bt2.setBounds(500,650,100,40);
		panel.add(bt2);
		bt2.addActionListener(this);
		
		label5 = new JLabel("Enter your courses");
		label5.setBounds(20,210,200,80);
		panel.add(label5);
		
		cb1 = new JCheckBox("Database");
		cb1.setBounds(220,230,120,40);
		panel.add(cb1);
		
		cb2 = new JCheckBox("Data Structure");
		cb2.setBounds(350,230,180,40);
		panel.add(cb2);
		
		cb3 = new JCheckBox("Math4");
		cb3.setBounds(550,230,120,40);
		panel.add(cb3);
		
		label6 = new JLabel("Programming Language");
		label6.setBounds(20,270,240,80);
		panel.add(label6);
		
		String arr1[] = new String[]
		{"","C", "C++", "Java", "C#"};
		jb = new JComboBox(arr1);
		jb.setBounds(300,300,240,40);
		panel.add(jb);
		
		img = new ImageIcon("AIUB.png");
		label7 = new JLabel(img);
		label7.setBounds(20,350,300,300);
		panel.add(label7);
		
		//step 4 (e)
		panel.setBackground(Color.YELLOW);
		
		label1.setForeground(c1);
		label1.setFont(f1);
		
		label2.setForeground(c2);
		label2.setFont(f2);
		
		label4.setForeground(c2);
		label4.setFont(f2);
		
		tf1.setForeground(c2);
		tf1.setFont(f2);
		
		label3.setForeground(c2);
		label3.setFont(f2);
		
		rb1.setForeground(c2);
		rb1.setFont(f2);
		rb2.setForeground(c2);
		rb2.setFont(f2);
		
		jb.setForeground(c2);
		jb.setFont(f2);
		
		bt1.setForeground(c2);
		bt1.setFont(f2);
		bt2.setForeground(c2);
		bt2.setFont(f2);
		
		cb1.setForeground(c2);
		cb1.setFont(f2);
		cb2.setForeground(c2);
		cb2.setFont(f2);
		cb3.setForeground(c2);
		cb3.setFont(f2);
		
		label6.setForeground(c2);
		label6.setFont(f2);
		
		pf1.setForeground(c2);
		pf1.setFont(f2);
		pf1.setEchoChar('*');
		
		label5.setForeground(c2);
		label5.setFont(f2);
		
		//step 4(f)
		super.add(panel);
	}
	
	//There are 4 buildin interfaces
	//1. ActionListener
	//ActionListener interface has 1 abstract method
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == bt2)
		{
			System.exit(0);
		}
	}
}