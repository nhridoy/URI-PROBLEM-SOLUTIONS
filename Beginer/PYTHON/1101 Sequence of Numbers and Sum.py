num = [int(num) for num in input().split()]
m = min(num)
n = max(num)

while m > 1 and n > 1:
    s = 0
    for i in range(m, n + 1):
        print(i, end=' ')
        s += i
    print("Sum=", s, sep="")
    num = [int(num) for num in input().split()]
    m = min(num)
    n = max(num)
