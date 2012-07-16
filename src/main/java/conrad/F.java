package conrad;

interface F<A,B> {

				B f(A a);

				<C> F<C, B> o (final F<C, A> g) default {
								return new F<C, B>() {
												public B f(final C c) {
																return F.this.f(g.f(c));
												}
								};
				}

				<C> F<A,C> andThen(final F<B,C> g) default {
								return g.o(this);
				}

}

