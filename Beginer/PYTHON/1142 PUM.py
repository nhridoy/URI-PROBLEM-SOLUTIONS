n = int(input())
c = 0
while n > 0:
    for i in range(3):
        c += 1
        print(c, "", end="")
    print("PUM", end="")
    c += 1
    print()
    n -= 1
