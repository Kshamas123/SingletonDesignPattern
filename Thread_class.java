package challenge;

public class Thread_class extends Thread{
	public void run()
	{
		Log obj=Log.getinstance();
		obj.logMessage();
	}

}
