max_num = 0
pos = 0
for i in range(100):
    num = int(input())
    if num > max_num:
        max_num = num
        pos = i + 1
print(max_num)
print(pos)
