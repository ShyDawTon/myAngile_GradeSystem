package UnitTest;
import static org.junit.Assert.*;
import org.junit.Test;
import myGradeSystem.*;

public class TestCheckID {
	@Test(expected = IDExceptions1.class)
	public void testCheckID1() throws IDExceptions1, IDExceptions2  {
		UI aUI = new UI();
		aUI.checkID("96z001044");
	}

	@Test(expected = IDExceptions2.class)
	public void testCheckID2() throws IDExceptions1, IDExceptions2  {
		UI aUI = new UI();
		aUI.checkID("96200104");
	}

	@Test
	public void testCheckID3() throws IDExceptions1, IDExceptions2  {
		UI aUI = new UI();
		assertEquals(aUI.checkID("962001044"), true);
	}
}
