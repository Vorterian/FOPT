package swing.mvc_entwurfsmuster.variante1;

public interface IModel 
{
	
	public void addListener(IListener l);
	public void removeListener(IListener l);
	public void fireModel();

}
