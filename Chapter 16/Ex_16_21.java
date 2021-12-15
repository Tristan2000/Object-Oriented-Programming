import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.awt.*;
import java.time.*;
import java.beans.*;
import javax.print.attribute.standard.*;

public class Ex_16_21 extends Application {
	
	TextField tf = new TextField("");
	
	Timeline animation = new Timeline(
		new KeyFrame(Duration.millis(1000), e -> {
		int seconds = Integer.parseInt(tf.getText());
		tf.setText(seconds - 1 + "");
		if (seconds - 1 <= 0){
			stopAnimation();
		}
	}));

	Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	MediaPlayer mp = new MediaPlayer(media);
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage){
		mp.setCycleCount(Timeline.INDEFINITE);
		animation.setCycleCount(Timeline.INDEFINITE);
		tf.setAlignment(Pos.CENTER);
		
		tf.setOnAction(e ->{
			animation.play();
		});
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(tf, 300, 300);
		primaryStage.setTitle("Exercise 16-21"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	private void stopAnimation(){
		animation.stop();
		
		mp.play();
	}
	public static void main(String[] args) {
		launch(args);
	}
}