//Roll Number:1630
import static org.junit.Assert.*;

import org.junit.Test;

public class ScorecardTest {

	//calculates the total score
	@Test
	public void testCalculateScore() {
		//fail("Not yet implemented");
		Over[] over = new Over[5];
		Scorecard s = new Scorecard();
		
		over[0] = new Over(1,0,1,2,5,4,6);
		
		over[1] = new Over(2,0,1,2,5,4,6);
		over[2] = new Over(3,0,1,0,5,4,6);
		over[3] = new Over(4,0,1,0,5,4,6);
		over[4] = new Over(5,1,1,1,1,1,1);
		
	
		assertEquals(74,s.CalculateScore(over));	//total score in 5 Overs
			
		
	}

}
