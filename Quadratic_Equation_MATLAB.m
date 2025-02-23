syms x

% Asks user for coefficients of quadratic equation

a = input("Enter coefficient of a: ");
b = input("Enter coefficient of b: ");
c = input("Enter coefficient of c: ");

equation = a*x^2 + b*x + c == 0;

solx = solve(equation, x);

% Display solutions of quadratic equation

disp("The roots of the quadratic equation are:");
disp(solx);
