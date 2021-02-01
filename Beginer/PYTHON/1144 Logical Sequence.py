n = int(input())
m = 1

for i in range(1, n+1):
    print(i, end=" ")
    print(i*i, i*i*m)
    print(i, end=" ")
    print((i*i)+1, (i*i*m)+1)
    m += 1
