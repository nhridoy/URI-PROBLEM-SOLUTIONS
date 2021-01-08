from math import *
a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)

if a >= b + c or b >= a + c or c >= b + a:
    print("NAO FORMA TRIANGULO")
elif pow(a, 2) == pow(b, 2) + pow(c, 2) or pow(b, 2) == pow(a, 2) + pow(c, 2) or pow(c, 2) == pow(b, 2) + pow(a, 2):
    print("TRIANGULO RETANGULO")
    if a == b == c:
        print("TRIANGULO EQUILATERO")
    elif a == b != c or b == c != a or a == c != b:
        print("TRIANGULO ISOSCELES")
elif pow(a, 2) > pow(b, 2) + pow(c, 2) or pow(b, 2) > pow(a, 2) + pow(c, 2) or pow(c, 2) > pow(b, 2) + pow(a, 2):
    print("TRIANGULO OBTUSANGULO")
    if a == b == c:
        print("TRIANGULO EQUILATERO")
    elif a == b != c or b == c != a or a == c != b:
        print("TRIANGULO ISOSCELES")
elif pow(a, 2) < pow(b, 2) + pow(c, 2) or pow(b, 2) < pow(a, 2) + pow(c, 2) or pow(c, 2) < pow(b, 2) + pow(a, 2):
    print("TRIANGULO ACUTANGULO")
    if a == b == c:
        print("TRIANGULO EQUILATERO")
    elif a == b != c or b == c != a or a == c != b:
        print("TRIANGULO ISOSCELES")
