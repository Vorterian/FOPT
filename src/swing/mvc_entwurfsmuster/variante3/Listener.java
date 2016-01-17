package swing.mvc_entwurfsmuster.variante3;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Listener extends JPanel implements IListener
{
	
	private JLabel label;
	private Model m;
	
	public Listener(Model m)
	{
		this.m = m;
		label = new JLabel("Dies ist der Starttext");
		add(label);
	}

	@Override
	public void fireModel() 
	{
	label.setText(Integer.toString(m.getCount()));
	}

}
