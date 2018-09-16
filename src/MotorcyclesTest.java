import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotorcyclesTest {

	Motorcycle a;
	Motorcycle b;
	
	@Before
	public void setUp() throws Exception {
		a = new TwoStrokeTwoWheels();
		b = new FourStrokeTwoWheelsAndSidecart();
	}

	@Test
	public void testCountWheels() {
		assertEquals(2, a.countWheels());
		assertEquals(3, b.countWheels());
	}

}
