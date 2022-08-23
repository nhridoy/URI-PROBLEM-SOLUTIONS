start, end = input().split()
start = int(start)
end = int(end)
time = end - start if start < end else (24 - start) + end
print("O JOGO DUROU", time, "HORA(S)")
