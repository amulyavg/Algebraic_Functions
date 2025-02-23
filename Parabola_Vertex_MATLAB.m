% Ask user for coefficients of quadratic equation

a = input("Enter the coefficient of a: ");
b = input("Enter the coefficient of b: ");
c = input("Enter the coefficient of c: ");

% Calculate the vertex of the parabola

h = -b / (2*a);
k = a*h^2 + b*h + c;

fprintf("The vertex of the parabola is at (%.2f, %.2f)\n", h, k);
