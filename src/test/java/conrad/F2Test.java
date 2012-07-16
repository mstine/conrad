package conrad;

import org.junit.*;

public class F2Test {

				@Test
				public void shouldWork() {

					F2<Integer,Integer,Integer> adder = (x, y) -> x + y;
					int result = adder.f(1, 1);
					Assert.assertEquals(2, result);

					F2<Integer,Integer,Integer> multiplier = (x, y) -> x * y;
					result = multiplier.f(2, 2);
					Assert.assertEquals(4, result);

				}
				
}

				
