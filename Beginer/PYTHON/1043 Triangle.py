a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)

if a+b > c and a+c > b and b+c > a:
    p = a+b+c
    print("Perimetro = %.1f" % p)
else:
    area = ((a+b)/2)*c
    print("Area = %.1f" % area)
