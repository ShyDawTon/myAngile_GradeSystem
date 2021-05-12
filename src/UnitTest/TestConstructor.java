package UnitTest;
import static org.junit.Assert.*;

import org.junit.Test;
import myGradeSystem.*;

public class TestConstructor {

	@Test
	public void testUI1() {
		assertNotNull ( new UI() );
	}

	@Test
	public void testGrades1() {
		assertNotNull (new Grades() ); 
	}
}
