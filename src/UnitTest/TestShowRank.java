package UnitTest;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import myGradeSystem.*;

public class TestShowRank {
	@Test
	public void testShowRank1(){
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		GradeSystems aGradeSystem = new GradeSystems();
		double[] weights = {0.2, 0.2, 0.2, 0.2, 0.2};
		
		aGradeSystem.weights = weights;
		aGradeSystem.showRank("962001044");
		assertEquals("33\r\n", outContent.toString());
	}
	
	@Test
	public void testShowRank2(){
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		GradeSystems aGradeSystem = new GradeSystems();
		
		double[] weights = {0.2, 0.2, 0.2, 0.2, 0.2};
		aGradeSystem.weights = weights;
		aGradeSystem.showRank("962001051");
		assertEquals("33\r\n", outContent.toString());
	}
}
