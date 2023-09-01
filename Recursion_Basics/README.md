##Recursion Basics 

#Doing it for making programming more easier and applying easy concepts of Recusion while coding.

#What is Recursion ?
Recursion is a programming concept and technique where a function calls itself to solve a problem. 
It's a fundamental part of many programming languages and can be used to solve problems that can be
broken down into smaller, similar sub-problems. Recursion consists of two main parts:

1. Base Case: This is the termination condition that defines when the recursion should stop.
Without a base case, the recursion would continue indefinitely, leading to a stack overflow error.
2. Recursive Case: In this part, the function calls itself with a modified version of the problem.
   The goal is to eventually reach the base case.

Here's an example of recursion in Java that calculates the factorial of a number:

```java
public class FactorialExample {

    public static int factorial(int n) {
        // Base case: If n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
```

In this Java example, the `factorial` method calculates the factorial of an integer `n`.
The base case checks if `n` is 0 or 1 and returns 1 in those cases.
Otherwise, it calculates the factorial by recursively calling itself with a smaller value,
`(n-1)`. The `main` method demonstrates how to use the `factorial` function to calculate
the factorial of a number (in this case, 5) and prints the result.
