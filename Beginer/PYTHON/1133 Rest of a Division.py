x = int(input())
y = int(input())

if x > y:
    a = y
    b = x
elif y > x:
    a = x
    b = y
else:
    a, b = x

for i in range(a+1, b):
    if i % 5 == 2 or i % 5 == 3:
        print(i)
