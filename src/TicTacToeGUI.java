import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI extends JFrame implements ActionListener{
	JButton[][] button;
	
	public TicTacToeGUI(){
		super("Tic Tac Toe");
		setLayout(new GridLayout(3,3));
		button = new JButton[3][3];
		for (int i =0; i <3; i++){
			for (int k = 0; k <3 ; k++){
				button[i][k] = new JButton();
				button[i][k].addActionListener(this);
				add(button[i][k]);
			}
		}
	}
	
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		for (int i = 0; i <3; i++){
			for (int k = 0; k <3 ; k++){
				if(obj == button[i][k]){
					return;
				}
			}
		}
	}
	
	public static void main(String[] arg){
		TicTacToeGUI tictactoe = new TicTacToeGUI();
		tictactoe.setSize(400,400);
		tictactoe.setVisible(true);
	}
	
}
