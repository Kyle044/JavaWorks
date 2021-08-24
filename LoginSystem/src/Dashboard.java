import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Dashboard extends JFrame implements ActionListener {
	JButton Home = new JButton();
	JButton Settings = new JButton();
	JButton Employee = new JButton();
	JPanel panelRight = new JPanel();
	JPanel panelMiddle = new JPanel();
	JPanel panelLeft = new JPanel();
	JPanel panelHome = new JPanel();
	JPanel panelEmployee = new JPanel();
	JPanel panelSettings = new JPanel();
	Dashboard(){
		

		this.setTitle("ECC Dashboard");
		this.setSize(800,600);//sets the x-dimension, and y-dimension of this
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false);//prevent the this to resize
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		//Button
		Home.setText("Home");
		Settings.setText("Settings");
		Employee.setText("Employee");
		
		//panel
		panelRight.setBackground(Color.red);
		panelMiddle.setBackground(Color.yellow);
		panelRight.setPreferredSize(new Dimension(150,100));
		panelMiddle.setPreferredSize(new Dimension(100,100));
		//Panel Left
		panelLeft.setPreferredSize(new Dimension(250,100));
		panelLeft.setBackground(Color.GRAY);
		panelLeft.add(panelHome);
		panelLeft.add(panelEmployee);
		panelLeft.add(panelSettings);
		panelLeft.setLayout(new GridLayout(3,1,20,20));
		panelLeft.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		// add the button to panels
		panelHome.setLayout(new GridBagLayout());
		panelHome.setBackground(Color.GRAY);
		panelHome.add(Home);
		panelEmployee.setLayout(new GridBagLayout());
		panelEmployee.setBackground(Color.GRAY);
		panelEmployee.add(Employee);
		panelSettings.add(Settings);
		panelSettings.setLayout(new GridBagLayout());
		panelSettings.setBackground(Color.GRAY);
		
		//adding panel
		this.add(panelLeft,BorderLayout.WEST);
		this.add(panelRight,BorderLayout.EAST);
		this.add(panelMiddle,BorderLayout.CENTER);
		
		
		
		
		
		this.setVisible(true);//make this visible
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		
	}
	
	
	
	
}
