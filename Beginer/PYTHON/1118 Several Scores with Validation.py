def score():
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


score()

print("novo calculo (1-sim 2-nao)")
n = int(input())

while n != 1 or n != 2:
    print("novo calculo (1-sim 2-nao)")
    n = int(input())
    if n == 1:
        score()
    elif n == 2:
        break
