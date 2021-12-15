import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javax.swing.border.*;
import javax.xml.soap.*;
import java.awt.*;

public class Ex_16_1 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage){
		//Panes
		BorderPane borderPane = new BorderPane();
		Pane pane = new Pane();
		//Text
		Text text = new Text("Programming is fun");
		
		//Font
		Font fontNormal = Font.font("Times New Roman", 
			FontWeight.NORMAL, FontPosture.REGULAR, 20);
		
		text.setFont(fontNormal);
		pane.getChildren().add(text);
		
		//Buttons and HBox
		Button left = new Button("<=");
		Button right = new Button("=>");
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(left, right);
		//VBox
		VBox radioButtons = new VBox();
		radioButtons.setPadding(new Insets(5, 5, 5, 5));
		radioButtons.setStyle("-fx-border-width: 2px; fx-border-color: black");
		borderPane.getChildren().addAll(radioButtons, hbox, pane);
		borderPane.setTop(radioButtons);
		borderPane.setBottom(hbox);
		
		//Radio Buttons
		RadioButton red = new RadioButton();
		RadioButton green = new RadioButton();
		RadioButton blue = new RadioButton();
		RadioButton black = new RadioButton();
		RadioButton yellow = new RadioButton();
		radioButtons.getChildren().addAll(red, green, blue, black, yellow);
		
		//Toggle Group
		ToggleGroup group = new ToggleGroup();
		red.setToggleGroup(group);
		green.setToggleGroup(group);
		blue.setToggleGroup(group);
		black.setToggleGroup(group);
		yellow.setToggleGroup(group);
		
		//ChangeColor
		red.setOnAction(e -> {
			if (red.isSelected()){
				text.setFill(Color.RED);
			}
		});
		green.setOnAction(e -> {
			if (green.isSelected()){
				text.setFill(Color.GREEN);
			}
		});
		blue.setOnAction(e -> {
			if (blue.isSelected()){
				text.setFill(Color.BLUE);
			}
		});
		black.setOnAction(e -> {
			if (black.isSelected()){
				text.setFill(Color.BLACK);
			}
		});
		yellow.setOnAction(e -> {
			if (yellow.isSelected()){
				text.setFill(Color.YELLOW);
			}
		});
		
		//Move the text
		left.setOnAction(e -> text.setX(text.getX() - 10));
		right.setOnAction(e -> text.setX(text.getX() + 10));
		
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(borderPane, 300, 300);
		primaryStage.setTitle("Exercise 16-1"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	public static void main(String[] args) {
		launch(args);
	}
}