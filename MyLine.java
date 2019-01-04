package application;

import javafx.scene.canvas.GraphicsContext;

//import javafx.scene.shape.MyShape;
import javafx.scene.paint.Color;

public class MyLine extends MyShape {


	private double x2;
	
	private double y2;
	
	public MyLine( double x2 , double y2 , double x , double y , Color color) {
		super (x, y, color);
		this.x2 = x2;
		this.y2 = y2;
		
	}
	// Get the lenght of the line
	public double getLenght() {
		return Math.sqrt( (Math.pow((x2-getX()), 2)) + (Math.pow((y2-getY()), 2)) );
	}
	
	// Get the x-axis angle of the line
	public double get_xAngle() {
		double xDiff = x2-getX();
		double yDiff = y2-getY();
		double slop = yDiff/xDiff;
		
		return Math.toDegrees(Math.atan(slop));
	}
	
	
	public String toString() {
		return ("MYLine :: " + "Length : " + getLenght() + "  " + "Angle : " + get_xAngle() + "  " + "Super : " + super.toString() );
			}


	public void drawLines(GraphicsContext gc) { 
		
	// Draw the line using the canvas width and the canvas height
	
	double canvasWidth = gc.getCanvas().getWidth();
    double canvasHeight = gc.getCanvas().getHeight();
    
    // Draw the 2 diagonals lines
    gc.setLineWidth(2);
    gc.strokeLine(0, canvasWidth, canvasHeight, 0);
    gc.strokeLine(0, 0, canvasWidth, canvasHeight);
    
    // Draw the 4 lines at the corners
    gc.setLineWidth(5);
    gc.strokeLine(0, 0, canvasWidth, 0);
    gc.strokeLine(0, 0, 0, canvasHeight);
    gc.strokeLine(canvasWidth,0, canvasWidth,canvasHeight);
    gc.strokeLine(0,canvasHeight,canvasHeight,canvasWidth);


    }
    
 
}
