n = int(input())

for _ in range(n):
    x, y = input().split()
    x = int(x)
    y = int(y)

    try:
        s = x / y
        print("%.1f" % s)
    except:
        print("divisao impossivel")
