c = 0
s = 0
while c < 2:
    n = float(input())
    if 0 <= n <= 10:
        s += n
        c += 1
    else:
        print("nota invalida")
avg = s / 2
print("media = %.2f" % avg)
