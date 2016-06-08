package editor;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Version 0.1
 * @author htha9587
 * 6-8-16
 */

public class EditorApp extends Application {
	@Override
	public void start(Stage stage) throws Exception{
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("EditorUI.fxml"));
			loader.setControllerFactory(t -> new EditorController(new EditorModel()));
			stage.setScene(new Scene(loader.load()));
			stage.setTitle("TextEditorFX");
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
