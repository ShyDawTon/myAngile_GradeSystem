import static org.junit.Assert.*;

import org.junit.Test;

public class TestGradeSystems {

	@Test
	public void testGradeSystems1() {
		aGradeSystem = new GradeSystems();
		assertEquals(87, aGradeSystem.aTree.get("962001044").lab1);
	}
	
	@Test
	public  testGradeSystrems2(){
		aGradeSystem = new GradeSystems();
		assertEquals(81, aGradeSystem.aTree.get("962001051").lab1);
	}
	
}
