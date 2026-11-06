//step 0
package Frame;
import Entity.*;
import java.lang.*;
import java.awt.*; //package for font & coloring
import javax.swing.*; //package for GUI components 
import java.awt.event.*; //package for interfaces
import java.io.*; //for File class

//step 1
public class FrameSample extends JFrame implements MouseListener, ActionListener
{
	//step 2
	private Font f1, f2;
	private Color c1, c2;
	private JPanel panel;
	private JLabel label1, label2, label3, label4, label5, label6, label7;
	private JTextField tf1;
	private JPasswordField pf1;
	private JButton bt1, bt2, bt3;
	private JRadioButton rb1, rb2;
	private ButtonGroup bg1;
	private JCheckBox cb1, cb2, cb3, cb4;
	private JComboBox jb;
	private JTextArea ta, ta2;
	private ImageIcon img;
	
	//step 4
	public FrameSample()
	{
		//step 4(a)
		super("My First GUI");
		//super.setSize(800,400); //(width, height)
		super.setBounds(600,200,800,800); //(x,y,width, height)
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//step 4(b)
		panel = new JPanel();
		panel.setLayout(null);
		c2 = new Color(100, 199, 186); //(R, G, B)
		panel.setBackground(c2);
		
		//step 4(d)
		f1 = new Font("Cambria",Font.BOLD, 30); //(font name, font style, font size)
		f2 = new Font("Cambria",Font.BOLD, 20); //(font name, font style, font size)
		c1 = new Color(255, 0, 0); //(R, G, B)
		
		label1 = new JLabel("Hello OOP1");
		label1.setBounds(200, 0, 500,40);//(x,y,width, height)
		label1.setFont(f1);
		label1.setForeground(c1);
		label1.addMouseListener(this);
		panel.add(label1);
		
		label3 = new JLabel("Your Name");
		label3.setBounds(10, 50, 120,30);//(x,y,width, height)
		label3.setFont(f2);
		panel.add(label3);
		
		tf1 = new JTextField();
		tf1.setBounds(130, 50, 150,30);//(x,y,width, height)
		tf1.setFont(f2);
		panel.add(tf1);
		
		label4 = new JLabel("Your CGPA");
		label4.setBounds(10, 90, 120,30);//(x,y,width, height)
		label4.setFont(f2);
		panel.add(label4);
		
		pf1 = new JPasswordField();
		pf1.setBounds(130, 90, 150,30);//(x,y,width, height)
		pf1.setFont(f2);
		pf1.setEchoChar('$');
		pf1.addActionListener(this);
		panel.add(pf1);
		
		bt3 = new JButton("Show");
		bt3.setBounds(300, 90, 100, 30);//(x,y,width, height)
		bt3.setFont(f2);
		bt3.setBackground(Color.GREEN);
		bt3.addActionListener(this);
		panel.add(bt3);
		
		label2 = new JLabel("Your Gender");
		label2.setBounds(10, 130, 120,30);//(x,y,width, height)
		label2.setFont(f2);
		panel.add(label2);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(130, 130, 100,30);
		rb1.setFont(f2);
		panel.add(rb1);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(250, 130, 100,30);
		rb2.setFont(f2);
		panel.add(rb2);
		
		bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		
		label4 = new JLabel("Courses");
		label4.setBounds(10, 170, 120,30);//(x,y,width, height)
		label4.setFont(f2);
		panel.add(label4);
		
		cb1 = new JCheckBox("Data Structure");
		cb1.setBounds(130, 170, 180,30);//(x,y,width, height)
		cb1.setFont(f2);
		panel.add(cb1);
		
		cb2 = new JCheckBox("Database");
		cb2.setBounds(130, 210, 180,30);//(x,y,width, height)
		cb2.setFont(f2);
		panel.add(cb2);
		
		cb3 = new JCheckBox("Math4");
		cb3.setBounds(130, 250, 180,30);//(x,y,width, height)
		cb3.setFont(f2);
		panel.add(cb3);
		
		cb4 = new JCheckBox("Circuit");
		cb4.setBounds(130, 290, 180,30);//(x,y,width, height)
		cb4.setFont(f2);
		panel.add(cb4);
		
		label5 = new JLabel("Today's Topic");
		label5.setBounds(10, 330, 150,30);//(x,y,width, height)
		label5.setFont(f2);
		panel.add(label5);
		
		String items[] = new String[] 
		{"","GUI", "Interface", "Absraction", "Polymorphism"};
		jb = new JComboBox(items);
		jb.setBounds(170, 330, 150,30);//(x,y,width, height)
		jb.setFont(f2);
		panel.add(jb);
		
		label6 = new JLabel("Principles of OOP");
		label6.setBounds(10, 520, 180,30);//(x,y,width, height)
		label6.setFont(f2);
		label6.setBackground(Color.RED);
		label6.setOpaque(true); //using for color overlapping
		label6.addMouseListener(this);
		panel.add(label6);
		
		ta = new JTextArea();
		ta.setBounds(10, 560, 220,100);//(x,y,width, height)
		ta.setFont(f2);
		panel.add(ta);
		
		img = new ImageIcon("Picture/AIUB.png");
		label7 = new JLabel(img);
		label7.setBounds(400, 100, 300, 300);//(x,y,width, height)
		panel.add(label7);
		
		bt1 = new JButton("Submit");
		bt1.setBounds(350, 700, 150,30);//(x,y,width, height)
		bt1.setFont(f2);
		bt1.setBackground(Color.GREEN);
		bt1.addMouseListener(this);
		bt1.addActionListener(this);
		panel.add(bt1);
		
		bt2 = new JButton("Exit");
		bt2.setBounds(600, 700, 150,30);//(x,y,width, height)
		bt2.setFont(f2);
		bt2.setBackground(Color.GREEN);
		bt2.addActionListener(this);
		panel.add(bt2);
		
		ta2 = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(ta2);
		scrollPane.setBounds(270, 450, 460,210);//(x,y,width, height)
		ta2.setFont(f2);
		panel.add(scrollPane);
		
		//step 4(f)
		super.add(panel);
	}
	//there are 5 abstract methods for MouseListener interfaces
	//so, we need to override those 5 abstract methods 
	public void mouseClicked(MouseEvent me) 
	{	
		/*
		if(me.getSource() == bt1)
		{
			bt1.setText("Confirmed");
		}
		else { } */
		
		if(me.getSource() == label1)
		{
			label1.setText("Object Oriented Programming 1");
		}
		else { }
	}
	public void mousePressed(MouseEvent me) 
	{ 
		if(me.getSource() == label6)
		{
			label6.setText("OOP Full Form");
		}
		else { }
	}
	public void mouseReleased(MouseEvent me) 
	{ 
		if(me.getSource() == label6)
		{
			label6.setText("Principles of OOP");
		}
		else { }
	}
	public void mouseEntered(MouseEvent me) 
	{ 
		if(me.getSource() == bt1)
		{
			bt1.setBackground(Color.BLUE);
			bt1.setForeground(Color.WHITE);
		}
		else { }
	}
	public void mouseExited(MouseEvent me) 
	{
		if(me.getSource() == bt1)
		{
			bt1.setBackground(Color.GREEN);
			bt1.setForeground(Color.BLACK);
		}
		else { }
	}
	
