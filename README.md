# Conrad - Yet another functional programming support library for Java, targeted at JDK 1.8 with Project Lambda support

For some time I've wondered what functional programming in Java might look like with the combination of a good support library and JDK 1.8 lambdas. Unfortunately, as far as I can tell, no library exists that combines these two. Certainly existing are fine support libraries that enable functional programming, or at least **more** functional programming:

* [Functional Java](http://functionaljava.org)
* [LambdaJ](http://code.google.com/p/lambdaj/)
* [Guava](http://code.google.com/p/guava-libraries/)

Unfortunately, the first two utilize abstract classes (for good reason of course) to supply generic function types. JDK 1.8 Lambdas will only work with so-called "functional interfaces" or SAM's.

Guava does not currently contain the richness of support for functional programming that I'd like to see.

So, this project is an attempt to build a library that will combine the best of both worlds. Ideas from these libraries will certainly be incorporated where they make sense, and adapters will be build where they would provide value.

## Building

Conrad is built using [Gradle](http://gradle.org). The Gradle Wrapper is provided to support building the project without explicitly downloading and installing Gradle.




## What's with the name?

Conrad is named for Dr. H. Conrad Cunningham, Professor and Chair of the Department of Computer and Information Science at the University of Mississippi. Matt first learned functional programming in Haskell from Dr. Cunningham in the Spring of 2000.
