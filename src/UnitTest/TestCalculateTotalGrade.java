package UnitTest;
import static org.junit.Assert.*;

import org.junit.Test;
import myGradeSystem.*;

public class TestCalculateTotalGrade {

	@Test
	public void testCalculateTotalGrade1() {
		GradeSystems aGradeSystem = new GradeSystems();
		Grades aGrade = aGradeSystem.aTree.get("962001051");
		double[] weights = {0.1, 0.1, 0.1, 0.3, 0.4};
		int total = aGrade.calculateTotalGrade(weights);
		assertEquals(91, total);
	}

	@Test
	public void testCalculateTotalGrade2() {
		GradeSystems aGradeSystem = new GradeSystems();
		Grades aGrade = aGradeSystem.aTree.get("962001051");
		double[] weights = {0.2, 0.2, 0.2, 0.2, 0.2};
		int total = aGrade.calculateTotalGrade(weights);
		assertEquals(89, total);
	}
	
	@Test
	public void testCalculateTotalGrade3(){
		GradeSystems aGradeSystem = new GradeSystems();
		Grades aGrade = aGradeSystem.aTree.get("962001051");
		double[] weights = {0.1, 0.1, 0.0, 0.4, 0.4};
		int total = aGrade.calculateTotalGrade(weights);
		assertEquals(91, total);
	}
}
