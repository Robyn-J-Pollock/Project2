import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Robyn Pollock
 * @version 2019-10-3
*/
public class PosAvg {
	
	private String stId;
	private int position;
	private String[] aveStations;
	
	/*
	 * Creates a new PosAvg object and stores stId.
	 */
	public PosAvg(String stId) throws IOException
	{
		this.stId = stId;
		aveStations = new String[4];
		indexOfStation();
		
		
	}
	//TODO: Generate first two lines of the output related with the position/index
	/*
	 * Finds and stores the position of the station in the Mesonet.txt
	 * stores the data from N (+/-) 2 in array
	 */
	public int indexOfStation() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		int x = 1;
		String line = br.readLine();
		line = line.trim();
		line = line.split(" ")[0];
		boolean match = false;
		while (line != null && !match)
		{
			line = line.trim();
			line = line.split(" ")[0];
			if (stId.equals(line))
				match = true;
			else
			{
				line = br.readLine();
				x++;
			}
		}
		if (match)
		{
			if (x > 5 && x < 122)
			{
				position = x;
				aveStations[2] = br.readLine().trim().split(" ")[0];
				aveStations[3] = br.readLine().trim().split(" ")[0];
				br.close();
				br = new BufferedReader(new FileReader("Mesonet.txt"));
				for (int i = 0; i < x - 3; i++)
					br.readLine();
				aveStations[0] = br.readLine().trim().split(" ")[0];
				aveStations[1] = br.readLine().trim().split(" ")[0];
				br.close();
				return (position - 3);
			}
		}
		else
		{
			Arrays.fill(aveStations, null);
			br.close();
			return -1;
		}
		//java wanted me to :/
		br.close();
		return -1;
	}
	
	/*
	 * Returns a string in the following format
	 * "This index is average of NOWA and OILT, NEWP and OKCE, and so on."
	 * Where the stations are indexOfStation() = N, N+1 and N-1
	 * and the next two are N+2 and N-2,
	 * skipping the input if the stations are the first two and last two.
	 */
	@Override
	public String toString()
	{
		String ofThis = String.format("This index is average of %s and %s, %s and %s, and so on.", aveStations[1], aveStations[2], aveStations[0], aveStations[3]);
		return ofThis;
	}
}
