using System;

namespace feibi
{
    class Program
    {
        static int fib( int n)
        {
            if (n < 3)
                return 1;
            else
                return fib(n - 2) + fib(n - 1);
        }

        static void Main(string[] args)
        {
            Console.WriteLine("fib(40) = {0}", fib(40));
        }
    }
}

// $ mono-csc fib.cs
// $ time ./fib.exe