	//there are 1 abstract method for ActionListener interfaces
	//so, we need to override those 1 abstract method
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == bt2)
		{
			System.exit(0);
		}
		if(ae.getSource() == bt3)
		{
			pf1.setEchoChar((char)0);
		}
		if(ae.getSource() == bt1)
		{
			//JOptionPane.showMessageDialog(this,"Showing!");
			String s1, s2, s3, s4, s5, s6;
			
			s1 = tf1.getText();
			s2 = pf1.getText();
			if(rb1.isSelected()) { s3 = rb1.getText(); }
			else if(rb2.isSelected()) { s3 = rb2.getText(); }
			else { s3 = ""; }
			if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected() && cb4.isSelected())
			{
				s4 = cb1.getText()+" "+cb2.getText()+" "+cb3.getText()+" "+cb4.getText();
			}
			else if(cb1.isSelected()) { s4 = cb1.getText(); }
			else if(cb2.isSelected()) { s4 = cb2.getText(); }
			else if(cb3.isSelected()) { s4 = cb3.getText(); }
			else if(cb4.isSelected()) { s4 = cb4.getText(); }
			else { s4 = ""; }
			s5 = jb.getSelectedItem().toString();
			s6 = ta.getText();
			
			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Please fill up all information!");
			}
			else 
			{
				Student obj1 = new Student(s1,s2,s3,s4,s5,s6);
				obj1.insertInfo();
				JOptionPane.showMessageDialog(this,"Information saved!");
				check();
			}
		}
	}
	private void check() {
        try {
            File file = new File("./Data/userdata.txt");
            if (file.exists()) {
				FileReader fr = new FileReader(file); //reads one character at a time
                BufferedReader br = new BufferedReader(fr); //reads one line at a time
                String line;
                while ((line = br.readLine()) != null) {
                    ta2.append(line + "\n");
                }
                br.close();
            }
        }
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(this,"Error!");
		}
    }
}