package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane parent = new BorderPane();
			Scene scene = new Scene(parent,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
