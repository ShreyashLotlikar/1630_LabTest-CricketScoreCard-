import static org.junit.Assert.*;

import org.junit.Test;

public class OverTest {

	Over[] over = new Over[5];
	
	
	//It basically calculates total runs scored in over
	@Test
	public void testTotalOver() {
		//fail("Not yet implemented");
		over[0] = new Over(1,0,1,2,5,4,6);
		over[1] = new Over(2,0,1,2,5,4,6);
		over[2] = new Over(3,0,1,0,5,4,6);
		over[3] = new Over(4,0,1,0,5,4,6);
		over[4] = new Over(5,1,1,1,1,1,1);
		
		assertEquals(18,over[0].totalOver());	//total runs scored in over 1
		assertEquals(6,over[4].totalOver());	//total runs scored in over 5
	}

	//Function to print how many runs scored per ball
	@Test
	public void testRunsPerBall() {
		//fail("Not yet implemented");
		over[0] = new Over(1,0,1,2,5,4,6);
		over[1] = new Over(2,0,1,2,5,4,6);
		over[2] = new Over(3,0,1,0,5,4,6);
		over[3] = new Over(4,0,1,0,5,4,6);
		over[4] = new Over(5,1,1,1,1,1,1);
		
		assertEquals(6,over[0].RunsPerBall(6));		//Runs scored on 6th ball of first over
		assertEquals(1,over[4].RunsPerBall(1));		//Runs scored on 1th ball of fifth over
	}

}
