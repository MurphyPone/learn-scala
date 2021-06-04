import scala.io.StdIn

object SimpleIO {
    // Scala does not necessitate the use of the `return` key word
    def abs(x: Double) = if(x >= 0) x else - x

    // Variable length of arguments:
    def sum(args: Int*) = {
        var result = 0
        for (arg <- args) result += arg
        result
    }

    // Must specify return type for recusrive functions
    def recursiveSum(args: Int*): Int = {
        if(args.length == 0) 0
        else args. head + recursiveSum(args.tail: _*)
    }

    // This procedure does not return anything, so no `=` 
    // Can also explicitly set the return type to be `Unit`
    def box(s: String) {
        val border = "-" * (s.length + 2)
        print(f"$border%n|$s|%n$border%n")
    }



    
    def main(args: Array[String]): Unit = {
        // val name = StdIn.readLine("Your Name: ")
        // print("Your Age: ")
        // val age = StdIn.readInt()
        // println(s"Hello, ${name}! Next Year, you will be ${age + 1}")
        
        // println(abs(-3))

        // println(sum(1,2,3,4))
        println(sum(1 to 4: _*)) // treats the argument as a sequence
        println(recursiveSum(1 to 4: _*)) // treats the argument as a sequence
        box("Hello")
    }
}
