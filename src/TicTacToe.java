import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe extends JApplet implements ActionListener{
	private JFrame window = new JFrame("Tic Tac Toe");
	private JButton firstButton = new JButton("");
	private JButton secondButton = new JButton("");
	private JButton thirdButton = new JButton("");
	private JButton fourthButton = new JButton("");
	private JButton fifthButton = new JButton("");
	private JButton sixthButton = new JButton("");
	private JButton seventhButton = new JButton("");
	private JButton eigthButton = new JButton("");
	private JButton ninthButton = new JButton("");
	private boolean winner = false;
	private String mark = "";
	private int counter = 0;
	
	public void init(){
	//	window.setSize(400, 400);
	//	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new GridLayout(3,3));
		window.add(firstButton);
		firstButton.addActionListener(this);
		window.add(secondButton);
		secondButton.addActionListener(this);
		window.add(thirdButton);
		thirdButton.addActionListener(this);
		window.add(fourthButton);
		fourthButton.addActionListener(this);
		window.add(fifthButton);
		fifthButton.addActionListener(this);
		window.add(sixthButton);
		sixthButton.addActionListener(this);
		window.add(seventhButton);
		seventhButton.addActionListener(this);
		window.add(eigthButton);
		eigthButton.addActionListener(this);
		window.add(ninthButton);
		ninthButton.addActionListener(this);
		window.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		counter++;
		
		if (counter == 1 || counter == 3 || counter == 5 || counter == 7 | counter == 9){
			mark = "O";
		}
		if (counter == 2 || counter == 4 || counter == 6 || counter == 8 || counter == 10){
			mark = "X";
		}
		
			if(e.getSource() == firstButton){
				firstButton.setText(mark);
				firstButton.setEnabled(false);
			}
			else if(e.getSource() == secondButton){
				secondButton.setText(mark);
				secondButton.setEnabled(false);
			}
			else if(e.getSource() == thirdButton){
				thirdButton.setText(mark);
				thirdButton.setEnabled(false);
			}
			else if(e.getSource() == fourthButton){
				fourthButton.setText(mark);
				fourthButton.setEnabled(false);
			}
			else if(e.getSource() == fifthButton){
				fifthButton.setText(mark);
				fifthButton.setEnabled(false);
			}
			else if(e.getSource() == sixthButton){
				sixthButton.setText(mark);
				sixthButton.setEnabled(false);
			}
			else if(e.getSource() == seventhButton){
				seventhButton.setText(mark);
				seventhButton.setEnabled(false);
			}
			else if(e.getSource() == eigthButton){
				eigthButton.setText(mark);
				eigthButton.setEnabled(false);
			}
			else if(e.getSource() == ninthButton){
				ninthButton.setText(mark);
				ninthButton.setEnabled(false);
			}
	
			if (firstButton.getText() != "" && firstButton.getText() == secondButton.getText() && secondButton.getText() == thirdButton.getText()){
				winner = true;
			}
			else if (fourthButton.getText() != "" && fourthButton.getText() == fifthButton.getText() && fifthButton.getText() == sixthButton.getText()){
				winner = true;
			}
			else if (seventhButton.getText() != "" && seventhButton.getText() == eigthButton.getText() && eigthButton.getText() == ninthButton.getText()){
				winner = true;
			}
			else if (firstButton.getText() != "" && firstButton.getText() == fourthButton.getText() && fourthButton.getText() == seventhButton.getText()){
				winner = true;
			}
			else if (secondButton.getText() != "" && secondButton.getText() == fifthButton.getText() && fifthButton.getText() == eigthButton.getText()){
				winner = true;
			}
			else if (thirdButton.getText() != "" && thirdButton.getText() == sixthButton.getText() && sixthButton.getText() == ninthButton.getText()){
				winner = true;
			}
			else if (firstButton.getText() != "" && firstButton.getText() == fifthButton.getText() && fifthButton.getText() == ninthButton.getText()){
				winner = true;
			}
			else if (thirdButton.getText() != "" && thirdButton.getText() == fifthButton.getText() && fifthButton.getText() == seventhButton.getText()){
				winner = true;
			}
		
			if (winner == true){
				JOptionPane.showMessageDialog(null,  mark + " WINS!");
			}	
			else if(counter == 9 && winner == false){
				JOptionPane.showMessageDialog(null, "Draw!");
			}
		
	}
	
}
	
