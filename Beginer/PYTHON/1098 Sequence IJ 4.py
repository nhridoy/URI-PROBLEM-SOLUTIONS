i = 0.0
j = 1.0
while round(i, 1) <= 2.0:
    if round(i, 1).is_integer():
        for l in range(3):
            print("I=", int(round(i, 1)), sep="", end=" ")
            if round(j, 1).is_integer():
                print("J=", int(round(j, 1)), sep="")
            j += 1
        j = j - 3
        j += 0.2
    else:
        for l in range(3):
            print("I=", round(i, 1), sep="", end=" ")
            print("J=", round(j, 1), sep="")
            j += 1
        j = j - 3
        j += 0.2
    i = i + .2
