
public class Scorecard {

	public int CalculateScore(Over[] over) {
		// TODO Auto-generated method stub
		int totalRuns=0;
		for(int i=0;i<over.length;i++)
		{
			totalRuns = totalRuns + over[i].getFirst() + over[i].getSecond()+over[i].getThird()
						+over[i].getFourth()+over[i].getFifth()+over[i].getSxith();
		}
		System.out.println("Total Runs Scored "+totalRuns);
		return totalRuns;
	}

	

}
