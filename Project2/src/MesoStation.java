/**
 * @author Mohammad Mukhtaruzzaman
 * @version 2019-09-18
*/
public class MesoStation 
{
	private String stID;
	private char[] splitStId;
	
	public MesoStation(String stId)
	{
		this.stID = stId;
		splitStId = stId.toCharArray();
	}

	public String getStID() {
		return stID;
	}
	
	public char[] getSplitStId()
	{
		return splitStId;
	}
}