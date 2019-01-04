package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyPolygon extends MyShape {
	
private double sidelength; // the length of one side
private double n; // number of the sides

	public MyPolygon(double sidelength, double n ,double x , double y , Color color) {
		super (x, y, color);
		this.n = n;
		this.sidelength = sidelength;
	}
	
	
	// Get the Area using the Perimeter / Apothem rules

	public double getArea() { 
		double x = 2* Math.tan(Math.toRadians(180/n));
		double perimeter = n*sidelength;
		double apothem = sidelength / x ;
		double area = (perimeter * apothem)/2 ;
		return area;
	}
	
	
	//Get the Perimeter
	public double getPerimeter() {
		
		return (n*sidelength );
	}
	
	//Get the Angle
	public double getAngle() {
		double s = n-2;
		return (s* 180);
	}
	//Get the side length
	public double getSide() {
		return sidelength;
	}
	//Get the radius
	public double getRadius() {
		return (getSide()/(2*Math.sin(Math.toRadians(180/n))));
	}
	
	public String toString() {
		return ("MYPOLYGON :: " + "side Length : " + getSide() + "  " + " perimeter : " + getPerimeter() + "  " + "Angle : " + getAngle() + "  " + "Area : " + getArea() + "  " + "super class : " + super.toString());
	}
	public void drawPolygon(GraphicsContext gc) {
		double canvasWidth = gc.getCanvas().getWidth();
	      double canvasHeight = gc.getCanvas().getHeight();
	
	      
	 gc.setLineWidth(2); // The width of the polygon
     gc.setFill(getColor()); // To Get the color of the polygon.
	
    // It draws the polygon using the radius of the previous circle and the center of the circle to draw the polygon
     
     gc.fillPolygon(new double[]{canvasWidth/2 + getRadius()* Math.cos(Math.toRadians(55+0)) ,canvasWidth/2+ getRadius()* Math.cos(Math.toRadians(72+55)),canvasWidth/2 +getRadius()* Math.cos(Math.toRadians(144+55)),canvasWidth/2 +getRadius()* Math.cos(Math.toRadians(216+55)),canvasWidth/2 +getRadius()* Math.cos(Math.toRadians(288+55))},  
     new double[]{canvasHeight/2 + getRadius()* Math.sin(Math.toRadians(0+55)),canvasHeight/2 +getRadius()* Math.sin(Math.toRadians(72+55)),canvasHeight/2 +getRadius()* Math.sin(Math.toRadians(144+55)),canvasHeight/2 +getRadius()* Math.sin(Math.toRadians(216+55)),canvasHeight/2 +getRadius()* Math.sin(Math.toRadians(288+55))}, 5);
	   
	    
	}


}
