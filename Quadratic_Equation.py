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

a = float(input("Input a quadratic equation to solve! First enter a: "))
b = float(input("Now enter b: "))
c = float(input("Finally enter c: "))
print("The solutions for the quadratic function you enterered are:", quad_func(a, b, c))