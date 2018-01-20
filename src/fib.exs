defmodule Math do

  def fib(1), do: 1

  def fib(2), do: 1

  def fib(n) do
    fib(n-2) + fib(n-1)
  end

end

IO.puts Math.fib(40)
