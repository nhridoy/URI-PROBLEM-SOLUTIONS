x, y = input().split()
x = int(x)
y = int(y)

while y != x:
    if x < y:
        print("Crescente")
    else:
        print("Decrescente")

    x, y = input().split()
    x = int(x)
    y = int(y)
