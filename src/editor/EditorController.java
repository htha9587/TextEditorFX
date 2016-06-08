package editor;

import java.io.File;
import java.util.Arrays;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 * Version 0.1
 * @author htha9587
 * 6-8-16
 */

public class EditorController 
{
	@FXML 
	private TextArea areaText;
	private EditorModel model;
	private TextFile currentTextFile;
	
	public EditorController(EditorModel model)
	{
		this.model = model;
	}
	
	@FXML
	private void onSave()
	{
		TextFile textFile = new TextFile(currentTextFile.getFile(), Arrays.asList(areaText.getText().split("\n")));
		model.save(textFile);
	}
	@FXML
	private void onLoad()
	{
		FileChooser fileChooser = new FileChooser();
		fileChooser.setInitialDirectory(new File("./"));
		File file = fileChooser.showOpenDialog(null);
		if(file != null)
		{
			IOResult <TextFile> io = model.load(file.toPath());
			
			if(io.isOk() && io.hasData())
			{
				currentTextFile = io.getData();
				areaText.clear();
				currentTextFile.getContent().forEach(line -> areaText.appendText(line + "\n"));
				
			}
			
			else
			{
				System.out.println("Failed");
			}
		}
	}
	
	@FXML
	private void onClose()
	{
		model.close();
	}
	
	@FXML
	private void onAbout()
	{
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("About");
		alert.setContentText("This text editor is EditorApp");
		alert.show();
	}
	
}
