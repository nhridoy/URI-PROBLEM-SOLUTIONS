n = int(input())

while n > 0:
    x, y = input().split()
    x = int(x)
    y = int(y)

    s = 0
    if x > y:
        for i in range(y+1, x):
            if i % 2 != 0:
                s += i
    else:
        for i in range(x+1, y):
            if i % 2 != 0:
                s += i
    print(s)
    n -= 1
