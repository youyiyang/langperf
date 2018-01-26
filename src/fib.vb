Imports System
Module Module1

    Function fib(n)

        If n < 3 Then
            Return 1
        Else
            Return fib(n - 2) + fib(n - 1)
        End If

    End Function
    Sub Main()
        Dim result As Integer
        result = fib(40)
        Console.Write("fib(40) = " & result.ToString)
        Console.ReadLine()

    End Sub

End Module