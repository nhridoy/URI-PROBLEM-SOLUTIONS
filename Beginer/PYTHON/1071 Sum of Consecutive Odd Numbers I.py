x = int(input())
y = int(input())
s = 0

for i in range(y+1, x):
    if i % 2 != 0:
        s = s + i
print(s)
