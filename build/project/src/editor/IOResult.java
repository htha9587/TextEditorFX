package editor;

/**
 * Version 0.2
 * @author htha9587
 * 6-8-16
 */


public class IOResult<T>
{
	private T data;
	private boolean ok;
	
	public IOResult(boolean ok, T data)
	{
		this.ok = ok;
		this.data = data;
	}
	
	public boolean isOk()
	{
		return ok;
	}
	
	public boolean hasData()
	{
		return data != null;
	}
	
	public T getData()
	{
		return data;
	}
	
}
