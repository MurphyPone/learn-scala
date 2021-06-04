# learn-scala
Scala examples from "Scala for the Impatient", "Scala with Cats", and The Red Book

## General Notes
- `$ scala` to open the interpreter, `$ scalac` to compile
- "Scala has no silly prejudice against non-alphanumeric characters in method names"
- `a method b` is the same as `a.method(b)`
- Applying methods, string indexing using `()` instead of `[]`
- Declare variables with `var` and constants as `val`
- supply a function with compact notation as the arg of another function like so `"aAaA".count(_.isUpper)`
- In Scala, assignments have no value, or more specifically, they have a `Unit` value which is equivalent to Java/C's `void` 
- Difference between an `Array` and a `Vector` in Scala contiguity within memory and mutability?
- recusrive functions require a return type to be specified
- procedures are functions which return no value
- `lazy` valuevariables defer initialization until it they are accessed for the first time
