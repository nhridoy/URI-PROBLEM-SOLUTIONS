start, end = input().split()
start = int(start)
end = int(end)
if start < end:
    time = end - start
    print("O JOGO DUROU", time, "HORA(S)")
else:
    time = (24 - start) + end
    print("O JOGO DUROU", time, "HORA(S)")
