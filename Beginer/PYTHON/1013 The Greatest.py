a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)


def isGreat(A, B):
    return (A + B + abs(A - B)) / 2


greatest = isGreat(a, b)
greatest = isGreat(c, greatest)
print("%d eh o mainor" % int(greatest))
