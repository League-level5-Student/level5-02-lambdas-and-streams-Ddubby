package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		addNumbers.addActionListener((e)->{
			String num = JOptionPane.showInputDialog("Enter a number:");
			String num2 = JOptionPane.showInputDialog("Enter a number:");
			int n = Integer.parseInt(num);
			int n2 = Integer.parseInt(num2);
			JOptionPane.showMessageDialog(null, num + " + " + num2 + " is " + (n + n2));
		});
		randNumber.addActionListener((e)->{
			Random random = new Random();
			int num = random.nextInt(1000000000);
			JOptionPane.showMessageDialog(null, num);
		});
		tellAJoke.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "Button out of order!");
		});
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
}
