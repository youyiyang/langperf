import pyximport; pyximport.install()
import fib_cython
import time

start = time.time()
print(fib_cython.fib(40))
print(time.time() - start)

