a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)
pii = 3.14159

triangle = 0.5 * a * c
circle = pii * c * c
trapezium = ((a + b) / 2) * c
square = b * b
rectangle = a * b

print("TRIANGULO: %.3f" % triangle)
print("CIRCULO: %.3f" % circle)
print("TRAPEZIO: %.3f" % trapezium)
print("QUADRADO: %.3f" % square)
print("RETANGULO: %.3f" % rectangle)
