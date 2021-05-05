import static org.junit.Assert.*;

import org.junit.Test;

public class TestShowRank {
	@Test
	public testShowRank1(){
		aGradeSystem = new GradeSystems();
		assertEquals(aGradeSystem.showRank("962001044"), 2);
	}
	
	@Test
	public testShowRank2(){
		aGradeSystem = new GradeSystems();
		assertEquals(aGradeSystem.showRank("962001051"), 1);
	}
}
