
public class CricketClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Over over1 = new Over(1,0,1,2,5,4,6);
		//over1.total();
		
		Scorecard s = new Scorecard();
		
		Over[] over = new Over[5];
		over[0] = new Over(1,0,1,2,5,4,6);
		over[1] = new Over(2,0,1,2,5,4,6);
		over[2] = new Over(3,0,1,0,5,4,6);
		over[3] = new Over(4,0,1,0,5,4,6);
		over[4] = new Over(5,1,1,1,1,1,1);
		
		
		over[1].totalOver();
		
		over[1].RunsPerBall(6);
		
		s.CalculateScore(over);
		
		
		
		
		
		
		

	}

}
