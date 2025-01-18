
# How to Code a Function in Python that Solves a Quadratic Equation

In this tutorial, I will show you how to code a function in Python that solves a quadratic equation.

## What is a Quadratic Equation?

A quadratic equation is a second-order polynomial equation. The quadratic equation in its standard form is ax<sup>2</sup> + bx + c = 0, where a, b, and c are real numbers and a ≠ 0. To solve a quadratic equation, the quadratic formula is used: x = $$\frac{-b ± \sqrt{b^2 - 4ac}}{2a}$$

### What is a Discriminant?

In order to determine the nature of the roots of a quadratic equation, the discriminant is examined. The discriminant is **b<sup>2</sup> - 4ac** part of the quadratic equation, which helps us decide the type of solutions. 
* If b<sup>2</sup> - 4ac **>** 0, the equation has two real solutions
* If b<sup>2</sup> - 4ac **=** 0, the equation has one real solution
* If b<sup>2</sup> - 4ac **<** 0, the equation has zero real solutions, or two complex solutions

## Quadratic Equation Function Overview

The function `quad_func(a, b, c)` solves a quadratic equation and returns its solutions. First, the function calculates the discriminant, and depending on whether the discriminant is positive, negative, or 0, the function goes to the respective conditional and returns the roots as either real or complex numbers.

```
def quad_func(a, b, c):
  discriminant = b**2 - 4*a*c
  if discriminant > 0:
    x1 = (-b + discriminant**0.5) / (2*a)
    x2 = (-b - discriminant**0.5) / (2*a)
    return x1, x2
  elif discriminant == 0:
    x = -b / (2*a)
    return x
  else:
    real = -b / (2*a)
    imag = (-discriminant)**0.5 / (2*a)
    x1 = complex(real, imag)
    x2 = complex(real, -imag)
    return x1, x2
```

The next part of the code prompts the user to enter the coefficients a, b, and c. These values are converted to floats to allow for decimal coefficients. Finally, the solutions of the quadratic equation are printed for the user.
```
a = float(input("Input a quadratic equation to solve! First enter a: "))
b = float(input("Now enter b: "))
c = float(input("Finally enter c: "))
print("The solutions for the quadratic function you enterered are:", quad_func(a, b, c))
```
