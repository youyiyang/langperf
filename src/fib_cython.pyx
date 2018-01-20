cdef int _fib(int x):
    if x < 3:
        return 1
    else:
        return _fib(x - 2) + _fib(x -1)

def fib(x):
    return _fib(x)
