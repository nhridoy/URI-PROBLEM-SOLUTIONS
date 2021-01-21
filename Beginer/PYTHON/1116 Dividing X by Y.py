n = int(input())

for i in range(n):
    x, y = input().split()
    x = int(x)
    y = int(y)

    try:
        s = x / y
        print("%.1f" % s)
    except:
        print("divisao impossivel")
