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
	
	/**
	 * Instantializes IOResult data members.
	 * @param ok
	 * @param data
	 */
	public IOResult(boolean ok, T data)
	{
		this.ok = ok;
		this.data = data;
	}
	/**
	 * Returns ok.
	 * @return
	 */
	public boolean isOk()
	{
		return ok;
	}
	/**
	 * Checks if data is present.
	 * @return
	 */
	public boolean hasData()
	{
		return data != null;
	}
	/**
	 * Returns data.
	 * @return
	 */
	public T getData()
	{
		return data;
	}
	
}
