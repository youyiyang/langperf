fn fib(n: i64) -> i64 {
    if n < 3 {
        1
    } else {
        fib(n - 2) + fib(n - 1)
    }
}

fn main() {
    print!("fib(40) = {}\n", fib(40));
}
