// http://aperiodic.net/phil/scala/s-99/

// P01 (*) Find the last element of a list.
//     Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

object P01 {

    // [A] allows handling of any type (does this refer to the List[A])
    def lastBuiltin[A](ls: List[A]): A = ls.last

    // or with recursive pattern matching
    def myLast[A](ls: List[A]): A = ls match {
        // :: prepends a single item whereas ::: prepends a complete list 
        // List ::: sequence will result in a nested structure, think [[a, b], y, z] 
        
        // so, if it is the case where we have just the head of the list, head = last 
        case head :: Nil  => head 

        // if it is not the case where the head is the last element, then call the function on everything else 
        case _    :: tail => myLast(tail)

        // can't call last on an empty list
        case _            => throw new NoSuchElementException      
    }
}

// Find the last but one element of a list.
//      Example:
//      scala> penultimate(List(1, 1, 2, 3, 5, 8))
//      res0: Int = 5

object P02 {

    // built in, remember haskell behavior
    def penultimateBuiltin[A](ls: List[A]): A = 
        if (ls.isEmpty) throw new NoSuchElementException
        // ls.init take everything but the last element
        else ls.init.last 

    def penultimate[A](ls: List[A]): A = ls match {
        // here it's matching elements
        case head :: _ :: Nil => head 
        // otherwise keep going until we hit the above case 
        case _    :: tail     => penultimate(tail)

        case _                => throw new NoSuchElementException
    }

}


// Find the Kth element of a list.
// By convention, the first element in the list is element 0.
//      Example:
//      scala> nth(2, List(1, 1, 2, 3, 5, 8))
//      res0: Int = 2
object P03 {

    def kthBuiltin[A](k: Int, ls: List[A]): A = ls(k)

    def kthElement[[A](k: Int, ls: List[A]): A = ls match { 
        case (0, head :: _ ) => head 
        case (k, _ :: tail ) => kthElement(k - 1, tail)
        case (_, Nil )       => throw new NoSuchElementException
    }
}


object Main {

    def main(args: Array[String]): Unit =  {
        val ls = List(1,2,3,4,5)

        printf("p01: %d\n",  P01.myLast(ls))
        printf("p02: %d\n",  P02.penultimate(ls))
        printf("p03: %d\n",  P03.kthElement(ls))

    }
}