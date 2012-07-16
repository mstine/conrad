package conrad;

import org.junit.*;

public class FunctionTest {

				@Test
				public void shouldWork() {

					Function<Integer,Integer,Integer> adder = (x, y) -> x + y;
					int result = adder.apply(1, 1);
					Assert.assertEquals(2, result);

					Function<Integer,Integer,Integer> multiplier = (x, y) -> x * y;
					result = multiplier.apply(2, 2);
					Assert.assertEquals(4, result);

				}
				
}

				
