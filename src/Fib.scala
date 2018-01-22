object Fib extends App {
  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0)/ 1000.0 / 1000 + "ms")
    result
  }
  def fib(n: Int): Int = {
    if (n < 3)
      1
    else
      fib(n - 1) + fib(n - 2)
  }
  for (_ <- 1 to 1000)
    fib(20)
  for (_ <- 1 to 10)
    println(time(fib(40)))
}
//scala -opt:l:inline '-opt-inline-from:**' Fib.scala
