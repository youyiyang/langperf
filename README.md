# Programming language raw performance tests

Some simple tests measuring performance of programming languages.
Maybe not so scientific, it just provides a brief concept.

Here are the results for __Fibonacci sequence fib(40)__ using recursive function calls, single-threaded, on Thinkpad X200, Ubuntu 14.04:

Language                     | Finished in seconds
-----------------------------|--------------------
C (gcc, no optimization)     | 2s
C (gcc, -O3 optimization)    | 0.37s
Ruby 2.4.0p0                 | 15s
Crystal 0.23.1               | 2.7s
Python 2.7.6                 | 45s
Python 3.6.1                 | 66s
Python 3.6.1 / Numba 0.33.0  | 2.2s
Python 3.5.3 / PyPy 5.10.1   | 2.6s
Elixir 1.5.2 / Erlang/OTP 20 | 5.7s

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
