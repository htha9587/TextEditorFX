package editor;

import java.nio.file.Path;
import java.util.List;

/**
 * Version 0.2
 * @author htha9587		
 * 6-8-16
 */


public class TextFile 
{
	private final Path file;
	
	private final List<String> content;
	
	/**
	 * Uses Path file and a String list as data members.
	 * @param file
	 * @param content
	 */
	public TextFile(Path file, List<String> content)
	{
		this.file = file;
		this.content = content;
	}
	/**
	 * Returns file.
	 * @return
	 */
	public Path getFile()
	{
		return file;
	}
	/**
	 * Returns content.
	 * @return
	 */
	public List<String> getContent()
	{
		return content;
	}
	
}
