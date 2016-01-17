package swing.mvc_entwurfsmuster.variante3;

import java.util.ArrayList;

public class Model implements IModel
{
	
	private int count;
	private ArrayList<IListener> listener;
	
	public Model()
	{
		count = 0;
		listener = new ArrayList<IListener>();
	}
	
	
	public void increase()
	{
		count++;
		fireModel();
	}

	public void decrease()
	{
		count--;
		fireModel();
	}
	
	public int getCount()
	{
		return count;
	}
	
	@Override
	public void addListener(IListener l) 
	{
		listener.add(l);
		
	}

	@Override
	public void removeListener(IListener l) 
	{
		listener.remove(l);
		
	}

	@Override
	public void fireModel() 
	{
	for(IListener l: listener)
	{
		l.fireModel();
	}
		
	}

}
