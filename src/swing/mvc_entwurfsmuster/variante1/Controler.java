package swing.mvc_entwurfsmuster.variante1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controler implements ActionListener
{
	
	private Model m;
	
	public Controler(Model m)
	{
		this.m=m;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		Object obj = arg0.getSource();
		System.out.println("Ereignis von " + obj.toString());
		
		if((arg0.getActionCommand()).equals("-"))
		{
			m.decrease();
		}
		else
		{
			m.increase();
		}
		
	}

	
	
}
