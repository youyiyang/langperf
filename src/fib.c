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
