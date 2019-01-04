package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Geometric_Figure {

	
	public static void drawShape1(GraphicsContext gc) {
		
		double canvasWidth = gc.getCanvas().getWidth();
		   double canvasHeight = gc.getCanvas().getHeight();
			
		  // Draw the first circle of LightPink color 
		   
	        MyCircle c1 = new MyCircle(0,0,canvasWidth/2,Color.LIGHTPINK); 
	        c1.setColor(Color.LIGHTPINK);      
	        c1.drawCircle(gc);
	       
	  
	      // Draw the first polygon of LightYellow color 
	        
	        MyPolygon polygon1 = new MyPolygon(c1.getRadius()*2* Math.sin(Math.toRadians(36)),5.0,c1.getX(),c1.getY(),Color.LIGHTYELLOW);
	        polygon1.setColor(Color.LIGHTYELLOW);
	        polygon1.drawPolygon(gc);
	     
	    
	      // Draw the second circle of GreenYellow color
	        
	        double x = polygon1.getSide();
	        double y = 2*(Math.tan(Math.toRadians(36)));
	        MyCircle c2 = new MyCircle(polygon1.getX()+69,polygon1.getY()+69,x/y,Color.GREENYELLOW);
	        c2.setColor(Color.GREENYELLOW);  
	        c2.drawCircle(gc);
	       
	      
	      // Draw the second polygon of LightGrey color 
	        MyPolygon polygon2 = new MyPolygon(c2.getRadius()*2*(Math.sin(Math.toRadians(36))),5.0,c2.getX(),c2.getY(),Color.LIGHTGRAY);
	        polygon2.setColor(Color.LIGHTGRAY);
	        polygon2.drawPolygon(gc);
	        
	       
	     // Draw the third circle of LightBlue color
	        
	       double z = polygon2.getSide();
	       double w = 2*(Math.tan(Math.toRadians(36)));
	       MyCircle c3 = new MyCircle(polygon2.getX()+53,polygon2.getY()+53,z/w,Color.LIGHTBLUE); 
	       c2.setColor(Color.GREENYELLOW);  
	       c3.setColor(Color.LIGHTBLUE);  
	       c3.drawCircle(gc);
	      

	    // Draw the third polygon of DarkRed color
	       
	       MyPolygon polygon3 = new MyPolygon(c3.getRadius()*2*(Math.sin(Math.toRadians(36))),5.0,c3.getX(),c3.getY(),Color.DARKRED);
	       polygon3.setColor(Color.DARKRED);
	       polygon3.drawPolygon(gc);
	       
	       
	    // Draw the fourth circle of white color 
	       
	       double r = polygon3.getSide();
	       double b = 2*(Math.tan(Math.toRadians(36)));
	       MyCircle c4 = new MyCircle(polygon2.getX()+97,polygon2.getY()+97,r/b,Color.WHITE); 
	       c2.setColor(Color.GREENYELLOW);  
	       c4.setColor(Color.WHITE);  
	       c4.drawCircle(gc);
	       
	       
	    // Draw  a black line 
	       
	        MyLine line = new MyLine(canvasWidth,canvasHeight,0.0,0.0, Color.BLACK);
	        line.drawLines(gc);
		
	}
	
	
}
