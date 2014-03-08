
public class Missile {
	int v1;
	int u1;
	int t;
	
 	public Missile (int v,int u,int t)
 	{
	 	this.v1 = v;
	 	this.u1 = u;
	 	this.t = t;
 	}
 	public int getU ()
 	{
 		return u1;
 	}
	public void run()
	{
		
		new Thread(new Runnable() {
	        public void run(){
	        	
	    		for (int x=0; x < 10; x++)
	    		{
	    			
	    			if (u1 < 20)
	    			{
	    				x = 10;
	    			}
	    			u1 = u1-20;
	    			System.out.println("Running Thread 2" + u1);
	    			try {
	    				Thread.sleep(1000);
	    			} catch (InterruptedException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		}	
	        }
	        
	    }).start();

	}
	
	
	
}
