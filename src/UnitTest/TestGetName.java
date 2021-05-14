package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import myGradeSystem.GradeSystems;
import myGradeSystem.IDExceptions3;

public class TestGetName {
	@Test
	public void testGetName1() throws IDExceptions3 {
		GradeSystems gradeSystem = new GradeSystems();
		String name = gradeSystem.getName("985002005");
		assertEquals("ÁÂ¥É¯ø", name);
	}
	
	@Test
	public void testGetName2() throws IDExceptions3 {
		GradeSystems gradeSystem = new GradeSystems();
		String name = gradeSystem.getName("985002016");
		assertEquals("¤ý²E", name);
	}
	
	@Test(expected = IDExceptions3.class)
	public void testGetName3() throws IDExceptions3 {
		GradeSystems gradeSystem = new GradeSystems();
		String name = gradeSystem.getName("98500201");
	}
}
