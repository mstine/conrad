package conrad;

interface F2<A,B,C> {

				C f(A x, B y);

				void hello() default {
								System.out.println("I still work");
				}

				F<B, C> f(final A a) default {
								return new F<B, C>() {
												public C f(final B b) {
																return F2.this.f(a, b);
												}
								};
				}

				

}

