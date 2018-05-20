import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;








public class PictureFrame extends Application {
	
	
	 String [] imageFiles = {"jacket.jpg", "Character.jpg", "Rock.jpg"};
	    
	    int i = imageFiles.length;
	    int x = 1;
	    @Override
	    public void start(Stage primaryStage) throws Exception {
	    
	        Label image = new Label();
	        
	        StackPane root = new StackPane();
	        root.setAlignment(Pos.CENTER);
	        
	        EventHandler<ActionEvent> handler = event-> {
	          x++;
	          root.getChildren().clear();
	          root.getChildren().addAll(image, new ImageView (imageFiles[x -1]));
	          
	          if (x == i) {
	          x = 0;
	          }
	        
	        
	        
	        };
	        
	      Duration sec = new Duration (2000);
	        KeyFrame keyframe = new KeyFrame (sec, handler);
	  
	        Timeline timeline = new Timeline(keyframe);
	        timeline.setCycleCount(Animation.INDEFINITE);
	        
	        
	        //getting all times for the stage.
	        root.getChildren().addAll(image, new ImageView(imageFiles[x-1]));
	        primaryStage.setScene(new Scene(root, 800, 600));
	        primaryStage.setTitle("Digital Image Slider");
	        primaryStage.show();
	        timeline.playFromStart();
	    
	    
	    } 

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	        
	        launch(args);
	        
	    }
	    
	}
	
	
	


