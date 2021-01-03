x, y = input().split()
x = int(x)
y = int(y)

if x == 1:
    t = y * 4.00
    t = format(t, ".2f")
    print("Total: R$", t)
elif x == 2:
    t = y * 4.50
    t = format(t, ".2f")
    print("Total: R$", t)
elif x == 3:
    t = y * 5.00
    t = format(t, ".2f")
    print("Total: R$", t)
elif x == 4:
    t = y * 2.00
    t = format(t, ".2f")
    print("Total: R$", t)
elif x == 5:
    t = y * 1.50
    t = format(t, ".2f")
    print("Total: R$", t)
