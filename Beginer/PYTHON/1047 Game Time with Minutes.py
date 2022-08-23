initial_hour, initial_minute, final_hour, final_minute = input().split()
initial_hour = int(initial_hour)
initial_minute = int(initial_minute)
final_hour = int(final_hour)
final_minute = int(final_minute)

if final_hour > initial_hour:
    hour = final_hour - initial_hour
    if final_minute > initial_minute:
        minute = final_minute - initial_minute
        if minute > 60:
            minute = minute - 60
            hour = hour + 1
    else:
        minute = (60 - initial_minute) + final_minute
        if minute < 0:
            minute = initial_minute % 60
            hour = hour - (initial_minute // 60) - 1
            if hour < 0:
                hour = 24 + hour
        elif minute == 60:
            minute = 0
        else:
            hour = hour - 1
else:
    hour = (24 - initial_hour) + final_hour
    if final_minute > initial_minute:
        minute = final_minute - initial_minute
        if hour == 24 and minute > 0:
            hour = 0
            if minute > 60:
                minute = minute - 60
                hour += 1
    else:
        minute = (60 - initial_minute) + final_minute
        if minute < 0:
            minute = initial_minute % 60
            hour = hour - (initial_minute // 60) - 1
            if hour < 0:
                hour = 24 + hour
        elif minute == 60:
            minute = 0
        else:
            hour = hour - 1

print("O JOGO DUROU", hour, "HORA(S) E", minute, "MINUTO(S)")
