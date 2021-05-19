x, y = input().split()

x = int(x)
y = int(y)

n = 0
for i in range(y):
    print(i + 1, end="")
    n += 1
    if n == x:
        print()
        n = 0
    else:
        print(end=" ")
