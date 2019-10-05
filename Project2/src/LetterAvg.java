import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Robyn Pollock
 * @version 2019-10-3
*/
public class LetterAvg {
	//TODO: Generate output from line 7 to end
	private char avg;
	private ArrayList<String> stations;
	
	/*
	 * Creates new LetterAvg object and stores avg
	 */
	public LetterAvg(char avg) throws IOException
	{
		stations = new ArrayList<String>();
		this.avg = avg;
		computeStations();
	}
	
	/*
	 * Goes through Mesonet.txt and finds all stations with the same starting character
	 * Stores their strings in stations and returns the number
	 */
	private void computeStations() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		String line = br.readLine();
		int x = 1;
		int count = 0;
		while(line != null)
		{
			if (x > 2)
			{
				line = line.trim().split(" ")[0];
				if (line.charAt(0) == avg)
				{
					stations.add(line);
					count++;
				}
			}
			line = br.readLine();
			x++;
		}
		br.close();
	}
	
	/*
	 * returns number of stations with same letter average
	 */
	public int numberOfStationWithLetterAvg()
	{
		
		return stations.size();
	}
	
	/*
	 * Lists on each line the number of stations in format:
	 * "They are:
	 * OILT
	 * OKCE
	 * OKEM
	 * OKMU"
	 */
	@Override
	public String toString()
	{
		StringBuffer stBu = new StringBuffer("\nThey are:");
		for (String strg : stations)
			stBu.append(String.format("\n%s", strg));
		return stBu.toString();
	}
}
