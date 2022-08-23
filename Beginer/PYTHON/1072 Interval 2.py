n = int(input())
interval = 0
not_interval = 0

for _ in range(n):
    num = int(input())
    if 10 <= num <= 20:
        interval = interval + 1
    else:
        not_interval = not_interval + 1
print(interval, "in")
print(not_interval, "out")
