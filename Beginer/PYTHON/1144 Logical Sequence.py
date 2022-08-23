n = int(input())
for m, i in enumerate(range(1, n+1), start=1):
    print(i, end=" ")
    print(i*i, i*i*m)
    print(i, end=" ")
    print((i*i)+1, (i*i*m)+1)
