import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
//import java.awt.*;

public class Ex_15 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    Pane pane = new Pane();
    //create the circle
    Circle movingCircle = new Circle();
    movingCircle.setRadius(30);
    movingCircle.setStroke(Color.BLACK);
    movingCircle.setFill(Color.WHITE);
    pane.getChildren().add(movingCircle);
    //create the buttons and hbox
    Button left = new Button("Left");
    Button right = new Button("Right");
    Button up = new Button("Up");
    Button down = new Button("Down");
    HBox hbox = new HBox();
    hbox.setSpacing(10);
    hbox.setAlignment(Pos.CENTER);
    hbox.getChildren().addAll(left, right, up, down);
    
    // Create a pane and set its properties
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(pane);
    borderPane.setBottom(hbox);
    borderPane.setAlignment(hbox, Pos.CENTER);
    
    // Create a scene and place the pane in the stage
    Scene scene = new Scene(borderPane, 300, 300);
    primaryStage.setTitle("Exercise 15"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    //move the circle
    left.setOnAction(e -> {
      movingCircle.setCenterX(movingCircle.getCenterX() > 0 ? movingCircle.getCenterX() - 5 : 0);
    });
    
    right.setOnAction(e -> {
      movingCircle.setCenterX(movingCircle.getCenterX() < scene.getWidth() ? movingCircle.getCenterX() + 5 : 0);
    });
    
    up.setOnAction(e -> {
      movingCircle.setCenterY(movingCircle.getCenterY() > 0 ? movingCircle.getCenterY() - 5 : 0);
    });
    
    down.setOnAction(e -> {
      movingCircle.setCenterY(movingCircle.getCenterY() < scene.getHeight() ? movingCircle.getCenterY() + 5 : 0);
    });
    
  }

  public static void main(String[] args) {
    launch(args);
  }
}
