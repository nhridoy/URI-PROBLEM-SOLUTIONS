seconds = int(input())
hour = seconds//3600
seconds -= hour*3600
minute = seconds//60
seconds -= minute*60
print(hour, ":", minute, ":", seconds, sep="")
