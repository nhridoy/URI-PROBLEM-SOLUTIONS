e = 0
o = 0
p = 0
n = 0

for i in range(5):
    num = int(input())
    if num < 0:
        n = n + 1
    if num > 0:
        p = p + 1
    if num % 2 == 0:
        e = e + 1
    if num % 2 != 0:
        o = o + 1
print(e, "valor(es) par(es)")
print(o, "valor(es) impar(es)")
print(p, "valor(es) positivo(s)")
print(n, "valor(es) negativo(s)")
