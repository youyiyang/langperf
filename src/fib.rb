def fib(n)
  if n < 3
    return 1
  else
    return fib(n-2) + fib(n-1)
  end
end

puts(fib(40))
