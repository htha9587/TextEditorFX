package editor;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Version 0.2
 * @author htha9587
 * 6-8-16
 */

/**
 * 
 * @author htha9587
 *Gathers FXML file to help create stage and scene.
 */
public class EditorApp extends Application {
	@Override
	public void start(Stage stage) throws Exception{
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor.fxml"));
			loader.setControllerFactory(t -> new EditorController(new EditorModel()));
			stage.setScene(new Scene(loader.load()));
			stage.setTitle("TextEditorFX");
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Launches the application.
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
