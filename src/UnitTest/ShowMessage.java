package UnitTest;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import myGradeSystem.*;

public class ShowMessage {

	@Test
	public void testShowFinishMsg() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		aUI.showFinishMsg();
		assertEquals("結束了\r\n", outContent.toString());
	}

	@Test
	public void testUpdateWeight() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		
		GradeSystems aGradeSystems = new GradeSystems();
		aGradeSystems.updateWeights();
		
		String[] lastLine = outContent.toString().split("\n");
		
		assertEquals("以上正確嗎? Y (Yes) 或 N (No)", lastLine[lastLine.length-1]);
	}
}
