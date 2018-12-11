
import static org.junit.Assert.*;

import org.junit.Test;


public class test7 {

	@org.junit.Test
	public void test7() {

		Tour a = new Tour(7, 3, 1.34,1.6, 10000,100000, 250);
		assertEquals(a.getResult(),"620400.0");
	}

}
