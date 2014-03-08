import java.applet.*;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import java.awt.event.*;
//import java.util.concurrent.TimeUnit;
public class Keyboard0 extends Applet
   implements KeyListener, MouseListener {

	Timer timer;
	public int reminder (int seconds)
	{
		timer = new Timer();
	
		//if (isfired == false) {
			timer.schedule(new RemindTask(), 0,500);
		//}
		
		return 2;
	}
	class RemindTask extends TimerTask {
		public void run()
		{
			System.out.println("Drop bomb");
			u=u-20;
			//isfired = false;
			//timer.cancel(); //terminate the timer thread
		}
	}
   
   int width, height;
   int x, y, u, v;
   String s = "";

   public void init() {
      width = getSize().width;
      height = getSize().height;
      setBackground( Color.WHITE );

      x = width/2;
      y = height/2;
      int u;
      int v;
      addKeyListener( this );
      addMouseListener( this );
   }

   public void keyPressed( KeyEvent e ) 
   
   {
	   char c = e.getKeyChar();
	   
	   char w;
	   if (c == 'w' && y > 0)
	   {
		  y=y-10;
	   }else if (c == 'a')
	   {
		   x=x-10;
	   }else if (c == 's')
	   {
		   y=y+10;
	   }else if (c == 'd')
	   {
		   x=x+10;
	   }else if (c == 'p')
	   {
		   int test = reminder(3);
	   }
	   System.out.println(u+"     " + v + "     " + x + "     " + y);
		   
	   
   }
   
   public void keyReleased( KeyEvent e ) { }
   public void keyTyped( KeyEvent e ) {
	   char c = e.getKeyChar();
	      //if ( c != KeyEvent.CHAR_UNDEFINED ) {
	         s = s + c;
	         repaint();
	         e.consume();
	      //}
   }
   
   public void mouseEntered( MouseEvent e ) { }
   public void mouseExited( MouseEvent e ) { }
   public void mousePressed( MouseEvent e ) { }
   public void mouseReleased( MouseEvent e ) { }
   public void mouseClicked( MouseEvent e ) 
   {
	   x = e.getX();
	      y = e.getY();
	      v = e.getX();
	      u = e.getY();
	      s = "";
	      repaint();
	      e.consume();
   }

   public void paint( Graphics g ) 
   {
	   //v = x;
	   //u = y;
	   g.setColor(Color.WHITE);
	   g.setColor( Color.blue );
	   g.drawLine( v-10, u, v+10,u );
	   g.setColor( Color.gray );
      g.drawLine( x, y+10, x, y-10 );
      g.drawLine(x-1, y+10, x-1, y-10);
      g.drawLine(x+1, y+10, x+1, y-10);
      g.drawLine( x-10, y, x+10, y );
      g.drawLine( x-10, y-1, x+10, y-1 );
      g.drawLine( x-10, y+1, x+10, y+1 );
    
      //g.drawString( s, x, y );
      
   }
}