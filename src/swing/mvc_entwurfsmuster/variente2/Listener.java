package swing.mvc_entwurfsmuster.variente2;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Listener extends JPanel implements IListener
{
	
	private JLabel label;
	
	public Listener()
	{
		label = new JLabel("Dies ist der Starttext");
		add(label);
	}

	@Override
	public void fireModel(Model m) 
	{
	label.setText(Integer.toString(m.getCount()));
	}

}
