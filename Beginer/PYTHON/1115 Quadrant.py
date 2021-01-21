while True:
    n = [int(n) for n in input().split()]
    x = n[0]
    y = n[1]
    if x > 0 and y > 0:
        print("primeiro")
    elif x > 0 and y < 0:
        print("quarto")
    elif x < 0 and y < 0:
        print("terceiro")
    elif x < 0 and y > 0:
        print("segundo")
    else:
        break
