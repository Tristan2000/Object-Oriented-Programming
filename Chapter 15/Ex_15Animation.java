import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.input.MouseButton;
import javafx.collections.ObservableList;
import java.awt.*;
import java.util.*;
import java.time.*;

public class Ex_15Animation extends Application {
	//Override start
	@Override
	public void start(Stage primaryStage){
		//Create the pane
		Pane pane = new Pane();
		//create pentagon and rectangle. Add them to the pane
		Rectangle rectangle = new Rectangle(0, 0, 25, 25);
		rectangle.setFill(Color.RED);
		Polygon pent = new Polygon();
		ObservableList<Double> list = pent.getPoints();
		
		final double WIDTH = 200;
		final double HEIGHT = 200;
		double centerX = WIDTH / 2;
		double centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		for (int i = 0; i < 5; i++){
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5 - Math.PI / 5));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 5 - Math.PI / 5));
		}
		pent.setFill(Color.WHITE);
		pent.setStroke(Color.BLACK);
		pane.getChildren().addAll(rectangle, pent);
		//creat path transition
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(pent);
		pt.setNode(rectangle);
		pt.setOrientation(
			PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(false);
		pt.play();
		//pause and play the animation
		pent.setOnMousePressed(e -> {
			if (e.getButton() == MouseButton.PRIMARY){
				pt.play();
			}
			else if (e.getButton() == MouseButton.SECONDARY){
				pt.pause();
			}
		});
		//rectangle fading
		FadeTransition ft = new FadeTransition(Duration.millis(3000), rectangle);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Ex_15 Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


