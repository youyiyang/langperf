# Programming language raw performance tests

Some simple tests measuring performance of programming languages.
Maybe not so scientific, it just provides a brief concept.

Here are the results for __Fibonacci sequence fib(40)__ using recursive function calls, single-threaded, on Thinkpad X200, Ubuntu 14.04:

Language                         | Finished in seconds
---------------------------------|--------------------
C/gcc 4.8.4 (no optimization)    | 2s
C/gcc 4.8.4 (-O3 optimization)   | 0.37s
C/clang 4.0.1 (no optimization)  | 2.08s
C/clang 4.0.1 (-O3 optimization) | 1.13s
Rust 1.23.0 (no optimization)    | 2.4s
Rust 1.23.0 (-O optimization)    | 0.8s
Go 1.9.2                         | 2.25s
Go 1.9.2 pre-compiled            | 1.97s
OCaml 4.02.3                     | 1.48s
Java 1.8.0_161                   | 0.76s
Clojure 1.9.0                    | 4.4s
Kotlin 1.2.0 (JRE 1.8.0_161-b12) | 0.8s
JavaScript/node.js 6.11.5        | 1.95s
Python 2.7.6                     | 45s
Python 3.6.1                     | 66s
Python 3.6.1 / Cython 0.27.3     | 0.38s
Python 3.6.1 / Numba 0.33.0      | 2.2s
Python 3.5.3 / PyPy 5.10.1       | 2.6s
Ruby 2.4.0p0                     | 15s
Crystal 0.24.1                   | 2.76s
Crystal 0.24.1 pre-compiled      | 1.65s
Elixir 1.5.2 / Erlang/OTP 20     | 5.7s

### C code
```c
#include <stdio.h>

int fib(int n)
{
    if (n < 3)
        return 1;
    else
        return fib(n - 2) + fib(n - 1);
}

int main(int argc, char const *argv[])
{
    printf("fib(40) = %d\n", fib(40));
    return 0;
}

```

### Ruby / Crystal code
```ruby
def fib(n)
  if n < 3
    return 1
  else
    return fib(n-2) + fib(n-1)
  end
end

puts(fib(40))
```

### Python code
```python
def fib(n):
  if n < 3:
    return 1
  else:
    return fib(n-2) + fib(n-1)

print(fib(40))
```

### Elixir code
```ruby
defmodule Math do

  def fib(1), do: 1

  def fib(2), do: 1

  def fib(n) do
    fib(n-2) + fib(n-1)
  end

end

IO.puts Math.fib(40)
```

### Go code
```go
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
```

### Java code
```java
public class Fib {
    static int fib(int n) {
        if (n < 3)
            return 1;
        else
            return fib(n -2) + fib(n - 1);
    }

    public static void main(String[] args) {
        long tStart = System.currentTimeMillis();
        System.out.printf("fib(40) = %d\n", fib(40));
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.printf("Elapsed time: %g\n", elapsedSeconds);
    }
}
```

### Rust code
```rust
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
```

### OCaml code

```ocaml
let rec fib n =
  if n < 3 then
    1
  else
    fib (n-1) + fib (n-2)

let () =
  Printf.printf "%d\n" (fib 40)
```

### JavaScript code
```javascript
function fib(n)
{
    if (n < 3)
        return 1;
    else
        return fib(n - 2) + fib(n - 1);
}

console.log(fib(40));
```
