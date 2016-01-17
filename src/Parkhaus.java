import java.util.ArrayList;


public class Parkhaus 
{
	
	private int minPl�tze;
	private int maxPl�tze;
	private int parker;
	private ArrayList warter = new ArrayList();
	
	public void Parkhaus()
	{
		minPl�tze = 0;
		maxPl�tze = 10;
		parker=0;
	}
	
	
	public synchronized void einfahren()
	{
		while(warter.size() != 0 | maxPl�tze == parker && warter.get(0) != Thread.currentThread())
		{
			try
			{
				warter.add(Thread.currentThread());
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
		warter.remove(0);
		parker++;
		notifyAll();
	}

	
	public synchronized void ausfahren()
	{
		while(minPl�tze == parker)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
		parker--;
		notifyAll();
	}
}
