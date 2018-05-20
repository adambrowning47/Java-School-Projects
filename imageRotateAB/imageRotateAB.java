import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class imageRotateAB extends Application {
	
	public void start(Stage primaryStage) {
		Pane pane = new HBox(100);
		pane.setPadding(new Insets(20,20,20,20));
		
		Image image = new Image("images/jacket.png");
		pane.getChildren().add(new ImageView(image));
		
		ImageView imageView2 = new ImageView(image);
		
		
		imageView2.setRotate(90);
		pane.getChildren().add(imageView2);
		
		
		Scene scene = new Scene(pane);
		
		primaryStage.setTitle("Jacket");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		launch(args);
		
		
	}


}
