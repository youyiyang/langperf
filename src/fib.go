package main

import (
	"fmt"
)

func fib(n int) int {
	if n < 3 {
		return 1
	}
	return fib(n-2) + fib(n-1)
}

func main() {
	fmt.Printf("fib(40) = %d\n", fib(40))
}
