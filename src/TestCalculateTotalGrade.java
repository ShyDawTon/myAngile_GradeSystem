import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculateTotalGrade {

	@Test
	public testCalculateTotalGrade1() {
		Grades aGrade = new Grades();
		int total = aGradeSystem.aTree.get("962001044").calculateTotalGrade(0.1, 0.1, 0.1, 0.3, 0.4);
		assertEquals(91, total);
	}

	@Test
	public testCalculateTotalGrade1() {
		Grades aGrade = new Grades();
		int total = aGradeSystem.aTree.get("962001051").calculateTotalGrade(0.1, 0.1, 0.1, 0.3, 0.4);
		assertEquals(89, total);
	}
}
