n = int(input())

for _ in range(n):
    n1, n2, n3 = input().split()
    n1 = float(n1)
    n2 = float(n2)
    n3 = float(n3)
    avg = (n1*2 + n2*3 + n3*5)/10
    print("%.1f" % avg)
