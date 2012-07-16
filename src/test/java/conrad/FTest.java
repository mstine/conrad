package conrad;

import org.junit.*;

public class FTest {

	@Test
	public void shouldWork() {
		F<Integer,Integer> squareIt = x -> x * x;
		int result = squareIt.f(2);
		Assert.assertEquals(4, result);
	}

	@Test
	@Ignore
	public void andThen() {
					F2<Integer,Integer,Integer> adder = (x,y) -> x + y;
					F<Integer,Integer> increment = adder.f(1);
					F2<Integer,Integer,Integer> mult = (x,y) -> x * y;
					F<Integer,Integer> addOneTimesTwo = increment.andThen(mult.f(2));
					Assert.assertEquals(4, (int) addOneTimesTwo.f(1));
	}

}

