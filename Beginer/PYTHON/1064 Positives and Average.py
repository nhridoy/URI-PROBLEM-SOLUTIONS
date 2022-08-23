c = 0
s = 0
for _ in range(6):
    n = float(input())
    if n > 0:
        c = c + 1
        s = s + n
avg = s / c
print(c, "valores positivos")
print("%.1f" % avg)
