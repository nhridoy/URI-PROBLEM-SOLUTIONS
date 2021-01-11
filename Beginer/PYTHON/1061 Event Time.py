dia, start_date = input().split()
start_hour, start_min, start_sec = input().split(" : ")

start_date = int(start_date)
start_hour = int(start_hour)
start_min = int(start_min)
start_sec = int(start_sec)

dia, end_date = input().split()
end_hour, end_min, end_sec = input().split(" : ")

end_date = int(end_date)
end_hour = int(end_hour)
end_min = int(end_min)
end_sec = int(end_sec)

total_sec = ((end_date*86400) + (end_hour*3600) + (end_min*60) + end_sec) - ((start_date*86400) + (start_hour*3600) + (start_min*60) + start_sec)

W = total_sec // 86400
X = (total_sec - (W*86400)) // 3600
Y = (total_sec - (W*86400) - (X*3600)) // 60
Z = (total_sec - (W*86400) - (X*3600) - (Y*60))

print(W, "dia(s)")
print(X, "hora(s)")
print(Y, "minuto(s)")
print(Z, "segundo(s)")
