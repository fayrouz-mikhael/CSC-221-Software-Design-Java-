package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCircle extends MyShape {
	
	 private double radius;

	public MyCircle(double x , double y , double radius ,Color color) {
		super (x, y, color);
		this.radius = radius;
	}
	
   // Set the radius of the circle
   public void setRadius(double r)
   {  
    this.radius = r; 
    
   }
   // Get the Area of the circle
	public double getArea() {
		return (Math.PI * (radius*radius));
	}
	// Get the perimeter of the circle
	public double getPerimeter() {
		return ( 2* Math.PI * radius);
	}
	
	// Get the radius of the circle
	public double getRadius() {
		return radius;

	}
	
	public String toString() {
		return ("MYCICLE :: " + "Radius : " + getRadius() + "  " + "Perimeter : " + getPerimeter() + "  " + "Area : " + getArea() +"  "+ "super class : " + super.toString());
	}
	public void drawCircle(GraphicsContext gc) {
       
       gc.setLineWidth(2); // The width of the circle
       gc.setFill(getColor()); // To Get the color of the circle.
       
       /* the method to draw the circle which needs the center (x, y) and the width and the height so i used the (radius *2)  */
       gc.fillOval(getX(),getY(),  getRadius()*2, getRadius()*2);
        
	}
}
