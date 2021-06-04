import scala.io

object Main {
    // the following expressions are identical
    val s = if (1 > 0) 1 else -1
    // if ( 1 > 0) s = 1 else s = -1 // except here, s must be a var

    // Here, the resulting type of expression is Any instead of Int
    if (s > 0) "positive" else -1

    // The value of this {} expression is the last term in the block
    // val distance = {val dx = x-x0; val dy = y - y0; sqrt(dx*dx + dy*dy) }

    // Scala has no `for (init, cond, update)` loop, instead there are while loops and iterable loops
    for (i <- 1 to 10) {
        println(i)
    }



}
