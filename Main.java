package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;




public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			
			StackPane root = new StackPane();
			
			Scene scene = new Scene(root, 800, 800, Color.WHITESMOKE);
	        Canvas canvas = new Canvas(700, 700);
	        canvas.setLayoutX(0);
	        canvas.setLayoutY(0);
	        GraphicsContext gc = canvas.getGraphicsContext2D();
	          
            Geometric_Figure.drawShape1(gc); // Draw the Geometric shape of the circles, polygons and the line
           
	        root.getChildren().addAll(canvas);
	      
	        
	        stage.setTitle("Shape");
	        stage.setScene(scene);
	        stage.show();
	        
	       
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
         
		launch(args);
	}
}
