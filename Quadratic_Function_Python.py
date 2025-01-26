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

def float_input(prompt):
  while True:
    try:
      value = float(input(prompt))
      return value
    except ValueError:
      print("Invalid input. Please enter a numerical value")

print("Input a quadratic equation to solve!")
while True:
  a = float_input("First enter a (coefficient of x^2): ")
  if a == 0:
    print("Coefficient 'a' cannot be 0. Please enter a valid value")
    continue
  b = float_input("Now enter b (coefficient of x): ")
  c = float_input("Finally enter c (constant term): ")
  break

try:
  print("The solutions for the quadratic function you enterered are:", quad_func(a, b, c))
except Exception as e:
  print("An error occurred while solving the equation", str(e))
