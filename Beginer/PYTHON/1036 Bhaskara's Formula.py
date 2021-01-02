from math import *
a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)

if a == 0 or (pow(b, 2) - (4 * a * c)) < 0:
    print("Impossivel calcular")
else:
    x1 = (-b+sqrt(pow(b, 2)-(4*a*c)))/(2*a)
    x2 = (-b-sqrt(pow(b, 2)-(4*a*c)))/(2*a)
    x1 = format(x1, ".5f")
    x2 = format(x2, ".5f")
    print("R1 = ", x1, "\nR2 = ", x2, sep="")
