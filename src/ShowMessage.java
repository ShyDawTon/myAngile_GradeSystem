import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class ShowMessage {

	@Test
	public void testShowFinishMsg() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		aUI.showFinishMsg();
		assertEquals("�����F\r\n", outContent);
	}

	@Test
	public void testUpdateWeight() {
		ByteArrayInputStream inContent = new ByteArrayInputStream("Y".getBytes());
		System.setIn(inContent);
		assertEquals("Y", inContent);
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		aUI.showFinishMsg();
		assertEquals("�H�W���T��? Y (Yes) �� N (No)\\r", outContent);
	}
}
