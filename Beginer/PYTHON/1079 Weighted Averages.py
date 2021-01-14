n = int(input())

for i in range(n):
    s = 0
    n1, n2, n3 = input().split()
    n1 = float(n1)
    n2 = float(n2)
    n3 = float(n3)
    s = (n1*2 + n2*3 + n3*5)/10
    print("%.1f" % s)
