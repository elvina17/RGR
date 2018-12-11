
import static org.junit.Assert.*;

import org.junit.Test;


public class test8 {

	@org.junit.Test
	public void test8() {

		Tour a = new Tour(21, 2, 1.28,1.6, 5000, 50000, 150);
		assertEquals(a.getResult(),"348080.0");
	}

}
