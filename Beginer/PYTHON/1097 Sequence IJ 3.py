j = 7
for i in range(1, 10, 2):
    for k in range(3):
        print("I=", i, sep="", end=" ")
        print("J=", j, sep="")
        j -= 1
    j = j + 5
