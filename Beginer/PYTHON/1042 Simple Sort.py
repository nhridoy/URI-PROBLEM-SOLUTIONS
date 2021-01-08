a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)

if c > a < b:
    print(a)
    if b < c:
        print(b)
        print(c)
    else:
        print(c)
        print(b)
elif c > b < a:
    print(b)
    if a < c:
        print(a)
        print(c)
    else:
        print(c)
        print(a)
else:
    print(c)
    if a < b:
        print(a)
        print(b)
    else:
        print(b)
        print(a)
print()
print(a)
print(b)
print(c)
