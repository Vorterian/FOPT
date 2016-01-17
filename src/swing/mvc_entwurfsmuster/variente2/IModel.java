package swing.mvc_entwurfsmuster.variente2;

public interface IModel 
{
	
	public void addListener(IListener l);
	public void removeListener(IListener l);
	public void fireModel();

}
