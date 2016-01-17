package swing.mvc_entwurfsmuster.variante3;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Starter extends JFrame
{
	
	public Starter()
	{
		
		// Erzeuge das Modell und baue 
		Model m = new Model();
		Listener top = new Listener(m);
		m.addListener(top);
		Controler c = new Controler(m);
		JPanel bottom = new JPanel();
		JButton increment = new JButton("+");
		JButton decrement= new JButton("-");
		bottom.add(increment);
		increment.addActionListener(c);
		bottom.add(decrement);
		decrement.addActionListener(c);
		
		setLayout(new GridLayout(2,0));
		add(top);
		add(bottom);
		
		setVisible(true);
		
		
	}

	
	public static void main(String[] argv)
	{
		Starter s = new Starter();
	}
}
