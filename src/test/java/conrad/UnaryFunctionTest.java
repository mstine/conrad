package conrad;

import org.junit.*;

public class UnaryFunctionTest {

	@Test
	public void shouldWork() {
		UnaryFunction<Integer,Integer> squareIt = x -> x * x;
		int result = squareIt.apply(2);
		Assert.assertEquals(4, result);
	}

}

