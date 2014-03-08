import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Blah extends Applet
   implements KeyListener, MouseListener {
	


   int width, height;
   int x, y;
   int u;
   int v;
   int t;
   String s = "";
       Missile m1 = new Missile (u,v,t);
       
       

   public void init() {
      width = getSize().width;
      height = getSize().height;
      setBackground( Color.WHITE );

      x = width/2;
      y = height/2;
      u = y;
      v = x;

      addKeyListener( this );
      addMouseListener( this );
      foo();
   
   }

 public void foo()
 {
		new Thread(new Runnable() {
	        public void run(){
	        	
	    		for (int x=0; x < 10; x= x+0)
	    		{
	    			repaint();
	    		}	
	        }
	        
	    }).start();
	System.out.println("Testing"); 
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
	   }else if(c == 'l')
	   {
		   
		   m1.u1 = y;
		   System.out.println(u);
		   m1.run();
	   }
	   /*else if (c == 'i' && y > 0)
	   {
		  u=u-10;
		  
	   }else if (c == 'j')
	   {
		  v = v-10;
	   }else if (c == 'k')
	   {
		   u=u+10;
	   }else if (c == 'l')
	   {
		   v=v+10;
	   }
	   System.out.println(u+"     " + v + "     " + x + "     " + y);*/
		 
	   
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
	      s = "";
	      repaint();
	      e.consume();
   }

   public void paint( Graphics g ) 
   {
	  if (m1.u1 < 1) 
	  {
	   u = y;
	   v = x;
	  }
	   g.setColor(Color.MAGENTA);
	   g.drawOval(v, u, 5, 5);
	   g.drawRect(x, y, 10, 10);
	   g.drawLine(x, y, x+5, y-10);
	   g.drawLine(x+10, y, x+5, y-10);
	   g.drawLine(x, y+10, x, y+20);
	   g.drawLine(x, y+20, x+5, y+15);
	   g.drawLine(x+5, y+15, x+10, y+20);
	   g.drawLine(x+10, y+20, x+10, y+10);
	   
	  /* g.drawOval(x, y, 20, 20);
	   g.drawLine(x+7, y+7, x+7, y+7);
	   g.drawLine(x+12, y+7, x+12, y+7);
	   g.drawLine(x+7, y+15, x+12, y+15); s
	   g.drawLine(x+7, y+15, x+4, y+11);
	   g.drawLine(x+12, y+15, x+16, y+11);*/
	   u = m1.getU();
	   
   }
}