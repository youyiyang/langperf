fun fib(n: Int): Int {
  if (n < 3) return 1;
  return fib(n - 1) + fib(n - 2)
}

fun main(args: Array<String>) {
  println(fib(40));
}

// kotlinc fib.kt -include-runtime -d fib.jar
// time java -jar fib.jar