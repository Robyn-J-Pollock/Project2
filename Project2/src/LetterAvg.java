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
	public LetterAvg(char avg)
	{
		this.avg = avg;
	}
	
	/*
	 * Goes through Mesonet.txt and finds all stations with the same average
	 * Stores their strings in stations and returns the number
	 */
	public int numberOfStationWithLetterAvg() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		String line = br.readLine();
		int x = 1;
		MesoStation meSt;
		MesoInherit meIn;
		int count = 0;
		while(line != null)
		{
			if (x > 2)
			{
				line = line.trim().split(" ")[0];
				meSt = new MesoStation(line);
				meIn = new MesoInherit(meSt);
				if (meIn.calAverage()[2] == avg)
				{
					stations.add(line);
					count++;
				}
			}
			br.readLine();
			x++;
		}
		return count;
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
		StringBuffer stBu = new StringBuffer("They are\n");
		for (String strg : stations)
			stBu.append(String.format("%s\n", strg));
		return stBu.toString();
	}
}
