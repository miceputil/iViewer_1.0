package application;

import javaFx.application.Application;
import javaFx.fxml.FXMLLoader;
import javaFx.stage.Stage;
import javaFx.stage.StageStyle;
import javaFx.stage.Window;
import service.ChangeService;
import javaFx.scene.Parent;
import javaFx.scene.Scene;


public class Main3 extends Application {
	public static Window mainStage;
	//public  static Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		ChangeService.stage = primaryStage;
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/view/MainUI.fxml"));
			Parent root = (Parent)loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add("view/iVCSS.css");
			ChangeService.stage.setScene(scene);
			ChangeService.stage.setTitle("iViewer-1.0");
			ChangeService.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

//it's a test.