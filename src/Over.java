
public class Over {

	int first,second,third,fourth,fifth,sxith,overNum;
	int totalOverRuns;
	public Over(int overNum, int first, int second, int third, int fourth, int fifth, int sxith) {
		// TODO Auto-generated constructor stub
		this.overNum = overNum;
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
		this.fifth = fifth;
		this.sxith = sxith;
	}
	
	public int totalOver() {
		// TODO Auto-generated method stub
		totalOverRuns = first + second + third + fourth + fifth + sxith;
		System.out.println("Runs Scored in over "+this.overNum+":"+this.totalOverRuns);
		return totalOverRuns;
	}
	
	public int getFirst() {
		return first;
	}
	public int getSecond() {
		return second;
	}
	public int getThird() {
		return third;
	}
	public int getFourth() {
		return fourth;
	}
	public int getFifth() {
		return fifth;
	}
	public int getSxith() {
		return sxith;
	}
	public int getOverNum() {
		return overNum;
	}
	public int getTotalRuns() {
		return totalOverRuns;
	}

	public int RunsPerBall(int ballNum) {
		// TODO Auto-generated method stub
		int runs=0;
		if(ballNum == 1)			
		{
			System.out.println("over "+this.overNum+" Ball Number 1 Runs: "+getFirst());
			runs = getFirst();
		}
		if(ballNum == 2)
		{
			System.out.println("over "+this.overNum+" Ball Number 2 Runs: "+getSecond());
			runs = getSecond();
		}
		if(ballNum == 3)
		{
			System.out.println("over "+this.overNum+" Ball Number 3 Runs: "+getThird());
			runs = getThird();
		}
		if(ballNum == 4)
		{
			System.out.println("over "+this.overNum+" Ball Number 4 Runs: "+getFourth());
			runs = getFourth();
		}
		if(ballNum == 5)
		{
			System.out.println("over "+this.overNum+" Ball Number 5 Runs: "+getFifth());
			runs = getFifth();
		}
		if(ballNum == 6)
		{
			System.out.println("over "+this.overNum+" Ball Number 6 Runs: "+getSxith());
			runs = getSxith();
		}
		return runs;
	}
}
