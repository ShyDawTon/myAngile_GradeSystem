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
		assertEquals("結束了\r\n", outContent);
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
		assertEquals("以上正確嗎? Y (Yes) 或 N (No)\\r", outContent);
	}
}
