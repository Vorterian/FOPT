import java.util.ArrayList;


public class Parkhaus 
{
	
	private int minPlätze;
	private int maxPlätze;
	private int parker;
	private ArrayList warter = new ArrayList();
	
	public void Parkhaus()
	{
		minPlätze = 0;
		maxPlätze = 10;
		parker=0;
	}
	
	
	public synchronized void einfahren()
	{
		while(warter.size() != 0 | maxPlätze == parker && warter.get(0) != Thread.currentThread())
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
		while(minPlätze == parker)
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
