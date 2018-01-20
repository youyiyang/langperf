import pyximport; pyximport.install()
import fib_fast
import time
start = time.time()
print(fib_fast.fib(40))
print(time.time() - start)

