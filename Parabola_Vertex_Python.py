def find_vertex(a, b, c):
    h = -b/(2*a)
    k = (a * (h**2)) +(b*h) + c
    return h, k

def float_input(prompt):
  while True:
    try:
      value = float(input(prompt))
      return value
    except ValueError:
      print("Invalid input. Please enter a numerical value")

print("Find the vertex of a parabola: y = ax^2 + bx + c")
while True:
  a = float_input("First enter a (coefficient of x^2): ")
  if a == 0:
    print("Coefficient 'a' cannot be 0. Please enter a valid value")
    continue
  b = float_input("Now enter b (coefficient of x): ")
  c = float_input("Finally enter c (constant term): ")
  break

try:
  print("The vertex of the parabola is:", find_vertex(a, b, c))
except ValueError as e:
  print("An error occurred while finding the vertex", str(e))
