package conrad;

public class Hello {

				public static void main(String[] args) {

					Function<Integer,Integer,Integer> adder = (x, y) -> x + y;
					int result = adder.apply(1, 1);
					System.out.println("Result: " + result);

					Function<Integer,Integer,Integer> multiplier = (x, y) -> x * y;
					result = multiplier.apply(2, 2);
					System.out.println("Result: " + result);

					UnaryFunction<Integer,Integer> squareIt = x -> multiplier.apply(x, x);
					result = squareIt.apply(4);
					System.out.println("Result: " + result);

					UnaryFunction<Integer,Integer> func = x -> x * x;
          result = func.apply(8);
          System.out.println("Result: " + result);					

				}


}

